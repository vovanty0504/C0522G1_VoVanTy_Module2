package ss16_binary_file_serialization.execise1.copy_file.modle;

import java.io.*;

public class CopyFileBinary {


    public static void copyFileBinary(File source, File dest) throws IOException {
        InputStream inputStream = null;
        OutputStream outputStream = null;
        int count = 0;
        try {
            inputStream = new FileInputStream(source);
            outputStream = new FileOutputStream(dest);
            byte[] buffer = new byte[1024];
            int length;
            while ((length = inputStream.read(buffer)) > 0) {
                outputStream.write(buffer, 0, length);
                count += length;
            }
            System.out.println("số byte có trong tệp " + count);
        } finally {
            inputStream.close();
            outputStream.close();
        }
    }

}

