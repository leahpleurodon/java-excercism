import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class SumOfMultiples {

    private List<Integer> set;
    private int number;


    SumOfMultiples(int number, int[] set) {
        this.number = number;
        this.set = Arrays.stream( set ).boxed().collect( Collectors.toList() );
    }

    int getSum() {

        List<Integer> factors = new ArrayList<>();

        for (int num : set) {

            for (int i = 1; i < number; i++) {

                if (i % num == 0) {
                    if(!factors.contains(i)){
                        factors.add(i);
                    }

                }
            }
        }
        return factors.stream().mapToInt(Integer::intValue).sum();
    }
}
