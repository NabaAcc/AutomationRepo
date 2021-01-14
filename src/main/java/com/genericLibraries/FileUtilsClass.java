package com.genericLibraries;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

public class FileUtilsClass {

    String configPath = "src\\main\\resources\\TestData\\Config.property.txt";
    String testDataPath = "src\\main\\resources\\TestData\\TestData.property.txt";
    String path = "src\\main\\resources\\TestData\\ExcelData.xlsx";
    FileInputStream fis;

    //Method to get property data
    public Properties getPropertyData() throws IOException {
        fis = new FileInputStream(configPath);
        Properties pObj = new Properties();
        pObj.load(fis);
        return pObj;
    }

    public Properties getPropertyTestData() throws IOException {
        fis = new FileInputStream(testDataPath);
        Properties properties = new Properties();
        properties.load(fis);
        return properties;
    }

    public List<String> getExcelData(String sheetName, int rowNumber, int colNumber) throws Exception {
        fis = new FileInputStream(path);
        XSSFWorkbook wb = new XSSFWorkbook(fis);
        XSSFSheet sh = wb.getSheet(sheetName);
        XSSFRow row = sh.getRow(rowNumber);
        XSSFCell col = row.getCell(colNumber);
        List<String> data = new ArrayList<String>();
        for (int i = 0; i <=sh.getLastRowNum(); i++) {
            data.add(sh.getRow(i).getCell(0).getStringCellValue());

        }
        return data;
    }

}
