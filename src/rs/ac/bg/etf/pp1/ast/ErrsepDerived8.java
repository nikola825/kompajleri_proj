// generated with ast extension for cup
// version 0.8
// 16/11/2018 17:36:48


package rs.ac.bg.etf.pp1.ast;

public class ErrsepDerived8 extends Errsep {

    public ErrsepDerived8 () {
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
        buffer.append("ErrsepDerived8(\n");

        buffer.append(tab);
        buffer.append(") [ErrsepDerived8]");
        return buffer.toString();
    }
}
