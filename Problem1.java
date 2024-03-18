import java.util.*;
public class Problem1 {
        public static void main(String[] args) {
            List<Integer> nums = Arrays.asList(11, 20, 134, 16, 78, 3);

            Set<Integer> sorted = new TreeSet<>(nums);

            System.out.println("Integers in the sorted order are:");
            for (int num : sorted) {
                System.out.println(num);
            }
        }
}
