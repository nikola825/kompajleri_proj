// generated with ast extension for cup
// version 0.8
// 17/11/2018 21:40:56


package rs.ac.bg.etf.pp1.ast;

public class ErrsepDerived1 extends Errsep {

    public ErrsepDerived1 () {
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
        buffer.append("ErrsepDerived1(\n");

        buffer.append(tab);
        buffer.append(") [ErrsepDerived1]");
        return buffer.toString();
    }
}
