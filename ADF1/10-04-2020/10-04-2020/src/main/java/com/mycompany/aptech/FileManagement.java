package com.mycompany.aptech;

import com.mycompany.aptech.models.Mark;
import com.mycompany.aptech.models.Product;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import javax.swing.*;
import javax.xml.transform.sax.SAXSource;
import java.io.*;
import java.sql.SQLOutput;
import java.util.ArrayList;

public class FileManagement {
    private ArrayList<Product> products = new ArrayList<>();
    public static final String filePath = "C:\\temp\\products.csv";
    public static final String excelFilePath = "C:\\temp\\productsExcel.xlsx";
    //co object roi, thich lam gi thi lam

    public ArrayList<Product> readFromFile() {
        try
        {
            products.clear();
            File file=new File(filePath);
            BufferedReader bufferedReader=new BufferedReader(new FileReader(file));
            String line;
            while((line = bufferedReader.readLine())!=null)
            {
                System.out.println("haha");
                //se phai viet 1 ham convert tu string sang object Product
                //Ham nay dong vai tro la ham tao ra product moi tu 1 string
                //Factory Method
                //Cac ham thong dung: convert string => array => object
                Product product = Product.createObjectFromString(line);//bai toan nay hay gap khi lay du lieu tu server ve
                if(product != null) {
                    products.add(product);
                }
            }
            System.out.println("Contents of File: ");
        }
        catch(IOException e)
        {
            e.printStackTrace();
        } finally {
            return products;
        }
    }
    //Sau khi co object, cho vao file excel
    int rownum = 0;
    public void saveProductsToExcel() {
        XSSFWorkbook workbook = new XSSFWorkbook();
        XSSFSheet sheet = workbook.createSheet("Product list");
        for (Product product : this.products) { //moi san pham la 1 row, moi truong la 1 column = cell
            Row row = sheet.createRow(rownum++);
            // this line creates a cell in the next column of that row
            row.createCell(0).setCellValue(product.getProductName());
            row.createCell(1).setCellValue(String.valueOf(product.getYear()));
            row.createCell(2).setCellValue(product.getDescription());
            row.createCell(3).setCellValue(product.getPrice());
        }
        try {
            // this Writes the workbook gfgcontribute
            FileOutputStream out = new FileOutputStream(new File(excelFilePath));
            workbook.write(out);
            out.close();
            System.out.println("written successfully on disk.");
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void UpdateMarksInExcel() {
        
    }
}
