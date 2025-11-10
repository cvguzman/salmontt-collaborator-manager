package App;

import Model.Collaborator;
import Model.ContactDetails;
import Model.Departament;
import Model.Role;

public class Main {
    public static void main(String[] args) {

        // Datos colaborador 1
        ContactDetails contactDetails1 = new ContactDetails(
                "Juan Valdez",
                "Lo Fontecilla 333, Las Condes",
                "jvaldez@salmontt.cl",
                984268718);

        // Datos colaborador 2
        ContactDetails contactDetails2 = new ContactDetails(
                "Luisa Godoy",
                "Alameda 674, Talca",
                "lgodoy@salmontt.cl",
                945871265);

        // Colaborador 2 modifica email
        contactDetails2.setEmail("lgodoyf@salmontt.cl");

        // Datos colaborador 3
        ContactDetails contactDetails3 = new ContactDetails(
                "Claudia Ponce",
                "El Portugal 544, Valdivia",
                "cponce@salmontt.cl",
                987024970);

        Collaborator collaborator1 = new Collaborator(contactDetails1, Departament.SALT_WATER, Role.ENGINEER);

        Collaborator collaborator2 = new Collaborator(contactDetails2, Departament.SWEET_WATER, Role.ENGINEER);

        Collaborator collaborator3 = new Collaborator(contactDetails3, Departament.SWEET_WATER, Role.MANAGER);


        System.out.println(" ");

        // Visualización del toString() en colaborador 1
        System.out.println("Detalles colaborador: " + (collaborator1));

        // Visualización detallada de colaborador 1
        System.out.println("\nDetalles de Contacto: "
                + "\nNombre Colaborador: " + collaborator1.getContactDetails().getName()
                + "\nArea acuícola: " + collaborator1.getDepartament().getArea()
                + "\nDirección colaborador:  " + collaborator1.getContactDetails().getAddress()
                + "\nRol en acuícola: "+ collaborator1.getRole().getRoleName());

        // Colaborador 1 modifica dirección
        contactDetails1.setAddress("Las Carmelitas 97, Las Condes");

       // Colaborador 1 modifica diección
        System.out.println("Cambio dirección: " + contactDetails1.getAddress());

        System.out.println(" ");
        // Visialización del toString() en colaborador 2
        System.out.println("Detalles colaborador: " + (collaborator2));
        // Visualización detallada colaborador 2
        System.out.println("\nDetalles de Contacto: "
                + "\nNombre Colaborador: " + collaborator2.getContactDetails().getName()
                + "\nArea acuícola: " + collaborator2.getDepartament().getArea()
                + "\nEmail  colaborador: " + collaborator2.getContactDetails().getEmail()
                + "\nRol en acuícola: "+ collaborator2.getRole().getRoleName());

        // Colaborador 2 cambia email
        System.out.println("Cambio email: " + contactDetails2.getEmail());

        System.out.println(" ");
        // Visialización del toString() en colaborador 3
        System.out.println("Detalles colaborador: " + (collaborator3));
        // Viasulaización detallada colaborador 3
        System.out.println("\nDetalles de Contacto: "
                + "\nNombre Colaborador: " + collaborator3.getContactDetails().getName()
                + "\nArea acuícola: " + collaborator3.getDepartament().getArea()
                + "\nRol en acuícola: "+ collaborator3.getRole().getRoleName());

        // Colaborador 3 cambia rol por ascenso
        collaborator3.setRole(Role.MARKETING);
        System.out.println("Cambio rol colaborador: " + collaborator3.getRole().getRoleName());
    }

}
