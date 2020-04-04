package practices;

import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;

public class Practice03 {
    private static AtomicInteger atomicInteger = new AtomicInteger();
    public static void main(String[] args) {
        String time = System.nanoTime() + "";
        System.out.println(time);
        System.out.println(time.substring(time.length() - 6));
        String uuid = UUID.randomUUID().toString();
        System.out.println(uuid);
        System.out.println(uuid.replace("-", ""));
        int i = atomicInteger.incrementAndGet();
        System.out.println(i);
    }
}
