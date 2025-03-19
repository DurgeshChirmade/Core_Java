package apps;

import office.sports.CricketPlayer;
import office.sports.FootballPlayer;
import office.sports.Player;
import office.staff.Person;

public class ThirdDemo {
	
	public static void main(String[] args) {
		
		Person p = new Person("AJAY",1,1,2001);
		p.display();
		System.out.println(p);
		
		Player pl = new Player("AJAY",1,1,2001,101,45000.56);
		pl.display();
		
		System.out.println(pl);
		
		CricketPlayer cp = new CricketPlayer("AJAY",1,1,2001,101,45000.56,54,45);
		cp.display();
		
		System.out.println(cp);
		
		FootballPlayer fp = new FootballPlayer("AJAY",1,1,2001,101,45000.56,45);
		fp.display();
		
		System.out.println(fp);
	}

}
