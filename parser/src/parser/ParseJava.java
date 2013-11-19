package parser;

/**
 * Indent four spaces within nested control structures such as loops and if-then statements.
 * The interior of curly brackets {}, for example, would be indented four spaces.
 * The left curly bracket { should be on a line by itself and aligned with the previous line’s
 * indention.
 * The right curly bracket } should be on a line by itself and aligned with its matching curly
 * bracket {.
 * Binary operators, e.g., a * b, should have a blank on either side of the operator.
 * Unary operators, e.g., i++, should be adjacent to their operand.
 *
 * @author aksfjh
 */

import java.util.ArrayList;

public class ParseJava {
    private ArrayList<String> new_line_chars = new ArrayList<String>();
    private ArrayList<String> line_end_chars = new ArrayList<String>();
    private int indent;

    parseJava(int indent){
        this.indent = indent;
    }

    //default sets indent to 4
    parseJava(){
        this(4);
    }

    private void setChars(){

    }
}
