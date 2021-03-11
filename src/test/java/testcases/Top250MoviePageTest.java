package testcases;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import java.io.IOException;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import com.grover.qa.base.TestBase;
import com.grover.qa.pages.Top250MoviePage;
import com.grover.qa.pages.WesternPage;
public class Top250MoviePageTest extends TestBase {

	@FindBy(name="sort")
    public WebElement sortby;
	
	@FindBy(xpath="//a[contains(text(),'Western')]")
	public WebElement western;
	

	
	Top250MoviePage   Top250MoviePage1;

	public static String finalMovie="";	
	WesternPageTest WesternPageTest;

	 public Top250MoviePageTest() throws IOException {
			
			// TODO Auto-generated constructor stub
		}

	    @BeforeClass
		 public void SetUp() { 
	          initialization();
	          PageFactory.initElements(driver, this);
	           Top250MoviePage1 =new Top250MoviePage();
		}
	    
	    

		
		
		@Test(priority = 1)
		public void MovieList() {
	    List<WebElement> listOfElements=driver.findElements(By.xpath("//table/tbody/tr"));
	    int number =listOfElements.size();
	    System.out.println("chart-top250movie number" +" "+ number);
	    for(int i=0;i<listOfElements.size();i++) {
	    	String movieNameList =listOfElements.get(i).getText();
	    }
	    String movieNameList1 =listOfElements.get(0).getText();
	    Assert.assertEquals(movieNameList1, "1. The Shawshank Redemption (1994) 9.2");
		}
		
		
		@Test(priority = 2)
		public void SelectbyIMDBRating() {
			Top250MoviePage.SelectValueFromDropDown (sortby, "IMDb Rating");
			String Movies= Top250MoviePage.Findmovie("1. The Shawshank Redemption (1994)");
	    	Assert.assertEquals(Movies, "1. The Shawshank Redemption (1994)");
		}
		
		
		@Test(priority = 3)
		public void SelectbyRanking() {
			Top250MoviePage.SelectValueFromDropDown (sortby, "Ranking");
			String Movies= Top250MoviePage.Findmovie("1. The Shawshank Redemption (1994)");
	    	Assert.assertEquals(Movies, "1. The Shawshank Redemption (1994)");
		}
		
		@Test(priority = 4)
		public void SelectbyReleaseDate() {
			Top250MoviePage.SelectValueFromDropDown (sortby, "Release Date");
			String Movies= Top250MoviePage.Findmovie("1. The Shawshank Redemption (1994)");
	    	Assert.assertEquals(Movies, "1. The Shawshank Redemption (1994)");
		}
		
		
		@Test(priority = 5)
		public void SelectbyNumberofRatings() {
			Top250MoviePage.SelectValueFromDropDown (sortby, "Number of Ratings");
			String Movies= Top250MoviePage.Findmovie("1. The Shawshank Redemption (1994)");
	    	Assert.assertEquals(Movies, "1. The Shawshank Redemption (1994)");
		}
			
		
		@Test(priority = 6)
		public void SelectbyYourRating() {
			Top250MoviePage.SelectValueFromDropDown (sortby, "Your Rating");
			String Movies= Top250MoviePage.Findmovie("1. The Shawshank Redemption (1994)");
	    	Assert.assertEquals(Movies, "1. The Shawshank Redemption (1994)");
		}
		
		@Test(priority = 7)
		public void Clickonlink()
		{
			western.click();
			WesternPageTest= new WesternPageTest();
			WesternPageTest.VerifyMovie();
		}

		
		
		



	}




