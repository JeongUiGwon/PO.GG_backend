package co.kr.lolrecordservice.domain.League;

import java.util.List;

public class LeagueList {
    private String tier;
    private String leagueId;
    private String queue;
    private String name;
    private List<LeagueItem> entries;

    public LeagueList(String tier, String leagueId, String queue, String name, List<LeagueItem> entries) {
        this.tier = tier;
        this.leagueId = leagueId;
        this.queue = queue;
        this.name = name;
        this.entries = entries;
    }

    public String getTier() {
        return tier;
    }

    public String getLeagueId() {
        return leagueId;
    }

    public String getQueue() {
        return queue;
    }

    public String getName() {
        return name;
    }

    public List<LeagueItem> getEntries() {
        return entries;
    }
}
