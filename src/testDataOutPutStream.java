import java.io.*;

public class testDataOutPutStream {
    public static void main(String[] args) throws IOException {
        //viết 1 mảng kiểu int nhị phân vào file:
        int arr[] = {5, 5, 7, 8, 2, 6};
        try {
            FileOutputStream fileOutputStream = new FileOutputStream("test.txt");
            DataOutputStream dataOutputStream = new DataOutputStream(fileOutputStream);
            for (int i = 0; i < arr.length; i++) {
                dataOutputStream.writeInt(arr[i]);
            }
            dataOutputStream.close();
        } catch (IOException e) {
            System.out.println("loi");
        }

        // đọc dữ liệu kiểu int:

        try {
            FileInputStream fileInputStream = new FileInputStream("test.txt");
            DataInputStream dataInputStream = new DataInputStream(fileInputStream);

            for (int i = 0; i < arr.length; i++) {
                System.out.println(dataInputStream.readInt());
            }
//            while (true) {
//                System.out.println(dataInputStream.readInt());
//            }
        } catch (EOFException e) {
            System.out.println("loi tran bo de");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
