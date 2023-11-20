package com.school;

/**
 * Classe para criar e gerir objetos do tipo ContaBancaria
 */
public class ContaBancaria {
    //Atributos
    private String nib; //o número do nib da conta bancária
    private Cliente titular;   //o titular da conta bancária
    private double saldo;   //o saldo da conta bancária

    //Métodos construtores

    /**
     * Construtor default
     * Só deve ser utilizado quando não existir mais nenhum
     */
    public ContaBancaria() {
    }

    /**
     * Construtor completo
     * Permite permite criar objetos com todos os atributos
     * @param nib recebe uma String com o número da conta bancária
     * @param titular recebe um objeto do tipo Cliente com o titular da conta bancária
     * @param saldo recebe uma valor com o saldo da conta bancária
     */
    public ContaBancaria(String nib, Cliente titular, double saldo) {
        this.nib = nib;
        this.titular = titular;
        this.saldo = saldo;
    }

    //Métodos getters

    /**
     * Obtém o número da conta bancária
     * @return devolve o número da conta bancároa
     */
    public String getNib() {
        return nib;
    }

    /**
     * Obtém o titular da conta bancária
     * @return devolve o titular da conta bancária
     */
    public Cliente getTitular() {
        return titular;
    }

    /**
     * Obtém o saldo da conta bancária
     * @return devolve o saldo da conta bancária
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * Associa um cliente a uma conta bancária
     * @param titular recebe um cliente para associar a uma conta bancária
     */
    public void associarCliente(Cliente titular){
        this.titular = titular;
    }

    /**
     * Permite depositar dinheiro numa conta bancária
     * @param quantia recebe o valor da quantia a depositar
     * @return devolve o saldo atualizado da conta bancária
     */
    public double depositar(double quantia){
        saldo = saldo + quantia;
        return saldo;
    }

    /**
     * Permite levantar o dinheiro da conta bancária
     * Restrições: só é permitido levantar uma quantia inferior ou
     * igual ao valor existente na conta bancária
     * @param quantia recebe o valor da quantia a levantar
     * @return devolve se a operação foi realizada com sucesso (true)
     * ou não foi possível levantar a quantia (false)
     */
    public boolean levantar(double quantia){
        if (quantia > saldo)
            return false;
        else{
            saldo = saldo + quantia;
            return true;
        }
    }
}
