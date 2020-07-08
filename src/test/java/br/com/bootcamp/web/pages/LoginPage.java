package br.com.bootcamp.web.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public LoginPage(WebDriver webDriver){
        PageFactory.initElements(webDriver, this);
    }

    @FindBy(xpath = "//input[@name='email']")
    private WebElement txtEmail;

    @FindBy(xpath = "//input[@name='pass']")
    private WebElement txtPassWord;

    //@FindBy(xpath = "//button[@name='login']")
    @FindBy(xpath = "//input[@value='Entrar']")
    private WebElement btnEntra;

    public WebElement getTxtEmail() {
        return txtEmail;
    }

    public WebElement getTxtPassWord() {
        return txtPassWord;
    }

    public WebElement getBtnEntra() {
        return btnEntra;
    }
}
