package apps;

import office.library.PaperBook;
import office.library.eBook;

public class BookDemo {

	public static void main(String[] args) {
		
		PaperBook pb = new PaperBook();
		pb.display();
		
		PaperBook pb1 = new PaperBook(101,"ABC",450.24f,450,1,1,2001);
		pb1.display();
		
		eBook eb = new eBook();
		eb.display();

		eBook eb1 = new eBook(101,"ASD",450.54f,"QWERTY",980.78);
		eb1.display();
	}

}
