import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class UserManangment extends Managment{
	public String surname;
	public String password;
	
	Scanner scanner=new Scanner(System.in);
	static List<User>UserArrayList=new ArrayList<>();
	
	public void Ekleme() {
		System.out.print("Bir isim giriniz: ");
		String isim=scanner.nextLine();
		
		System.out.print("Bir soyismini giriniz: ");
		String SoyIsim=scanner.nextLine();
		
		System.out.print("Bir password giriniz: ");
		String Passaword=scanner.nextLine();
		
		System.out.print("Bir Id ekle: ");
		int Id=scanner.nextInt();
		scanner.nextLine();
		User user1=new User(isim,SoyIsim,Passaword,Id);
		UserArrayList.add(user1);
	      
	}
	public void Listeleme() {
		for(User a:UserArrayList) {
			System.out.println("Id:"+a.id);
			System.out.println("Isim:"+a.name);
			System.out.println("SoyIsim:"+a.surname);
			System.out.println("Passaword:"+a.password);
			System.out.println("Aktiflik durumu:"+a.IsDelete);
			System.out.println("Status :"+a.Status);
			System.out.println("-----------------------");
		}
		
	}
	
	public void Silme(int id) {
		boolean kontrol=true;
		for(User a:UserArrayList) {
			if(a.id==id) {
				UserArrayList.remove(a);
				System.out.println("Silme işlemi gerçekleşti");
				kontrol=false;
				break;
			}			
		}
		if(kontrol) {
			System.out.println("Girdiğiniz id veritabanında bulunmuyor");
		}
	}
	public  void Detay(int id) {
		boolean kontrol=true;
		for(User a:UserArrayList) {
			if(a.id==id) {
				System.out.println("Adı: "+a.name);
				System.out.println("SoyAdı: "+a.surname);
				System.out.println("Password:"+a.password);
				kontrol=false;
				break;
			}
		}
		if(kontrol) {
			System.out.println("Girdiğiniz id'ye veri tabanıda bulunmuyor");
		}
		
	}
	public void Silme() {
		System.out.println("Bu id Listenin içinde bulunmuyor");
	}

}
