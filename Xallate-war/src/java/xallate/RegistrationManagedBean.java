package xallate;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;
import java.util.Date;
import javax.ejb.EJB;

/**
 * Created by Vadim on 26/08/2016.
 */
@Named
@RequestScoped
public class RegistrationManagedBean {

   // @EJB
   // private RegistrationSessionBeanLocal registrationSessionBean;
    public RegistrationManagedBean(){
    }

    private String firstName;
    private String lastName;
    private Date birthday;
    private String homeTown;
    private String lang;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getHomeTown() {
        return homeTown;
    }

    public void setHomeTown(String homeTown) {
        this.homeTown = homeTown;
    }

    public String getLang() {
        return lang;
    }

    public void setLang(String lang) {
        this.lang = lang;
    }

    public String register(){
        //XallateUser user = new XallateUser(firstName, lastName, birthday, homeTown, lang);
        //registrationSessionBean.register(user);
        return "profile";
    }
}
