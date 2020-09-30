import java.io.*;

public class Test2 {
    // cach 2 tao file:
    public static void main(String[] args) throws IOException {

        //tao thu muc
        File file = new File("test3.txt");
        if (!file.exists()) {
            file.mkdir();
        }

//tao file trong thu muc
        File file1 = new File("test3.txt/test4");
        if (!file1.exists()) {
            file1.createNewFile();
        }

        //doc file
        FileReader fileReader = new FileReader(file1);
        int c = fileReader.read();
        while (c != -1) {
            System.out.print((char) c);
            c = fileReader.read();
        }
        fileReader.close();

        //ghi file
        // chèn bộ nhớ tạp buffere để lưu trữ:
        FileWriter fileWriter = new FileWriter(file1);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        bufferedWriter.write("hgjhg");
        bufferedWriter.flush();
        fileWriter.close();




        try {
            File file2 = new File("test6.txt");
            if (!file2.exists()) {
                file2.createNewFile();
            }
            FileReader fileReader1 = new FileReader(file2);
            int c2 = fileReader1.read();
            while (c2 != -1) {
                System.out.print((char) c2);
                c2 = fileReader1.read();
            }
            fileReader1.close();

        } catch (Exception e) {
            System.out.println("loi");
        }

//chen buffe vao de dễ đọc:
        try {
            File infile = new File("hello.txt");
            infile.createNewFile();
            FileReader fileReader1 = new FileReader(infile);
            BufferedReader bufferedReader = new BufferedReader(fileReader1);
            String line = null;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
            bufferedReader.close();

        } catch (Exception e) {
            e.printStackTrace();
        }


        //tach du lieu bang dau phay:
        String tosLip = "50,con zobie ghe qua,hehe";
        String[] result = tosLip.split(",");
        for (String st : result) {
            System.out.println(st);
        }
    }
}
