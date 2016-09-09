
package xallate;

import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.List;
import javax.ejb.EJB;

/**
 *
 * @author Vadim
 */
@Named(value = "friendsManagedBean")
@SessionScoped
public class FriendsManagedBean implements Serializable {

    @EJB
    private FriendsSessionBeanLocal friendsSessionBean;

    /**
     * Creates a new instance of FriendsManagedBean
     */
    public FriendsManagedBean() {
    }

    public List<XallateUser> getFriends() {
        return friendsSessionBean.getFriends();
    }
}
