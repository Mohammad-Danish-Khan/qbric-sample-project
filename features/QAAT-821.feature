@QAAT-821

Feature: Ingestion Engine - Code Structure Setup

  As a developer
  I want to ensure the code structure for the ingestion engine is properly set up
  So that the application is modular, maintainable, and configurable.

  Background:
    Given the project repository is accessible
    And the required development tools are installed

  Scenario: Verify project folder structure
    Given a predefined project folder structure
    When the code structure is set up
    Then the project folder structure should match the predefined structure

  Scenario: Verify separation of modules
    Given modules for ingestion engine, LLM layer, and core services
    When the code structure is set up
    Then each module should be in its dedicated directory

  Scenario: Verify externalization of configuration properties
    Given configuration properties that are externalized
    When the code structure is set up
    Then configuration properties should not be bundled in the JAR file
    And configuration properties should be accessible via external files

  Scenario: Verify execution using typed IngestionRequest
    Given the Ingestion Engine
    When the execution method uses typed IngestionRequest
    Then the execution should be successful

  # Additional scenarios to check error handling, edge cases, etc.
  # Example :

  Scenario: Handle invalid input data
    Given the Ingestion Engine
    When the request contains invalid input data
    Then the execution should fail and an appropriate error message should be returned.

# CHALLENGE ASSESSMENT
* Complex business logic requiring extensive setup
* External system dependencies (GitLab repository)
* Data privacy/security considerations when handling configuration properties.

