package hafta_13;

import java.util.ArrayList;
import java.util.Scanner;
public class Library {
		
	public ArrayList<Book> books = new ArrayList<Book>();
	
	public void kitapEkle(Book book)
	{
		
		books.add(book);
	}
	public void kitapKaldir(Book kitap)
	{
		books.remove(kitap);
	}
	public void kitaplarGet()
	{
		if(books.size() != 0)
		{
			for(int i = 0; i < books.size(); i++)
			{
				System.out.println(books.get(i).ToString());
				System.out.println("");
			}
		}else {
			System.out.println("This Book is not exsist!");
		}
		System.out.println(books.size() + " Books Found");
	}
	public void kitaplistelemek(Book.Tur tur)
	{
		ArrayList<Book> kitapListesi = new ArrayList<Book>(); 
		Book simdikiKitap ;
		for(int i = 0; i < books.size(); i++)
		{
			simdikiKitap = books.get(i);
			if(tur == simdikiKitap.turGet())
			{
				kitapListesi.add(simdikiKitap);
			}
		}
		if(kitapListesi.size() != 0)
		{
			for(int i = 0; i < kitapListesi.size(); i++)
			{
				System.out.println(kitapListesi.get(i).ToString());
			}
		}else {
			System.out.println("Empty");
		}
		System.out.println(kitapListesi.size() + " Books Found");
	}
	public void YiliArasi(int yil)
	{
		ArrayList<Book> kitapListesi = new ArrayList<Book>(); 
		int kitapYayinYili ;
		for(int i = 0; i < books.size(); i++)
		{
			kitapYayinYili = books.get(i).yayinYiliGet();
			if(kitapYayinYili == yil)
			{
				kitapListesi.add(books.get(i));
			}
		}
		if(kitapListesi.size() != 0)
		{
			for(int i = 0; i < kitapListesi.size(); i++)
			{
				System.out.println(kitapListesi.get(0).ToString());
			}
		}
		System.out.println(kitapListesi.size() + " Books Found");
	}

}


//Kitap Sınıfı
class Book{
	
	private String kitapAdi,yazarAdi,ISBN;
	private int yayinYili;
	private Tur Tur;
	Book(String kitapAdi,String yazarAdi,int yayinYili ,Tur tur ,String ISBN)
	{
		this.kitapAdi = kitapAdi;
		this.yazarAdi = yazarAdi;
		this.yayinYili = yayinYili;
		this.ISBN = ISBN;
		this.Tur = tur;
	}
	enum Tur{
		ROMANTIC,HORROR,SCIENCE,HISTORY,FICITON,PHILOSOPHY
	}
	
	//Getter ve Getter Metotlar Tanıma
	public void kitapAdiSet(String x)
	{
		this.kitapAdi = x;
	}
	public String kitapAdiGet()
	{
		return kitapAdi;
	}
	public void YazarSet(String x)
	{
		this.yazarAdi = x;
	}
	public String YazarGet()
	{
		return yazarAdi;
	}
	public void yayinYiliSet(int x)
	{
		this.yayinYili = x;
	}
	public int yayinYiliGet()
	{
		return yayinYili;
	}
	public void ISBNSet(String x)
	{
		this.ISBN = x;
	}
	public String ISBNGet()
	{
		return ISBN;
	}
	public void turSet(Tur x)
	{
		this.Tur = x;
	}
	public Tur turGet()
	{
		return Tur;
	}
	public String ToString()
	{
		return "*********************************** \n"
				+ "Book Name : " + kitapAdi + " \n"
				+ "Author : " + yazarAdi + " \n"
				+ "Published : " + yayinYili + " \n"
				+ "Book Category : " +   Tur + " \n"
				+ "ISBN :" +   ISBN + " \n" +
				"***********************************"
				;
	}
	
}
