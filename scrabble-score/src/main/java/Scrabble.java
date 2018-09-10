import java.util.HashMap;

class Scrabble {
    public String word;
    Scrabble(String word) {
        this.word = word.toLowerCase();
    }

    int getScore() {
        Integer totalValue = 0;
        for (int i = 0; i < word.length(); i++) {
            String letter = String.valueOf(word.charAt(i));  
            totalValue += letterScores().get(letter);
        }
        return totalValue;
    }

    HashMap<String, Integer> letterScores(){
        HashMap<String, Integer> letterScores = new HashMap<String, Integer>();
        letterScores.put("a", 1);
        letterScores.put("e", 1);
        letterScores.put("i", 1);
        letterScores.put("o", 1);
        letterScores.put("u", 1);
        letterScores.put("l", 1);
        letterScores.put("n", 1);
        letterScores.put("r", 1);
        letterScores.put("s", 1);
        letterScores.put("t", 1);
        letterScores.put("d", 2);
        letterScores.put("g", 2);
        letterScores.put("b", 3);
        letterScores.put("c", 3);
        letterScores.put("m", 3);
        letterScores.put("p", 3);
        letterScores.put("f", 4);
        letterScores.put("h", 4);
        letterScores.put("v", 4);
        letterScores.put("w", 4);
        letterScores.put("y", 4);
        letterScores.put("k", 5);
        letterScores.put("j", 8);
        letterScores.put("x", 8);
        letterScores.put("q", 10);
        letterScores.put("z", 10);
        return letterScores; 
    }

}

// Map<String, String> definitions = new HashMap<String, String>();
// definitions.put("dog", "a four-legged mammal that is Man's best friend");
// definition = definitions.get("dog");