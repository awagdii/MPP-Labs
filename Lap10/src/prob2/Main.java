package prob2;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Integer> integerList = Arrays.asList(new Integer[]{1,2,3});
        System.out.println(secondSmallest(integerList));
    }
    public static <T extends Comparable> T  secondSmallest(List<T> input){
        T smallest =input.get(0);
        T seconedSmallest =input.get(1);;
        for (T element: input) {
          if ( element.compareTo(smallest)<=0){
              smallest=element;
          }else if(element.compareTo(seconedSmallest)<0){
              seconedSmallest=element;
          }
        }
        return seconedSmallest ;
    }
}
