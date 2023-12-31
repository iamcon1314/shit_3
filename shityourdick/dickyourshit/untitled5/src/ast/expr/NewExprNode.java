package src.ast.expr;

import src.ast.*;
import src.ast.stmt.*;
import src.utils.*;
import java.util.ArrayList;

public class NewExprNode extends ExprNode {
  public String typeName;
  public int dim = 0;
  public ArrayList<ExprNode> sizeList = new ArrayList<ExprNode>();
  public NewExprNode(Position pos, String typeName) {
    super(pos);
    this.typeName = typeName;
  }

  @Override
  public boolean isLeftValue() {
    return false;
  }

  @Override
  public void accept(ASTVisitor visitor) {
    visitor.visit(this);
  }
}