import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class HandshakeCalculator {

    List<Signal> calculateHandshake(int number) {
        Integer binaryInteger = Integer.parseInt(Integer.toBinaryString(number));
        Boolean reverse = binaryInteger >= 10000;
        List<Signal> signals = new ArrayList<Signal>();

        if(binaryInteger >= 10000){
            binaryInteger -= 10000;
        }
        if(binaryInteger >= 1000){
            binaryInteger -= 1000;
            signals.add(Signal.JUMP);
        }
        if(binaryInteger >=100){
            binaryInteger -= 100;
            signals.add(Signal.CLOSE_YOUR_EYES);
        }
        if(binaryInteger >=10){
            binaryInteger -= 10;
            signals.add(Signal.DOUBLE_BLINK);
        }
        if(binaryInteger >=1){
            binaryInteger -= 1;
            signals.add(Signal.WINK);
        }
        if(!reverse){
            Collections.reverse(signals);
        }
        return signals;
    }

}
