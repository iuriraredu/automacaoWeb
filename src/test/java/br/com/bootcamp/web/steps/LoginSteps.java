package br.com.bootcamp.web.steps;

import br.com.bootcamp.commons.SeleniumRobot;
import br.com.bootcamp.web.funcionalidade.LoginFuncionalidade;
import cucumber.api.PendingException;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Quando;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginSteps {

    private LoginFuncionalidade loginFuncionalidade;
    private SeleniumRobot seleniumRobot;

    @FindBy(xpath = "//input[@value='Entrar']")
    private WebElement Entrar;

    public LoginSteps(){
        this.loginFuncionalidade = new LoginFuncionalidade();
        this.seleniumRobot = new SeleniumRobot();
    }

    @Dado("^preencho os dados de login com usuário \"([^\"]*)\"$")
    public void preenchoOsDadosDeLoginComUsuário(String arg0){
        // Write code here that turns the phrase above into concrete actions
        this.loginFuncionalidade.preencheCredenciais();
    }

    @Quando("^clico em \"([^\"]*)\"$")
    public void clicoEm(String texto) {
        this.seleniumRobot.clicaBotaoPorTexto(texto);
    }
}
