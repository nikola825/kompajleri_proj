// generated with ast extension for cup
// version 0.8
// 28/11/2018 17:15:5


package rs.ac.bg.etf.pp1.ast;

public class CodebodyDerived1 extends Codebody {

    public CodebodyDerived1 () {
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("CodebodyDerived1(\n");

        buffer.append(tab);
        buffer.append(") [CodebodyDerived1]");
        return buffer.toString();
    }
}
