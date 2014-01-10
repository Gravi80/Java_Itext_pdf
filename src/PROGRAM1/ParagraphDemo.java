package PROGRAM1;

import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

//represents a "paragraph" of text.
// In a paragraph you can set the paragraph alignment, indentation and spacing before and after the paragraph.
public class ParagraphDemo {

    public static void main(String[] args) {

        Document document = new Document();

        try {
            PdfWriter.getInstance(document,
                    new FileOutputStream("Paragraph.pdf"));

            document.open();
            Paragraph paragraph = new Paragraph();

            for(int i=0; i<10; i++){
                Chunk chunk = new Chunk(
                        "This is a sentence which is long " + i + ". ");
                paragraph.add(chunk);
            }

            document.add(paragraph);
            document.close();

        } catch (DocumentException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}
