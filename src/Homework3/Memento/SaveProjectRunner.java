package Homework3.Memento;

public class SaveProjectRunner {
    public static void main(String[] args) {
        Project project = new Project();
        GitHubRepo gitHub = new GitHubRepo();

        System.out.println("Creating new project. Version 1.0");
        project.setVersionAndData("Version 1.0");

        System.out.println(project);

        System.out.println("Saving current version to github...");
        gitHub.setSave(project.save());

        System.out.println("Updating project to Version 1.1");

        System.out.println("Writing poor code...");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        project.setVersionAndData("Version 1.1");

        System.out.println(project);

        System.out.println("Something went wrong...");

        System.out.println("Rolling back to version 1.0");
        project.load(gitHub.getSave());

        System.out.println("Project after rollback:");
        System.out.println(project);

    }
}
