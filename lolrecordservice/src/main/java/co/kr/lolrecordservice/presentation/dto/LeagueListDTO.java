package co.kr.lolrecordservice.presentation.dto;

import java.util.List;

public class LeagueListDTO {
    private String tier;
    private String leagueId;
    private String queue;
    private String name;
    private List<LeagueItemDTO> entries;

    public LeagueListDTO(String tier, String leagueId, String queue, String name, List<LeagueItemDTO> entries) {
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

    public List<LeagueItemDTO> getEntries() {
        return entries;
    }
}
