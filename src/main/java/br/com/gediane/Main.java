package br.com.gediane;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		int opcao; 
		Scanner in = new Scanner(System.in);

        Registro registro = new Registro();
       // registro.setNum1(5);
       // registro.setNum2(5);
        
        Retirada retirada = new Retirada();
        
        System.out.println("Abrindo sistema de estoque ...");
        System.out.println("Escolha uma das opções:");
        System.out.println( " 1: Registrar.");
        System.out.println( " 2: Retirar protudo do estoque.");
        System.out.println( " 3: Consultar estoque");
        
        opcao = in.nextInt();
	
        switch (opcao) {
		case 1: registro.Registrar();
			break;
		case 2:  retirada.Retirar(); 
			break;
		case 3:
			break;
		case 5:
			System.out.println("Aplicativo Finalizado");
			break;
		default:
			System.out.println("Opção inválida");
			break;
	} while (opcao != 6);
}
        
}     
        
       



