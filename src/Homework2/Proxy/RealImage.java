package Homework2.Proxy;

public class RealImage implements Image {
    String file;

    public RealImage(String file) {
        this.file = file;
        load();
    }

    void load() {
        System.out.println("Загрузка файла " + file);
    }

    @Override
    public void display() {
        System.out.println("Просмтор файла " + file);
    }
}
