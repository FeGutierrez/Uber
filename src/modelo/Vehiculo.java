/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;

/**
 *
 * @author Flexxo333
 */
public class Vehiculo extends Robot {
    
    private Cliente cliente;
    private Ciudad ciudad;

    public Vehiculo(Ciudad city, int street, int avenue, Direction drctn, int pasajeros) {
        super(city, street, avenue, drctn, pasajeros);
        this.ciudad = city;
        //setIcon(new Bicon("small-car-icon.png"));
        setIcon(new Bicon("small-car-icon.png"));
        this.cliente = null;
        
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    
    
    @Override
    public synchronized void move(){
        if (this.cliente!=null) {
            setIcon(new Bicon("Mini-car-icon_north.png"));
        } else {
            setIcon(new Bicon("small-car-icon.png"));
        }
        super.move();
        
    }
    
    public void irStreet(int street){

        if (this.getStreet() > street) {
            while(this.getDirection()!=Direction.NORTH){
                this.turnLeft();
            }
        }


        if (this.getStreet() < street) {
            while(this.getDirection()!=Direction.SOUTH){
                this.turnLeft();
            }
        }
        while(this.getStreet()!=street){
            this.move();
        }
    }

    public void irAvenue(int avenue){
        if (this.getAvenue()>avenue) {
            while(this.getDirection()!=Direction.WEST){
                this.turnLeft();
            }
        }
        if (this.getAvenue()< avenue) {
            while(this.getDirection()!=Direction.EAST){
                this.turnLeft();
            }
        }
        while (this.getAvenue()!=avenue) {                
            this.move();
        }
    }

    public void irACoordenada(int street, int avenue){
        irStreet(street);
        irAvenue(avenue);
        while (this.getDirection()!=Direction.EAST) {            
            this.turnLeft();
        }
    }
    
    public void recogerCliente(){
        while (this.cliente==null) {
            for (int i = 0; i <  ciudad.getTodosLosClientes().size(); i++) {
                if (ciudad.getTodosLosClientes().get(i).isPendiente() == true) {
                    this.cliente = ciudad.getTodosLosClientes().get(i);
                    this.irACoordenada(cliente.getSt(), cliente.getAv());
                    this.pickThing();
                    this.irACoordenada(cliente.getStDestiny(), cliente.getAvDestiny());
                    this.putThing();
                    this.cliente.setIcon(new Bicon("green_person.png"));
                }
            }
            
        }
        this.cliente = null;
        
    }
    


    
    
    
}
