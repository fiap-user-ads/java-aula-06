package br.com.fiap.main;

import javax.swing.JOptionPane;

import br.com.fiap.beans.Cliente;
import br.com.fiap.beans.Conta;
import br.com.fiap.beans.Endereco;

public class TesteBank {
	public static void main(String[] args) {
		Cliente objCliente = new Cliente(
			JOptionPane.showInputDialog("Informe o nome do cliente"),
			Integer.parseInt(JOptionPane.showInputDialog("Informe a idade do cliente")),
			Double.parseDouble(JOptionPane.showInputDialog("Informe o peso do cliente"))
		);
		
		Conta objConta = new Conta(
			Double.parseDouble(JOptionPane.showInputDialog("Informe o saldo do cliente"))
		);
		objConta.setNomeCliente(objCliente);
		
		Endereco objEndereco = new Endereco(
			JOptionPane.showInputDialog("Informe o logradouro do cliente"),
			Integer.parseInt(JOptionPane.showInputDialog("Informe o numero do endereco")),
			JOptionPane.showInputDialog("Informe o CEP do cliente")
		);
		objCliente.setEndereco(objEndereco);
		
		// saida
		
		System.out.println(
			"Nome do cliente: " + objConta.getNomeCliente().getNome()
		);
	}
}
