package br.com.bootcamp.web.steps;

import br.com.bootcamp.commons.SeleniumRobot;
import br.com.bootcamp.web.funcionalidade.LoginFuncionalidade;
import cucumber.api.java.pt.Dado;

public class LoginSteps {

    private LoginFuncionalidade loginFuncionalidade;

    public LoginSteps(){
        this.loginFuncionalidade = new LoginFuncionalidade();
    }

    @Dado("^realizo login com usuário \"([^\"]*)\"$")
    public void realizoLoginComUsuário(String texto) {
        this.loginFuncionalidade.realizarLogin();
    }
}
