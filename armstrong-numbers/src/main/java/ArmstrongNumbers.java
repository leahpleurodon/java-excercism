class ArmstrongNumbers {

	boolean isArmstrongNumber(int numberToCheck) {

      return numberToCheck == armstrongCalc(numberToCheck) ? true : false;
           
    }
    
    int armstrongCalc(int numberToCheck){
        String numStr = Integer.toString(numberToCheck);
        Integer totalValue = 0;
        for (int i = 0; i < numStr.length(); i++) {
            String c = String.valueOf(numStr.charAt(i));  
            totalValue += (int)Math.pow(Integer.parseInt(c) ,numStr.length());
        }
        return totalValue;
    }

}
