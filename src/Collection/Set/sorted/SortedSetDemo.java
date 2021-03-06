package Collection.Set.sorted;

import java.time.Period;
import java.util.Comparator;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SortedSetDemo {

  // TreeSet implements SortedSet interface.
  public static void main(String[] args) {
    // SortedSet extends from the Set interface, which implements Collection interface.
    Period p1 = Period.ofDays(35);
    Period p2 = Period.ofDays(15);
    Period p3 = Period.ofDays(25);
    Period p4 = Period.ofDays(99);
    Period p5 = Period.ofDays(10);

    // In a d ordering
    SortedSet<Period> periods =
        Stream.of(p1, p2, p3, p4, p5)
            .collect(
                Collectors.toCollection(
                    () -> new TreeSet<>(Comparator.comparing(Period::getDays).reversed())));

    System.out.println(periods);

    periods.add(Period.ofDays(12));
    System.out.println(periods);

    // sortedSet interface provides different methods from the set.
    System.out.println("first: " + periods.first());
    System.out.println("last: " + periods.last());

    // return a portion of this sorted set, above the reference an element: p3.
    Set<Period> headSet = periods.headSet(p3);
    System.out.println("elements before p3: " + headSet);

    // return a portion of this sorted set, below the reference an element: p3.
    Set<Period> tailSet = periods.tailSet(p3);
    System.out.println("element below p3: " + tailSet);
  }
}
