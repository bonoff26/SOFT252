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
public abstract class HotDrinks implements IPub{

    @Override
    public void serveDrink() {
        boilWater();
        brew();
        pourResult();
        addSomething();
        
    }
    
    protected abstract void brew();
    protected abstract void addSomething();

    
    protected void boilWater() {
        System.out.println("Boiling water");
    }
    
    protected void pourResult() {
        System.out.println("Pouring into glass");
    }
}

