package iterator;

import java.util.Iterator;

/**
 * @author Tyler Wu
 * AssignmentIterator Class inhert from java.util.Iterator
 * Please note that this class does not have a override remove method
 * unexpected behavior when remove is called
 */
public class AssignmentIterator implements Iterator<Assignment>{
    public Assignment[] assignments;
    private int position;

    /**
     * Constructor of AssignmentIterator, will create an Iterator for assignment that only
     * contains the param topic
     * it will hold an array with null if no topic match
     * @param newAssignment array of assignment as data
     * @param topic topic of this iterator's assignment will contain
     */
    public AssignmentIterator(Assignment[] newAssignment, Topic topic) {
        this.assignments = new Assignment[newAssignment.length];
        // create stub array
        if (topic == Topic.ALL) {
        // for all topic just copy the array exactly
            this.assignments = newAssignment;
        } else {
        // else test if each element in the array has the parm topic contain
            for (int i = 0, j = 0; i < newAssignment.length; ++i) {
                if ( newAssignment[i] == null ) {  
                    break;  // quit if reach the end of the array
                }
                if ( newAssignment[i].hasTopic(topic) ) {
                    this.assignments[j++] = newAssignment[i];
                    // assign the array element from zero
                }
            }
        }
        this.position = 0;
    }

    @Override
    public boolean hasNext() {
        return (position <= this.assignments.length) && (this.assignments[position] != null);
        // true if both the counter did not go over the size of the array 
        // AND the array at counter position has a valid element
    }

    @Override
    public Assignment next() {
        if ( hasNext() ) {
            return this.assignments[position++];
        }
        return null;
    }
    
}
