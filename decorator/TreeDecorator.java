package decorator;

import java.util.ArrayList;

public abstract class TreeDecorator extends Tree{

    public TreeDecorator(ArrayList<String> newLines) {
        super(newLines);
    }

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
                        }
                    }
                    for(; j < this.lines.get(i).length(); ++j){
                        newLines.append(this.lines.get(i).charAt(j));
                    }
                    rv.add(i, newLines.toString());
                }else{  // if decor have more row than lines
                    int j;
                    for(j = 0; j < this.lines.get(i).length(); ++j){  // literate through the end of row
                        if( (decor.get(i).charAt(j) != ' ') && (decor.get(i).charAt(j) != '\n') ){  // if no character exist in lines, overlay with, also only append \n in this.lines
                            newLines.append(decor.get(i).charAt(j));
                        }else{
                            newLines.append(this.lines.get(i).charAt(j));
                        } 
                    }
                    for(; j < decor.get(i).length(); ++j){
                        newLines.append(decor.get(i).charAt(j));
                    }
                    rv.add(i, newLines.toString());
                }
            }
        }else{
            // should not happen
        }

        this.lines = rv;
    }
    
}
