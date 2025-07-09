package local.generics;

import java.lang.reflect.GenericArrayType;
import java.util.Arrays;

public class Generic <T, U> {
    
    T foo;
    U baz;

    Generic(T foo, U baz) {
        this.foo = foo;
        this.baz = baz;
    }

    public static void main(String[] args) {
        
        Generic <String, Integer> gen1 = new Generic<>("Pepe", 123);
        System.out.println(gen1);
        System.out.println (gen1.foo.formatted(args));
        System.out.println(gen1.baz.intValue());
    }
}
