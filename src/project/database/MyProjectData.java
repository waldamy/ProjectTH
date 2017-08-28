package project.database;

import project.model.MyProject;

import java.util.ArrayList;

/**
 * @author Vladimir on 8/28/2017.
 */
public class MyProjectData {

    private static ArrayList<MyProject> projects = new ArrayList<>();

    /**
     * @return list of projects
     */
    public static ArrayList<MyProject> getProjects() {
        return projects;
    }

    /**
     * @param name is project's name.
     * @return {@Link MyProject} entity by given name.
     */
    public static MyProject getProjectByName(String name){
        for (int i = 0; i < projects.size(); i++) {
            if(name.equals(projects.get(i).getName())) return projects.get(i);
        }
        return null;
    }

    /**
     * @param projects is an ArrayList of projects
     * The method sets an ArrayList of projects.
     */
    public static void setProjects(ArrayList<MyProject> projects){
        MyProjectData.projects = projects;
    }

    /**
     * @param project is a project.
     * The method adds a project to an ArrayList.
     */
    public static void addProject(MyProject project){
        MyProjectData.projects.add(project);
    }

    /**
     * Clears all projects in the DB.
     */
    public static void clearProjects(){
        projects.clear();
    }
}
