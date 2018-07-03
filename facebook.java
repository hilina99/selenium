import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Facebook {
  
    public static void main(String [] args){
        WebDriver driver = new ChromeDriver(); 
        driver.get("http://www.facebook.com/"); //go to facebook.com
        WebElement username = driver.findElement(By.id("email"));
        WebElement password = driver.findElement(By.id("pass"));
        WebElement login = driver.findElement(By.id("loginbutton"));
        username.sendKeys( "email");
        password.sendKeys("password");
        login.click();
        driver.get("http://www.facebook.com/");
        WebElement notification = driver.findElement(By.id("notificationsCountValue"));
        System.out.println("You have"+ notification.getText()+" notifications");
        driver.close();

    }
}
