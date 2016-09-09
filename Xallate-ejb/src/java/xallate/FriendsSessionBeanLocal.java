/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xallate;

import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Vadim
 */
@Local
public interface FriendsSessionBeanLocal {

    List<XallateUser> getFriends();
    
}
