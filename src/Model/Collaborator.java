package Model;


// Comienzo de la composición, ya que tiene un ContactDetails, Departament y Role, por ende sin estos
// no podría existir un Collaborator completo
public class Collaborator {
    private ContactDetails contactDetails;
    private Departament departament;
    private Role role;

    public Collaborator(ContactDetails contactDetails, Departament departament, Role role) {
        this.contactDetails = contactDetails;
        this.departament = departament;
        this.role = role;
    }

    public ContactDetails getContactDetails() {
        return contactDetails;
    }

    public Departament getDepartament() {
        return departament;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "Collaborator {" +
                " ContactDetails=" + contactDetails +
                ", departament=" + departament +
                ", role=" + role +
                '}';
    }

}
