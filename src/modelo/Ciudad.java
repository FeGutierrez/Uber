/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import becker.robots.City;
import java.util.ArrayList;

/**
 *
 * @author Flexxo333
 */
public class Ciudad extends City{
    
    private ArrayList<Cliente> todosLosClientes;
    

    public Ciudad(String string) {
        super(string);
        this.todosLosClientes = new ArrayList<>();
    }

    public ArrayList<Cliente> getTodosLosClientes() {
        return todosLosClientes;
    }
    
    
    
}
