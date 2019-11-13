import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;
import java.io.*;
import javax.script.ScriptEngineManager;
import javax.script.ScriptEngine;
import javax.script.ScriptException;
import java.util.HashMap;

public class Interpeter <T> extends SRBaseVisitor {

    HashMap<String, Object> table = new HashMap<>();
    ScriptEngineManager mgr = new ScriptEngineManager();
    ScriptEngine engine = mgr.getEngineByName("JavaScript");

    @Override
    public T visitS(SRParser.SContext ctx) {
        visitBlock(ctx.block());
        if (ctx.list_declarations() != null) {
            visitList_declarations(ctx.list_declarations());
        }
        if (ctx.declarations() != null) {
            for(int j=0; j < ctx.declarations().size(); j++ ) {
                visitDeclarations(ctx.declarations().get(j));
            }
        }

        return null;
    }


    @Override
    public T visitBlock(SRParser.BlockContext ctx) {
        String id = ctx.Id().getText();
        table.put("class", id);
        return null;
    }

    @Override public T visitList_declarations(SRParser.List_declarationsContext ctx) {
        return null;
    }

    @Override
    public T visitDeclarations(SRParser.DeclarationsContext ctx) {
        if(ctx.reserve_funct() != null){

            for(int j=0; j < ctx.reserve_funct().size(); j++ ) {
                visitReserve_funct(ctx.reserve_funct().get(j));
            }


        }
        if(ctx.expr() != null){
            String exp = "";
            for(int j=0; j < ctx.expr().size(); j++ ) {
               exp =  (String) visitExpr(ctx.expr().get(j));
                table.put("expr",exp);
            }


        }
        if(ctx.control_struc() != null){
            for(int j=0; j < ctx.control_struc().size(); j++ ) {
                visitControl_struc(ctx.control_struc().get(j));
            }
        }
        if(ctx.init_var() != null){
            for(int j=0; j < ctx.init_var().size(); j++ ) {
                visitInit_var(ctx.init_var().get(j));
            }
        }
        if(ctx.asign() != null){
            for(int j=0; j < ctx.asign().size(); j++ ) {
                visitAsign(ctx.asign().get(j));
            }
        }
        return null;
    }

    @Override
    public T visitInit_var(SRParser.Init_varContext ctx) {
        table.put(ctx.Id(0).getText(), "0");
        return null;
    }
    @Override
    public T visitAsign(SRParser.AsignContext ctx) {
        String var = ctx.Id(0).getText();
        if(table.get(var) != null){
            table.put(var, ctx.expr().value().getText());
        }
        else {
            System.out.println("La variable " +var + " no existe" );
        }
        return null;
    }

    @Override
    public T visitReserve_funct(SRParser.Reserve_functContext ctx) {
        String ans = "";
        if (ctx.Write() != null) {
            visitDeclarations(ctx.declarations());
            System.out.println(table.get("expr"));
        }
        /*if (ctx.Cos() != null) {
            return (T) Double.toString(Math.cos(  Double.parseDouble((String) visitDeclarations(ctx.declarations())) )) ;
        }*/

        return null;
    }

    @Override
    public T visitExpr(SRParser.ExprContext ctx) {
        String value =  (String) visitValue(ctx.value());
        if(ctx.bin_exp() != null){
            if(ctx.bin_exp().Tk_igual() != null){
                value += "=";
            }
            value += ctx.bin_exp().getText();
        }
        try {
            value = engine.eval(value).toString();
        } catch (ScriptException e) {
            e.printStackTrace();

        }
        return  (T) value;
    }

    @Override
    public T visitValue(SRParser.ValueContext ctx) {
        if(ctx.Tk_num() != null){

            return (T) ctx.Tk_num().getText();
        }
        if(ctx.Tk_string() != null){
            return (T) ctx.Tk_string().getText();
        }
        if(ctx.Tk_resta() != null){
            return (T) (ctx.Tk_resta().getText() + ctx.Tk_num().getText());
        }
        if(ctx.Id() != null){

            return (T) table.get(ctx.Id().getText()).toString();
        }
        return null;
    }

    @Override
    public T visitControl_struc(SRParser.Control_strucContext ctx) {
        if(ctx.for_all() != null){
            visitFor_all(ctx.for_all());
        }
        if(ctx.iff() != null){
            visitIff(ctx.iff());
        }
        return null;
    }

    @Override
    public T visitFor_all(SRParser.For_allContext ctx) {
        Integer num1 = Integer.parseInt( (String) visitExpr(ctx.cuantificador().expr(0)));
        Integer num2 = Integer.parseInt( (String) visitExpr(ctx.cuantificador().expr(1)));
        table.put(ctx.cuantificador().Id().getText(), num1);
        for (int i = num1; i <= num2; i++){
            visitDeclarations(ctx.declarations());
            table.put(ctx.cuantificador().Id().getText(),i+1);
        }
        return null;
    }

    @Override public T visitIff(SRParser.IffContext ctx) {
        String expr = (String) visitExpr(ctx.expr());
        if(expr == "true"){
            visitDeclarations(ctx.declarations());
        } else {
            visitDeclarations(ctx.elsee().declarations());
        }
        return null;
    }


}