package CreateStream;

import java.util.Arrays;
import java.util.List;
//Creating a Stream using "collections."
public class Method1 {
    public static void main(String[] args) {
        List<String> stringList = Arrays.asList("Kenya", "Uganda", "Tanzania", "Rwanda", "Burundi");
        stringList.stream().forEach(System.out::println);
    }
}
