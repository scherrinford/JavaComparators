import java.util.Comparator;

public class CarHorseComparator implements Comparator<Car> {
    @Override
    public int compare(Car o1, Car o2) {
        return Integer.compare(o1.getHorsepower(),o2.getHorsepower());
    }
}


    /*public int comparet(Car o1, Car o2) {

        int c = Integer.compare(o1.getYear(),o2.getYear());
        if(c==0) return Integer.compare(sumOfAscii(o1.getBrand()),sumOfAscii(o2.getBrand()));
        else return c;
    }

    public int sumOfAscii(String text){
        int sum = 0;
        char[] charArray = text.toCharArray();
        for(int i = 0; i< charArray.length; i++){ sum += (int) charArray[i]; }
        return sum;
    }*/


/*
porównanie po rocznikach  jak maja ten sam to sprawdzamy czy sa sportowe i jak są to porównujemy po koniach
 */
