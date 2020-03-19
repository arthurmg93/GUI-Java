/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.ArrayList;
import java.util.Collections;
/**
 * Classe ListaCargo
 */
public class ListaCargo
{
    
    private ArrayList<Cargo> cargos;

    /**
     * Constructor for objects of class ListaCargo
     */
    public ListaCargo()
    {
        cargos = new ArrayList<Cargo>();
    }

    /**
     * Metodo para adicionar um novo Cargo e lista de Perfis
     */
    public void addPerfil(Cargo c)
    {
        if (checkUnico(c) == true)
        {
            cargos.add(c);
        }
    }
    
    /**
     * Checa se um cargo eh unico
     */
    public boolean checkUnico(Cargo c)
    {
        String busca = c.getNomeCargo();
        boolean resultado = false;
        if (cargos.isEmpty() == true)
        {
            resultado = true;
            return resultado;
        }
        else{
            for (Cargo n: cargos)
            {
                if (n.getNomeCargo().equals(busca))
                {
                    resultado = true;
                    return resultado;
                }
            }
        }
        return resultado;
    }
    
    /**
     * Lista os cargos em ordem alfabetica
     */
    public ArrayList listarCargos()
    {
        ArrayList ordenado = new ArrayList(cargos);
        Collections.sort(ordenado);
        return ordenado;
    }
    
    /**
     * Remove um Perfil da lista de Perfis
     */
    public void removerCargo(String name)
    {
        for (Cargo c: cargos)
        {
            if (c.getNomeCargo().equals(name))
            {
                cargos.remove(c);
            }
        }
    }
}
