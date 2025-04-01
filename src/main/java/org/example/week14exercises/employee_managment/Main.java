package org.example.week14exercises.employee_managment;

public class Main {
    public static void main(String[] args) {
        SystemDeveloper gentrit = new SystemDeveloper("Gentrit");
        gentrit.addCertificate(".Net");
        gentrit.addCertificate("Sql");
        gentrit.addCertificate("React");

        System.out.println(gentrit);

        gentrit.addCertificate("Test koding");
        System.out.println(gentrit);


//        SalesPerson hoti = new SalesPerson(2);
//        hoti.setName("ClientGentrit");
//        System.out.println(hoti);
//
//        hoti.addClients("Geni");
//        hoti.addClients("hoti");
//
//
//
//        System.out.println(hoti);


    }
}
