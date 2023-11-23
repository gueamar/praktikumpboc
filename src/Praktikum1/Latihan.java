package Praktikum1;
import java.util.Scanner;

public class Latihan {
	public static void main(String args[]) {
		System.out.println("Hello World");
		int angka1, angka2, hasil;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Masukkan Angka 1 : ");
		angka1 = input.nextInt();
		
		System.out.println("Masukkan Angka 2 : ");
		angka2 = input.nextInt();
		
		hasil = angka1 + angka2;
		System.out.println("Hasilnya : "+hasil);
		
		String namaDepan, namaBelakang, fullName;
		System.out.print("Masukkan nama depan :");
		namaDepan = input.next();
		System.out.print("Masukkan nama belakang :");
		namaBelakang = input.next();
		fullName = namaDepan + "" + namaBelakang;
		System.out.print(fullName);
	}

}
