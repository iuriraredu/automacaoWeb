package br.com.bootcamp.web.steps;

import br.com.bootcamp.web.funcionalidade.HomeFuncionalidade;
import cucumber.api.java.pt.Entao;
import cucumber.runtime.junit.Assertions;
import org.junit.Assert;

public class HomeSteps {
    private HomeFuncionalidade homeFuncionalidade;

    private HomeSteps(){
        this.homeFuncionalidade = new HomeFuncionalidade();
    }

    @Entao("^visualizo a tela inicial com o meu usuário logado$")
    public void visualizoATelaInicialComOMeuUsuárioLogado() {

    }
}
