import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //Generic Class
        GenericClass<String> GenericExample = new GenericClass<>("Generic field value");
        GenericExample.printGenericField();

        GenericClass<Integer> GenericExample2 = new GenericClass<>(123);
        GenericExample2.printGenericField();

        // Stream API- Örnek Kullanım
        List<String> stringList = Arrays.asList("A", "B", "C", "D");
        String targetElement = "B";

        int resultIndex = CollectionSearch.findElementIndex(stringList, targetElement);

        if (resultIndex != -1) {
            System.out.println("Öğe bulundu, index: " + resultIndex);
        } else {
            System.out.println("Öğe bulunamadı.");
        }
    }
}
