package iterator;

/**
 * @author Tyler Wu
 * Assignment Class
 * contain the name, description, and topic for an assignment
 */
public class Assignment {
    private String title;
    private String description;
    private Topic topic;

    public Assignment(String newTitle, String newDescription, Topic newTopic) {
        this.title = newTitle;
        this.description = newDescription;
        this.topic = newTopic;
    }

    /**
     * @param topicToCompare topic to check with this assignment
     * @return true if assignment contain the param topic, false OW
     */
    public boolean hasTopic(Topic topicToCompare) {
        return this.topic == topicToCompare;
    }

    /**
     * @return a string in the format of:
     * [title] [description] [topic]
     */
    @Override
    public String toString() {
        return this.title + " " + this.description + " " + this.topic;
    }
    
}
