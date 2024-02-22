package co.kr.lolrecordservice.domain.League;

import java.util.List;

public interface LeagueItemRepository {
    List<LeagueItem> findAll();

    List<LeagueItem> findByTier(String tier);
}
