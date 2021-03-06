// Generated by Selenium IDE
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.HashMap;
import java.util.Map;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Ed08CT03CadastrarLivroComErroISBN3DigitosTest {
  private WebDriver driver;
  private Map<String, Object> vars;
  JavascriptExecutor js;
  @BeforeAll
  public void setUp() {
    driver = new  ChromeDriver();
    js = (JavascriptExecutor) driver;
    vars = new HashMap<String, Object>();
  }
  @AfterAll
  public void tearDown() {
    driver.quit();
  }
  @Test
  public void ed08CT03CadastrarLivroComErroISBN3Digitos() {
    driver.get("http://ts-scel-web.herokuapp.com/");
    driver.manage().window().setSize(new Dimension(1295, 695));
    driver.findElement(By.linkText("Livros")).click();
    driver.findElement(By.id("isbn")).click();
    driver.findElement(By.id("isbn")).sendKeys("123");
    driver.findElement(By.id("autor")).click();
    driver.findElement(By.id("autor")).sendKeys("teste");
    driver.findElement(By.id("titulo")).click();
    driver.findElement(By.id("titulo")).sendKeys("teste");
    driver.findElement(By.cssSelector(".row:nth-child(4)")).click();
    driver.findElement(By.cssSelector(".btn:nth-child(1)")).click();
    driver.findElement(By.cssSelector(".col-md-4")).click();
    assertEquals(driver.findElement(By.cssSelector(".text-danger:nth-child(3)")).getText(), ("ISBN deve ter 4 caracteres"));
  }
}
