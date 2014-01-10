package PROGRAM1;

import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfWriter;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

//The Phrase class knows how to add spacing between lines.
public class PhraseExample {



//    public static void main(String[] args) {
//
//        Document document = new Document();
//
//        try {
//            PdfWriter.getInstance(document,
//                    new FileOutputStream("Phrase.pdf"));
//
//            document.open();
//            document.add(new Phrase("This is sentence 1. "));
//            document.add(new Phrase("This is sentence 2. "));
//            document.add(new Phrase("This is sentence 3. "));
//            document.add(new Phrase("This is sentence 4. "));
//            document.add(new Phrase("This is sentence 5. "));
//            document.add(new Phrase("This is sentence 6. "));
//            document.close();
//
//        } catch (DocumentException e) {
//            e.printStackTrace();
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        }
//
//    }



  //Line Spacing
    //Phrase objects knows how to add line spacing if the added phrase exceeds the right edge of the document. It does not, however, add extra space between paragraphs. For this, you need to use a Paragraph object.
  //Line spacing is measured in user units.
  // There are 72 units per inch.
  // The default spacing is 1.5 times the font height.
  // You can change the line spacing by passing spacing as a parameter to the Phrase constructor, like this:

    public static void main(String[] args) {

        Document document = new Document();

        try {
            PdfWriter.getInstance(document,
                    new FileOutputStream("Phrase2.pdf"));

            document.open();
            Chunk chunk = new Chunk("This is a sentence ");

            Phrase phrase = new Phrase(50);

            phrase.add(chunk);
            phrase.add(chunk);
            phrase.add(chunk);
            phrase.add(chunk);
            phrase.add(chunk);
            phrase.add(chunk);

            document.add(phrase);
            document.close();

        } catch (DocumentException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }



}
