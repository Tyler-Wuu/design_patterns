package decorator;

/**
 * A concrete object to be decorated
 * will pass content in a file to the parent
 */
public class SpruceTree extends Tree{

    public SpruceTree(){
        super(FileReader.getLines("design_patterns/decorator/spruce-tree.txt"));
    }

}