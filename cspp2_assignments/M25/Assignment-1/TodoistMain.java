import java.util.Scanner;
import java.util.Arrays;

/**
  * write your code below this comment
  * @author Prasanth...
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
	/**
	 * Constructs the object.
	 *
	 * @param      title           The title
	 * @param      assignedTo      The assigned to
	 * @param      timeToComplete  The time to complete
	 * @param      important       The important
	 * @param      urgent          The urgent
	 * @param      status          The status
	 */
	protected Task(String title, String assignedTo, int timeToComplete,
		boolean important, boolean urgent, String status) {
		/**
		 * { item_description }
		 */
		this.taskTitle = title;
		/**
		 * { item_description }
		 */
		this.name = assignedTo;
		/**
		 * { item_description }
		 */
		this.taskTime = timeToComplete;
		/**
		 * { item_description }
		 */
		this.taskImportant = important;
		/**
		 * { item_description }
		 */
		this.taskUrgent = urgent;
		/**
		 * { item_description }
		 */
		this.taskStatus = status;
	}
	/**
	 * Gets the title.
	 *
	 * @return     The title.
	 */
	public String getTitle() {
		return this.taskTitle;
	}
	/**
	 * Sets the title.
	 *
	 * @param      title  The title
	 *
	 * @return     { description_of_the_return_value }
	 */
	public String setTitle(final String title) {
        this.taskTitle = title;
        return taskTitle;
    }
	/**
	 * Gets the name.
	 *
	 * @return     The name.
	 */
	public String getName() {
		return this.name;
	}
	/**
	 * Gets the time.
	 *
	 * @return     The time.
	 */
	public int getTime() {
		return this.taskTime;
	}
	/**
	 * Gets the status.
	 *
	 * @return     The status.
	 */
	public String getStatus() {
		return this.taskStatus;
	}
	/**
	 * Gets the imp.
	 *
	 * @return     The imp.
	 */
	public String getImp() {
		String str = "";
		if (this.taskImportant == true) {
			str = "Important";
		} else {
			str = "Not Important";
		}
		return str;
	}
	/**
	 * Gets the urgent.
	 *
	 * @return     The urgent.
	 */
	public String getUrgent() {
		String str = "";
		if (this.taskUrgent == true) {
			str = "Urgent";
		} else {
			str = "Not Urgent";
		}
		return str;
	}
	/**
	 * Returns a string representation of the object.
	 *
	 * @return     String representation of the object.
	 */
	public String toString() {
		String str = "";
	
		str = getTitle() + ", " + getName() + ", " + getTime() + ", " + getImp() + ", " +
		getUrgent() + ", " + getStatus();
	// }
		return str;
		// try {}
		// 		if (getTitle() != "") {
					
		// 		}
		// 	} catch (Exception e) {
		// 		System.out.println("Title not provided");
		// 	}
		// // try {
		// // 		if (getTime() > 0) {
		// // 			return getTime();
		// // 		}
		// // 	} catch (Exception e) {
		// // 		System.out.println("Invalid timeToComplete" + getTime());
		// // 	}
		// 	String str = "";
		// try {
		// 		if (getStatus() == "todo" || getStatus() == "done") {
		// 			str = getTitle() + ", " + getName() + ", " + getTime() + ", " + getImp() + ", " +
		// 			getUrgent() + ", " + getStatus();
		// 		}
		// 	} catch (Exception e) {
		// 		System.out.println("Invalid status");
		// 	}
		// 	return str;
	}
}
/**
 * Class for todoist.
 */
class Todoist {
	/**
	 * task[]
	 */
	private Task[] taskdata;
	/**
	 * hundres.
	 */
	private static final int hundred = 100;
	/**
	 * size
	 */
	private int tasksize;
	/**
	 * Constructs the object.
	 */
	protected Todoist() {
		taskdata = new Task[hundred];
		tasksize = 0;
	}
	/**
	 * Adds a task.
	 *
	 * @param      task  The task
	 */
	public void addTask(Task task) {
		if (tasksize == taskdata.length) {
            resize();
        }
        else {
            taskdata[tasksize++] = task;
        }
	}
	/**
	 * resize
	 */
	public void resize() {
		taskdata = Arrays.copyOf(taskdata, tasksize + 2);
	}
	/**
	 * Returns a string representation of the object.
	 *
	 * @return     String representation of the object.
	 */
	public String toString() {
		String str = "";
		for (int i = 0; i < tasksize; i++) {
			// System.out.println(taskdata[i]);
			str += taskdata[i] + "\n";
		}
		return str;
	}
	/**
	 * Gets the next task.
	 *
	 * @param      personName  The person name
	 *
	 * @return     The next task.
	 */
	public Task getNextTask(String personName) {
		// for (int i =0; i < tasksize; i++) {
		// taskdata[i] = taskdata[i].getName();
		// }
		// for (personName : taskdata.getName() ) {
		// 	addTask(taskdata);
		// }
		return null;
	}
	/**
	 * Gets the next task.
	 *
	 * @param      personName  The person name
	 * @param      taskcount   The taskcount
	 *
	 * @return     The next task.
	 */
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
