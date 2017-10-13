import org.antlr.v4.runtime.misc.Pair;

import java.awt.dnd.peer.DragSourceContextPeer;
import java.util.HashSet;
import java.util.Set;

public class EvalListener extends codeLangBaseListener {

//    HashSet<Pair<Object,Object>> memory = new HashSet<Pair<Object, Object>>();

    @Override
    public void enterGraph(codeLangParser.GraphContext ctx) {
        System.out.println("@startuml");
    }

    @Override
    public void exitGraph(codeLangParser.GraphContext ctx) {
        System.out.println("@enduml");
    }

    @Override
    public void exitFrom(codeLangParser.FromContext ctx) {
        System.out.print(") -> ");
    }

    @Override
    public void enterFrom(codeLangParser.FromContext ctx) {
        System.out.print("("+ ctx.STRING());
    }

    @Override
    public void exitTo(codeLangParser.ToContext ctx) {
        System.out.println(")");
    }

    @Override
    public void enterTo(codeLangParser.ToContext ctx) {
        System.out.print("("+ ctx.STRING());
    }


}
