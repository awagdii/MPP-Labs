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
public class Test2 {
    public static void main(String[] args) {
             Cylinder cylinder=new Cylinder(5, 4);
             Circle circle=new Circle(5);
        
        
        
        System.out.println("Cylinder 1 Volumn is : "+cylinder.comupteVolume());
        System.out.println("Circle Area is : "+circle.computeArea());
        System.out.println("which is right, Composition allow the circle radius to be mutable");
   
    }
}
