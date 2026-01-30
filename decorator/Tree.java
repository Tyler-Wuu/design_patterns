package decorator;

import java.util.ArrayList;

public abstract class Tree {
    private static final String RESET = "\033[0m";  // Text Reset
    private static final String GREEN = "\033[0;32m";   // GREEN
    private static final String WHITE = "\033[0;37m";   // WHITE
    private static final String RED = "\033[0;31m";     // RED
    private static final String YELLOW = "\033[0;33m";  // YELLOW
    private static final String BROWN = "\u001B[38;2;139;69;19m"; // RGB: 139, 69, 19
    protected ArrayList<String> lines;

    public Tree(ArrayList<String> newLines){
        this.lines = newLines;
    }

    public String toString(){
        StringBuilder output = new StringBuilder();
        int num_lines_to_change = 0;
        char current_color = '\0';
        for(int i = 0; i < lines.size(); ++i){
            for(int j = 0; j < lines.get(i).length(); ++j){

                if(num_lines_to_change == 0){

                    if(current_color == 'G'){
                        output.append(GREEN);
                        current_color = 'G';
                    }else if(current_color == 'B'){
                        output.append(BROWN);
                    }else{
                        output.append(RESET);
                    }

                    if(lines.get(i).charAt(j) == 'G'){
                        output.append(" ");
                        output.append(GREEN);
                        current_color = 'G';
                    }else if(lines.get(i).charAt(j) == 'B'){
                        output.append(" ");
                        output.append(BROWN);
                        current_color = 'B';
                    }else if(lines.get(i).charAt(j) == 'W'){
                        output.append(" ");
                        output.append(WHITE);
                        num_lines_to_change = 1;
                    }else if(lines.get(i).charAt(j) == 'Y'){
                        output.append(" ");
                        output.append(YELLOW);
                        num_lines_to_change = 1;
                    }else if(lines.get(i).charAt(j) == 'R'){
                        output.append(" ");
                        output.append(RED);
                        num_lines_to_change = 2;
                    }else{
                        output.append(lines.get(i).charAt(j));
                    }

                }else{
                    num_lines_to_change -= 1;
                    output.append(lines.get(i).charAt(j));
                }
            }
            output.append("\n");
        }
        return output.toString();
    }

}
