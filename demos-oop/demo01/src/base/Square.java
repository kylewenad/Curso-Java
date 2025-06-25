package base;
//Diferenciar OVERLOAD de OVERRIDE
public class Square implements Cloneable {

    public int side;
    //private int id;

    public Square(int side){
        //this.id = (int) Math.random()*1000; ESTA MAL HECHO
        //(int) lo que llegue a id lo devuelva a entero que por defecto sería 0
        //lo multiplicamos por 1000 para que devuelva un int mayor que 0
        this.side = side; 
        //no se puede guardar un clon porque no es una referencia nueva?
    }

    public Square(Square sq) { 
        //Overload del constructor
        //para clonar el objeto
        this(sq.side); //es equivalente a un "new"
    }

    @Override //tengo un objeto en el padre y lo sobrescribo sobre el hijo
    public String toString(){
      return 
      //super.toString() + "\n" + //(devuelve la referencia)
      "Square {side: %s}".formatted(side);
    }

    @Override
    public boolean equals(Object object){
        if (object instanceof Square && this.side == ((Square)object).side) {
        }
     return true;    
    }

    @Override
    public Object clone () throws CloneNotSupportedException {
        return super.clone();
    }

}
