package com.school;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //Inserir os dados para o cliente
        System.out.print("Insere o nome do cliente: ");
        String nome = input.next();
        System.out.print("Inserre o apelido do cliente: ");
        String apelido = input.next();
        //Instancia um objeto do tipo Cliente
        Cliente cliente = new Cliente(nome, apelido);
        //Ler dados do cliente
        System.out.println("Nome: "+cliente.getNome());
        System.out.println("Apelido: "+cliente.getApelido());
        //Inserir o nib da conta bancária
        System.out.print("Insere o número da conta: ");
        String nib = input.next();
        ContaBancaria cb = new ContaBancaria(nib, null, 0);
        //Associar o cliente a uma conta
        cb.associarCliente(cliente);
        //Depositar dinheiro
        System.out.print("Quantia a depositar: ");
        double quantia = input.nextDouble();
        cb.depositar(quantia);
        System.out.println("NIB: "+cb.getNib());
        System.out.println("Nome do titular da conta: "+cb.getTitular().getNome()+" "+cb.getTitular().getApelido());
        System.out.println("Saldo: "+cb.getSaldo()+"€");

    }
}
