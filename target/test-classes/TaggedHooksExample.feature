Feature: Test TaggedHooks functionality

 @smokeTest
  Scenario: Verify the taggedHook on smoke tag functionality
  Given First test
  When second test
  Then Third test
  
   
  @Regression
  Scenario: Verify the taggedHook on regression tag functionality
  Given Fourth test
  When Fifth test
  And Sixth test
  
  @E2E
  Scenario: Verify the taggedHook on smoke tag functionality
  Given seventh test
  When eighth test
  Then Ninth test
  
  @BVT
  Scenario: Verify the taggedHook on smoke tag functionality
  Given thenth test
  When eleventh test
  Then Telve test
 