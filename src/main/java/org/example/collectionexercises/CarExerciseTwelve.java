package org.example.collectionexercises;

public class CarExerciseTwelve {
    private static int sequencer = 1;
    private int id;
    private String brand;
    private String model;

    public CarExerciseTwelve(String brand, String model) {
        this.id = getNextInt();
        setBrand(brand);
        setModel(model);
    }

    public int getNextInt() {
        return sequencer++;
    }

    public int getId() {
        return id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "CarExerciseTwelve{" +
                "id=" + getId() +
                ", brand='" + getBrand() + '\'' +
                ", model='" + getModel() + '\'' +
                '}';
    }
}
