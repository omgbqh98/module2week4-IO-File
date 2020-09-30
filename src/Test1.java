import java.io.File;
import java.io.IOException;

public class Test1 {
    File f = new File("foo.txt");
    File dir = new File("books");

    public static void main(String[] args) throws IOException {
        System.err.println("kk");

        int i = System.in.read(); //tra ve ASCII cua ky tu dau tien

        System.out.println((char) i);
// in ra ky tu lay dc ra man hinh
    }
}
