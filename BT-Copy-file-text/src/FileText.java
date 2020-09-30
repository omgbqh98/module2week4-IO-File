import sun.plugin.javascript.navig.Link;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileText {

    public static List<String> ReadFileText(String pathName) {
        List<String> list = new ArrayList<>();

            try {
                FileReader fileReader = new FileReader(pathName);
                BufferedReader bufferedReader = new BufferedReader(fileReader);

                String line = null;
                while ((line = bufferedReader.readLine()) != null) {
                    list.add(line);
                }
                bufferedReader.close();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        return list;
    }

    static void writerFile(String pathname) {
        try {
            FileWriter fileWriter = new FileWriter(pathname,true);
            fileWriter.write("dc cai gi");
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
