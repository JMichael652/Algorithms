package test;

/**
 *
 * @author dortonus
 */
public class Tests {
    
    public static void testEquals(Object a, Object b) {
        if (a == b)
            System.out.println("\tpassed");
        else
            System.out.println("\tfailed");
    }
    
    public static void testNotEquals(Object a, Object b) {
        if (a != b)
            System.out.println("\tpassed");
        else
            System.out.println("\tfailed");
    }
    
    public static void testValueEquals(Object a, Object b) {
        if (a.equals(b))
            System.out.println("\tpassed");
        else
            System.out.println("\tfailed");
    }
    
    public static void testValueNotEquals(Object a, Object b) {
        if (!a.equals(b))
            System.out.println("\tpassed");
        else
            System.out.println("\tfailed");
    }
}
