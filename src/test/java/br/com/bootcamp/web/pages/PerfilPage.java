package br.com.bootcamp.web.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PerfilPage {

    public PerfilPage(WebDriver webDriver){
        PageFactory.initElements(webDriver, this);
    }

    @FindBy (xpath = "//a[@aria-label='Opções do story' and ancestor:: div[@data-insertion-position='0']]")
    //@FindBy(xpath = "//div[img[following-sibling:: div and ancestor:: div[@aria-posinset='1']]]")
    WebElement btnReticencias;

    @FindBy(xpath = "//span[text()='Excluir']")
    //@FindBy(xpath = "//div[span[text()='Excluir publicação']]")
    WebElement btnExcluirPublicacao;

    @FindBy(xpath = "//button[text()='Excluir']")
    //@FindBy(xpath = "//span[text()='Excluir' and parent:: div/parent:: div/parent:: div/parent:: div/parent:: div/parent:: div/preceding-sibling::div/descendant:: h2]")
    WebElement btnConfirmaExclusao;

    @FindBy(xpath = "//span[text()='Sua publicação foi excluída.']")
    WebElement avisoConfirmaExclusao;

    public WebElement getBtnReticencias() {
        return btnReticencias;
    }

    public WebElement getBtnExcluirPublicacao() {
        return btnExcluirPublicacao;
    }

    public WebElement getBtnConfirmaExclusao() {
        return btnConfirmaExclusao;
    }

    public WebElement getAvisoConfirmaExclusao() {
        return avisoConfirmaExclusao;
    }
}
