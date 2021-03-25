import java.util.Random;

public class RandomCarObjectGenerator {

    public Car randomCar(){
        Car car;
        car = new Car(getRandomBrand(), getRandomModel(), getRandomYear(), getRandomHorsePower());
        return car;
    }

    static String getRandomBrand(){
        int r = (int) (Math.random()*7);
        String name = new String [] {"AUDI","MERCEDES","OPEL","RENAULT","TOYOTA","MINI","FIAT"}[r];
        return name;
    }

    static String getRandomModel(){
        int r = (int) (Math.random()*3);
        String name = new String [] {"Classic","Eco","GT"}[r];
        return name;
    }

    static int getRandomYear(){
        Random r = new Random();
        return r.nextInt((2020 - 1999) + 1) + 1999;
    }

    static int getRandomHorsePower(){
        Random r = new Random();
        return r.nextInt((250 - 50) + 1) + 50;

    }
}
