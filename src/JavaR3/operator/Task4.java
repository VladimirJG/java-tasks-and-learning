package JavaR3.operator;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Enumeration;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

//Отрефакторите метод writeZipEntriesToFile в соответствии с java7 try-with-resources.
//
//Требования:
//•	Метод writeZipEntriesToFile должен быть объявлен с модификатором доступа public.
//•	Метод writeZipEntriesToFile должен быть статическим.
//•	Тип возвращаемого значения метода writeZipEntriesToFile должен быть void.
//•	Метод writeZipEntriesToFile должен корректно использовать try-with-resources.
public class Task4 {
    public static void writeZipEntriesToFile(String zipFileName, String outputFileName) {
        Charset charset = StandardCharsets.UTF_8;
        Path outputFilePath = Paths.get(outputFileName);

        BufferedWriter writer = null;
        ZipFile zip = null;
        try {
            zip = new ZipFile(zipFileName);
            writer = Files.newBufferedWriter(outputFilePath, charset);
            String newLine = System.getProperty("line.separator");
            for (Enumeration entries = zip.entries(); entries.hasMoreElements(); ) {
                // Берем имя файла из архива и записываем его в результирующий файл
                // Get the entry name and write it to the output file
                String zipEntryName = ((ZipEntry) entries.nextElement()).getName() + newLine;
                writer.write(zipEntryName, 0, zipEntryName.length());
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (writer != null) {
                try {
                    writer.close();
                } catch (IOException e1) {
                    e1.printStackTrace();
                }
            }
            if (zip != null) {
                try {
                    zip.close();
                } catch (IOException e1) {
                    e1.printStackTrace();
                }
            }
        }
    }

    public static void main(String[] args) {

    }
}
