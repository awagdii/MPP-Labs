package prob3;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;

public class Main {

    public static void main(String [] args){
        MyClass myClass=new MyClass(1,5);
        MyClass myClass2=new MyClass(1,5);
        MyClass myClass3=new MyClass(20,5);

        myClass.myMethod(myClass2);
        myClass.myMethod(myClass3);
    }
}
