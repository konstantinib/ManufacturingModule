@smokeSuite
Feature: Manufacturing functionality

  Background: Login to  BriteERP Web Application
    When  User is on the BriteERP Web Application
    And User inputs the right credentials for the manager
    And User is selecting Manufacturing link in navigation bar

  @Aizada
  Scenario: Checking the Filter functionality
  And User clicks on second ManufacturingOrders link in Manufacturing home page
  And User clicks on plus button
  And User clicks on Filters button
  Then User should be able to see drop-down menu

  @Cesar
  Scenario: GroupBy functionality verification
    And User clicks on the Manufacturing Orders link under Reporting
    And User clicks on the Advanced Search link on the search bar
    And User clicks on the Group By button
    And User clicks on the Routing link in the drop down menu
    Then User should see new graph is displayed


  @David
  Scenario: Checking the cancel imports for Bill of Material functionality
    And User goes to the Bill of Materials and clicks on Import button
    And User chooses a file from the file explorer and click open
    And User clicks cancel button located next to import button
    Then User should be taken back to the initial page.

  @Emre
  Scenario: Checking the Search functionality in manufacuring module
    And User scrolls up and down the page
    And User clicks the Product button
    And User enters the product name and the information about the product
    Then User should see the result of the product that he she entered


  @Gulmira
  Scenario: Checking product Sales Prices
    And User clicks on the Product button
    And User clicks on the first product
    And User clicks on the edit button
    And User clicks on the sales price button and input couple of letters
    And User clicks on save
    Then User should see a red pop-up stating that the input is invalid

  @Gulmira
  Scenario: Checking the load file functionality
    And User clicks on the Bill of Material  button
    And User clicks on the Import Button
    And User clicks on the Load file button
    Then User should see Bill of Materials displayed and Load file button has to be enabled

  @Hamza
  Scenario: Cancel button functionality
    And User is hovering  over Import button with mouse pointer and pressing on Import button
    And User is hovering over Cancel button and pressing Cancel button
    Then User should be redirected back to Manufacturing Orders page
 @Hamza
  Scenario: Checking the Import button functionality
    And User goes to Bill of Materials and clicks on Import button
    Then User should be taken to a new page


  @Konstantin
  Scenario: Checking the filter dropdown menu
    And User clicks on Product link under Master Data
    And User locates and click on Filters button
    Then User should see the dropdown menu displayed

  @Nadia
  Scenario: Checking the Save button for Bill of Materials
    And User clicks on Bill of Materials button
    And User clicks on create button
    And User clicks the save button without making any changes
    Then User should see a pop up red square and should't be able to save





