package Homework2.Bridge;

public class Main {
    public static void main(String[] args) {

        Color newColor = new BlackColor();

        Shape figure = new Rectangle(newColor);
        figure.draw();

    }
}
