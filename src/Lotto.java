import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Lotto {
    public static void main(String[] args) {
        ArrayList<Integer> lootoNumbers = new ArrayList<>();
        for(int i=1; i<=45; i++) {
            lootoNumbers.add(i);
        }
        System.out.println(lootoNumbers);
        Collections.shuffle(lootoNumbers);
        System.out.println(lootoNumbers);
        System.out.println("이번주 로또 번호는 :");

        for(int i=1; i<=5; i++) {}
    }
}
