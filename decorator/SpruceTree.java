package decorator;

import java.util.ArrayList;

public class SpruceTree extends Tree{

    public SpruceTree(){
        super(FileReader.getLines("design_patterns/decorator/spruce-tree.txt"));
    }

}