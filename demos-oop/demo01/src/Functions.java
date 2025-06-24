import base.Square;

public class Functions {

    public static Square Foo(Square sqFoo) {
        
        Square newSq = new Square(sqFoo);//objeto clonado
        newSq.side *=2;
        //modifica el valor de algo que está fuera
        //está modificando el parámetro y no debería hacerlo
        return newSq;
    }

    public static void main(String[] args) {
        
        Square sq1 = new Square(10);
        Square dSq = Foo(sq1);
        //paso por referencia
        System.out.println(sq1); // side:10
        System.out.println(dSq); // side:20
    }
}
