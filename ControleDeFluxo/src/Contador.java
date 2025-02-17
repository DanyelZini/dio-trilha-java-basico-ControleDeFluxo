import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
		try (Scanner terminal = new Scanner(System.in)) {
			System.out.println("Digite o primeiro parâmetro");
			int parametroUm = terminal.nextInt();
			System.out.println("Digite o segundo parâmetro");
			int parametroDois = terminal.nextInt();
			
			try {
				contar(parametroUm, parametroDois);		
			}catch (ParametrosInvalidosException exception) {
				exception.printStackTrace();
			}
		}
		
	}
	static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
		if (parametroUm >= parametroDois)
			throw new ParametrosInvalidosException();
		
		for(int i = 1; i <= (parametroDois - parametroUm); i++)
			System.err.println("Imprimindo o número " + i);
	}
}
