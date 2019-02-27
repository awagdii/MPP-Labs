/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package composition;



/**
 *
 * @author 987171
 */
public class Cylinder {
   
    private double height;
    private Circle circle;

    public Cylinder(double height, double radius) {
        this.height = height;
        this.circle=new Circle(radius);
    }
   public double getHeight(){
     return height;   
    }
   
    public double comupteVolume(){
        return (circle.computeArea()*height);
    }
}
