interface Playable {
    void play();
}

class Guitar implements Playable {
    @Override
    public void play() {
        System.out.println("The guitar strums a melody.");
    }
}

class Drum implements Playable {
    @Override
    public void play() {
        System.out.println("The drum beats a rhythmic sound.");
    }
}

public class Playing {
    public static void main(String[] args) {
        Guitar guitar = new Guitar();
        guitar.play();

        Drum drum = new Drum();
        drum.play();
    }
}

