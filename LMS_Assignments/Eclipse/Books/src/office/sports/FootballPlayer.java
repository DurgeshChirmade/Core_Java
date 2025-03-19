package office.sports;

public class FootballPlayer extends Player {
	private int totalGoalsScored;
	
	public FootballPlayer() {
		super();
		totalGoalsScored=0;
	}
	
	public FootballPlayer(String name,int dd,int mm,int yy,int playerId,double contractFees,int totalGoalsScored) {
		super(name,dd,mm,yy,playerId,contractFees);
		this.totalGoalsScored=totalGoalsScored;
	}
	
	public void display() {
		super.display();
		System.out.println("Total Goals Scored : "+totalGoalsScored);
	}

	@Override
	public String toString() {
		return "FootballPlayer [totalGoalsScored=" + totalGoalsScored + "]";
	}
	
	

}
