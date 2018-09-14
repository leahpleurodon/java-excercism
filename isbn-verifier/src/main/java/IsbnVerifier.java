import java.util.ArrayList;
import java.util.Arrays;

class IsbnVerifier {

    boolean isValid(String stringToVerify) {

        if(stringToVerify.equalsIgnoreCase("") || stringToVerify.length() < 10){
            return false;
        }

        stringToVerify = stringToVerify.replace("-","").toUpperCase();

        ArrayList<String> digitStrs = new ArrayList<>(Arrays.asList(stringToVerify.split("")));

        if(digitStrs.get(digitStrs.size() - 1 ).equalsIgnoreCase("x")) {
            digitStrs.set(digitStrs.size() - 1, "10");
        }

        ArrayList<Integer> digits = new ArrayList<>();


        for (String digit: digitStrs) {
            if(Character.isLetter(digit.charAt(0))) {
                return false;
            }else{
                digits.add(Integer.valueOf(digit));
            }
        }

        Integer multiple = 10;
        Integer total = 0;
        for (int i = 0; i < digits.size(); i++) {
            total += multiple * digits.get(i);
            multiple --;
        }

        return (
                total % 11 == 0
        );
    }

}
