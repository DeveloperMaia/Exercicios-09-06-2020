import java.util.Scanner;

public class num2 {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner (System.in);
		
		int x,y;
		double soma=0;
		
		System.out.println("Digite dois números diferentes em sequência:");
		x=leitor.nextInt();
		y=leitor.nextInt();
		
		if (x<y) {
			
			do {
			
			soma=x+soma;
			x++;
		}
		
		while (x<y);
		
		
		System.out.println("A soma de todos números interios de um ao outro é igual á: "+(soma+y));}
		
		
		if(x>y) {
		
			do {
				
				soma=y+soma;
				y++;
			}
			
			while (y<x);
		
			System.out.println("A soma de todos números interios de um ao outro é igual á: "+(soma+x));}

			

}}
