package hafta_13;

import java.util.Scanner;

public class runLib {
	public static void main(String[] args) {
		
		//System.out.println("Hoş Geldiniz !");
		Library lib = new Library();
		Book book = new Book("Math Basics" , "Ali" ,2024 ,Book.Tur.SCIENCE, "23355893");
		Book book2 = new Book("Physics" , "Ali" ,2020 ,Book.Tur.SCIENCE, "8941292");
		Book book3 = new Book("İyi bir Hayat Yaş " , "Dorda" ,1984 ,Book.Tur.PHILOSOPHY, "426915");
		Book book4 = new Book("karanlik hayat" , "Ramazn " ,2010 ,Book.Tur.HORROR, "588722");
		Book book5 = new Book("Hayatım" , "Ahmet" ,1990 ,Book.Tur.ROMANTIC, "894124432");
		lib.kitapEkle(book);
		lib.kitapEkle(book2);
		lib.kitapEkle(book3);
		lib.kitapEkle(book4);
		lib.kitapEkle(book5);

		
		System.out.println(" ******** Liblery Operations ********");
		System.out.println("1. View All Books ");
		System.out.println("2. Search by category ");
		System.out.println("3. Search by published year");
		System.out.println(" ");
		System.out.println("Choose Operation : ......");
		
		Scanner input = new Scanner(System.in);
		int islem = input.nextInt();
		
		switch(islem) {
			case 1 :
				
				lib.kitaplarGet();
				break;
			case 2 :
				System.out.println("Choose Category \n"
						+ "ROMANTIC,HORROR,SCIENCE,HISTORY,FICITON,PHILOSOPHY");
				
				Scanner in = new Scanner(System.in);
				switch(in.next()) {
				case "ROMANTIC" :
					lib.kitaplistelemek(Book.Tur.ROMANTIC);
					break;
				case "HORROR" :
					lib.kitaplistelemek(Book.Tur.HORROR);
					break;
				case "SCIENCE" :
					lib.kitaplistelemek(Book.Tur.SCIENCE);
					break;
				case "HISTORY" :
					lib.kitaplistelemek(Book.Tur.HISTORY);
					break;
				case "FICITON" :
					lib.kitaplistelemek(Book.Tur.FICITON);
					break;
				case "PHILOSOPHY" :
					lib.kitaplistelemek(Book.Tur.PHILOSOPHY);
					break;
				
				default :
					System.out.println("This Category is not exsist! ");
					break;
				}
				break;
			default :
				System.out.println("This Operation is not exsist!");
				break;
		}
	}
}
