package com.segurosbolivar.automation.pageobjects.login;

import lombok.RequiredArgsConstructor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class LoginMethods {
    private final WebDriver driver;
    private final LoginPage loginPage;
    private final WebDriverWait wait;

    public void go(String url) {
        this.driver.get(url);
    }

    public void writeUsername(String username) {
        this.wait.until(ExpectedConditions.visibilityOf(this.loginPage.getUsername()));
        this.loginPage.getUsername().sendKeys(username);
    }

    public void writePassword(String password) {
        this.loginPage.getPassword().sendKeys(password);
    }

    public void submit() {
        this.loginPage.getSubmit().click();
    }

    public String getWelcomePageMessage() {
        this.wait.until(ExpectedConditions.visibilityOf(this.loginPage.getWelcomePage()));
        return this.loginPage.getWelcomePage().getText();
    }

}
