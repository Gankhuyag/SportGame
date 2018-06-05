package domain;

import java.util.Date;

public class TournamentMatch extends Match {
	private int homePoints;
	private int visitorPoints;

	public int getHomePoints() {
		return homePoints;
	}

	public void setHomePoints(int homePoints) {
		this.homePoints = homePoints;
	}

	public int getVisitorPoints() {
		return visitorPoints;
	}

	public void setVisitorPoints(int visitorPoints) {
		this.visitorPoints = visitorPoints;
	}

	public TournamentMatch(long matchKey, Date date, Date startTime, Stadium stadium, int homeScore, int visitorScore,
			Team visitorTeam, Team homeTeam, int homePoints, int visitorPoints) {
		super(matchKey, date, startTime, stadium, homeScore, visitorScore, visitorTeam, homeTeam);
		this.homePoints = homePoints;
		this.visitorPoints = visitorPoints;
	}

}
