package prob3;

import java.util.function.Function;

public class MyClass {

    private int x,y;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public MyClass(int x,int y) {
        this.x=x;
        this.y=y;

    }

    @Override
    public boolean equals(Object otherObj) {
        if(otherObj.getClass()!=this.getClass()) return false;
        if(((MyClass)otherObj).x == x && ((MyClass)otherObj).y==y) {
            return true;
        }else {
            return false;
        }

    }

    public void myMethod(MyClass cl) {

        Function< MyClass, Boolean> checker=this::equals;
        System.out.println(checker.apply(cl));
    }

}
