// generated with ast extension for cup
// version 0.8
// 28/11/2018 17:15:5


package rs.ac.bg.etf.pp1.ast;

public interface SyntaxNode { 

    public void accept(Visitor visitor); 

    public void childrenAccept(Visitor visitor); 
    public void traverseBottomUp(Visitor visitor); 
    public void traverseTopDown(Visitor visitor); 

    public SyntaxNode getParent(); 
    public void setParent(SyntaxNode parent); 
    public int getLine(); 
    public void setLine(int line); 
}