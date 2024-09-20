// 11/9/2024
import java.util.Scanner;

public class inputkeyboard02 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String nama, NIM, PS;

        System.out.println("=========== input =========");
        System.out.print("Nama : ");
        nama = in.nextLine();
        System.out.print("NIM  : ");
        NIM = in.nextLine();
        System.out.print("Program Studi : ");
        PS = in.nextLine();

        System.out.println(" ");

        System.out.println("=========== output ========");
        System.out.print("Hi " +nama+ ", Anda terdaftar dengan NIM: " +NIM+ " di program studi " +PS+ ".");
    }
}
