@QAAT-821

Feature: Ingestion Engine - Code Structure Setup

  As a developer
  I want to ensure the code structure of the Ingestion Engine is correctly set up
  So that the application is modular, maintainable, and scalable

  Background:
    Given the Ingestion Engine project exists in the repository

  Scenario: Verify the project folder structure

    Given the project folder structure is defined
    When the developer navigates to the project directory
    Then the defined folder structure should be present

  Scenario: Verify the separation of modules

    Given the application architecture includes distinct modules
    When the developer inspects the project's modules
    Then the Ingestion Engine, LLM Layer, and Core Services should be separated into distinct modules

  Scenario: Verify externalization of configuration properties

    Given configuration properties are externalized
    When the developer examines the deployment package
    Then the configuration properties should not be bundled within the JAR file

  Scenario: Verify IngestionRequest is used instead of JSON

    Given the execution method is refactored
    When the developer inspects the code
    Then the execution method should use typed IngestionRequest instead of JSON

# CHALLENGE ASSESSMENT
*  External system dependencies (LLM Layer, other services) may require mocking or stubbing for effective testing.
*  Complex interactions between modules might necessitate integration tests.
*  Configuration properties externalization needs careful handling of environment-specific values.
