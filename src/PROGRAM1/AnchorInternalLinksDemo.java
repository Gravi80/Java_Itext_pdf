package PROGRAM1;

import com.itextpdf.text.Anchor;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

//You can create internal links in your documents too, just like internal links in an HTML page.
// Just like in HTML, you need both a link and a target anchor (an anchor with a name).
public class AnchorInternalLinksDemo {
    public static void main(String[] args) {

        Document document = new Document();

        try {
            PdfWriter.getInstance(document,
                    new FileOutputStream("Anchor2.pdf"));

            document.open();


            Anchor anchor =
                    new Anchor("Jump down to next paragraph");
            anchor.setReference("#linkTarget");
            Paragraph paragraph = new Paragraph();
            paragraph.add(anchor);
            document.add(paragraph);

            Anchor anchorTarget =
                    new Anchor("This is the target of the link above");
            anchor.setName("linkTarget");
            Paragraph targetParagraph = new Paragraph();
            targetParagraph.setSpacingBefore(50);

            targetParagraph.add(anchorTarget);
            document.add(targetParagraph);


            document.close();
        } catch (DocumentException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }

}
//Notice how the mouse pointer is again shaped as a hand.
// Since the target of the link is located just below on the same page,
// the Adobe Reader would probably not react when the link is clicked.
// But, if the target paragraph was located on a different page, the Adobe Reader would jump to that page.
