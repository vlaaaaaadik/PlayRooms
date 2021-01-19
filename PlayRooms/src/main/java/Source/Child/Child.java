package Source.Child;

import java.io.Serializable;
import java.util.Date;

public class Child implements Serializable {
    private String fullName;
    private Date birthDate;
    private String parentsPhone;


    public Child(String fullName, Date birthdate, String parentsPhone) {
        this.fullName = fullName;
        this.birthDate = birthdate;
        this.parentsPhone = parentsPhone;
    }

    @Override
    public String toString() {
        return "Child{" +
                "fullName " + fullName  +
                ", birthDate " + birthDate+
                ", parentsPhone='" + parentsPhone + '\'' + '}';
    }


    public String getParentsPhone() {
        return parentsPhone;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public String getFullName() {
        return fullName;
    }

}
