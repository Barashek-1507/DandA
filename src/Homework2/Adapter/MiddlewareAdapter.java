package Homework2.Adapter;

public class MiddlewareAdapter implements Excuse {

    private StudentExcuse superStudentExcuse;

    public MiddlewareAdapter(StudentExcuse excuse) {
        this.superStudentExcuse = excuse;
    }

    @Override
    public String generateExcuse() {
        return superStudentExcuse.generateExcuse();
    }

    @Override
    public void likeExcuse(String excuse) {
        throw new UnsupportedOperationException("Метод likeExcuse не поддерживается в новом функционале");
    }

    @Override
    public void dislikeExcuse(String excuse) {
        // Метод обращается за дополнительной информацией к БД,
        // Затем передает ее в метод dislikeExcuse объекта superStudentExcuse.
    }
}
