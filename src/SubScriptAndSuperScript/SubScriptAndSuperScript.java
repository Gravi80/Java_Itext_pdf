package SubScriptAndSuperScript;

import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.pdf.PdfWriter;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class SubScriptAndSuperScript {
    public static void main(String[] args) {

        Document document = new Document();

        try {
            PdfWriter.getInstance(document,
                    new FileOutputStream("src/SubScriptAndSuperScript/SuperSubScript.pdf"));

            document.open();

            Chunk normalText =
                    new Chunk("Normal text at normal y-location. ");
            document.add(normalText);

            Chunk superScript = new Chunk("Superscript");
            superScript.setTextRise(5f);
            document.add(superScript);

            Chunk moreNormalText =
                    new Chunk(". More normal y-location text. ");
            document.add(moreNormalText);

            Chunk subScript = new Chunk("Subscript");
            subScript.setTextRise(-5f);
            document.add(subScript);

            document.close();

        } catch (DocumentException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }

}
