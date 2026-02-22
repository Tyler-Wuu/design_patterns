package iterator;

/**
 * @author Tyler WU
 * Course Class, contain list of assignment, the course name, and course title
 * Sorry for bad javadoc
 */
public class Course {

    public Assignment[] assignment;
    private int count;
    private String name;
    private String title;

    public Course(String newName, String newTitle) {
        this.assignment = new Assignment[2];
        this.count = 0;
        this.name = newName;
        this.title = newTitle;
    }

    /**
     * Add a new assignment to the list with the follow parm as content
     * @param title the title of the assignment to create
     * @param description the description of the assignment to create
     * @param topic the topic of the assignment to create
     */
    public void addAssignment(String title, String description, Topic topic) {
        if (assignment.length < count + 1) {
            // if the next element added is over the array size
            this.assignment = growArray(assignment);
        }
        assignment[count++] = new Assignment(title, description, topic);
    // assign the next elemnt to the new Assignment created
    }

    /**
     * Return an Iterator that contain assigment only have the parm topic
     * @param topic topic of the assignment must contain
     * @return an Iterator object
     */
    public AssignmentIterator createIterator(Topic topic) {
        return new AssignmentIterator(this.assignment, topic);
    }

    /**
     * @return a string in the format of:
     * [name] [title]
     */
    @Override
    public String toString() {
        return this.name + " " + this.title;
    }

    private Assignment[] growArray(Assignment[] first) {
        Assignment[] newArray = new Assignment[this.assignment.length * 2];
        for (int i = 0; i < this.assignment.length; ++i) {
            newArray[i] = this.assignment[i];
        }
        return newArray;
    }
    
}
