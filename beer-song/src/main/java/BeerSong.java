
class BeerSong{

    String singSong(){
        return sing(99,100);
    }

    String sing(Integer bottleCount, Integer verseCount){
        String song = "";
        while (verseCount > 0) {
            song += verse(bottleCount);
            bottleCount --;
            verseCount --;
        }
        return song;
    }

    String verse(Integer bottleCount){

        Integer bottleMinusOne = bottleCount - 1;
        
        if(bottleCount == 0){
            return "No more bottles of beer on the wall, no more bottles of beer.\n" +
            "Go to the store and buy some more, 99 bottles of beer on the wall.\n\n";
        }else if(bottleCount == 2){
            return "2 bottles of beer on the wall, 2 bottles of beer.\n" +
            "Take one down and pass it around, 1 bottle of beer on the wall.\n\n";
        }else if(bottleCount == 1){
            return "1 bottle of beer on the wall, 1 bottle of beer.\n" +
            "Take it down and pass it around, no more bottles of beer on the wall.\n\n";
        }else{
            return bottleCount.toString() + " bottles of beer on the wall, " + bottleCount.toString() + " bottles of beer.\n" +
            "Take one down and pass it around, " + bottleMinusOne.toString() + " bottles of beer on the wall.\n\n";
        }
    }
}