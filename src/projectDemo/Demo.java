package projectDemo;

import com.itextpdf.text.DocumentException;
import com.itextpdf.text.pdf.PdfPTable;

import java.io.IOException;
import java.util.ArrayList;

public class Demo {

    public static void main(String[] args) throws IOException, DocumentException {
        ArrayList<VehicleTripSummary> vehicleTripSummaries = new ArrayList<VehicleTripSummary>();
        vehicleTripSummaries.add(new VehicleTripSummary("Compactor","DL 1212",3,10,120.0));
        vehicleTripSummaries.add(new VehicleTripSummary("Dumper","DL 1213",4,20,110.0));

        PdfGenerator pdfGenerator = new PdfGenerator("src/projectDemo/genPdf.pdf");

        PdfPTable table = pdfGenerator.createTable(5,vehicleTripSummaries);
        pdfGenerator.generatePdf(table);
    }
}
