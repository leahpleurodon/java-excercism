import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
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

    String returnProteinName(String proteinSequence) {

        for (String key : proteinTranslations().keySet()) {
            if(proteinTranslations().get(key).contains(proteinSequence)){
                return key;
            }
        }
        throw new Error("Protein not found");
    }  

    HashMap<String, List<String>> proteinTranslations(){
        HashMap<String, List<String>> proteinTranslations = new HashMap<String, List<String>>();
        proteinTranslations.put("Methionine", Arrays.asList("AUG"));
        proteinTranslations.put("Phenylalanine", Arrays.asList("UUU","UUC"));
        proteinTranslations.put("Leucine", Arrays.asList("UUA","UUG"));
        proteinTranslations.put("Serine", Arrays.asList("UCU","UCC","UCA","UCG"));
        proteinTranslations.put("Tyrosine", Arrays.asList("UAU","UAC"));
        proteinTranslations.put("Cysteine", Arrays.asList("UGU","UGC"));
        proteinTranslations.put("Tryptophan", Arrays.asList("UGG"));
        proteinTranslations.put("STOP", Arrays.asList("UAA","UAG","UGA"));
        return proteinTranslations; 
    }
}