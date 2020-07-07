package br.com.bootcamp.web.funcionalidade;

import br.com.bootcamp.commons.SeleniumRobot;
import br.com.bootcamp.settings.BaseTest;
import br.com.bootcamp.web.pages.PerfilPage;
import org.openqa.selenium.WebDriver;

public class PerfilFuncionalidade extends BaseTest {
    private PerfilPage perfilPage;
    private SeleniumRobot seleniumRobot;

    public PerfilFuncionalidade(){
        this.perfilPage = new PerfilPage(webDriver);
        this.seleniumRobot = new SeleniumRobot();
    }

    public void excluiPublicacao() {
        this.seleniumRobot.scrollAteOElementoJS(this.perfilPage.getBtnReticencias());
        this.seleniumRobot.esperaElementoSerClicavelJS(this.perfilPage.getBtnReticencias());
        this.perfilPage.getBtnReticencias().click();
        this.seleniumRobot.esperaElementoSerClicavelJS(this.perfilPage.getBtnExcluirPublicaçao());
        this.perfilPage.getBtnExcluirPublicaçao();
        this.seleniumRobot.esperaElementoSerClicavelJS(this.perfilPage.getBtnConfirmaExclusao());
        this.perfilPage.getBtnConfirmaExclusao();
    }

    public void confirmarExclusao(String mensagem){
        String atual = this.seleniumRobot.pegarValorTextoJS(this.perfilPage.getAvisoConfirmaExclusao());
        this.seleniumRobot.validaTexto(atual,mensagem);
    }
}
