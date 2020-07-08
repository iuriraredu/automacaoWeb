package br.com.bootcamp.web.funcionalidade;

import br.com.bootcamp.commons.SeleniumRobot;
import br.com.bootcamp.web.pages.HomePage;
import br.com.bootcamp.settings.BaseTest;

public class HomeFuncionalidade extends BaseTest {

    private HomePage homePage;
    private SeleniumRobot seleniumRobot;

    public HomeFuncionalidade(){
        this.homePage = new HomePage(webDriver);
        this.seleniumRobot = new SeleniumRobot();
    }

    public void acessarPerfil(){
        this.seleniumRobot.esperarElementoSerVisivel(this.homePage.getLinkMeuPerfil());
        this.homePage.getLinkMeuPerfil().click();
    }



}
