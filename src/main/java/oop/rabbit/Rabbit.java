package oop.rabbit;

public class Rabbit {
    private int age = 0;
    private Farm farm;

    public Rabbit(Farm farm) {
        this.farm = farm;
    }

    public void action() {
        ageUp();
        die();
        delivery();
    }

    private void ageUp() {
        age++;
    }

    private void delivery() {
        if (age >= 4 && age < 6) {
            farm.addRabbit(new Rabbit(farm));
            farm.addRabbit(new Rabbit(farm));
        }
    }

    private void die() {
        if (age == 6)
            farm.removeRabbit(this);
    }
}
