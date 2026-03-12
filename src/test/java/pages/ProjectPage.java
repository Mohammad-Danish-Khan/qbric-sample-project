package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProjectPage {

    private WebDriver driver;

    private By projectRepositoryLink = By.linkText("Project Repository"); // Example Locator
    private By ingestionEngineModule = By.id("ingestion-engine"); // Example Locator
    private By llmLayerModule = By.id("llm-layer"); // Example Locator
    private By coreServicesModule = By.id("core-services"); // Example Locator

    public ProjectPage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getProjectRepositoryLink() {
        return driver.findElement(projectRepositoryLink);
    }

    public WebElement getIngestionEngineModule() {
        return driver.findElement(ingestionEngineModule);
    }

    public WebElement getLlmLayerModule() {
        return driver.findElement(llmLayerModule);
    }

    public WebElement getCoreServicesModule() {
        return driver.findElement(coreServicesModule);
    }

    public boolean isModulePresent(String moduleName) {
        try {
            switch (moduleName.toLowerCase()) {
                case "ingestion engine":
                    return driver.findElement(ingestionEngineModule).isDisplayed();
                case "llm layer":
                    return driver.findElement(llmLayerModule).isDisplayed();
                case "core services":
                    return driver.findElement(coreServicesModule).isDisplayed();
                default:
                    return false;
            }
        } catch (org.openqa.selenium.NoSuchElementException e) {
            return false;
        }
    }
}