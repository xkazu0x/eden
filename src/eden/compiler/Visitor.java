package eden.compiler;

import eden.parser.*;
import eden.parser.EdenParser.*;

public class Visitor extends EdenBaseVisitor<String> {
    @Override
    public String visitExpr(ExprContext context) {
        visitChildren(context);
        if (context.getChildCount() == 1) {
            System.out.println(context.getChild(0));
        } else {
            System.out.println(context.getChild(2));
            System.out.println("expr");
        }
        return(null);
    }
}
