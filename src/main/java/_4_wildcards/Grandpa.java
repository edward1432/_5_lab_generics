package _4_wildcards;

public class Grandpa {

    String name;

    public Grandpa(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "My name is " + name + ". I am a " + this.getClass().getSimpleName() + "!";
    }
}
