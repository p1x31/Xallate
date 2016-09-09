
package xallate;

import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Vadim
 */
@Stateless
public class FriendsSessionBean implements FriendsSessionBeanLocal {

    @PersistenceContext(unitName = "Xallate-ejbPU")
    private EntityManager em;
 
    @Override
    public List<XallateUser> getFriends() {
        return em.createQuery("select u from XallateUser u").getResultList();
        
    }

    public void persist(Object object) {
        em.persist(object);
    }
    

  
}
