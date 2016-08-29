package xallate;

/**
 * Created by Vadim on 25/08/2016.
 */

import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import java.io.Serializable;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

@Named
@SessionScoped
public class ProfileManagedBean implements Serializable{

    public ProfileManagedBean(){

    }
    private String firstName = "Ivan";
    private String lastName = "Petrov";
    private Date birthday = new GregorianCalendar(1980, Calendar.APRIL, 21).getTime();
    private String homeTown = "SPB";
    private String lang = "Russian";

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

    public String getHomeTown() {
        return homeTown;
    }

    public void setHomeTown(String homeTown) {
        this.homeTown = homeTown;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getLang() {
        return lang;
    }

    public void setLang(String lang) {
        this.lang = lang;
    }
}
