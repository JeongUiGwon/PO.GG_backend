import { Injectable } from '@nestjs/common';
import { ConfigService } from '@nestjs/config/dist';
import axios from 'axios';

@Injectable()
export class RankingService {
  constructor(private configService: ConfigService) {}

  async getRanking() {
    const apiKey = this.configService.get<string>('LOL_API_KEY');
    const url = `https://kr.api.riotgames.com/lol/league/v4/challengerleagues/by-queue/RANKED_SOLO_5x5?api_key=${apiKey}`;

    try {
      const response = await axios.get(url);
      const sortedEntries = response.data.entries.sort((a, b) => {
        return b.leaguePoints - a.leaguePoints;
      });

      return sortedEntries;
    } catch (error) {
      throw new Error('Failed to get Ranking Data');
    }
  }
}
