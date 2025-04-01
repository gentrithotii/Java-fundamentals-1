package org.example.week14exercises.employee_managment;

public class SystemDeveloper extends Employee {
    private String[] certificates;
    private String[] languages;

    public SystemDeveloper(String name) {
        super.setName(name);
        this.certificates = new String[0];
        this.languages = new String[0];
    }

    private void setCertificates(String[] certificates) {
        this.certificates = certificates;
    }

    private void setLanguages(String[] languages) {
        this.languages = languages;
    }

    public String[] getCertificates() {
        return certificates;
    }

    public String[] getLanguages() {
        return languages;
    }

    public void addCertificate(String certificateToAdd) {
        String[] newArrayOfCertificates = new String[getCertificates().length + 1];

        for (int i = 0; i < getCertificates().length; i++) {
            newArrayOfCertificates[i] = certificates[i];
        }

        newArrayOfCertificates[newArrayOfCertificates.length - 1] = certificateToAdd;
        setCertificates(newArrayOfCertificates);
        calculateSalary();
    }

    public void addLanguages(String languagesToAdd) {
        String[] newArrayOfLanguages = new String[getLanguages().length + 1];

        for (int i = 0; i < getLanguages().length; i++) {
            newArrayOfLanguages[i] = certificates[i];
        }

        newArrayOfLanguages[newArrayOfLanguages.length - 1] = languagesToAdd;
        setLanguages(newArrayOfLanguages);
        calculateSalary();
    }

    public void printAllCertificates() {
        System.out.print("The certificates: ");
        for (String certi : getCertificates()) {
            System.out.print(certi);
            System.out.print(" ");
        }

    }


    public void printAllLanguages() {
        for (String lang : getLanguages()) {
            System.out.println(lang);
            System.out.println(" ");

        }
        System.out.println(" ");
    }

    @Override
    public void calculateSalary() {
        int base = 25000;
        setSalary(base);
        int certificates = getCertificates().length * 1000;
        int languages = getLanguages().length * 1500;

        setSalary(getSalary() + certificates + languages);
    }

    @Override
    public String toString() {
        return super.getName() + " salary: " + super.getSalary();
    }
}
