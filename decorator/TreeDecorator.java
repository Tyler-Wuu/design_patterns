package decorator;

import java.util.ArrayList;

/**
 * Parent of all concrete decorator class, contain useful method
 */
public abstract class TreeDecorator extends Tree{

    public TreeDecorator(ArrayList<String> newLines) {
        super(newLines);
    }
    /**
     * If you are checking this I suggest to only check only one branch of 
     * the inner(not inner inner) if-else statement
     * (marked with // if lines have more row than decor OR
     * // if decor have more row than lines)
     * Bascially it use two if-else statement to determine the approate length to
     * traverse. 
     * - If decor is smaller than the original tree, than do some condition
     * that append decor if the decor have a character on that index, if not append 
     * content at that index from tree. After append all decor's content it will
     * fill the rest with tree's content
     * - If tree is smaller than decor, same logic apply, append tree content with
     * some condition than append the rest with decor's content
     * @param decor the content child passed  to us in their constructor
     */
    protected void integrateDecor(ArrayList<String> decor){
        StringBuilder newLines = new StringBuilder();
        ArrayList<String> rv = new ArrayList<String>();        
        if(decor.size() <= this.lines.size()){ // if lines have more column than decor
            for(int i = 0; i < decor.size(); ++i){
                newLines = new StringBuilder();
                if(decor.get(i).length() <= this.lines.get(i).length()){  // if lines have more row than decor
                    int j;
                    for(j = 0; j < decor.get(i).length(); ++j){  // literate through the end of row
                        if( (decor.get(i).charAt(j) != ' ') && (decor.get(i).charAt(j) != '\n') ){  // if no character exist in lines, overlay with, also only append \n in this.lines
                            newLines.append(decor.get(i).charAt(j));
                        }else{
                            newLines.append(this.lines.get(i).charAt(j));
                        }  // end of 1st inner inner if-else statement
                    }  // end of 1st inner for loop
                    for(; j < this.lines.get(i).length(); ++j){
                        newLines.append(this.lines.get(i).charAt(j));
                    }  // end of 2nd inner for loop
                    rv.add(i, newLines.toString());
                }else{  // if decor have more row than lines
                    int j;
                    for(j = 0; j < this.lines.get(i).length(); ++j){  // literate through the end of row
                        if( (decor.get(i).charAt(j) != ' ') && (decor.get(i).charAt(j) != '\n') ){  // if no character exist in lines, overlay with, also only append \n in this.lines
                            newLines.append(decor.get(i).charAt(j));
                        }else{
                            newLines.append(this.lines.get(i).charAt(j));
                        }  // end of 2nd inner inner if-else statement
                    }  // end of 3rd inner for loop
                    for(; j < decor.get(i).length(); ++j){
                        newLines.append(decor.get(i).charAt(j));
                    }  // end of 4th inner for loop
                    rv.add(i, newLines.toString());
                }  // end of inner if-else statement
            }  // end of outer for loop
        }else{
            // should not happen
        }  // end of outer if-else statement
        this.lines = rv;
    }
    
}
