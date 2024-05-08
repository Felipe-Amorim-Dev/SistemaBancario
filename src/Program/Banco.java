package Program;

import Controller.BontaBancariaController;
import java.util.Scanner;
import java.time.*;

import Entities.Cliente;
import Entities.ContaBancaria;

public class Banco {
		
	private static BontaBancariaController bontaBancaria = new BontaBancariaController();	
	
	public static void main(String[] args) 
	{							
		
		Scanner input = new Scanner(System.in);				
		
		System.out.println("\n Programa para gerir contas bancarias \n");
		
		System.out.println("Menu");
		System.out.println("Escolha uma das opções:");
		System.out.println("1 - Criar Conta \n 2 - Consultar \n 3 - Depositar \n 4 - Sacar \n 5 - Encerrar");
		
		System.out.print("\n Informe a opção desejada: ");
		var opcao = input.nextInt();
		
		switch(opcao)
		{
		case 1:						
			try 
			{				
				bontaBancaria.CadastrarCliente();				
			}
			
			catch (Exception e) 
			{
				System.out.println("Erro" + e.getMessage());
			}
			
			break;
			
		case 2:						
			try 
			{				
				bontaBancaria.ConsultarCliente();
			}
			
			catch (Exception e) 
			{
				System.out.println("Erro" + e.getMessage());
			}
			
			break;
			
		case 3:			
			try 
			{				
				bontaBancaria.Depositar();
			}
			
			catch (Exception e) 
			{
				System.out.println("Erro" + e.getMessage());
			}
			break;
			
		case 4: 
			try 
			{				
				bontaBancaria.Sacar();
			}
			
			catch (Exception e) 
			{
				System.out.println("Erro" + e.getMessage());
			}
			break;
			
		case 5:
			System.out.println("FIM.");
			break;
		
		default:
			System.out.println("Opção inválida, Tente outra!");
			break;
		}
		
		System.out.println("Deseja voltar ao menu? (S, N)");
		if(input.next().equalsIgnoreCase("s"))
		{
			main(args);
		}				
		else
		{
			System.out.println("FIM.");
		}
	}
}
