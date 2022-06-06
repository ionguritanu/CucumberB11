package poi;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Before;
import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ReadLargeData {
    Workbook workbook;

    @Before
    public void setup() throws IOException {
        File excelFile = new File("src/test/resources/LargeTestData.xlsx");
        FileInputStream fileInputStream = new FileInputStream(excelFile);
        workbook = new XSSFWorkbook(fileInputStream);
    }


    @Test
    public void printStateTest() {

        Sheet sheet = workbook.getSheetAt(0);
        Row tempRow = sheet.getRow(0);
        int index = 0;
        for (int i = tempRow.getFirstCellNum(); i < tempRow.getLastCellNum(); i++) {
            Cell cell1 = tempRow.getCell(i);
            if (cell1.toString().equalsIgnoreCase("State")) {
                index = i;
                break;
            }
        }

        for (int i = sheet.getFirstRowNum(); i<=sheet.getLastRowNum();i++){
            Row tempRow2 = sheet.getRow(i);
            System.out.println(tempRow2.getCell(index));
        }
    }
}
//Read about big O notation
//        for(int i = sheet.getFirstRowNum(); i<=sheet.getLastRowNum();i++){
//            Row tempRow = sheet.getRow(i);
//            for (int j = tempRow.getFirstCellNum();j< tempRow.getLastCellNum();j++){
//                Cell tempCell = tempRow.getCell(j);
//                if(tempCell.toString().equalsIgnoreCase("state")){
//                    System.out.println(tempCell);
//                }
//            }
//        }



