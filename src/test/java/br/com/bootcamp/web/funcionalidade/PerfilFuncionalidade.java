package br.com.bootcamp.web.funcionalidade;

import br.com.bootcamp.commons.SeleniumRobot;
import br.com.bootcamp.settings.BaseTest;
import br.com.bootcamp.web.pages.PerfilPage;

public class PerfilFuncionalidade extends BaseTest {
    private PerfilPage perfilPage;
    private SeleniumRobot seleniumRobot;

    public PerfilFuncionalidade(){
        this.perfilPage = new PerfilPage(webDriver);
        this.seleniumRobot = new SeleniumRobot();
    }

    public void clicoEmOpcPost(){
        this.seleniumRobot.esperarElementoSerVisivel(this.perfilPage.getBtnReticencias());
        this.seleniumRobot.clicaBotaoJS(this.perfilPage.getBtnReticencias());
    }

    public void excluiPublicacao() {
        this.seleniumRobot.pausarAplicacao(10);
        this.seleniumRobot.clicaBotaoJS(this.perfilPage.getBtnExcluirPublicacao());
    }

    public void confirmarExclusao(){
        this.seleniumRobot.pausarAplicacao(5);
        this.seleniumRobot.clicaBotaoJS(this.perfilPage.getBtnConfirmaExclusao());
    }
}
