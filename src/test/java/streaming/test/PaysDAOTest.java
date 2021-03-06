/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming.test;

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import streaming.dao.PaysDAO;
import streaming.entity.Pays;
import streaming.spring.SpringConfig;

/**
 *
 * @author admin
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes=SpringConfig.class)
public class PaysDAOTest {
    
    @Autowired
    private PaysDAO dao;
    
    @Test
    public void test() {
        Pays p = new Pays();
        p.setNom("FRANCE");
        
        dao.ajouter(p);
    }
    
    @Test    
    public void ajouter() {
        Pays p = new Pays();
        p.setNom("FRANCE");
        dao.ajouter(p);
    }
    
     @Test    
    public void rechercher(long ID)
    {
        Pays p = dao.rechercher(ID);
    }
    
}
