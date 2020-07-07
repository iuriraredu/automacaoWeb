package br.com.bootcamp.web.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
    public HomePage(WebDriver webDriver){
        PageFactory.initElements(webDriver,this);
    }

    @FindBy(xpath = "//span[parent::a[@href='/me/']]")
    private WebElement linkMeuPerfil;

    public WebElement getLinkMeuPerfil() {
        return linkMeuPerfil;
    }
}
