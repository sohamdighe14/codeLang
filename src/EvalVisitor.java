//import com.google.common.collect.HashMultimap;
//import com.google.common.collect.HashMultiset;
//import com.google.common.collect.Multiset;
//import org.antlr.runtime.tree.ParseTree;
//import org.antlr.v4.runtime.misc.MultiMap;
//import org.antlr.v4.runtime.misc.Pair;
//
//import java.util.Map;
//import java.util.Set;
//import java.util.TreeSet;
//
//public class EvalVisitor extends codeLangBaseVisitor {
//
//    Set<Pair<Object,Object>> memory = new Set<Pair<Object, Object>> ();
//
//    @Override
//    public Object visitEdges(codeLangParser.EdgesContext ctx) {
//        for(ParseTree a: ctx.children)
//            visit(a);
//        return 0;
//    }
//
//    @Override
//    public Object visitEdge(codeLangParser.EdgeContext ctx) {
//        memory.add(visit(ctx.FROM().getText()),visit(ctx.TO().getText()));
//        String s = visit(ctx.FROM())+ "->" +visit(ctx.TO());
//        return super.visitEdge(ctx);
//    }
//
//    @Override
//    public Object visitFrom(codeLangParser.FromContext ctx) {
//        return ctx.CHAR().getText();
//    }
//
//    @Override
//    public Object visitTo(codeLangParser.ToContext ctx) {
//        return ctx.CHAR().getText();
//    }
//}
