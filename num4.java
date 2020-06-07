import java.util.Scanner;

public class num4 {

	public static void main(String[] args) {
		
		
		Scanner leitor = new Scanner ( System.in);
		
		double x,y;
		int opr;
		
		System.out.println("Digite dois números:");
		x=leitor.nextDouble();
		y=leitor.nextDouble();
		System.out.println("Em sequência a operação desejada:");
		System.out.println("1- Soma");
		System.out.println("2- Subtração");
		System.out.println("3- Divisão");
		System.out.println("4- Multiplicação");
		opr=leitor.nextInt();
		
		switch (opr) {
		
	case 1:
		System.out.println("O resultado é: "+(x+y));
		break;
	case 2:
		System.out.println("O resultado é: "+(x-y));
		break;
	case 3 :
		System.out.println("O resultado é: "+(x/y));
		break;
	case 4 :	
		System.out.println("O resultado é: "+(x*y));
		break;
		
		default: System.out.println("Não é possível completar essa operação.");
		
		
		
		
		
		
		
		
		
		
		
		}
		

	}

}
