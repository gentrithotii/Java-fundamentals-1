package org.example.week14exercises.employee_managment;

public class SalesPerson extends Employee {
    private String[] clients;
    private int aquiredClients;

    public SalesPerson(int aquiredClients) {
        this.clients = new String[0];
        setAquiredClients(aquiredClients);
    }

    public void setClients(String[] clients) {
        this.clients = clients;
    }

    public String[] getClients() {
        return clients;
    }

    public int getAquiredClients() {
        return aquiredClients;
    }

    public void setAquiredClients(int aquiredClients) {
        this.aquiredClients = aquiredClients;
    }

    public void addClients(String certificateToAdd) {
        String[] newArrayOfClients = new String[getClients().length + 1];

        for (int i = 0; i < getClients().length; i++) {
            newArrayOfClients[i] = getClients()[i];
        }

        newArrayOfClients[newArrayOfClients.length - 1] = certificateToAdd;
        setClients(newArrayOfClients);
    }


    @Override
    public void calculateSalary() {
        int base = 25000;
        setSalary(base);
        int certificates = getClients().length * 500;
        int languages = getAquiredClients() * 1000;

        setSalary(getSalary() + certificates + languages);
    }


    @Override
    public String toString() {
        return super.getName() + " salary: " + super.getSalary();
    }
}
