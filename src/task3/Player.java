package task3;

public class Player implements Playable, Recodable{
    @Override
    public void play() {
        System.out.println("Player is played");
    }

    @Override
    public void pause() {
        System.out.println("Player is paused");
    }

    @Override
    public void stop() {
        System.out.println("Player is stopped");
    }

    @Override
    public void record() {
        System.out.println("Player is recording");
    }
}
