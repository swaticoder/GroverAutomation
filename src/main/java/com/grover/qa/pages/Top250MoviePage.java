package com.grover.qa.pages;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import com.grover.qa.base.TestBase;



public class Top250MoviePage extends TestBase {
  
	
	
	public static String  finalMovie= "";
	
	public Top250MoviePage(){
		PageFactory.initElements(driver, this);
	}
	

	
	public static  void SelectValueFromDropDown(WebElement element, String value) {
	     Select select =new Select(element);
	     select.selectByVisibleText(value);
	        
	        }
	
	public static String Findmovie(String s) {
	List<WebElement> noOfRowInIMDBPageTable=driver.findElements(By.xpath("//table[@class='chart full-width']//tbody/tr"));
    int row =noOfRowInIMDBPageTable.size();	        
    for(int i=1;i<row;i++) {
        List<WebElement> noOfColumnInIMDBPage=driver.findElements(By.xpath("//table[@class='chart full-width']//tbody/tr["+(i)+"]/td"));
        int column =noOfColumnInIMDBPage.size();
    	for(int j=1;j<column;j++) {
    	String text= noOfColumnInIMDBPage.get(j).getText();   
    	if (text.equals("1. The Shawshank Redemption (1994)"))
    	  finalMovie="1. The Shawshank Redemption (1994)";
    	break;
    	}
    	
    }
    return finalMovie;

	}
	
	
}
