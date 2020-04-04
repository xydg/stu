package stream;

import java.util.Arrays;
import java.util.stream.Stream;

public class StreamTest {
    public static void main(String[] args) {
//        Stream.iterate(1, item -> item + 1).limit(10).forEach(System.out::println);
    /*int ids[] = new int[] {1,2,3,4,5};
        Arrays.stream(ids).forEach(System.out::println);
    */
//    Stream.concat(Stream.of(1,2,3), Stream.of(4,5)).forEach(i -> System.out.print(i + " "));
//    Stream.of(1,2,3,3,2,1).distinct().forEach(System.out::println);
//    Stream.of(1,2,3,4,5,6).filter(item -> item > 3).forEach(System.out::println);
//    Stream.of("wanglu", "yuanshuchang", "yibeizi").map(String::toUpperCase).forEach(System.out::println);
//    Stream.of(1,2,3).flatMap(integer -> Stream.of(integer * 10)).forEach(System.out::println);
    Stream.of(1,2,3).peek(integer -> System.out.println("accept:" + integer)).forEach(System.out::println);
    }
}
