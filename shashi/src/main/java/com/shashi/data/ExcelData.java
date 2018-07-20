package com.shashi.data;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelData {

	public static Workbook workbook;
	public static Sheet sheet;
	public static FileInputStream fis;
	public static FileOutputStream fos;
	public ExcelData() throws EncryptedDocumentException, InvalidFormatException, IOException
	{
		fis=new FileInputStream("C:\\Users\\Shashi\\Desktop\\Data.xlsx");
		workbook=WorkbookFactory.create( fis);
		sheet=workbook.getSheet("Sheet1");
	}
	public static Object[][] getExcelData() throws EncryptedDocumentException, InvalidFormatException, IOException
			{
		
		
		int rowCount=sheet.getLastRowNum();
		int cellCount=sheet.getRow(0).getLastCellNum();
		String[][] testCase=new String[rowCount][cellCount];
		for(int i=0;i<rowCount;i++)
		{Row row=sheet.getRow(i);
			for(int j=0;j<cellCount;j++)
			{Cell cell=row.getCell(j);
				testCase[i][j]=getData(cell);
			}
		}
		
		return testCase;
		
	}
	
	public static String getData(Cell cell)
	{
		String data = null;
		switch (cell.getCellTypeEnum()) {
        case BOOLEAN:

            break;
        case STRING:
            data=cell.getRichStringCellValue().getString();
            break;
        case NUMERIC:
           
               data=cell.getDateCellValue().toString();
           
            break;
        case FORMULA:
           
            break;
        case BLANK:
            System.out.print("");
            break;
        default:
            System.out.print("");
    }

    //System.out.print("\t");
		return data;
		
	}
	
	public static String[] getTestData(String testCase,String sheetName)
	{sheet=workbook.getSheet(sheetName);
		int rowCount=sheet.getLastRowNum();
		int cellCount=sheet.getRow(0).getLastCellNum();
		String data[]=new String[cellCount];
		
		for(int i=0;i<rowCount;i++)
		{Row row=sheet.getRow(i);
		
		if(testCase.equals(row.getCell(0)))
			for(int j=0;j<cellCount;j++)
			{Cell cell=row.getCell(j);
				data[j]=getData(cell);
			}
		}
		
		return null;
		
	}
}
