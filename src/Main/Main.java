
package Main;

import media.Radio;
import media.Television;

public class Main {

    public static void main(String[] args) {
        Television prvaTv = new Television(5, 5, true);
        prvaTv.showData();
        
        prvaTv.setVolume(9);
        prvaTv.setTurnOn(false);
        prvaTv.setCurrentProgram(11);
        prvaTv.showData();
        
        Radio play = new Radio(98.8, 10, 'F');
        play.showData();
        
        
    }
    
}
