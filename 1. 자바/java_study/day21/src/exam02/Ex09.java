package exam02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Ex09 {
    public static void main(String[] args) {
        List<String> strs = new ArrayList<>();
        Collections.addAll(strs, "abc", "def", "ghi");
        System.out.println(strs);

        List<String> alphas = Arrays.asList("A", "A", "A", "B", "C");
        int frequency = Collections.frequency(alphas, "A");
        System.out.println(frequency);
    }
}
