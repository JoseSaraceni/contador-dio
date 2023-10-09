import java.util.Scanner;

public class contadorDio extends  ParametrosInvalidosException  {
	public static void main(String[] args) {
		Scanner terminal = new Scanner(System.in);
		System.out.println("Digite o primeiro parâmetro");
		int parametroUm = terminal.nextInt();
		System.out.println("Digite o segundo parâmetro");
		int parametroDois = terminal.nextInt();
		
		try {
			//chamando o método contendo a lógica de contagem
			contar(parametroUm, parametroDois);
		
		}catch (ParametrosInvalidosException  e) {
			//imprimir a mensagem: O segundo parâmetro deve ser maior que o primeiro
            System.out.println("O Segundo parâmetro deve ser maior que o primeiro");
		}
		
	}
	static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException  {
		//validar se parametroUm é MAIOR que parametroDois e lançar a exceção
        int contagem = parametroDois - parametroUm;
        if(parametroUm > parametroDois){
            throw new ParametrosInvalidosException();
        }
		

        for(contagem = parametroUm ; contagem <= parametroDois; contagem ++){
            System.out.println(contagem);
        }
	}
}