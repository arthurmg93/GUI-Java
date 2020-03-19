/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Classe Cargo
 */
public class Cargo
{
    // Atributos da classe Cargo
    private String nome;

    /**
     * Construtor de objetos da classe Cargo
     */
    public Cargo(String name)
    {
        this.nome = name;
    }

    /**
     * Retorna o nome do cargo
     */
    public String getNomeCargo()
    {
        return this.nome;
    }
    
    /**
     *  Metodo para editar o nome do cargo
     */
    
    public void editCargo(String name)
    {
        this.nome = name;
    }
    
}