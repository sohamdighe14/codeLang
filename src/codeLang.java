import net.sourceforge.plantuml.GeneratedImage;
import net.sourceforge.plantuml.SourceFileReader;
import net.sourceforge.plantuml.ant.PlantUmlTask;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import sun.misc.IOUtils;
import sun.nio.ch.IOUtil;

import javax.imageio.ImageIO;
import java.awt.*;
import java.io.*;
import java.util.List;

public class codeLang {

    public static void main(String[] args) throws Exception {

//        PrintStream outfile = new PrintStream(new File("~/","a.code"));
//        System.setOut(outfile);
//
//        PrintStream infile = new PrintStream(new File("~/","infile"));
//        infile.println("graph { \n from a to b \n from c to d \n from b to c\n from a to asd \n }");
//
//        System.setIn(new FileInputStream("infile"));


        // Instantiate an Input stream for ANTLR
        ANTLRInputStream input = new ANTLRInputStream(System.in);

        // A lexer for parsing ANTLRInputStream

        codeLangLexer lexer = new codeLangLexer(input);

        // Generate Tokens from the lexer

        CommonTokenStream tokens = new CommonTokenStream(lexer);;

        // generate a parser from the tokens

        codeLangParser parser =new codeLangParser(tokens);

        // Create a Parse tree

        ParseTree tree = parser.graph();

        // Walk!!

        ParseTreeWalker walker = new ParseTreeWalker();

        // Create a Listener

        EvalListener elistener = new EvalListener();

        // Start walking notifing the listener about changes

        walker.walk(elistener,tree);


        // Declare infut file for PlantUml source
//        File inputForPlantUMl = new File("~/","a.code");
//
        //Configure PlantUML SourceFileReader to read from the given source
//        SourceFileReader reader = new SourceFileReader(inputForPlantUMl);
        // Get list of generated images
//        List<GeneratedImage> list = reader.getGeneratedImages();
        // Get file object from generated details
//        File imageFile = list.get(0).getPngFile();

        //TODO create a Jframe to display the image from the file


////        Image image = ImageIO.read(imageFile);
////        Graphics g = image.getGraphics();
//        FileOutputStream out = new FileOutputStream(new File("~/","a.png"));
//        InputStream in = new FileInputStream(imageFile);
//
//        byte[] buffer = new byte[1024];
//        int len;
//        while ((len = in.read(buffer)) != -1) {
//            out.write(buffer, 0, len);
//        }





    }
}

