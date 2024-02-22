package co.kr.lolrecordservice.domain.League;

public class LeagueItem {
    private String summonerId;
    private String summonerName;
    private Integer leaguePoints;
    private String rank;
    private Integer wins;
    private Integer losses;
    private Boolean veteran;
    private Boolean inactive;
    private  Boolean freshBlood;
    private  Boolean hotStreak;

    public LeagueItem(String summonerId, String summonerName, Integer leaguePoints, String rank, Integer wins, Integer losses, Boolean veteran, Boolean inactive, Boolean freshBlood, Boolean hotStreak) {
        this.summonerId = summonerId;
        this.summonerName = summonerName;
        this.leaguePoints = leaguePoints;
        this.rank = rank;
        this.wins = wins;
        this.losses = losses;
        this.veteran = veteran;
        this.inactive = inactive;
        this.freshBlood = freshBlood;
        this.hotStreak = hotStreak;
    }

    public String getSummonerId() {
        return summonerId;
    }

    public String getSummonerName() {
        return summonerName;
    }

    public Integer getLeaguePoints() {
        return leaguePoints;
    }

    public String getRank() {
        return rank;
    }

    public Integer getWins() {
        return wins;
    }

    public Integer getLosses() {
        return losses;
    }

    public Boolean getVeteran() {
        return veteran;
    }

    public Boolean getInactive() {
        return inactive;
    }

    public Boolean getFreshBlood() {
        return freshBlood;
    }

    public Boolean getHotStreak() {
        return hotStreak;
    }
}
