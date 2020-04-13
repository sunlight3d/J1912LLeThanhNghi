public class Main {
    public static  final void main(String[] args){
        System.out.println("haha");
        ExcelManager excelManager = new ExcelManager("c:\\temp\\inputMarks.xlsx");
        excelManager.openExcelFile();
        excelManager.processFile();
    }
}
