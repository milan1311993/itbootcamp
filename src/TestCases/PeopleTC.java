package TestCases;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.Assert;
import org.testng.annotations.Test;

import Base.DriverWaitSetup;
import Base.URLs;
import Pages.HeaderBottomLinkPages.PeoplePage;

public class PeopleTC extends DriverWaitSetup {

	File file;
	PeoplePage pp;
	List<String> listFromFile;
	FileInputStream stream;
	XSSFWorkbook wb;
	XSSFSheet sheet;

	@Test
	public void testApache() throws Exception {
		file = new File("C:\\Users\\MM\\Desktop\\ZavrsniFajl.xlsx");
		getWebDriver().navigate().to(URLs.PEOPLE_PAGE);
		pp = new PeoplePage(getWebDriver());
		pp.pageLoadedWait(getWait());

		listFromFile = new ArrayList<String>();

		stream = new FileInputStream(file);
		wb = new XSSFWorkbook(stream);
		sheet = wb.getSheetAt(0);

		for (int i = 0; i <= sheet.getLastRowNum(); i++) {
			listFromFile.add(sheet.getRow(i).getCell(0).getStringCellValue());
		}

		Assert.assertFalse(pp.getPeopleInfo().equals(listFromFile));
	}

	@Test
	public void writingInExcel() throws Exception {
		pp = new PeoplePage(getWebDriver());
		List<String> listOfAllPeople = pp.getPeopleInfo();
		int flag = 0;
		int rowCount = sheet.getLastRowNum();
		Row row;
		Cell cell;

		for (int i = 1; i < listOfAllPeople.size(); i++) {
			for (int j = 0; j < listFromFile.size(); j++) {
				if (listOfAllPeople.get(i).equals(listFromFile.get(j))) {
					flag = 1;
					break;
				}
			}
			if (flag == 0) {
				row = sheet.createRow(++rowCount);
				cell = row.createCell(0);
				cell.setCellValue(listOfAllPeople.get(i));
			} else {
				flag = 0;
			}

		}
		FileOutputStream output = new FileOutputStream(file);
		wb.write(output);
		wb.close();
	}

}
