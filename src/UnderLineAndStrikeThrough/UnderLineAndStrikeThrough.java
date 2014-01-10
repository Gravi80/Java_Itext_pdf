package UnderLineAndStrikeThrough;

//You can add underline and strikethrough text using the Chunk class, and its setUnderline() method.
// You use a negative underline value to get the line lower below the text, and a positive underline value to get
// the line to strike through the text.

import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class UnderLineAndStrikeThrough {
    public static void main(String[] args) {

        Document document = new Document();

        try {
            PdfWriter.getInstance(document,
                    new FileOutputStream("src/UnderLineAndStrikeThrough/UnderlineStrikethrough.pdf"));

            document.open();

            Chunk underline = new Chunk("Underline. ");
            underline.setUnderline(0.1f, -2f); //0.1 thick, -2 y-location
            document.add(underline);

            document.add(new Paragraph("   "));

            Chunk strikethrough = new Chunk("Strikethrough.");
            strikethrough.setUnderline(0.1f, 3f); //0.1 thick, 2 y-location
            document.add(strikethrough);

            document.close();

        } catch (DocumentException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}
