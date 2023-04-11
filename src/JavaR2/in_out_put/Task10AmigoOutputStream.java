package JavaR2.in_out_put;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
Task10AmigoOutputStream
*/

public class Task10AmigoOutputStream extends FileOutputStream {
    public static String fileName = "C:\\Users\\ASUS\\Practice\\java-tasks-and-learning\\src\\In";

    FileOutputStream fileOutputStream;

    public Task10AmigoOutputStream(FileOutputStream fileOutputStream) throws FileNotFoundException {
        super(fileName);
        this.fileOutputStream = fileOutputStream;
    }

    public static void main(String[] args) throws FileNotFoundException {
        new Task10AmigoOutputStream(new FileOutputStream(fileName));
    }

    @Override
    public void write(int b) throws IOException {
        fileOutputStream.write(b);
    }

    @Override
    public void write(byte[] b) throws IOException {
        fileOutputStream.write(b);
    }

    @Override
    public void write(byte[] b, int off, int len) throws IOException {
        fileOutputStream.write(b, off, len);
    }

    @Override
    public void flush() throws IOException {
        fileOutputStream.flush();
    }

    @Override
    public void close() throws IOException {
        flush();
        write("JavaRush © All rights reserved.".getBytes());
        fileOutputStream.close();
    }
}