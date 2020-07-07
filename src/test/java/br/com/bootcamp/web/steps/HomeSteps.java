package br.com.bootcamp.web.steps;

import br.com.bootcamp.commons.SeleniumRobot;
import br.com.bootcamp.web.funcionalidade.HomeFuncionalidade;
import cucumber.api.PendingException;
import cucumber.api.java.pt.E;
import org.openqa.selenium.WebElement;

public class HomeSteps {

    private HomeFuncionalidade homeFuncionalidade;

    public HomeSteps(){
        this.homeFuncionalidade = new HomeFuncionalidade();
    }

    @E("^acesso perfil clicando em \"([^\"]*)\"$")
    public void acessoPerfilClicandoEm(String texto) {
        this.homeFuncionalidade.acessarPerfil();
    }
}
