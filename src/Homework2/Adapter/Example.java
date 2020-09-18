package Homework2.Adapter;

public class Example {
    public static void main(String[] args) {
        Excuse excuse = new WorkExcuse();
        System.out.println(excuse.generateExcuse());
    }
}
