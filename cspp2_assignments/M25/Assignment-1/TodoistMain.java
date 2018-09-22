import java.util.Scanner;
import java.util.Arrays;

/**
  * write your code below this comment
  */
class Task {
	private String taskTitle;
	private String name;
	private int taskTime;
	private boolean taskImportant;
	private boolean taskUrgent;
	private String taskStatus;
	protected Task () {
		// this.taskTime = time;
	}
	protected Task(String title, String assignedTo, int timeToComplete,
		boolean important, boolean urgent, String status) {
		this.taskTitle = title;
		this.name = assignedTo;
		this.taskTime = timeToComplete;
		this.taskImportant = important;
		this.taskUrgent = urgent;
		this.taskStatus = status;
	}
	public String getTitle() {
		return this.taskTitle;
	}
	public String setTitle(final String title) {
        this.taskTitle = title;
        return taskTitle;
    }
	public String getName() {
		return this.name;
	}
	public int getTime() {
		return this.taskTime;
	}
	public String getStatus() {
		return this.taskStatus;
	}
	public String getImp() {
		String str = "";
		if (this.taskImportant == true) {
			str = "Important";
		} else {
			str = "Not Important";
		}
		return str;
	}
	public String getUrgent() {
		String str = "";
		if (this.taskUrgent == true) {
			str = "Urgent";
		} else {
			str = "Not Urgent";
		}
		return str;
	}
	public String toString() {
		String str = "";
		str = getTitle() + ", " + getName() + ", " + getTime() + ", " + getImp() + ", " +
		getUrgent() + ", " + getStatus();
		return str;
	}
}
class Todoist {
	private Task[] taskdata;
	Task t = new Task();
	private int tasksize;
	protected Todoist() {
		taskdata = new Task[10];
		tasksize = 0;
	}
	public void addTask(Task task) {
		if (tasksize == taskdata.length) {
            resize();
        }
        else {
            taskdata[tasksize++] = task;
        }
	}
	public void resize() {
		taskdata = Arrays.copyOf(taskdata, tasksize + 2);
	}
	public String toString() {
		String str = "";
		for (int i = 0; i < tasksize; i++) {
			// System.out.println(taskdata[i]);
			str += taskdata[i] + "\n";
		}
		return str;
	}
	public Task getNextTask(String personName) {
		
		return null;
	}
	public Task[] getNextTask(String personName, int taskcount) {
		return null;
	}
	public int totalTime4Completion() {
		int total = 0;
		for (int i = 0; i < tasksize; i++) {
			// System.out.println("HIIIIII");
			if (taskdata[i].getStatus().equals("todo")) {
				total += taskdata[i].getTime();
				// System.out.println(total);
			}
		}
		return total;
	}

}
/**
 * Class for todoist main.
 */
public class TodoistMain {

    /**
     * Starts a test.
     */
    public static void startTest() {
        Todoist todo = new Todoist();
        Scanner s = new Scanner(System.in);
        while (s.hasNext()) {
            String[] tokens = s.nextLine().split(",");
            switch (tokens[0]) {
                case "task":
                    testTask(tokens);
                break;
                case "add-task":
                    testAddTask(todo, tokens);
                break;
                case "print-todoist":
                    System.out.println(todo);
                break;
                case "get-next":
                    System.out.println(todo.getNextTask(tokens[1]));
                break;
                case "get-next-n":
                    int n = Integer.parseInt(tokens[2]);
                    Task[] tasks = todo.getNextTask(tokens[1], n);
                    System.out.println(Arrays.deepToString(tasks));
                break;
                case "total-time":
                    System.out.println(todo.totalTime4Completion());
                break;
                default:
                break;
            }
        }
    }

    /**
     * method to test add task.
     *
     * @param      todo    The todo
     * @param      tokens  The tokens
     */
    public static void testAddTask(final Todoist todo, final String[] tokens) {
        try {
            todo.addTask(createTask(tokens));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    /**
     * method to test the creation of task object.
     *
     * @param      tokens  The tokens
     */
    public static void testTask(final String[] tokens) {
        try {
            System.out.println(createTask(tokens));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    /**
     * Creates a task object.
     *
     * @param      tokens     The tokens
     *
     * @return     Task object
     *
     * @throws     Exception  if task inputs are invalid
     */
    public static Task createTask(final String[] tokens) throws Exception {
        String title = tokens[1];
        String assignedTo = tokens[2];
        int timeToComplete = Integer.parseInt(tokens[3]);
        boolean important = tokens[4].equals("y");
        boolean urgent = tokens[5].equals("y");
        String status = tokens[6];
        return new Task(
            title, assignedTo, timeToComplete, important, urgent, status);
    }

    /**
     * main method.
     *
     * @param      args  The command line arguments
     */
    public static void main(final String[] args) {
        startTest();
    }
}
