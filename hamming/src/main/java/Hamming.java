class Hamming {
    public String leftStrand;
    public String rightStrand;
    
    Hamming(String leftStrand, String rightStrand) {
        this.leftStrand = leftStrand;
        this.rightStrand = rightStrand;
        if (leftStrand.length() != rightStrand.length()){
            throw new IllegalArgumentException("leftStrand and rightStrand must be of equal length.");
        }
    }

    int getHammingDistance() {

        if(leftStrand == rightStrand){
            return 0;
        }

        Integer pointDistance = 0;
        for (int i = 0; i < leftStrand.length(); i++) {

            Character leftNucleotide = leftStrand.charAt(i);
            Character rightNucleotide = rightStrand.charAt(i);

            if(leftNucleotide != rightNucleotide){
                pointDistance++;
            }
        }
        return pointDistance;
    }

}
