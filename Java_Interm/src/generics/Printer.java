package generics;


/*
 * @author : rabin
 */

// create the generic type class
public class Printer<Any_Type> {
    Any_Type thingToPrint;

    public Printer(Any_Type thingToPrint){
    this.thingToPrint = thingToPrint;
    }
    public void print(){
        System.out.print("\n"+thingToPrint);
    }

}
