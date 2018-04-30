/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import becker.robots.Direction;
import modelo.*;

/**
 *
 * @author Flexxo333
 */
public class Main {
    
    public static void main(String[] args) {
        
        Ciudad objetos = new Ciudad("Field.txt");
        
        Cliente cliente = new Cliente(objetos, 0, 0, Direction.EAST, 5, 5);
        
        Cliente cliente2 = new Cliente(objetos, 1, 1, Direction.EAST, 7, 6);
        
        Vehiculo carro1 = new Vehiculo(objetos, 2, 2, Direction.EAST, 0);
        
        carro1.recogerCliente();
        carro1.move();carro1.move();carro1.move();carro1.move();carro1.move();
        
        
        System.out.println(objetos.getTodosLosClientes().get(0));
        
        
        
    }
    
}
