import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class HomeWork {

    WebDriver wd;

    @BeforeClass
    public void setUp() {
        wd = new ChromeDriver();
        wd.get("https://telranedu.web.app/login");
    }


    @Test
    public void locators() {
        //by tagName
        WebElement body = wd.findElement(By.tagName("body"));
        WebElement body1 = wd.findElement(By.cssSelector("body"));

        WebElement div = wd.findElement(By.tagName("div"));
        WebElement div1 = wd.findElement(By.cssSelector("div"));

        WebElement h1 = wd.findElement(By.tagName("h1"));
        WebElement h1_1 = wd.findElement(By.cssSelector("h1"));

        WebElement a = wd.findElement(By.tagName("a"));
        WebElement a1 = wd.findElement(By.cssSelector("a"));

        WebElement form = wd.findElement(By.tagName("form"));
        WebElement form1 = wd.findElement(By.cssSelector("form"));

        WebElement input = wd.findElement(By.tagName("input"));
        WebElement input1 = wd.findElement(By.cssSelector("input"));

        WebElement button = wd.findElement(By.tagName("button"));
        WebElement button1 = wd.findElement(By.cssSelector("button"));

        //by class
        WebElement el = wd.findElement(By.className("container"));
        WebElement el1 = wd.findElement(By.cssSelector(".container"));

        WebElement el2 = wd.findElement(By.className("navbar-component_nav__1X_4m"));
        WebElement el3 = wd.findElement(By.cssSelector(".navbar-component_nav__1X_4m"));

        WebElement el4 = wd.findElement(By.className("login_login__3EHKB"));
        WebElement el5 = wd.findElement(By.cssSelector(".login_login__3EHKB"));


        //by id
        WebElement el6 = wd.findElement(By.id("root"));
        WebElement el7 = wd.findElement(By.cssSelector("#root"));

        //by attribute
        WebElement el8 = wd.findElement(By.cssSelector("[href='/home']"));
        WebElement el9 = wd.findElement(By.cssSelector("[href = '/about']"));

        WebElement name = wd.findElement(By.name("email"));
        WebElement name1 = wd.findElement(By.cssSelector("[name='email']"));

        //one of elements find by attribute ==> start & end & contains value
        WebElement el10 = wd.findElement(By.cssSelector("[placeholder='Email']"));
        //start
        WebElement el11 = wd.findElement(By.cssSelector("[placeholder^='Em']"));
        //end
        WebElement el12 = wd.findElement(By.cssSelector("[placeholder $='il']"));
        //contains
        WebElement el13 = wd.findElement(By.cssSelector("[placeholder *='ma']"));


    }

}
