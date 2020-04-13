import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.*;
import java.util.Iterator;

public class ExcelManager {
    private String filePath;
    private XSSFWorkbook workbook;
    public ExcelManager(String filePath) {
        this.filePath = filePath;
    }
    public void openExcelFile() {
        try {
            File file = new File(this.filePath);
            FileInputStream fileInputStream = new FileInputStream(file);
            this.workbook = new XSSFWorkbook(fileInputStream);
            // Ensure if file exist or not
            if (file.isFile() && file.exists()) {
                System.out.println(this.filePath+"is open");
            }
            else {
                System.out.println(this.filePath+" not exist"
                        + " or can't open");
            }
        }catch (Exception e) {
            System.err.println("Cannot open file. Error : "+e.toString());
        }
    }
    public void processFile()  {
        try {
            Sheet sheet1 = workbook.getSheetAt(0);
            Iterator<Row> iterator = sheet1.iterator();
            int rowIndex = 0;
            while (iterator.hasNext()) {
                Row currentRow = iterator.next();
                if(rowIndex == 0){
                    rowIndex++;
                    continue;
                }
                Cell cell = currentRow.getCell(0);
                System.out.println("haha");

                double javaMark = currentRow.getCell(1).getNumericCellValue();
                double cMark = currentRow.getCell(2).getNumericCellValue();
                double htmlMark = currentRow.getCell(3).getNumericCellValue();
                double total = javaMark + cMark + htmlMark;
                Cell cellTotalMark = currentRow.getCell(4) == null ? currentRow.createCell(4): currentRow.getCell(4);
                cellTotalMark.setCellValue(total);
                rowIndex++;
            }
            FileOutputStream outputStream = new FileOutputStream(this.filePath);
            workbook.write(outputStream);
            workbook.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    /*
    Regex = Regular Expression = Bieu thuc chinh quy
    -Tim kiem du lieu.VD: tim tat cac email ben trong 1 file text
    -Validate: kiem tra 1 string bat ky co phai dinh dang email hay ko.
    VD: [a-zA-Z0-9]+@[a-zA-Z0-9]{3, 5}\.[a-zA-Z]{2,3}
    -lay du lieu tu 1 dinh dang(format) xac dinh nao do:
    ban co 1 file text, co 10.000 dong, thinh thoang co nhuwng doan:
    x = 3.212 y = 2.556 => regex doc ra duoc gia tri 3.212 va 2.556
    * */
}
