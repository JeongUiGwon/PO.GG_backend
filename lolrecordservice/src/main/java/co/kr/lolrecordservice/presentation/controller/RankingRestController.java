package co.kr.lolrecordservice.presentation.controller;

import co.kr.lolrecordservice.application.SimpleRankingService;
import co.kr.lolrecordservice.presentation.dto.LeagueItemDTO;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Tag(name = "Ranking API", description = "Ranking 관련 API 입니다.")
@RestController
@RequestMapping(value = "/api")
public class RankingRestController {

    private SimpleRankingService simpleRankingService;

    @Autowired
    RankingRestController(SimpleRankingService simpleRankingService) {
        this.simpleRankingService = simpleRankingService;
    }

    @Operation(summary = "티어별 소환사 랭킹 조회", description = "티어별로 소환사 랭킹을 조회할 수 있습니다.")
    @Parameter(name = "tier", description = "LOL TFT의 티어명")
    @RequestMapping(value = "/ranking/{tier}", method = RequestMethod.GET)
    public List<LeagueItemDTO> getRankingChallenger(@PathVariable String tier) {
        return simpleRankingService.findByTier(tier);
    }
}
