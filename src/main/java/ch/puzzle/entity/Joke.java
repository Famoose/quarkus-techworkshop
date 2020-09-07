package ch.puzzle.entity;

public class Joke {
    private String type;
    private JokeValue value;

    public Joke() {}

    public Joke(String type, JokeValue value) {
        this.type = type;
        this.value = value;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public JokeValue getValue() {
        return value;
    }

    public void setValue(JokeValue value) {
        this.value = value;
    }
}
