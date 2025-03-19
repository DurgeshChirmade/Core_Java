package office.sports;

import office.staff.Person;

public class Player extends Person {
	private int playerId;
	private double contractFees;
	
	public Player() {
		super();
		playerId=0;
		contractFees=0.0;
	}
	
	public Player(String name,int dd,int mm,int yy,int playerId,double contractFees) {
		super(name,dd,mm,yy);
		this.playerId=playerId;
		this.contractFees=contractFees;
	}
	
	public void display() {
		super.display();
		System.out.println("Player Id : "+playerId+" Contract Fees : "+contractFees);
	}

	@Override
	public String toString() {
		return "Player [playerId=" + playerId + ", contractFees=" + contractFees + "]";
	}
	
	

}
