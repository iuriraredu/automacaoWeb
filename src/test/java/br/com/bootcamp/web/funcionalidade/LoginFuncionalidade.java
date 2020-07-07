package br.com.bootcamp.web.funcionalidade;

import br.com.bootcamp.enums.Credentials;
import br.com.bootcamp.settings.BaseTest;
import br.com.bootcamp.web.pages.LoginPage;

public class LoginFuncionalidade extends BaseTest {

    private LoginPage loginPage;

    public LoginFuncionalidade(){
        this.loginPage = new LoginPage(webDriver);
    }

    public void realizarLogin(){
        this.loginPage.getTxtEmail().sendKeys(Credentials.CADASTRADO.usuario());
        this.loginPage.getTxtPassWord().sendKeys(Credentials.CADASTRADO.senha());
        this.loginPage.getBtnEntra().click();
    }
}
