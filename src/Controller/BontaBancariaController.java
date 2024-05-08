package Controller;

import java.time.LocalDateTime;

import Entities.Cliente;
import Entities.ContaBancaria;
import java.util.Scanner;
import java.util.UUID;
import java.time.*;
import java.util.List;
import java.util.ArrayList;

public class BontaBancariaController 
{			
	
	private static Cliente cliente = new Cliente();
	
	public void CadastrarCliente() 
	{				
		try {						
						
			cliente.conta = new ContaBancaria(); 
			
			Scanner input = new Scanner(System.in);
						
			System.out.println("\n Criar conta");

			System.out.println("\n Cadastrar Cliente");
			
			cliente.setId(UUID.randomUUID());

			System.out.print("Informe o nome do cliente: ");
			cliente.setNome(input.next());

			System.out.print("Informe o sexo do cliente: ");
			cliente.setSexo(input.next());

			System.out.print("Informe o CPF do cliente: ");
			cliente.setCpf(input.nextInt());

			System.out.println("\n Cadastrar conta bancaria");						

			cliente.conta.setId(UUID.randomUUID());
			
			System.out.print("Informe o numero da conta: ");
			cliente.conta.setNumeroConta(input.nextInt());

			System.out.print("Informe a agencia: ");
			cliente.conta.setAgencia(input.nextInt());

			System.out.print("Informe o nome do Banco: ");
			cliente.conta.setNomeBanco(input.next());

			System.out.print("Informe o saldo da conta: ");
			cliente.conta.setSaldo(input.nextDouble());

			System.out.println("\n Profavor confira os dados cadastrados: \n");

			System.out.println("Nome do cliente: " + cliente.getNome());
			System.out.println("Sexo: " + cliente.getSexo());
			System.out.println("CPF: " + cliente.getCpf());
			System.out.println("ID do cliente: " + cliente.getId().toString());
			System.out.println("\n Profavor confira os dados da conta: \n");

			System.out.println("Número da conta: " + cliente.conta.getNumeroConta());
			System.out.println("Número da Agencia: " + cliente.conta.getAgencia());
			System.out.println("Banco: " + cliente.conta.getNomeBanco());
			System.out.println("Saldo: " + cliente.conta.getSaldo());
			System.out.println("ID da conta: " + cliente.conta.getId().toString());
			
			cliente.setDataHoraCriacao(LocalDateTime.now());
			System.out.println("\n Conta Criada com Sucesso!" + cliente.getDataHoraCriacao());							

		} catch (Exception e) {
			System.out.println("Ocorreu um erro, não foi possivel criar a conta bancaria" + e.getMessage());			
		}		
				
	}

	public void ConsultarCliente() 
	{						
		try 
		{						
			Scanner input = new Scanner(System.in);					
			System.out.println("\n Informe o numero da conta para consulta: ");
				if(input.nextInt() == cliente.conta.getNumeroConta()) {
					System.out.println("Nome do cliente: " + cliente.getNome());
                    System.out.println("CPF: " + cliente.getCpf());
                    System.out.println("Número da conta: " + cliente.getConta().getNumeroConta());
                    System.out.println("Número da Agência: " + cliente.getConta().getAgencia());
                    System.out.println("Banco: " + cliente.getConta().getNomeBanco());
                    System.out.println("Saldo: " + cliente.getConta().getSaldo());                    
				}
				else {
					System.out.println("Conta não encontrada.");					
				}
			
		} 
		catch (Exception e) 
		{
			System.out.println("Ocorreu um erro, não foi possivel consultar a conta bancaria." + e.getMessage());			
		}		
	}

	public void Depositar() 
	{			
		try 
		{						
			Scanner input = new Scanner(System.in);					
			
			System.out.println("\n Informe o numero da conta: ");
			var dataNumeroConta = input.nextInt();
			System.out.println("\n Informe o numero da Agencia: ");
			var dataAgencia = input.nextInt();					
			
				if(dataNumeroConta == cliente.conta.getNumeroConta() && dataAgencia == cliente.conta.getAgencia()) {
					System.out.println("Nome do cliente: " + cliente.getNome());
                    System.out.println("CPF: " + cliente.getCpf());
                    System.out.println("Informe o valor para deposito: ");
                    var valorDeposito = input.nextDouble();
                    cliente.conta.setSaldo(cliente.conta.getSaldo() + valorDeposito);
				}
				else {
					System.out.println("Conta não encontrada.");					
				}
			
		} 
		catch (Exception e) 
		{
			System.out.println("Ocorreu um erro, não foi encontrado a conta bancaria." + e.getMessage());			
		}	
	}

	public void Sacar() 
	{
		try 
		{						
			Scanner input = new Scanner(System.in);					
			
			System.out.println("\n Informe o numero da conta: ");
			var dataNumeroConta = input.nextInt();
			System.out.println("\n Informe o numero da Agencia: ");
			var dataAgencia = input.nextInt();					
			
				if(dataNumeroConta == cliente.conta.getNumeroConta() && dataAgencia == cliente.conta.getAgencia()) {					                    
                    System.out.println("Informe o valor para saque: ");
                    var valorSacar = input.nextDouble();
                    cliente.conta.setSaldo(cliente.conta.getSaldo() - valorSacar);
                    System.out.println("\n Saldo atual da conta é: " + cliente.conta.getSaldo());
				}
				else {
					System.out.println("Conta não encontrada.");					
				}
			
		} 
		catch (Exception e) 
		{
			System.out.println("Ocorreu um erro, não foi encontrado a conta bancaria." + e.getMessage());			
		}	
	}
}
