import java.util.Comparator;

public class BrandToSasinComparator implements Comparator<Car> {

    private int Sasin = 70000000;

    @Override
    public int compare(Car o1, Car o2) {
        return Integer.compare(sumOfAscii(o1.getBrand()),sumOfAscii(o2.getBrand()));
    }

    public int sumOfAscii(String text){
        int sum = 0;
        char[] charArray = text.toCharArray();
        for(int i = 0; i< charArray.length; i++){
            sum += (int) charArray[i];
        }
        return sum;
    }

    public float toSasin(int sum){
        return (float)sum/Sasin;
    }


}
