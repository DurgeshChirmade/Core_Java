package office.sports;

public class CricketPlayer extends Player {
	private int totalRunsScored;
	private int totalWicketsTaken;
	
	public CricketPlayer() {
		super();
		totalRunsScored=0;
		totalWicketsTaken=0;
	}
	
	public CricketPlayer(String name,int dd,int mm,int yy,int playerId,double contractFees,int totalRunsScored,int totalWicketsTaken) {
		super(name,dd,mm,yy,playerId,contractFees);
		this.totalRunsScored=totalRunsScored;
		this.totalWicketsTaken=totalWicketsTaken;
	}
	
	public void display() {
		super.display();
		System.out.println("Total Runs : "+totalRunsScored+" Total Wickets: "+totalWicketsTaken);
	}

	@Override
	public String toString() {
		return "CricketPlayer [totalRunsScored=" + totalRunsScored + ", totalWicketsTaken=" + totalWicketsTaken + "]";
	}
	
	
}
