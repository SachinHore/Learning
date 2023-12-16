package package1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

abstract class abstractClassDemo{

    public abstract void abstractMethod();

}



public class Test1 {


    public static void main(String[] args) {

        List<Integer> l = new ArrayList<>();
        l.add(3);
        l.add(4);

        Iterator itr = l.iterator();

        while(itr.hasNext()){
            System.out.println(itr.next());
        }


    }

}



