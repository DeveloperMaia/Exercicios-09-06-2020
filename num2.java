import java.util.Scanner;

public class num2 {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner (System.in);
		
		int x,y;
		double soma=0;
		
		System.out.println("Digite dois n�meros diferentes em sequ�ncia:");
		x=leitor.nextInt();
		y=leitor.nextInt();
		
		if (x<y) {
			
			do {
			
			soma=x+soma;
			x++;
		}
		
		while (x<y);
		
		
		System.out.println("A soma de todos n�meros interios de um ao outro � igual �: "+(soma+y));}
		
		
		if(x>y) {
		
			do {
				
				soma=y+soma;
				y++;
			}
			
			while (y<x);
		
			System.out.println("A soma de todos n�meros interios de um ao outro � igual �: "+(soma+x));}

			

}}
