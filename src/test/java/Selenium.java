import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.Random;

public class Selenium {

    // Criar instancia do driver do chrome
    private static WebDriver driver;
    private WebDriverWait wait = new WebDriverWait(driver,100);


    @BeforeAll
    public static void setup() {
        // Setar as propriedades  do ChromeDrive
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");

        driver = new ChromeDriver();
        // Abrir Browser e acessar URL
        driver.get("https://automacaocombatista.herokuapp.com");

        // Maximinizando o Browser
        driver.manage().window().maximize();


        driver.findElement(By.xpath("//a[text()='Começar Automação Web']")).click();
    }

    @Test
    public void criarUsuario(){
        Random random = new Random();
        String email = "iuri"+random.nextInt(1000)+"@gmail.com";

        driver.findElement(By.xpath("//a[text()='Formulário']")).click();
        driver.findElement(By.xpath("//a[text()='Criar Usuários']")).click();

        // Identificando um elemento e preenchendo o campo com um texto
        driver.findElement(By.id("user_name")).sendKeys("Iuri");
        driver.findElement(By.id("user_lastname")).sendKeys("Reducino");
        driver.findElement(By.id("user_email")).sendKeys(email);
        driver.findElement(By.id("user_address")).sendKeys("Rua Manuel Fagundes de Souza");
        driver.findElement(By.id("user_university")).sendKeys("FATEC Franco da Rocha");
        driver.findElement(By.id("user_profile")).sendKeys("Agente de Atendimento");
        driver.findElement(By.id("user_gender")).sendKeys("Masculino");
        driver.findElement(By.id("user_age")).sendKeys(String.valueOf(random.nextInt(30)));

        // Clicando no Botão
        driver.findElement(By.name("commit")).click();

        // Atribuindo o texto de mensagem da tela para variavel
        String mensagem = driver.findElement(By.xpath("//p[@id='notice']")).getText();

        // Validando se a mensagem que eu necessito está sendo exibida na tela
        Assertions.assertEquals("Usuário Criado com sucesso", mensagem);


    }

    @Test
    public void radioCheckBox(){
        driver.findElement(By.xpath("//a[text()='Busca de elementos']")).click();
        WebElement link = driver.findElement(By.xpath("//a[text()='Radio e Checkbox']"));
        wait.until(ExpectedConditions.visibilityOf(link));
        link.click();

        driver.findElement(By.xpath("//input[@id='red']/following-sibling:: label")).click();
        driver.findElement(By.xpath("//input[@id='blue']/following-sibling:: label")).click();
        driver.findElement(By.xpath("//input[@id='yellow']/following-sibling:: label")).click();
        driver.findElement(By.xpath("//input[@id='green']/following-sibling:: label")).click();
        driver.findElement(By.xpath("//input[@id='purple']/following-sibling:: label")).click();
        driver.findElement(By.xpath("//input[@id='grey']/following-sibling:: label")).click();
        driver.findElement(By.xpath("//input[@id='black']/following-sibling:: label")).click();
        driver.findElement(By.xpath("//input[@id='white']/following-sibling:: label")).click();
    }

    @AfterAll
    public static void fecharBrowser(){
        // Fechando o navegador
        driver.quit();
    }
}