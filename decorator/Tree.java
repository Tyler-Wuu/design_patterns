package decorator;

import java.util.ArrayList;

/**
 * Class Tree, content an Arraylist<String> lines for it's content
 * use toString() method to get correct output
 */
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

    /**
     * Override toString() method, this will print colored lines based speical mark
     * in this.lines
     * "G" = change string's color to green untill meet next indicator
     * "B" = change string's color to brown untill meet next indicator
     * "W" = change the next character's color to white untill meet next indicator
     * "Y" = change the next character's color to yellow untill meet next indicator
     * "R" = change the following two characters' color to red untill meet next indicator
     */
    @Override
    public String toString(){
        StringBuilder output = new StringBuilder();
        int num_lines_to_change = 0;
        // keep track how many char has been passed since a color change
        char current_color = '\0';
        // keep track of last color used(Only for G and B)
        for(int i = 0; i < lines.size(); ++i){  // for every column i
            for(int j = 0; j < lines.get(i).length(); ++j){  // for every column j
                if(num_lines_to_change == 0){  // if color change is allow
                    if(current_color == 'G'){
                    // change to green if last color is green
                        output.append(GREEN);
                        current_color = 'G';
                    }else if(current_color == 'B'){
                    // change to brown if last color is brown
                        output.append(BROWN);
                    }else{
                    // if no last color exist than just change color to white
                        output.append(RESET);
                    }  // end of first inner if-else statement
                    // replace the indicator with a space and change to that
                    // color accordingly, also set the num_lines_to_change to
                    // number of following character the indicator going to change
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
                    // if no indicator just append the original character to buffer
                        output.append(lines.get(i).charAt(j));
                    }  // end of second inner if-else statement
                }else{
                    // if a color change has been happened
                    num_lines_to_change -= 1;  // decrease the counter
                    output.append(lines.get(i).charAt(j));  // append original chraracter
                } // end of outer if-else statement
            }  // end of inner for loop
            output.append("\n");
            // I have to add this, I assume charAt() won't return \n
        }// end of outer for loop
        return output.toString();
    }// end of method toString()

}
