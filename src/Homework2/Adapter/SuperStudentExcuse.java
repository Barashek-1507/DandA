package Homework2.Adapter;

public class SuperStudentExcuse implements StudentExcuse {
    @Override
    public String generateExcuse() {
        // Логика нового функционала
        return "Невероятная отговорка, адаптированная под текущее состояние погоды, пробки или сбои в расписании общественного транспорта.";
    }

    @Override
    public void dislikeExcuse(String excuse) {
        // Добавляет причину в черный список
    }
}
