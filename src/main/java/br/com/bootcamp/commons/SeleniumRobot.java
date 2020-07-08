package br.com.bootcamp.commons;

import br.com.bootcamp.settings.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class SeleniumRobot extends BaseTest {
    /**
     * Clicar em um botão através de JavaScriptExecutor
     * @param elemento Insira o elemento que você deseja clicar
     */
    public void clicaBotaoJS(WebElement elemento){
        JavascriptExecutor js = (JavascriptExecutor)webDriver;
        js.executeScript("arguments[0].click();", elemento);
    }

    /**
     * Insere um texto no campo através de JavaScriptExecutor
     * @param elemento Insira o elemento onde você deseja preencher no campo
     * @param valor insisra o valor que você deseja preencher no campo
     */
    public void insereTextoNoElementoJS(WebElement elemento, String valor){
        JavascriptExecutor js = (JavascriptExecutor)webDriver;
        js.executeScript("arguments[0].value='"+valor+"';", elemento);
    }

    /**
     * Marcar um checkbox através de JavaScriptExecutor
     * @param id Insira o Id do elemento que você quer marcar
     */
    public void selecionaCheckBoxJS(String id){
        JavascriptExecutor js = (JavascriptExecutor)webDriver;
        js.executeScript("document.getElementById('"+id+"').checked=true;");
    }

    /**
     * Retorna o valor de texto que existe no elemento
     * @param elemento Insira o elemento que você deseja capturar o texto.
     * @return Retorna o valor de texto do elemento
     */
    public String pegarValorTextoJS(WebElement elemento){
        return elemento.getText();
    }

    /**
     * Valida se o texto atual é igual ao texto esperado
     * @param atual Insira o valor do texto atual
     * @param esperado Insira o valor do texto esperado
     * @return Retorna Verdadeiro ou Falso
     */
    public boolean validaTexto(String atual, String esperado){
        return atual.equals(esperado);
    }

    /**
     * Realiza o scroll da pagina até encontrar o elemento. (Obs.: O elemento precisa existir na página)
     * @param elemento
     */
    public void scrollAteOElementoJS(WebElement elemento){
        JavascriptExecutor js = (JavascriptExecutor)webDriver;
        js.executeScript("arguments[0].scrollIntoViews()", elemento);
    }


    /**
     * Realiza Scroll até o fim da página
     */
    public void scrollAteFimDaPaginaJS(){
        JavascriptExecutor js = (JavascriptExecutor)webDriver;
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
    }

    /**
     * Realiza Scroll até o topo da página
     */
    public void scrollAteTopoDaPaginaJS(){
        JavascriptExecutor js = (JavascriptExecutor)webDriver;
        js.executeScript("window.scrollTo(0, document.body.scrollTop)");
    }

    /**
     * Seleciona um intem na lista através do texto que está visivel na lista
     * @param elemento Elemento pai da lista de seleção (id da tag select)
     * @param textoVisivel Texto ao qual o comando deve clicar
     */
    public void selecionaItemListaJS(WebElement elemento, String textoVisivel){
        Select lista = new Select(elemento);
        lista.selectByVisibleText(textoVisivel);
    }

    /**
     * Seleciona um intem na lista através de index
     * @param elemento Elemento pai da lista de seleção (id da tag select)
     * @param index Posição do elemento na lista
     */
    public void selecionaItemListaJS(WebElement elemento, int index){
        Select lista = new Select(elemento);
        lista.selectByIndex(index);
    }

    /**
     * Seleciona um intem na lista através do valor
     * @param elemento Elemento pai da lista de seleção (id da tag select)
     * @param value Atributo value da tag option
     */
    public void selecionaItemListaPorValorJS(WebElement elemento, String value){
        Select lista = new Select(elemento);
        lista.selectByValue(value);
    }

    /**
     * Espero o Elemento estar visivel na Tela
     * @param elemento o elemento a ficar visivel
     */
    public void esperarElementoSerVisivel(WebElement elemento){
        wait.until(ExpectedConditions.visibilityOf(elemento));
    }

    /**
     * Espera o elemento estar clicável na tela
     * @param elemento
     */
    public void esperaElementoSerClicavelJS(WebElement elemento){
        wait.until(ExpectedConditions.elementToBeClickable(elemento));
    }

    /**
     * Mapeia e retorna um elemento pelo xpath
     * @param xPath do elemento a ser mapeado
     * @return o elemento mapeado
     */
    public WebElement mapearElemento (String xPath){
        return webDriver.findElement(By.xpath(xPath));
    }

    /**
     * Mapeia e retorna um elemento pelo xpath
     * @param atributo a tag do elemento HTML que deseja mapear
     * @param especificacao o atributo da tag
     * @param valor o valor do atributo
     * @return o elemento mapeado
     */
    public WebElement mapearElemento (String atributo, String especificacao, String valor){
        return webDriver.findElement(By.xpath("//"+atributo+"["+especificacao+"='"+valor+"']"));
    }

    /**
     * Espera Implicita (OBS.: Evitar de usar esse tipo de espera)
     * @param l quantidade em segundos
     */
    public void pausarAplicacao (long l){
        webDriver.manage().timeouts().implicitlyWait(l, TimeUnit.SECONDS);
    }
}
