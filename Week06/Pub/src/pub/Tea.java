/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pub;

/**
 *
 * @author tallenbrook
 */
public class Tea extends HotDrinks {

    @Override
    protected void brew() {
        System.out.println("Steep Tea in water");
    }

    @Override
    protected void addSomething() {
        System.out.println("Add lemon");
    }
    
    
}
