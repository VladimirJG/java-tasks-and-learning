package java_rush_java_core.lesson_adapter;

import java.io.FileOutputStream;
import java.io.IOException;

public class task2 implements AmigoStringWriter {
    private FileOutputStream fileOutputStream;

    public task2(FileOutputStream fileOutputStream) {
        this.fileOutputStream = fileOutputStream;
    }
    public void flush(){

    }
}

interface AmigoStringWriter {
}