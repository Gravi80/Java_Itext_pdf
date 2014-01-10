package PROGRAM1;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class HelloWorldExample {

    public static void main(String[] args) {

        //First a Document instance is created.
        // This Document instance represents the PDF document.
        // To add content to the PDF document, you call methods on the Document instance.
        Document document = new Document();


        try {

            //a PDFWriter is created,
            // passing the Document instance and an OutputStream to its constructor.
            // The Document instance is the document we are currently adding content to.
            // The OutputStream is where the generated PDF document is written to.
            // In this example the PDF document is written to a file, using a FileOutputStream.

            PdfWriter.getInstance(document,
                    new FileOutputStream("HelloWorld.pdf"));

            //Third, the document is opened by calling document.open().
            // Now you can add content to the Document instance.
            document.open();

            //Fourth, content (a Paragraph instance) is added to the Document instance.
            document.add(new Paragraph("A Hello World PDF document."));
            //the Document instance is closed, by calling document.close().
            // It is important to close the document, to flush all content in the document to the PDFWriter.
            document.close(); // no need to close PDFwriter?

        } catch (DocumentException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}
