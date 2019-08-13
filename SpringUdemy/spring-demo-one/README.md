1. Spring Application Set Up
1. This application is the Basic Spring application.

2. This is using XML Configuration file.

3. The XML file here is the ApplicationContext.xml.

4. Inside the ApplicationContext.xml file, we have created a Bean.

	<bean id="myCoach"
    	  class="com.luv2code.springdemo.TrackCoach">
    </bean>
    
5. The name of the bean is "myCoach".

6. We have created a new class called HelloSpringApp, in which we have created ClassPathXmlApplicationContext which creates a context.

7. By using the context, we can create a new Object which is Coach theCoach = context.getBean("myCoach",Coach.class);

8. This is called as Retrieving the bean from the context.

9. This creates a new Object and then we can use theCoach.getDailyWorkout() to get the output.

10. The app should be configurable now.

11. Easily change the coach for another sport.
    Hockey,Cricket,Tennis,Gymnastics etc.
    
12. Changing the class="com.luv2code.springdemo.TrackCoach"> to 
	class="com.luv2code.springdemo.BaseballCoach"> changes the output.
	
	
2. Dependency Injection using Constructor

	1. First we need to have a parameterized Constructor for the class like BaseballCoach, which takes  in the field of a Class like FortuneService.
	
	2. Then methods like getDailyFortune() returns the output like, 
	fortuneService.getFortune() which is from the Interface.
	
	3. HappyFortuneService is a class which implements the FortuneService Interface and implements the method getFortune() which returns a string.
	
	4.Now, in the PracticeHelloSpringApp, we can just call the previous object created from the same bean and then call the method, getDailyFortune().
	
	5. We need to write this inside the ApplicationContext,
	<!-- set up constructor injection -->
    	  <constructor-arg ref="myFortune"/>
    6. Also, we need to write this Dependency.
    <!--  define the dependency -->
    <bean id="myFortune"
    	class="com.luv2code.springdemo.HappyFortuneService">    	    	
    </bean>
    
3. Dependency Injection using Setter Injection
 
	1. We need to write a Setter method for the variable.
	
	2. If the name of the setter method for example is setFortuneService, then the property name inside the bean that is to be created in the ApplicationContext is to be named as fortuneService.
	
	3. A property should be created inside the Application context bean which is called as the Setter Injection.
	
	4. This property has a name and a value in the ApplicationContext.xml file inside the bean. We can change the value in the ApplicationContext file when we want to change the information.
	
	5. Based on the bean name, the property name, the new object created can call the setter or getter methods like ObjectName.getPropertyName(); or ObjectName.setPropertyName() etc.
	
4. Loading the values from a file
	5. Create a text file and create the properties like,
	foo.email=myeasycoach@luv2code.com
	foo.team=Royal Challengers Bangalore
	then, in the ApplicationContext.xml file,
	<!-- load the properties file: sport.properties -->
    <context:property-placeholder location="classpath:sport.properties"/>
    then, inside the bean, inside the properties, change the value to ${propertyName}.
    


	
	
