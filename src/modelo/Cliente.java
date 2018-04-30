/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Thing;
import becker.robots.icons.Icon;

/**
 *
 * @author Flexxo333
 */
public class Cliente extends Thing {
    
    private int stDestiny;
    private int avDestiny;
    private boolean pendiente;
    private int st;
    private int av;

    public Cliente(Ciudad city, int street, int avenue, Direction drctn, int stDestiny, int avDestiny) {
        super(city, street, avenue, drctn);
        this.st = street;
        this.av = avenue;
        this.stDestiny = stDestiny;
        this.avDestiny = avDestiny;
        this.pendiente = true;
        city.getTodosLosClientes().add(this);
        setIcon(new Bicon("red_person_90.png"));
    }

    public int getStDestiny() {
        return stDestiny;
    }

    public void setStDestiny(int stDestiny) {
        this.stDestiny = stDestiny;
    }

    public int getAvDestiny() {
        return avDestiny;
    }

    public void setAvDestiny(int avDestiny) {
        this.avDestiny = avDestiny;
    }

    public boolean isPendiente() {
        return pendiente;
    }

    public void setPendiente(boolean pendiente) {
        this.pendiente = pendiente;
    }

    public int getSt() {
        return st;
    }

    public void setSt(int st) {
        this.st = st;
    }

    public int getAv() {
        return av;
    }

    public void setAv(int av) {
        this.av = av;
    }
    


    
    
    
    
    
}
