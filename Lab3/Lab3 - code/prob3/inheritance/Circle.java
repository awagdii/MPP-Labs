/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritance;

/**
 *
 * @author 987171
 */
public class Circle extends Cylinder{

    private double radius;
    
    public Circle(double radius) {
        super(0, radius);
    }
    
    public double getRadius(){
        return radius;
    }
    public double computeArea(){
        return (Math.PI*radius*radius);
    }
}
