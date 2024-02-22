package firstTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class TestExample {
    WebDriver driver;
    @Test
    public void Login(){
       driver  = new EdgeDriver();
        driver.get("https://admin-demo.nopcommerce.com/Admin/Order/List");
    }

    @Test
    public void addData(){

    }
}
