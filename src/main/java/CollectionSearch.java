import java.util.Collection;
import java.util.List;
import java.util.Optional;

public class CollectionSearch {
    public static <T> int findElementIndex(Collection<T> collection, T targetElement) {
        Optional<Integer> index = collection.stream()
                .filter(element -> element.equals(targetElement))
                .map(element -> {
                    if (collection instanceof List) {
                        return ((List<T>) collection).indexOf(element);
                    } else {
                        return -1;
                    }
                })
                .findFirst();

        return index.orElse(-1);
    }


}



