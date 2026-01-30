package decorator;

public class Star extends TreeDecorator{
    private Tree tree;

    public Star(Tree newTree){
        super(newTree.lines);
        this.tree = newTree;
        integrateDecor(FileReader.getLines("design_patterns/decorator/star.txt"));
    }
}
