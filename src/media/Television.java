
package media;

public class Television {
    
    private int volume;
    private int currentProgram;
    private boolean turnOn;
    
    public Television() {
        this.currentProgram = 0;
    }
    
    public Television(int volume, int currentProgram, boolean turnOn) {
        this.volume = volume;
        this.currentProgram = currentProgram;
        this.turnOn = turnOn;        
    }
    
    public int getVolume() {
        return this.volume;
    }
    
    public void setVolume(int volume) {
        this.volume = volume;
    }
    
     public int getCurrentProgram() {
        return this.currentProgram;
    }
    
    public void setCurrentProgram(int currentProgram) {
        this.currentProgram = currentProgram;
    }
    
     public boolean getTurnOn() {
        return this.turnOn;
    }
    
    public void setTurnOn(boolean turnOn) {
        this.turnOn = turnOn;
    }
    
    public void showData(){
        System.out.println("Current volume on TV is " + getVolume());
        System.out.println("Current TV program number is  " + getCurrentProgram());
        System.out.println("TV is on? " + getTurnOn());
        System.out.println();
    }
    
}
