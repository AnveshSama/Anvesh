 package utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelBase {

	
	public static File f;
	
	public static FileInputStream fis;
	
	public static XSSFWorkbook workbook;
	
	public static XSSFSheet sheet;
	
	public static XSSFRow row;
	
	public static XSSFCell cell;
	
	
	public static int getTotalRows(String filePath,String SheetName) throws Exception
	{
	 f=new File(filePath);
		
		 fis=new FileInputStream(f)	;	
		
		XSSFWorkbook workbook=new XSSFWorkbook(fis);
				
		XSSFSheet sheet=workbook.getSheet(SheetName);
		
		
		int totalRows=sheet.getLastRowNum();
		
		return totalRows;
		
		
	}
	
	public static int getTotalCells(String filePath,String SheetName) throws Exception
	{
	 f=new File(filePath);
		
		 fis=new FileInputStream(f)	;	
		
		XSSFWorkbook workbook=new XSSFWorkbook(fis);
				
		XSSFSheet sheet=workbook.getSheet(SheetName);
		
		
		int totalCols=sheet.getRow(1).getLastCellNum();
		
		return totalCols;
		
		
	}
	
	
	public static String getCellData(String filePath,String SheetName,int rowNo,int colNo) throws Exception
	{
		f=new File(filePath);
		
		 fis=new FileInputStream(f)	;	
		
		XSSFWorkbook workbook=new XSSFWorkbook(fis);
				
		XSSFSheet sheet=workbook.getSheet(SheetName);
		
		row=sheet.getRow(rowNo);
		cell=row.getCell(colNo);
		String data=null;
		if(cell.getCellType()==cell.CELL_TYPE_STRING)
		{
			data=cell.getStringCellValue();
		}
		else if(cell.getCellType()==cell.CELL_TYPE_NUMERIC)
		{
			int data1=(int) cell.getNumericCellValue();
			
			data=String.valueOf(data1);
		}
		return data;
		
		
		
	}
	
	public static Object[][] getData(String FileName,String Sheetname) throws Exception
	
	{
		
	//	System.out.println("In getData ");
		
		f=new File(FileName);
		
		fis=new FileInputStream(f)	;	
		
		XSSFWorkbook workbook=new XSSFWorkbook(fis);
				
		XSSFSheet sheet=workbook.getSheet(Sheetname);
		
		int totalRows=sheet.getLastRowNum();
		int totalCols=sheet.getRow(1).getLastCellNum();
	//	System.out.println(totalRows);
	//	System.out.println(totalCols);
		
		
		
		Object[][] data=new Object[totalRows][totalCols];
		
		
		System.out.println(data.length);
		for(int rowNumber=1;rowNumber<=totalRows;rowNumber++)
		{
			
		//	System.out.println("In RowNumber:"+rowNumber);
			
			for(int columnNo=0;columnNo<totalCols;columnNo++)
			{
				
		//		System.out.println("In columnNo:"+columnNo);
				
				data[rowNumber-1][columnNo]=ExcelBase.getCellData(FileName, Sheetname, rowNumber, columnNo);
			}
		}
		
		
	
		
		
		return data;
		
	}
	
	
	
	
	
}
