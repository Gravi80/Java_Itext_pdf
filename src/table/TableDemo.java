package table;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class TableDemo {
    public static void main(String[] args) throws FileNotFoundException, DocumentException {
        Document document = new Document();

            PdfWriter.getInstance(document,
                    new FileOutputStream("src/table/HelloWorld-Table.pdf"));

            document.open();

        //When instantiating a PdfTable you must tell how many columns the table should have.
        // You pass the number of columns as a parameter to the PdfPTable constructor.
            PdfPTable table = new PdfPTable(3); // 3 columns.

            PdfPCell cell1 = new PdfPCell(new Paragraph("Cell 1"));
            PdfPCell cell2 = new PdfPCell(new Paragraph("Cell 2"));
            PdfPCell cell3 = new PdfPCell(new Paragraph("Cell 3"));

        //To add cells to the table you call the addCell() method,
        // passing PdfPCell instances, or other IText objects like Paragraph etc.
        // Keep in mind though, that there is a difference in behaviour depending on what object you add
        //see "Cell Text Mode and Composite Mode"
        table.addCell(cell1);
        table.addCell(cell2);
        table.addCell(cell3);
        document.add(table);
        document.close();

    }
}
