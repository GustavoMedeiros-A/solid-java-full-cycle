package ISP.Wrong;

public class Duna implements Movie{


    @Override
    public void play() {
        System.out.println("play");
    }

    @Override
    public void increaseVolume() {
        System.out.println("increase volume...");
    }
}
