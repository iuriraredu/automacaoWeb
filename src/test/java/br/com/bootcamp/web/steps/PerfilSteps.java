package br.com.bootcamp.web.steps;

import br.com.bootcamp.web.funcionalidade.PerfilFuncionalidade;
import cucumber.api.PendingException;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;

public class PerfilSteps {

    private PerfilFuncionalidade perfilFuncionalidade;

    public PerfilSteps(){
        this.perfilFuncionalidade = new PerfilFuncionalidade();
    }

    @Quando("^exclui publicação$")
    public void excluiPublicação() {
        this.perfilFuncionalidade.excluiPublicacao();
    }

    @Então("^exibe mensagem \"([^\"]*)\"$")
    public void exibeMensagem(String texto) {
        this.perfilFuncionalidade.confirmarExclusao(texto);
    }
}
