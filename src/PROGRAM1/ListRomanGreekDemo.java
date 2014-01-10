package PROGRAM1;

import com.itextpdf.text.*;
import com.itextpdf.text.pdf.PdfWriter;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class ListRomanGreekDemo {
    public static void main(String[] args) {

        Document document = new Document();

        try {
            PdfWriter.getInstance(document,
                    new FileOutputStream("List2.pdf"));

            document.open();

            RomanList romanList = new RomanList();
            romanList.add(new ListItem("Item 1"));
            romanList.add(new ListItem("Item 2"));
            romanList.add(new ListItem("Item 3"));

            document.add(romanList);

            GreekList greekList = new GreekList();
            greekList.add(new ListItem("Item 1"));
            greekList.add(new ListItem("Item 2"));
            greekList.add(new ListItem("Item 3"));

            document.add(greekList);

            document.close();

        } catch (DocumentException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}
