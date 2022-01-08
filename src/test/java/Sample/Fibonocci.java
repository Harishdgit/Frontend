package Sample;

import java.util.Scanner;

public class Fibonocci {
   static Scanner sc;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sc= new Scanner(System.in);
		int count = sc.nextInt();
        fibonocci(count);
		System.out.println("Fibb");
		System.out.println("learn new world");
	}
	private static void fibonocci(int count) {
        
		int first =0;
		int second =1;
		int sum=0;
		System.out.print(first +" "+second);
        for(int i=2;i<count;i++){
        	System.out.print(" "+(sum=first+second)+" ");
        	first=second;
        	second=sum;
        }
		
		 
		
	}

}
