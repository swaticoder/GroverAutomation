package testcases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.grover.qa.base.TestBase;
import com.grover.qa.pages.Top250MoviePage;




public class WesternPageTest extends TestBase {
	

	@FindBy(name="sort")
    public WebElement sortby;
	

	
	
    @Test (priority = 8)
    public void VerifyMovie() {
        List<WebElement> e=driver.findElements(By.xpath("//*[@class='sorting']//a"));
      int size=e.size() ;
       System.out.println(size);
       String abcd[] =new String [size];
       int j =0;
      
       for (WebElement ka: e)
       {
       	 abcd[j]=ka.getText();
       	 
       	System.out.println(abcd[j]);
       	j++;
       	
       }

       for (String l: abcd)
   	{
   		driver.findElement(By.linkText(l)).click();
           List<WebElement> e1=driver.findElements(By.xpath("//*[@class='lister-item-content']//*[@class='lister-item-header']"));
           int size1=e1.size() ;
            System.out.println(size1);
            Assert.assertEquals(size1, 50);
   	}
    }
    }
     
     
   
    
    
 //   @AfterClass
//	 public void TearDown() { 
  //   driver.quit();
          
	//}
 

    
