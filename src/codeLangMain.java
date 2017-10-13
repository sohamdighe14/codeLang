import java.io.*;

public class codeLangMain {

    public static void main(String[] args) throws Exception {

//        PrintWriter fout = new PrintWriter("a.code");
//        fout.println("graph { \n from a to b \n from c to d \n from b to c\n from a to asd \n }");

        String filename = "a";
//        FileInputStream f = new FileInputStream("a");

        Process p = Runtime.getRuntime().exec
                ("java codeLang > " + filename + ".code > outfile");
        p.waitFor();
        System.out.println(p.exitValue());
        Process q =Runtime.getRuntime().exec(
                        "java -jar ~/Downloads/plantuml.jar outfile"
                );
        q.waitFor();
    }
}



//
//        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(p.getOutputStream()));
//        String line = f.readLine();
//        while(line != null){
//            writer.write(line);
//            line = f.readLine();
//        }
//
//        BufferedReader reader = new BufferedReader(new InputStreamReader(p.getInputStream()));
//        line = reader.read();
//        while(line != null){
//            writer.write(line);
//            line = reader.read();
//        }
//
//
//        Runtime.getRuntime().exec("java -jar plantuml.jar "+ args[1]."code");
//    }
//
//}

