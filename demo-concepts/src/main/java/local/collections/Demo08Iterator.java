package local.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.function.Consumer;

public class Demo08Iterator {
    void useIterators(Collection<Integer> coll) {

        Iterator<Integer> ite = coll.iterator();

        while (ite.hasNext()) {
            Integer item = ite.next();
            System.out.println(item);
        }
        //coll.spliterator();
    }
    
    void useIteratorForEach(Collection<Integer> coll) { //usando lambda
        coll.forEach((item2) -> System.out.println("Item" + item2));
    }

    //void useIteratorForEach2(Collection<Integer> coll) { 
    //    final Integer accumulator = 0;
    //    Consumer<Integer> foo = (item3) -> {
    //        accumulator = accumulator + item3;
    //        System.out.println("Item" + item3);
    //    };
    //}

    void useSplitIterator(Collection<Integer> coll) {

    }

    public static void main(String[] args) {
        Demo08Iterator demo = new Demo08Iterator();
        Collection<Integer> coll = new ArrayList<Integer>() ;
        for(int i = 1; i <=10 ; i++) {
            coll.add(i);
        }
        demo.useIterators(coll);
        demo.useIteratorForEach(coll);
    }
}
