package br.com.bootcamp.web.funcionalidade;

import br.com.bootcamp.web.pages.HomePage;
import br.com.bootcamp.settings.BaseTest;

public class HomeFuncionalidade extends BaseTest {

    private HomePage homePage;

    public HomeFuncionalidade(){
        this.homePage = new HomePage(webDriver);
    }

    public String retornaTexto(){
        return this.homePage.getBtnTeste().getText();
    }
}
