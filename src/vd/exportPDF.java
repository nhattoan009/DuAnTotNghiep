package vd;

import com.itextpdf.text.Anchor;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class exportPDF {
    public static void main(String[] args) {
        Document document = new Document(PageSize.A4, 50,50,50,50);
        try {
            //tạo đối tượng pdf
            PdfWriter.getInstance(document, new FileOutputStream("E:\\MyFile\\cc.pdf"));
            //mở kết nối ghi
            document.open();
            //thêm nội dung
            document.add(new Paragraph("Hóa đơn điện"));
            Anchor anchor = new Anchor("Tháng 1 \n");
            anchor.add("CSC: 100 \n");
            anchor.add("CSM: 120 \n");
            anchor.add("DNTT: 20 \n");
            anchor.setName("Hóa đơn cc");
            
            document.add(anchor);
            
            document.close();
            System.out.println("Xuất xong!");
        } catch (FileNotFoundException | DocumentException e) {
            e.printStackTrace();
        }
    }
    
    
}
