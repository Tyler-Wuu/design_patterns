package decorator;

public class Lights extends TreeDecorator{

    private Tree tree;

    public Lights(Tree newTree) {
        super(newTree.lines);
        this.tree = newTree;
        integrateDecor(FileReader.getLines("design_patterns/decorator/lights.txt"));
    }
    
}
