/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xallate;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Vadim
 */
@Stateless
public class RegistrationSessionBean implements RegistrationSessionBeanLocal {

    @PersistenceContext(unitName = "Xallate-ejbPU")
    private EntityManager em;

    
    @Override
    public void register(final XallateUser user) {
        em.persist(user);
    }
}
