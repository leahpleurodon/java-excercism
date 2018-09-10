class RnaTranscription {

    String transcribe(String dnaStrand) {

        
        return dnaStrand
            .replace("C", "g")
            .replace("G", "c")
            .replace("T","a")
            .replace("A","U")
            .toUpperCase();
    }

}
