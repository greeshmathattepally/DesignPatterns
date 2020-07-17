package com.epam3.Design_Patterns;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Singleton Design Pattern" );
        Singleton s=Singleton.getInstance();
        Singleton s1=Singleton.getInstance();
        System.out.println();
        
        System.out.println("Prototype Design Pattern");
        VehicleCache.LoadCache();
        Prototype clonedVehicle=(Prototype)VehicleCache.getVehicle("1");
        System.out.println("Vehicle "+clonedVehicle.getType()+"\n");
        
        System.out.println("Adapter Design Pattern");
        TextBook tb=new TextBook();
        NoteBook nb=new PlainNoteBook();
        BookAdapter ba=new BookAdapter(tb);
        ba.write();
        System.out.println();
        
        System.out.println("Decorator Design Pattern");
        Icecream i=new VanillaIcecream();
        i=new OreoToppings(i);
        System.out.println(i.getDesc()+" at cost of Rs."+i.getCost());
        System.out.println();
        
        System.out.println("Command Design Pattern");
        Remote r=new Remote();
        Fan f=new Fan();
        r.setCommand(new FanOnCommand(f));
        r.pressButton();
        System.out.println();
        
        System.out.println("Iterator Design Pattern");
        NameCollection nc=new NameCollection();
        for(Iterator itr=nc.getIterator();itr.hasNext();)
        {
        	System.out.print((String)itr.next()+" ");
        }
    }
}
