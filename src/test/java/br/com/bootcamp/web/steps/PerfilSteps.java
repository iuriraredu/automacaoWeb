package br.com.bootcamp.web.steps;

import br.com.bootcamp.web.funcionalidade.PerfilFuncionalidade;
import cucumber.api.PendingException;
import cucumber.api.java.pt.E;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;

public class PerfilSteps {

    private PerfilFuncionalidade perfilFuncionalidade;

    public PerfilSteps(){
        this.perfilFuncionalidade = new PerfilFuncionalidade();
    }


    @E("^clico em opções da postagem$")
    public void clicoEmOpçõesDaPostagem() {
        this.perfilFuncionalidade.clicoEmOpcPost();
    }

    @Quando("^clico em excluir postagem$")
    public void clicoEmExcluirPostagem() {
        this.perfilFuncionalidade.excluiPublicacao();
    }

    @Então("^confirmo a exclusão$")
    public void confirmoAExclusão() {
        this.perfilFuncionalidade.confirmarExclusao();
    }
}
