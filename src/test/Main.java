package test;

import datastructures.lists.*;

/**
 * Exists to provide simple testing for the project
 * @author JMichael652
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        testSLNode();
    }
    
    private static void testSLNode() {
        
        System.out.println("Test 1");
        SLNode a = new SLNode(null);
        Tests.testEquals(a.getData(), null);
        Tests.testEquals(a.getNext(), null);
        
        System.out.println("Test 2");
        SLNode b = new SLNode(null, null);
        Tests.testEquals(b.getData(), null);
        Tests.testEquals(b.getNext(), null);
        
        System.out.println("Test 3");
        String c = "";
        SLNode<String> d = new SLNode<>(c);
        Tests.testEquals(d.getData(), c);
        Tests.testEquals(d.getNext(), null);
        
        System.out.println("Test 4");
        SLNode<String> e = new SLNode(c, null);
        Tests.testEquals(e.getData(), c);
        Tests.testEquals(e.getNext(), null);
        
        System.out.println("Test 5");
        SLNode<String> f = new SLNode(c, d);
        Tests.testEquals(f.getData(), c);
        Tests.testEquals(f.getNext(), d);
        
        System.out.println("Test 6");
        SLNode<String> g = new SLNode(c, d);
        g.setData(null);
        Tests.testEquals(g.getData(), null);
        Tests.testEquals(g.getNext(), d);
        
        System.out.println("Test 7");
        SLNode<String> h = new SLNode(c, d);
        h.setNext(null);
        Tests.testEquals(h.getData(), c);
        Tests.testEquals(h.getNext(), null);
    }
    
}
