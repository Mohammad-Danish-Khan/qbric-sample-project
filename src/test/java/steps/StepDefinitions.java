package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import utils.WebDriverUtils;
import pages.ProjectDirectoryPage;
import org.junit.Assert;

public class StepDefinitions {

    private WebDriver driver;
    private ProjectDirectoryPage projectDirectoryPage;

    public StepDefinitions() {
        driver = WebDriverUtils.getDriver("chrome");
        projectDirectoryPage = new ProjectDirectoryPage(driver);
    }

    @Given("the Ingestion Engine project exists in the repository")
    public void the_ingestion_engine_project_exists_in_the_repository() {
        // Assuming the project exists, no specific action needed
    }

    @Given("the project folder structure is defined")
    public void the_project_folder_structure_is_defined() {
        // Assuming the folder structure is defined, no specific action needed
    }

    @When("the developer navigates to the project directory")
    public void the_developer_navigates_to_the_project_directory() {
        driver.get("https://example.com/project-directory");  // Replace with actual URL
    }

    @Then("the defined folder structure should be present")
    public void the_defined_folder_structure_should_be_present() {
        Assert.assertTrue(projectDirectoryPage.isFolderStructurePresent());
    }

    @Given("the application architecture includes distinct modules")
    public void the_application_architecture_includes_distinct_modules() {
        // Assuming the architecture is defined, no specific action needed
    }

    @When("the developer inspects the project's modules")
    public void the_developer_inspects_the_project_s_modules() {
        // No specific action needed, the page is already loaded
    }

    @Then("the Ingestion Engine, LLM Layer, and Core Services should be separated into distinct modules")
    public void the_ingestion_engine_llm_layer_and_core_services_should_be_separated_into_distinct_modules() {
        Assert.assertTrue(projectDirectoryPage.areModulesSeparated());
    }

    @Given("configuration properties are externalized")
    public void configuration_properties_are_externalized() {
        // Assuming configuration properties are externalized, no specific action needed
    }

    @When("the developer examines the deployment package")
    public void the_developer_examines_the_deployment_package() {
        // No specific action needed, the page is already loaded
    }

    @Then("the configuration properties should not be bundled within the JAR file")
    public void the_configuration_properties_should_not_be_bundled_within_the_jar_file() {
       Assert.assertFalse(projectDirectoryPage.isConfigurationPropertiesBundled());
    }

    @Given("the execution method is refactored")
    public void the_execution_method_is_refactored() {
        // Assuming the execution method is refactored, no specific action needed
    }

    @When("the developer inspects the code")
    public void the_developer_inspects_the_code() {
        // No specific action needed, the page is already loaded
    }

    @Then("the execution method should use typed IngestionRequest instead of JSON")
    public void the_execution_method_should_use_typed_ingestionrequest_instead_of_json() {
        Assert.assertTrue(projectDirectoryPage.isExecutionMethodUsingIngestionRequest());
    }
}