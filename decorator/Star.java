package decorator;

/**
 * @author Tyler Wu
 * A concrete decorator class for Tree 
 */
public class Star extends TreeDecorator{

    /**
     * Constructor of Lights class
     * pass the content of tree to parent and call integrateDecor()
     * to merge the decorator content from a .txt file
     * @param newTree
     */
    public Star(Tree newTree){
        super(newTree.lines);
        integrateDecor(FileReader.getLines("design_patterns/decorator/star.txt"));
    }
}
