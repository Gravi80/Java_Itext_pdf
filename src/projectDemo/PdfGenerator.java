package projectDemo;

import com.itextpdf.text.*;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.*;
import java.lang.reflect.Field;
import java.util.Date;
import java.util.List;


public class PdfGenerator {


    private Document document;
    private OutputStream FILE;


    public PdfGenerator(String fileDestination) throws FileNotFoundException, DocumentException {
        this.document =new Document();
        this.FILE=new FileOutputStream(new File(fileDestination));
        PdfWriter.getInstance(document,FILE);
    }


    public PdfPTable addContentToTable(PdfPTable table,List<VehicleTripSummary> rows){
        for (VehicleTripSummary vehicleTripSummary : rows) {
            table.addCell(vehicleTripSummary.getVehicleType());
            table.addCell(vehicleTripSummary.getVehicleNumber());
            table.addCell(vehicleTripSummary.getTrips().toString());
            table.addCell(vehicleTripSummary.getBinCleared().toString());
            table.addCell(vehicleTripSummary.getCollectedWeight().toString());
        }
        return table;
    }

    public PdfPTable createTable(Integer columnCount,List<VehicleTripSummary> rows) throws DocumentException {
        PdfPTable table=new PdfPTable(columnCount);
        for (Field field : rows.get(0).getClass().getDeclaredFields()) {
            table.addCell(field.getName());
        }
        float[] columnWidths = {1.5f, 2f, 1f,1.5f,2f};
        table.setWidths(columnWidths);
        table.setSpacingBefore(20.0f);
        table.setSpacingAfter(10.0f);
        return addContentToTable(table,rows);
    }


    public void generatePdf(Element... elements) throws IOException, DocumentException {
        document.open();
        document.add(new Chunk("Report Generated On - " + new Date().toString()).setUnderline(0.1f, -2f));
        document.add(new Paragraph(" "));
        for (Element element : elements) {
            document.add(element);
        }
        document.close();
        FILE.close();
    }


}
