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
public class Test1 {
    
    
    public static void main(String[] args) {
    
        Cylinder cylinder=new Cylinder(5, 4);
        Cylinder circle=new Circle (4);
        
        
        
        System.out.println("Cylinder 1 Volumn is : "+cylinder.comupteVolume());
        System.out.println("Circle Area is : "+((Circle) circle).computeArea());
        System.out.println("which is Wrong because the radius is immutable at the Circle side");
        
    }
   
}
