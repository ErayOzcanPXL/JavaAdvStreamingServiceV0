package be.pxl.ja.streamingservice.model;

public class Documentary extends Movie {
    private String topic;

    public Documentary(String title, Rating maturityRating) {
        super(title, maturityRating);
        this.setGenre(Genre.DOCUMENTARY);
    }

    public String getTopic() {
        return this.topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    @Override
    public void play() {
        System.out.println("Playing documentary \"" + this + "\" about " + this.getTopic());
    }

    @Override
    public void pause() {
        System.out.println("Pausing documentary \"" + this + "\" about " + this.getTopic());
    }
}
