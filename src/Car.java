public class Car implements Comparable<Car>{

    private String brand;
    private String model;
    private int year;
    private int horsepower;

    public Car(String brand, String model, int year, int horsepower) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.horsepower = horsepower;
    }

    public int getHorsepower() {
        return horsepower;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    @Override
    public String toString(){
        return "Brand: " + getBrand() + " " + "Model: " + getModel() + " " + "Year: " + getYear() + " " + "Horsepower: " + getHorsepower();
    }

    @Override
    public int compareTo(Car o) {
        int c = Integer.compare(this.year,o.year);
        if(c==0) return compareSportsCar( this, o);
        return c;
    }

    public int isSportsCar(){ return model.compareTo("GT"); }

    public int isEcoCar(){ return model.compareTo("Eco"); }

    public int compareSportsCar(Car o1, Car o2){
        CarHorseComparator comp = new CarHorseComparator();
        if(o1.isSportsCar() == 0 && o2.isSportsCar() == 0) return comp.compare(o1,o2);
        else if(o1.isEcoCar() == 0 && o1.isEcoCar() == 0) return comp.compare(o1,o2);
        else if(o1.isSportsCar() == 0 && o2.isSportsCar() != 0) return 1;
        else if(o1.isSportsCar() != 0 && o2.isSportsCar() == 0) return -1;
        else if(o1.isEcoCar() == 0 && o2.isEcoCar() != 0 && o2.isSportsCar() != 0) return 1;
        else if(o1.isEcoCar() == 0 && o2.isSportsCar() == 0) return -1;
        else if(o1.isEcoCar() != 0 && o1.isSportsCar() != 0 && (o2.isEcoCar() == 0 || o2.isSportsCar() == 0)) return -1;
        else return comp.compare(o1,o2);
    }
}
