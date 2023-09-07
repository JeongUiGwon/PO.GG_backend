import { Controller, Get } from '@nestjs/common';
import { RankingService } from './ranking.service';

@Controller('ranking')
export class RankingController {
  constructor(private rankingService: RankingService) {}

  @Get('/tier')
  async getTier() {
    return await this.rankingService.getRanking();
  }
}
