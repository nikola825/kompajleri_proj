package rs.ac.bg.etf.pp1;

import rs.ac.bg.etf.pp1.ast.SyntaxNode;

public class CompilerError
{
    protected String message;
    protected int line;
    protected int column;
    public static boolean errorsMade=false;
    private CompilerError(String message, int line, int column)
    {
        this.message = message;
        this.line = line;
        this.column = column;
    }

    private CompilerError(String message, int line)
    {
        this(message, line, -1);
    }

    public static void raise(String message, int line, int column)
    {
        errorsMade=true;
        System.err.println(new CompilerError(message, line, column));
    }

    public static void raise(String message, SyntaxNode node)
    {
        errorsMade=true;
        raise(message, node.getLine(), -1);
    }

    @Override
    public String toString()
    {
        String msg = "Compilation eror: " + message + "\nOn Line:" + line;
        if (column != -1)
        {
            msg += ", Column:" + column;
        }
        return msg;
    }
}
