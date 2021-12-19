package vd;

import EasyXLS.Constants.DataType;
import EasyXLS.ExcelDocument;
import EasyXLS.ExcelTable;
import EasyXLS.ExcelWorksheet;

/**
 *
 * @author huynh
 */
public class exportExcel {

    public static void main(String[] args) {
        try {
            ExcelDocument workbook = new ExcelDocument(2);

            // Set the sheet names
            workbook.easy_getSheetAt(0).setSheetName("First tab");
            workbook.easy_getSheetAt(1).setSheetName("Second tab");

            // Get the table of data for the first worksheet
            ExcelTable xlsFirstTable = ((ExcelWorksheet) workbook.easy_getSheetAt(0)).easy_getExcelTable();

            // Add data in cells for report header
            for (int t = 1; t <= 12; t++) {
                xlsFirstTable.easy_getCell(0, t).setValue("Tháng " + t);
                xlsFirstTable.easy_getCell(0, t).setDataType(DataType.STRING);
            }
            xlsFirstTable.easy_getCell(1, 0).setValue("Tiền phòng");
            xlsFirstTable.easy_getCell(2, 0).setValue("Tiền điện nước");
            xlsFirstTable.easy_getCell(3, 0).setValue("Tổng tiền");

            
            workbook.easy_WriteXLSXFile("D:\\DemoExcel.xlsx");

            // Confirm export of Excel file
            if (workbook.easy_getError().equals("")) {
                System.out.println("File successfully created.");
            } else {
                System.out.println("Error encountered: " + workbook.easy_getError());
            }

            // Dispose memory
            workbook.Dispose();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
