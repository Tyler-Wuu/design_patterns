package iterator;

public class Assignment {
    private String title;
    private String description;
    private Topic topic;

    public Assignment(String newTitle, String newDescription, Topic newTopic) {
        this.title = newTitle;
        this.description = newDescription;
        this.topic = newTopic;
    }

    public boolean hasTopic(Topic topicToCompare) {
        return this.topic == topicToCompare;
    }

    @Override
    public String toString() {
        return title + " " + description + " " + topic;
    }
    
}
