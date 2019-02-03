Feature: OpenWeatherMap API testing 

@Dover 
Scenario: Verify weather by city name 
	Given Content type is Json 
	When I get the current weather using city name "Dover" 
	Then Status code should be 200 
	And  Temperature should be in specific range 
	
	
	
	
	
	
	
	
	
	