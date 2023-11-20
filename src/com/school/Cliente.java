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

    //Métodos getters

    /**
     * Obtém o nome do cliente
     * @return devolve o nome do cliente
     */
    public String getNome() {
        return nome;
    }

    /**
     * Obtém o apelido do cliente
     * @return devolve o apelido do cliente
     */
    public String getApelido() {
        return apelido;
    }

    //Métodos setters

    /**
     * Atribui um novo valor ao atributo nome do objeto
     * @param nome novo valor para o nome do Cliente
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * Atribui um novo valor ao atributo apelido do objeto
     * @param apelido novo valor para o apelido do Cliente
     */
    public void setApelido(String apelido) {
        this.apelido = apelido;
    }
}
