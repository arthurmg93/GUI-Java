/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.ArrayList;
import java.util.Collections;
/**
 * Classe ListaPerfil
 */
public class ListaPerfil
{
    // instance variables - replace the example below with your own
    private static ArrayList<Perfil> perfis;

    /**
     * Construtor de objetos da classe ListaPerfil
     */
    public ListaPerfil()
    {
        perfis = new ArrayList<Perfil>();
    }

    /**
     * Metodo para adicionar um novo Perfil e lista de Perfis
     */
    public void addPerfil(Perfil p)
    {
        if (checkUnico(p) == true)
        {
            perfis.add(p);
        }
    }
    
    /**
     * Checa se um perfil eh unico
     */
    public boolean checkUnico(Perfil p)
    {
        String busca = p.getNomePerfil();
        boolean resultado = false;
        if (perfis.isEmpty() == true)
        {
            resultado = true;
            return resultado;
        }
        else{
            for (Perfil n: perfis)
            {
                if (n.getNomePerfil().equals(busca))
                {
                    resultado = true;
                    return resultado;
                }
            }
        }
        return resultado;
    }
    
    /**
     * Lista os perfis em ordem alfabetica
     */
    public ArrayList listarPerfis()
    {
        ArrayList ordenado = new ArrayList(perfis);
        Collections.sort(ordenado);
        return ordenado;
    }
    
    /**
     * Remove um Perfil da lista de Perfis
     */
    public void removerPerfil(String name)
    {
        for (Perfil p: perfis)
        {
            if (p.getNomePerfil().equals(name))
            {
                perfis.remove(p);
            }
        }
    }
}
