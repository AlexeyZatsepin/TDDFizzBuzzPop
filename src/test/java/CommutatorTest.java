/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author Alex
 */
public class CommutatorTest {
    
    public CommutatorTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void testSwicherNormal() {
        Commutator com = new Commutator();
        assertEquals(com.Swicher(2),2 );
        assertEquals(com.Swicher(4),4 );
        assertEquals(com.Swicher(1),1);
    }
    @Test
    public void testSwicherFizz() {
        Commutator com = new Commutator();
        assertEquals(com.Swicher(3),"Fizz");
        assertEquals(com.Swicher(9),"Fizz" );
        assertEquals(com.Swicher(123),"Fizz");
    }
    @Test
    public void testSwicherBuzz() {
        Commutator com = new Commutator();
        assertEquals(com.Swicher(5),"Buzz" );
        assertEquals(com.Swicher(20),"Buzz" );
        assertEquals(com.Swicher(200),"Buzz");
    }
    @Test
    public void testSwicherFizzBuzz() {
        Commutator com = new Commutator();
        assertEquals(com.Swicher(15),"Fizz Buzz" );
        assertEquals(com.Swicher(45),"Fizz Buzz");
        assertEquals(com.Swicher(330),"Fizz Buzz");
    }
    @Test
    public void testSwicherPop() {
        Commutator com = new Commutator();
        assertEquals(com.Swicher(7),"Pop" );
        assertEquals(com.Swicher(28),"Pop");
        assertEquals(com.Swicher(77),"Pop");
    }
    @Test
    public void testSwicherFizzPop() {
        Commutator com = new Commutator();
        assertEquals(com.Swicher(21),"Fizz Pop" );
        assertEquals(com.Swicher(63),"Fizz Pop");
        assertEquals(com.Swicher(126),"Fizz Pop");
    }
    @Test
    public void testSwicherBuzzPop() {
        Commutator com = new Commutator();
        assertEquals(com.Swicher(35),"Buzz Pop" );
        assertEquals(com.Swicher(70),"Buzz Pop");
        assertEquals(com.Swicher(140),"Buzz Pop");
    }
    @Test
    public void testSwicherFizzBuzzPop() {
        Commutator com = new Commutator();
        assertEquals(com.Swicher(105),"Fizz Buzz Pop" );
        assertEquals(com.Swicher(210),"Fizz Buzz Pop");
        assertEquals(com.Swicher(315),"Fizz Buzz Pop");
    }
    @Test
    public void testSwicherCustom() {
        Commutator com = new Commutator();
        assertEquals(com.Swicher(1),1);
        assertEquals(com.Swicher(45),"Fizz Buzz");
        assertEquals(com.Swicher(105),"Fizz Buzz Pop");
    }
}
