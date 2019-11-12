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
            }
            return (T) exp;

        }
        return null;
    }

    @Override
    public T visitReserve_funct(SRParser.Reserve_functContext ctx) {
        String ans = "";
        if (ctx.Write() != null) {
            System.out.println(visitDeclarations(ctx.declarations()));
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
        return null;
    }


}