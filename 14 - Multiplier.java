/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nico
 */
public class Multiplier {
    
    private int multiplier = 0;
    
    public Multiplier(int number){
        this.multiplier = number;
    }
    public int multiply(int number){
        return number * this.multiplier;
    }
}
