import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class User extends UserManangment{
	 static Scanner scanner=new Scanner(System.in);	
//	public String name;
//	public String surname;
//	public String password;
//	public int id;	
//	public boolean Status;
//	public  boolean IsDelete;
	public User(String name,String surname,String password,int id) {
		this.name=name;
		this.surname=surname;
		this.password=password;
		this.id=id;		
		this.Status=true;
		this.IsDelete=false;
		
	}
	public User() {
		
	}
	
//	public void Ekleme() {
//		
//	      
//	}
//	public  void Listeleme() {
//		
//	}
//	public void Silme() {
//		
//	}
//	public void Detay() {
//		
//	}

}
