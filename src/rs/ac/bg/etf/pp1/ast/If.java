// generated with ast extension for cup
// version 0.8
// 17/9/2018 23:25:43


package rs.ac.bg.etf.pp1.ast;

public class If extends Statement {

    private Condexpr condexpr;
    private Statement statement;

    public If (Condexpr condexpr, Statement statement) {
        this.condexpr=condexpr;
        if(condexpr!=null) condexpr.setParent(this);
        this.statement=statement;
        if(statement!=null) statement.setParent(this);
    }

    public Condexpr getCondexpr() {
        return condexpr;
    }

    public void setCondexpr(Condexpr condexpr) {
        this.condexpr=condexpr;
    }

    public Statement getStatement() {
        return statement;
    }

    public void setStatement(Statement statement) {
        this.statement=statement;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
        if(condexpr!=null) condexpr.accept(visitor);
        if(statement!=null) statement.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(condexpr!=null) condexpr.traverseTopDown(visitor);
        if(statement!=null) statement.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(condexpr!=null) condexpr.traverseBottomUp(visitor);
        if(statement!=null) statement.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("If(\n");

        if(condexpr!=null)
            buffer.append(condexpr.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        if(statement!=null)
            buffer.append(statement.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [If]");
        return buffer.toString();
    }
}
