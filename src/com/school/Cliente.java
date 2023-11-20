package com.school;

/**
 * Classe para criar e gerir objetos do tipo Cliente
 */
public class Cliente {
    //Atributos
    private String nome; //nome do cliente
    private String apelido; //apelido do cliente

    //Métodos construtores

    /**
     * Construtor default
     * Só deve ser utilizado quando não existir mais nenhum
     */
    public Cliente() {
    }

    /**
     * Construtor completo
     * Permite permite criar objetos com todos os atributos
     * @param nome recebe uma String com o nome do cliente
     * @param apelido recebe uma String com o apelido do cliente
     */
    public Cliente(String nome, String apelido) {
        this.nome = nome;
        this.apelido = apelido;
    }
}
