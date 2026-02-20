package iterator;

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

    public void addAssignment(String title, String description, Topic topic) {
        if (assignment.length < count + 1) {
            // if the next element added is over the array size
            this.assignment = growArray(assignment);
        }
        assignment[count++] = new Assignment(title, description, topic);
    // assign the next elemnt to the new Assignment created
    }

    public AssignmentIterator createIterator(Topic topic) {
        return new AssignmentIterator(this.assignment, topic);
    }

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
