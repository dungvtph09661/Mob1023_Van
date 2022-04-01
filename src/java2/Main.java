
package java2;

import java.util.Scanner;

public class Main {
     public static void main(String[] args) {
    
    
      Scanner scanner = new Scanner(System.in);
       System.out.println("ho va ten:");
       String hoTen = scanner.nextLine();
       System.out.println("Diem trung binh:");
       double diemTB = scanner.nextDouble();
       
       System.out.printf("SV: %s; %3f", hoTen,diemTB);
      
} 
}
