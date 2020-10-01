package Generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * A Generic type provides a strong-type safety of a collection. That is the reason why the reference generic
 * type must be identical to the instance generic type.
 * <p>
 * For this method argument generic type, it requires subtypes of a Number, but it triggers compiling check when
 * you intend to modify it. When you add a new element in the method body, it will generates a specific compiling error,
 * i.e. "capture of ? extends Number". That is how the Java try to keep the type safety in a collection.
 */
public class GenericTypeCollectionAsArgument {

    public static void main(String[] args) {
        System.out.println(inputNumbers(new ArrayList<>(Arrays.asList(1, 2, 3))));
    }

    private static List<? extends Number> inputNumbers(List<? extends Number> numbers) {
        //numbers.add(1);  if so you cannot add another element in this list.
        //numbers.add(2);
        return numbers;
    }
}
