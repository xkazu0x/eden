package compiler;

import parser.*;
import parser.EdenParser.*;

public class Visitor extends EdenBaseVisitor<String> {
    @Override
    public String visitProg(ProgContext context) {
        visitChildren(context);
        int child_count = context.getChildCount();
        for (int child_index = 0;
             child_index < child_count;
             ++child_index) {
            var child = context.getChild(child_index);
            System.out.println(child.getText());
        }
        return(null);
    }
}
