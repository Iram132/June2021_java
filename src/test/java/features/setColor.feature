@tag
Feature: Background color validation;

@tag1
 Scenario: Valid user should be able to set skyBlue backgroung  
 Given User is on techfios test Website        
 When User clicks on the set Skyblue button; 
 Then the background color will change to skyblue;
 
 @tag2
 Scenario: Valid user should be able to set White backgroung color
 Given User is on techfios test Website 
 When User clicks on the set White background button; 
 Then the background color will change to white;  