package application.util;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Db {
	
	final String DIR = "C:\\Users\\user\\Documents\\ReadQuiz\\file";
	final String DBFILE = "\\NepLeagueQuiz.xlsx";
	
	XSSFWorkbook wkbk;
	XSSFSheet sheet;
	XSSFRow row;
	XSSFCell cell;
	
	//answersTitleRow
	public String getATRNum() {
		try {
			
			wkbk = new XSSFWorkbook(new FileInputStream(this.DIR + this.DBFILE));
			sheet = wkbk.getSheet("leadQuiz");
			row = sheet.getRow(0);
			cell = row.getCell(0);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return cell.toString();
	}
	
	public String getATRQuestion() {
		try {
			
			wkbk = new XSSFWorkbook(new FileInputStream(this.DIR + this.DBFILE));
			sheet = wkbk.getSheet("leadQuiz");
			row = sheet.getRow(0);
			cell = row.getCell(1);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return cell.toString();
	}
	
	public String getATRAnswer() {
		try {
			
			wkbk = new XSSFWorkbook(new FileInputStream(this.DIR + this.DBFILE));
			sheet = wkbk.getSheet("leadQuiz");
			row = sheet.getRow(0);
			cell = row.getCell(2);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return cell.toString();
	}
	
	public String getA1Question() {
		try {
			
			wkbk = new XSSFWorkbook(new FileInputStream(this.DIR + this.DBFILE));
			sheet = wkbk.getSheet("leadQuiz");
			row = sheet.getRow(1);
			cell = row.getCell(1);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return cell.toString();
	}
	
	public String getA1answer() {
		try {
			
			wkbk = new XSSFWorkbook(new FileInputStream(this.DIR + this.DBFILE));
			sheet = wkbk.getSheet("leadQuiz");
			row = sheet.getRow(1);
			cell = row.getCell(2);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return cell.toString();
	}
	
	public String getA2Question() {
		try {
			
			wkbk = new XSSFWorkbook(new FileInputStream(this.DIR + this.DBFILE));
			sheet = wkbk.getSheet("leadQuiz");
			row = sheet.getRow(2);
			cell = row.getCell(1);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return cell.toString();
	}
	
	public String getA2answer() {
		try {
			
			wkbk = new XSSFWorkbook(new FileInputStream(this.DIR + this.DBFILE));
			sheet = wkbk.getSheet("leadQuiz");
			row = sheet.getRow(2);
			cell = row.getCell(2);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return cell.toString();
	}
	
	public String getA3Question() {
		try {
			
			wkbk = new XSSFWorkbook(new FileInputStream(this.DIR + this.DBFILE));
			sheet = wkbk.getSheet("leadQuiz");
			row = sheet.getRow(3);
			cell = row.getCell(1);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return cell.toString();
	}
	
	public String getA3answer() {
		try {
			
			wkbk = new XSSFWorkbook(new FileInputStream(this.DIR + this.DBFILE));
			sheet = wkbk.getSheet("leadQuiz");
			row = sheet.getRow(3);
			cell = row.getCell(2);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return cell.toString();
	}
	
	public String getA4Question() {
		try {
			
			wkbk = new XSSFWorkbook(new FileInputStream(this.DIR + this.DBFILE));
			sheet = wkbk.getSheet("leadQuiz");
			row = sheet.getRow(4);
			cell = row.getCell(1);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return cell.toString();
	}
	
	public String getA4answer() {
		try {
			
			wkbk = new XSSFWorkbook(new FileInputStream(this.DIR + this.DBFILE));
			sheet = wkbk.getSheet("leadQuiz");
			row = sheet.getRow(4);
			cell = row.getCell(2);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return cell.toString();
	}
	
	public String getA5Question() {
		try {
			
			wkbk = new XSSFWorkbook(new FileInputStream(this.DIR + this.DBFILE));
			sheet = wkbk.getSheet("leadQuiz");
			row = sheet.getRow(5);
			cell = row.getCell(1);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return cell.toString();
	}
	
	public String getA5answer() {
		try {
			
			wkbk = new XSSFWorkbook(new FileInputStream(this.DIR + this.DBFILE));
			sheet = wkbk.getSheet("leadQuiz");
			row = sheet.getRow(5);
			cell = row.getCell(2);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return cell.toString();
	}
	
}
