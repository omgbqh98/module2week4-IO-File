import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test {
    public static void main(String[] args) throws IOException {
        File file = new File("test.txt");

        if (!file.exists()) {
            file.createNewFile();
        }

//        doc du lieu tu file:
        FileInputStream fileInputStream = new FileInputStream(file);
        int c = System.in.read();
        while (c != -1) {
            System.out.print((char) c);
            //doc het chu
            c=fileInputStream.read();
        }
        fileInputStream.close();

        // ghi du lieu vao file
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        String s = " helllllo";
        fileOutputStream.write(s.getBytes());
        fileOutputStream.close();

    }


}
