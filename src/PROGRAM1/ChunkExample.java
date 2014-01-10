package PROGRAM1;

import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.pdf.PdfWriter;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;


//represents the smallest possible "chunk" of text.
//A Chunk can contain as little as a single character, up to several sentences.

public class ChunkExample {
        public static void main(String[] args) {

            Document document = new Document();

            try {
                PdfWriter.getInstance(document,
                        new FileOutputStream("Chunk.pdf"));

                document.open();
                document.add(new Chunk("This is sentence 1. "));
                document.add(new Chunk("This is sentence 2. "));
                document.close();

            } catch (DocumentException e) {
                e.printStackTrace();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }

        }
}
