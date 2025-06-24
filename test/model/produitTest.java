/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;


import org.junit.Test;
import static org.junit.Assert.*;


public class produitTest {
    
    public produitTest() {
    }
    
    
    @Test
    public void testPrix_total() {
        System.out.println("prix_total");
        int prix = 0;
        int quantite = 0;
        produit instance = null;
        int expResult = 0;
        int result = instance.prix_total(prix, quantite);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
