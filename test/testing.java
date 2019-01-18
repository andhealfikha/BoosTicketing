/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import boosticketing.Boos_Ticketing;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Andhea
 */
public class testing {
    
    public testing() {
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
    public void testBoosTicketing(){
        Boos_Ticketing test = new Boos_Ticketing();
        double u1 = 2;
        double u2 = 120000;
        double hasil = test.hitung(u1, u2);
        double hasil2 = test.hitung(10, 10000);
        double expected = 240000.0;
        assertEquals(expected, hasil, 0.0);
        assertEquals(100000, hasil2, 0.0);
    }
    
    @Test
    public void testBoosTicketingtiket(){
        Boos_Ticketing test = new Boos_Ticketing();
        double u3 = 240000;
        double u4 = 120000;
        double hasil = test.hitungtiket(u3, u4);
        double expected = 2.0;
        assertEquals(expected, hasil, 0.0);
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
