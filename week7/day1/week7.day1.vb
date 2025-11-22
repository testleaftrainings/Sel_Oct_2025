3:00 to 3:30 --->Parametrization
3:30 to 4:00 ---> Multiple data
4:00 to 4:20 ---> Breakout
4:20 to 4:30 ---> Break
4:30 to 5:00 ---> Hooks implementation and tags
5:00 to 5:30 --->Explicit Wait
5:30 to 6:00 ---> Exception Handling

parameterization:
1)surround the data with single quote in the feature file
2)in the step def replace the data with{string}
3)pass the i/p arguments to the method and replace the hardcoded data with the arguments.

Steps to pass multiple data to a scenario using Scenario Outline and Examples:
Create a feature file called CreateLead.feature and write all the BDD steps
In Scenario Outline replace the data with <> and pass a name inside it Enter the companyname as
In StepDefinition on the top of that particular method replace the parameterized data with (.)$ @Given("Enter the companyname as (.)$")

Steps to implement Hooks:
Create a package called hooks and create a class called HooksImplementation
Create 2 methods preCondition() and postCondition() and annotate with @Before and @After
The HooksImplementatio class should extends BaseClass
In the Runner class inside glue attribute mention hooks package as well glue ={"steps","hooks"}
Tags:
It is used to categorize the scenarios

tags="@smoke" )// only smoke scenarios will be executed tags="not @smoke") // to exclude a scenario from execution tags="@smoke or @functional")// To run scenarios that have either of the tags tags="@functional and @regression" )//To run scenarios which has both the tags

Exceptions:
1)undefined step exception
2)duplicate step definition exception
3)Invalid method exception
4)Null pointer Exception

ExplicitWait:
1)it is condn based wait
2)it polls for every 500ms in the dom,if the condn is satisfied it proceeds immediately.
3)if the condn is not satisfied,it polls until the time specified,after it throws timeout exception.