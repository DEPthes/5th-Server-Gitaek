import java.util.ArrayList;
import java.util.Iterator;

public class IteratorPractice {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("철수");
        list.add("영희");

        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
