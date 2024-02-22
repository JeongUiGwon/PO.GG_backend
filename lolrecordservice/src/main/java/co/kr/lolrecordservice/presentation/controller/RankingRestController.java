package co.kr.lolrecordservice.presentation.controller;

import co.kr.lolrecordservice.application.SimpleRankingService;
import co.kr.lolrecordservice.presentation.dto.LeagueItemDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class RankingRestController {

    private SimpleRankingService simpleRankingService;

    @Autowired
    RankingRestController(SimpleRankingService simpleRankingService) {
        this.simpleRankingService = simpleRankingService;
    }

    @RequestMapping(value = "/ranking/{tier}", method = RequestMethod.GET)
    public List<LeagueItemDTO> getRankingChallenger(@PathVariable String tier) {
        return simpleRankingService.findByTier(tier);
    }
}
