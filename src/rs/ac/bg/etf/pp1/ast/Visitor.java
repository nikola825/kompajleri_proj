// generated with ast extension for cup
// version 0.8
// 17/9/2018 23:25:43


package rs.ac.bg.etf.pp1.ast;

public interface Visitor { 

    public void visit(Statement statement);
    public void visit(Condexpr condexpr);
    public void visit(Actpars actpars);
    public void visit(Expr expr);
    public void visit(Programname programname);
    public void visit(Formpars formpars);
    public void visit(Programdeclarations programdeclarations);
    public void visit(Errsep errsep);
    public void visit(Function function);
    public void visit(Constantdeclaration constantdeclaration);
    public void visit(Declarationblockwrapper declarationblockwrapper);
    public void visit(Program program);
    public void visit(Classdeclaration classdeclaration);
    public void visit(Extendsdeclaration extendsdeclaration);
    public void visit(Designatorstmt designatorstmt);
    public void visit(Statementblock statementblock);
    public void visit(Declarationblock declarationblock);
    public void visit(Condfactor condfactor);
    public void visit(Factor factor);
    public void visit(Condterm condterm);
    public void visit(Designator designator);
    public void visit(Term term);
    public void visit(Functionname functionname);
    public void visit(Variabledeclaration variabledeclaration);
    public void visit(Codebody codebody);
    public void visit(Formparswrapper formparswrapper);
    public void visit(Call call);
    public void visit(Namedeclaration namedeclaration);
    public void visit(Classname classname);
    public void visit(Constnamedeclaration constnamedeclaration);
    public void visit(Designatorline designatorline);
    public void visit(EmptyParameters EmptyParameters);
    public void visit(Parameters Parameters);
    public void visit(Parameter Parameter);
    public void visit(Type Type);
    public void visit(IndexDesignator IndexDesignator);
    public void visit(PathDesignator PathDesignator);
    public void visit(BaseDesignator BaseDesignator);
    public void visit(CallResult CallResult);
    public void visit(Parenthesized Parenthesized);
    public void visit(NewArray NewArray);
    public void visit(NewObject NewObject);
    public void visit(SingleFactor SingleFactor);
    public void visit(BooleanConstant BooleanConstant);
    public void visit(CharacterConstant CharacterConstant);
    public void visit(NumericConstant NumericConstant);
    public void visit(FuncCall FuncCall);
    public void visit(Modulus Modulus);
    public void visit(Division Division);
    public void visit(Multiplication Multiplication);
    public void visit(Negated Negated);
    public void visit(SingleTerm SingleTerm);
    public void visit(Substraction Substraction);
    public void visit(Addition Addition);
    public void visit(SingleExpr SingleExpr);
    public void visit(ErrsepDerived12 ErrsepDerived12);
    public void visit(ErrsepDerived11 ErrsepDerived11);
    public void visit(ErrsepDerived10 ErrsepDerived10);
    public void visit(ErrsepDerived9 ErrsepDerived9);
    public void visit(ErrsepDerived8 ErrsepDerived8);
    public void visit(ErrsepDerived7 ErrsepDerived7);
    public void visit(ErrsepDerived6 ErrsepDerived6);
    public void visit(ErrsepDerived5 ErrsepDerived5);
    public void visit(ErrsepDerived4 ErrsepDerived4);
    public void visit(ErrsepDerived3 ErrsepDerived3);
    public void visit(ErrsepDerived2 ErrsepDerived2);
    public void visit(ErrsepDerived1 ErrsepDerived1);
    public void visit(LessEqual LessEqual);
    public void visit(Less Less);
    public void visit(GreaterEqual GreaterEqual);
    public void visit(Greater Greater);
    public void visit(NotEquals NotEquals);
    public void visit(Equals Equals);
    public void visit(SingleCondFactor SingleCondFactor);
    public void visit(CondTermError CondTermError);
    public void visit(And And);
    public void visit(SingleCondTerm SingleCondTerm);
    public void visit(CondExprError CondExprError);
    public void visit(Or Or);
    public void visit(SingleCondExpr SingleCondExpr);
    public void visit(Decrement Decrement);
    public void visit(Increment Increment);
    public void visit(Assign Assign);
    public void visit(DesignatorlineDerived3 DesignatorlineDerived3);
    public void visit(DesignatorlineDerived2 DesignatorlineDerived2);
    public void visit(DesignatorlineDerived1 DesignatorlineDerived1);
    public void visit(StatementBlock StatementBlock);
    public void visit(EmptyBlock EmptyBlock);
    public void visit(CallStatement CallStatement);
    public void visit(EmptyReturn EmptyReturn);
    public void visit(Return Return);
    public void visit(Continue Continue);
    public void visit(Break Break);
    public void visit(DoWhile DoWhile);
    public void visit(IfElse IfElse);
    public void visit(If If);
    public void visit(Block Block);
    public void visit(StatementDerived1 StatementDerived1);
    public void visit(Array Array);
    public void visit(Variable Variable);
    public void visit(NumberConstantDeclaration NumberConstantDeclaration);
    public void visit(CharConstantDeclaration CharConstantDeclaration);
    public void visit(BoolConstantDeclaration BoolConstantDeclaration);
    public void visit(VariabledeclarationDerived4 VariabledeclarationDerived4);
    public void visit(VariabledeclarationDerived3 VariabledeclarationDerived3);
    public void visit(VariabledeclarationDerived2 VariabledeclarationDerived2);
    public void visit(VariabledeclarationDerived1 VariabledeclarationDerived1);
    public void visit(ConstantDeclarationTyped ConstantDeclarationTyped);
    public void visit(ConstantDeclarations ConstantDeclarations);
    public void visit(FormparsDerived4 FormparsDerived4);
    public void visit(FormparsDerived3 FormparsDerived3);
    public void visit(FormparsDerived2 FormparsDerived2);
    public void visit(FormparsDerived1 FormparsDerived1);
    public void visit(FormParsWrapper3 FormParsWrapper3);
    public void visit(FormParsWrapper2 FormParsWrapper2);
    public void visit(FormParsWrapper FormParsWrapper);
    public void visit(EmptyDeclarationBlock EmptyDeclarationBlock);
    public void visit(DeclarationBlock DeclarationBlock);
    public void visit(DeclarationBlockWrapper2 DeclarationBlockWrapper2);
    public void visit(DeclarationBlockWrapper1 DeclarationBlockWrapper1);
    public void visit(Proc Proc);
    public void visit(Func Func);
    public void visit(CodebodyDerived2 CodebodyDerived2);
    public void visit(CodebodyDerived1 CodebodyDerived1);
    public void visit(NonDerivedClass NonDerivedClass);
    public void visit(DerivedClass DerivedClass);
    public void visit(ExtendsdeclarationDerived2 ExtendsdeclarationDerived2);
    public void visit(ExtendsdeclarationDerived1 ExtendsdeclarationDerived1);
    public void visit(ProgramdeclarationsDerived4 ProgramdeclarationsDerived4);
    public void visit(ProgramdeclarationsDerived3 ProgramdeclarationsDerived3);
    public void visit(ProgramdeclarationsDerived2 ProgramdeclarationsDerived2);
    public void visit(ProgramdeclarationsDerived1 ProgramdeclarationsDerived1);
    public void visit(FunctionName FunctionName);
    public void visit(ClassName ClassName);
    public void visit(ProgramName ProgramName);
    public void visit(ProgramDerived1 ProgramDerived1);

}
