package elements;

import java.util.Scanner;
import java.util.InputMismatchException;

public class task2 {
	public static void main(String[]args) {
		Scanner sc = null;
		try {
		System.out.println("enter the salary:");
		sc =new Scanner(System.in);
				double salary = sc.nextDouble();
				if(salary==10000) {
					System.out.println("your salary is 10000");
				}else if (salary == 20000) {
					System.out.println("your salary is 20000");
				}else if (salary == 30000) {
					System.out.println("your salary is 30000");
				}else if (salary == 40000) {
					System.out.println("your salary is 40000");
				}else if (salary == 50000) {
					System.out.println("your salary is 50000");
				}else if (salary == 60000) {
					System.out.println("your salary is 60000");
				}else {
					System.out.println("your salary is 70000 ");
				}}catch(InputMismatchException e) {
					System.out.println(e);
				}finally {
					sc.close();
				}
	}

}
