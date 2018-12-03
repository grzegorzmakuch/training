package Todolist;

public class Main {

    static String[] tasks = new String[100];
    static String[] projects = new String[100];
    static String[] changeLog = new String[100];

    static int tasksCount = 0;
    static int projectsCount = 0;
    static int changeLogCount = 0;

    public static void main(String[] args) {

    }

    public static void displayMenu() {
        System.out.println("1 - Create new task");
        System.out.println("2 - Remove task");
        System.out.println("3 - Create new project");
        System.out.println("4 - Remove project");
        System.out.println("5 - Display all tasks");
        System.out.println("6 - Display all projects");
        System.out.println("7 - Display change log");
        System.out.println("0 - Exit app");
    }

    public static void addTask(String task) {
        boolean hasCapacityForNewTask = tasksCount < tasks.length;
        if(hasCapacityForNewTask) {
            tasks[tasksCount] = task;
            tasksCount++;
        }
    }

    public static void removeTask(int indexTask) {
        boolean isTaskExist = indexTask < tasksCount;
        if(isTaskExist) {
            for()
        }
    }
}
