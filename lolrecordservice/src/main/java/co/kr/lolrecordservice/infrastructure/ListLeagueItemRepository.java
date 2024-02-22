package co.kr.lolrecordservice.infrastructure;

import co.kr.lolrecordservice.domain.League.LeagueItem;
import co.kr.lolrecordservice.domain.League.LeagueItemRepository;
import co.kr.lolrecordservice.domain.League.LeagueList;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.*;
import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

@Repository
public class ListLeagueItemRepository implements LeagueItemRepository {
    private List<LeagueItem> leagueItems = new CopyOnWriteArrayList<>();

    @Value("${riot.api.key}")
    private String riotApiKey;

    @PostConstruct
    void initLeagueItems() {
        RestTemplate restTemplate = new RestTemplate();

        String url = UriComponentsBuilder.fromHttpUrl("https://kr.api.riotgames.com/tft/league/v1/challenger")
                .queryParam("queue", "RANKED_TFT")
                .build()
                .toUriString();

        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        headers.set("X-Riot-Token", riotApiKey);

        HttpEntity request = new HttpEntity(headers);

        ResponseEntity<LeagueList> response = restTemplate.exchange(
                url,
                HttpMethod.GET,
                request,
                LeagueList.class
        );

        LeagueList leagueList = response.getBody();

        leagueItems.addAll(leagueList.getEntries());
    }

    @Override
    public List<LeagueItem> findAll() {
        return leagueItems;
    }
}
