import java.util.ArrayList;
import java.util.List;

class NaturalNumber {

    public Integer numberToCheck;

    NaturalNumber(Integer numberToCheck){
        if( numberToCheck < 1){
            throw new IllegalArgumentException("You must supply a natural number (positive integer)");
        }
        this.numberToCheck = numberToCheck;
    }

    Classification getClassification(){
        
        int sumOfFactors = getFactors().stream().mapToInt(Integer::intValue).sum();

        if(sumOfFactors == numberToCheck){
            return Classification.PERFECT;
        }else if(sumOfFactors > numberToCheck){
            return Classification.ABUNDANT;
        }else{
            return Classification.DEFICIENT;
        }

    }

    List<Integer> getFactors(){
        List<Integer> factors = new ArrayList<Integer>();
        for (int i = 1; i < numberToCheck; i++) {
            if(numberToCheck % i == 0){
                factors.add(i);
            }
        }
        return factors;
    }
}
