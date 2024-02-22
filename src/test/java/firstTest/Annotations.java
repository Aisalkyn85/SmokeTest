package firstTest;

import org.testng.annotations.*;

public class Annotations {
    @Test
    public void Login(){
        System.out.println("login to website");
    }
    @Test
    public void HomePage(){
        System.out.println("Inspect homepage");
    }
    @BeforeMethod
    public void signIn(){
        System.out.println("Run before method");
    }
    @AfterMethod
    public void signOut(){
        System.out.println("Run after method");
    }
    @BeforeClass
    public void Init(){
        System.out.println("This is BeforeClass");
    }
    @AfterClass
    public void Close(){
        System.out.println("Close method");
    }

}
