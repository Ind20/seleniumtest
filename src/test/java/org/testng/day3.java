package org.testng;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvException;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class day3 {
	
	@Test
	public void test2()
	{
		System.out.println("day 3 test 2");
		Assert.assertTrue(false);
		
	}
	
	@Test
	public void API()
	{
		System.out.println("day 3 test API");
		getData();
		
	}
	
	@DataProvider
	    public void getData() {
	        String csvFilePath = "C:\\Users\\Asus\\Desktop\\generated_data.csv";

	        try (CSVReader reader = new CSVReader(new FileReader(csvFilePath))) {
	            List<String[]> csvData = reader.readAll();
	            
	            for (String[] data : csvData)
	            {
	            	System.out.println(data);
	            }
	            
	        } catch (IOException | CsvException e) {
	            e.printStackTrace();
	        }
	    }

}
