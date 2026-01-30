package decorator;

import java.util.ArrayList;

public class Ornaments extends TreeDecorator{

    private Tree tree;

    public Ornaments(Tree newTree) {
        super(newTree.lines);
        this.tree = newTree;
        integrateDecor(FileReader.getLines("design_patterns/decorator/ornaments.txt"));
    }
    
}
