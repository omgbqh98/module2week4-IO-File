import java.io.*;
import java.nio.file.Files;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        List<String> list= FileText.ReadFileText("test.txt");
//        for (int i = 0; i < list.size(); i++) {
//            System.out.println(list.get(i));
//        }

        InputStream inputStream ;
        OutputStream outputStream ;
        try {
//            File file = new File("test7.txt");

            inputStream = new FileInputStream(new File("test.txt"));
            outputStream = new FileOutputStream(new File("test7.txt"));
            int length;
            byte[] bytes = new byte[1024];
            while ((length = inputStream.read(bytes))>0){
                outputStream.write(bytes,0,length);
            }
//            System.out.println(.length());
            System.out.println("hoan thanh");
            inputStream.close();
            outputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
//        FileText.writerFile("test.txt");
    }
}
