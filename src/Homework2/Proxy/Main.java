package Homework2.Proxy;

public class Main {
    public static void main(String[] args) {
        Image image = new ProxyImage("beautiful.img");
        image.display();
    }
}
