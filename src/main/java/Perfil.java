/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Classe Perfil
 */
public class Perfil
{
    // Atributos da classe perfil
    private String nome;

    /**
     * Construtor de objetos da classe Perfil
     */
    public Perfil(String name)
    {
        this.nome = name;
    }

    /**
     * Retorna o nome do Perfil
     */
    public String getNomePerfil()
    {
        return this.nome;
    }
    
    /**
     * Edita o nome do Perfil
     */
    public void editaPerfil(String name)
    {
        this.nome = name;
    }
}
