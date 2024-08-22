package edu.eci.cvds.patterns.archetype;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ) {
        if (args != null && args.length > 0){
            String name = String.join(" ", args);
            System.out.println("Hello " + name);
        }else {
            System.out.println( "Hello World!" );
        }

    }
}
