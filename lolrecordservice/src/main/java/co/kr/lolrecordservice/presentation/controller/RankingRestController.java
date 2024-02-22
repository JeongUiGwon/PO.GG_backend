package co.kr.lolrecordservice.presentation.controller;

import co.kr.lolrecordservice.application.SimpleRankingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RankingRestController {

    private SimpleRankingService simpleRankingService;

    @Autowired
    RankingRestController(SimpleRankingService simpleRankingService) {
        this.simpleRankingService = simpleRankingService;
    }

    @RequestMapping(value = "/ranking", method = RequestMethod.GET)
    public List<> getRanking() {
        return null;
    }
}
