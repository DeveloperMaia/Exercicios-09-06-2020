import java.util.Scanner;

public class num3 {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner (System.in);
		
		double a,b,c,d;//cada letra uma nota
		
		System.out.println("Descubra se est� aprovado! Digite suas 4 notas em sequ�ncia:");
		
		a=leitor.nextDouble();
		b=leitor.nextDouble();
		c=leitor.nextDouble();
		d=leitor.nextDouble();
		
		if((a+b+c+d)/4 >=7) {
			
			System.out.println("Sua m�dia � "+(a+b+c+d)/4+" e voc� foi APROVADO!");
		}
		
		else {
			System.out.println("Sua m�dia � "+(a+b+c+d)/4+" e voc� foi REPROVADO!");
		}
	
		
		
		
		
		
		
		
		
		
		
		

	}

}
