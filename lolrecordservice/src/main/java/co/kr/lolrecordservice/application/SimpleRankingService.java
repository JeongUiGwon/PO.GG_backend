package co.kr.lolrecordservice.application;

import co.kr.lolrecordservice.domain.League.LeagueItem;
import co.kr.lolrecordservice.domain.League.LeagueItemRepository;
import co.kr.lolrecordservice.presentation.dto.LeagueItemDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SimpleRankingService {
    private LeagueItemRepository leagueItemRepository;

    @Autowired
    SimpleRankingService(LeagueItemRepository leagueItemRepository) {
        this.leagueItemRepository = leagueItemRepository;
    }

    public List<LeagueItemDTO> findAll() {
        List<LeagueItem> leagueItems = leagueItemRepository.findAll();
        List<LeagueItemDTO> leagueItemDTOs = leagueItems.stream()
                .map(leagueItem -> LeagueItemDTO.toDto(leagueItem))
                .toList();

        return leagueItemDTOs;
    }
}
