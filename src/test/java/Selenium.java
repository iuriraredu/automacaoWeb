import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Random;

public class Selenium {

    // Criar instancia do driver do chrome
    private WebDriver driver;

    @BeforeAll
    public void setup() {
        // Setar as propriedades  do ChromeDrive
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");

        driver = new ChromeDriver();

        // Abrir Browser e acessar URL
        driver.get("https://automacaocombatista.herokuapp.com/");


        driver.findElement(By.xpath("//a[text()='Começar Automação Web']")).click();

        // Maximinizando o Browser
        driver.manage().window().maximize();
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
        driver.findElement(By.id("user_age")).sendKeys("27");

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
        driver.findElement(By.xpath("//a[text()='Radio e Checkbox']")).click();



        driver.findElement(By.xpath("//input[@id='red']")).click();
        driver.findElement(By.xpath("//input[@id='blue']")).click();
        driver.findElement(By.xpath("//input[@id='yellow']")).click();
        driver.findElement(By.xpath("//input[@id='green']")).click();
        driver.findElement(By.xpath("//input[@id='purple']")).click();
        driver.findElement(By.xpath("//input[@id='grey']")).click();
        driver.findElement(By.xpath("//input[@id='black']")).click();
        driver.findElement(By.xpath("//input[@id='white']")).click();

    }

    @AfterAll
    public void fecharBrowser(){
        // Fechando o navegador
        driver.quit();
    }
}