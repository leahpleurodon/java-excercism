public class PangramChecker {

    public boolean isPangram(String input) {
        if(input == ""){
            return false;
        }
        for(char alphabet = 'a'; alphabet <= 'z'; alphabet++) {
            if(!input.toLowerCase().contains(Character.toString(alphabet))){
                return false;
            }
        }
        return true;  
    }

}
