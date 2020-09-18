package Homework1.Prototype;

public class VersionControlRunner {
    public static void main(String[] args) {
        Project project = new Project(1, "SuperProject", "sourceCode//");
        ProjectFactory factory = new ProjectFactory(project);
        Project projectClone = factory.cloneProject();
        System.out.println(project);
        System.out.println("------------");
        System.out.println(projectClone);
    }
}
