package praktikum5;
import java.util.Scanner;

public class Test {
	public static void main(String []args) {
		String nama, warna;
		int berat;
		Scanner input = new Scanner(System.in);
		Cat KucingSaya = new Cat();
		
		System.out.print("Masukkan nama kucing : ");
		nama = input.next();
		
		System.out.print("Masukkan warna kucing : ");
		warna = input.next();
		
		System.out.print("Masukkan berat kucing : ");
		berat = input.nextInt();
		
		KucingSaya.identitas(nama, warna, berat);
		KucingSaya.eat();
		
		System.out.println("kucing "+KucingSaya.ambilNAma()
		+" warnanya "+KucingSaya.ambilWarna()
		+" beratnya "+KucingSaya.ambilBerat()+" kg"
		+ "ada di teras");
	}
	
}
