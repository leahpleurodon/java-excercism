import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PigLatinTranslator {


    public String translate(String englishPhrase) {

        List<String> englishWords = Arrays.asList(englishPhrase.split(" "));

        List<String> pigLatinWords = englishWords.stream().map(str -> wordTranslate(str)).collect(Collectors.toList());

        return String.join(" ", pigLatinWords);
    }

    public String wordTranslate(String englishWord) {


        String firstLetter = englishWord.substring(0, 1);
        String secondLetter = englishWord.substring(1, 2);

        if (englishWord.length() == 2) {

            return secondLetter + firstLetter + "ay";

        }else if(isVowel(firstLetter) ||
            (firstLetter.equalsIgnoreCase("y") && !isVowel(secondLetter))) {

            return englishWord + "ay";

        }else if(englishWord.substring(0,2).equalsIgnoreCase("xr")) {

            return englishWord + "ay";

        }else if(englishWord.substring(0,3).equalsIgnoreCase("thr")) {

            return englishWord.substring(3) + englishWord.substring(0,3) + "ay";

        }else if(isTwoConsonantsOneSound(englishWord.substring(1,3))) {

            return englishWord.substring(3) + englishWord.substring(0,3) + "ay";

        }else if(englishWord.substring(0,3).equalsIgnoreCase("thr")) {

            return "hello";
        }else if(isTwoConsonantsOneSound(englishWord.substring(0,2))) {

            return englishWord.substring(2) + englishWord.substring(0, 2) + "ay";
        }

        return  englishWord.substring(1) + firstLetter + "ay";

    }

    private Boolean isTwoConsonantsOneSound(String string) {

        return string.equalsIgnoreCase("ch") ||
                string.equalsIgnoreCase("qu") ||
                string.equalsIgnoreCase("th") ||
                string.equalsIgnoreCase("rh");
    }

    private Boolean isVowel(String string) {

        return "aeiou".contains(string);
    }
}

