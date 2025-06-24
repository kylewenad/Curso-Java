package base;
//Diferenciar OVERLOAD de OVERRIDE
public class Square {
    public int side;

    public Square(int side){
        this.side = side;
    }

    public Square(Square sq) { 
        //Overload del constructor
        //para clonar el objeto
        this(sq.side); //es equivalente a un "new"
    }

    @Override //tengo un objeto en el padre y lo sobrescribo sobre el hijo
    public String toString(){
      return super.toString() + "\n" +
     "Square {side: %s}".formatted(side);
    }

    @Override
    public boolean equals(Object object){
        if (object instanceof Square && this.side == ((Square)object).side) {
        }
     return true;    
    }

}
