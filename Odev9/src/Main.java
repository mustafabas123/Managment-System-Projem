import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		boolean kontrol1=true;
		boolean kontrol2=false;
		boolean kontrol3=false;
		User user1=new User();
		Product product1=new Product();
		
		while(kontrol1) {
			System.out.print("User işlemleri için (1) Product işlemleri için (2) 'ye basın :");
			String islem1=scanner.nextLine();
			if(islem1.equals("1")){
				kontrol2=true;
				
				while(kontrol2) {
					System.out.println("***********************************");
					System.out.println("User Ekleme için (1)\n User Listelemek için (2)\n User Silmek için (3)\n User Detay (4)\nUser Sisteminde Çıkmak için (5) ");
					System.out.print("İşlem :");
					String islem2=scanner.nextLine();
					if(islem2.equals("1")) {
						user1.Ekleme();
					}
					else if(islem2.equals("2")) {
						if(UserManangment.UserArrayList.size()==0) {
							System.out.println("Bu listenin ici boş ");
						}
						else {
							user1.Listeleme();
						}						
				    }
					else if(islem2.equals("3")) {						
						System.out.print("Silmek istediğiniz kişnin id'si:");
						int Id=scanner.nextInt();
						user1.Silme(Id);					
						}
					else if(islem2.equals("4")) {
						System.out.print("Görmek istediğiniz kişinin Id'sini giriniz: ");
						int id=scanner.nextInt();
						user1.Detay(id);
				    }
					else if(islem2.equals("5")) {
						kontrol2=false;
				    }
				}
			}
			else if(islem1.equals("2")) {
				
				kontrol3=true;
				
				while(kontrol3) {
					System.out.println("**********************************");
					System.out.println("Product Ekleme için (1)\n Product Listelemek için (2) \n Product Silmek için (3)\n Product Detay (4) \n Product Sisteminde Çıkmak için (5) ");
					System.out.print("İşlem :");
					String islem3=scanner.nextLine();
					if(islem3.equals("1")) {
						product1.Ekleme();
					}
					else if(islem3.equals("2")) {
						if(ProductManangement.ProductArrayList.size()==0) {
							System.out.println("Bu listenin ici boş ");
						}
						else {
							product1.Listeleme();
						}
				    }
					else if(islem3.equals("3")) {
						System.out.print("Silmek istediğiniz kisinin Id'sini giriz :");
						int id=scanner.nextInt();
						product1.Silme(id);
				    }
					else if(islem3.equals("4")) {
						System.out.print("Detayları görmek istediğiz kişinin id'si ni giriniz : ");
						int id=scanner.nextInt();
						product1.Detay(id);
				    }
					else if(islem3.equals("5")) {
						kontrol3=false;
				    }
				}
				
			}else {
				System.out.println("Gecersiz islem");
				
			}
		}

	}

}

