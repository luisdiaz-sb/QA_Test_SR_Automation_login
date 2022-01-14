package com.segurosbolivar.automation.pageobjects.login;

import com.segurosbolivar.automation.pageobjects.PageBase;
import lombok.Getter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.springframework.stereotype.Component;

@Component
@Getter
public class LoginPage extends PageBase {

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//input[@name='uname']")
    private WebElement username;
    @FindBy(xpath = "//input[@name='pass']")
    private WebElement password;
    @FindBy(xpath = "//input[@value='login']")
    private WebElement submit;
    @FindBy(xpath = "//*[@id='globalNav']/table/tbody/tr/td[2]/a")
    private WebElement welcomePage;
}
