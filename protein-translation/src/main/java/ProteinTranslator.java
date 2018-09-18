import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.List;

class ProteinTranslator {

    List<String> translate(String rnaSequence) {
        List<String> translatedList = new ArrayList<String>();

        for (String protein : breakUpProteins(rnaSequence)) {
            if(returnProteinName(protein) == "STOP"){
                return translatedList;
            }
            translatedList.add(returnProteinName(protein));
        }
        return translatedList;
    }

    List<String> breakUpProteins(String rnaSequence) {

        List<String> proteins = new ArrayList<String>();

        for (Integer startPos = 0; startPos < (rnaSequence.length() - 2); startPos += 3){
            proteins.add( rnaSequence.substring(startPos, startPos + 3).toString() );
        }

        return proteins;
    }

    Optional<String> returnProteinName(String proteinSequence) {

        for (String key : proteinTranslations().keySet()) {
            if(proteinTranslations().get(key).contains(proteinSequence)){
                return Optional.of(key);
            }
        }
        return Optional.empty();
    }  

    Map<String, List<String>> proteinTranslations(){
        return Map.of(
        "Methionine", List.of("AUG"),
        "Phenylalanine", List.of("UUU","UUC"),
        "Leucine", List.of("UUA","UUG"),
        "Serine", List.of("UCU","UCC","UCA","UCG"),
        "Tyrosine", List.of("UAU","UAC"),
        "Cysteine", List.of("UGU","UGC"),
        "Tryptophan", List.of("UGG"),
        "STOP", List.of("UAA","UAG","UGA")); 
    }

    void test() {
        this.returnProteinName(proteinSequence)
    }
}