import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class ProductManangement extends Managment{
	
	static List<Product>ProductArrayList=new ArrayList<>();
	
	Scanner scanner=new Scanner(System.in);
	
	public String Descrption;
	public double Price;
	
	
	public void Ekleme() {
		System.out.print("Bir Id giriniz:");
		int id=scanner.nextInt();
		scanner.nextLine();
		
		System.out.print("Ismi giriniz: ");
		String name=scanner.nextLine();
		
		System.out.print("Tarif ediniz:");
		String desc=scanner.nextLine();
		
		System.out.print("Fiyatı giriniz: ");
		double price=scanner.nextDouble();
		
		Product product1=new Product(id, name, desc, price);
	    ProductArrayList.add(product1);
	    
	}
	public void Listeleme() {
		for(Product a:ProductArrayList) {
			System.out.println("Id:"+a.id);
			System.out.println("Isim :"+a.name);
			System.out.println("Tarif : "+a.Descrption);
			System.out.println("Fiyat:"+ a.Price);
			System.out.println("Aktiflik durumu:"+a.IsDelete);
			System.out.println("Status :"+a.Status);
			System.out.println("-----------------------");
		}
	}
	public void Silme(int i) {
		boolean kontrol=true;
		for(Product a:ProductArrayList) {
			if(a.id==i) {
				ProductArrayList.remove(a);
				System.out.println("Bir eleman kaldırılıyor...");
				kontrol=false;
				break;
			}
		}
		if(kontrol) {
			System.out.println("sistemde verdiğiniz id'ye ait bir eleman bulunmuyor");
		}
		Listeleme();
	}
	public void Detay(int id) {
		boolean kontrol=true;
		for(Product a:ProductArrayList) {
			if(a.id==id) {
				System.out.println("Productin Id'si: "+a.id);
				System.out.println("Productın ismi:"+ a.name);
				System.out.println("Productın fiyati:" +a.Price);
				kontrol=false;
				break;
			
			}
		}
		if(kontrol) {
			System.out.println("Girdiğiniz id'yi veri tabanında bulunmuyor");
		}
		
	}


}
