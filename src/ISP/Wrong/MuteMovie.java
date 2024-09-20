package ISP.Wrong;

public class MuteMovie implements Movie {

    @Override
    public void play() {
        System.out.println("play");
    }

    // This movie do not have colume
    @Override
    public void increaseVolume() {
        System.out.println("increase volume...");
    }
}
