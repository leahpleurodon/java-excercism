class Proverb {
    public String[] words;
    Proverb(String[] words) {
        this.words = words;
    }

    String recite() {
        String finalString = "";
        if(words.length == 0){
            return finalString;
        }else if(words.length == 1){
            return allForX(words[0]);
        }

        for (int i = 1 ; i < words.length ; i++) {
            finalString += forXlostY(words[i-1], words[i]);
        }
        
        return finalString + allForX(words[0]);
    }

    String forXlostY(String nounX, String nounY) {
        return "For want of a " + nounX + " the " + nounY + " was lost.\n";
    }

    String allForX(String nounX) {
        return "And all for the want of a " + nounX + ".";
    }

}
