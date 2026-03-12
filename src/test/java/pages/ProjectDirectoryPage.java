package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProjectDirectoryPage {

    private WebDriver driver;

    private By projectDirectory = By.id("projectDirectory");
    private By modulesSection = By.id("modulesSection");
    private By ingestionEngineModule = By.id("ingestionEngineModule");
    private By llmLayerModule = By.id("llmLayerModule");
    private By coreServicesModule = By.id("coreServicesModule");
    private By deploymentPackage = By.id("deploymentPackage");
    private By codeSection = By.id("codeSection");
    private By executionMethod = By.id("executionMethod");


    public ProjectDirectoryPage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getProjectDirectory() {
        return driver.findElement(projectDirectory);
    }

    public WebElement getModulesSection() {
        return driver.findElement(modulesSection);
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

    public WebElement getDeploymentPackage() {
        return driver.findElement(deploymentPackage);
    }

    public WebElement getCodeSection() {
        return driver.findElement(codeSection);
    }

    public WebElement getExecutionMethod() {
        return driver.findElement(executionMethod);
    }

    public boolean isFolderStructurePresent() {
        return getProjectDirectory().isDisplayed();
    }

    public boolean areModulesSeparated() {
        return getIngestionEngineModule().isDisplayed() &&
                getLlmLayerModule().isDisplayed() &&
                getCoreServicesModule().isDisplayed();
    }

    public boolean isConfigurationPropertiesBundled() {
        return getDeploymentPackage().getText().contains("configuration properties");
    }

    public boolean isExecutionMethodUsingIngestionRequest() {
        return getExecutionMethod().getText().contains("IngestionRequest");
    }
}