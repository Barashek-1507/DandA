package Homework2.Adapter;

public class Test {
    public static void main(String[] args) {
        Excuse excuse = new WorkExcuse(); // Создаются объекты классов,
        StudentExcuse newExcuse = new SuperStudentExcuse(); // Которые должны быть совмещены.
        System.out.println("Обычная причина для работника:");
        System.out.println(excuse.generateExcuse());
        System.out.println("\n");
        Excuse adaptedStudentExcuse = new MiddlewareAdapter(newExcuse); // Оборачиваем новый функционал в объект-адаптер
        System.out.println("Использование нового функционала с помощью адаптера:");
        System.out.println(adaptedStudentExcuse.generateExcuse()); // Адаптер вызывает адаптированный метод
    }
}