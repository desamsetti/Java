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
    
    
    
4. Java Annotations

	1. Java Annotations are labels/markers added to Java Classes.
	
	2. Provide meta-data about the class.
	
	3. Processed at compile-time or run-time for special processing.
	
	4. One of the known examples for Annotations is @Override.
	
	5. Annotations minimize the XML configuration.
	
	6. Spring will scan your Java classes for special annotations.
	
	7. Automatically register the beans in the spring container

	
	4.1 Using Java Annotations
		
		1. We need to add this line in the Application Context to enable Component Scanning
		 <!-- add entry to enable component scanning -->
    
    	<context:component-scan base-package="com.luv2code.springdemo"></context:component-scan>

    	2. In the class, here TennisCoach class, we have added this line,
    	@Component("thatSillyCoach") and wrote the method getDailyWorkout() by implementing the Coach interface.
    	
    	3. In the AnnotationDemoApp class, we need to read the spring config file, then retrieve the bean and then call the methods.
    	
    	4. We can call the getDailyWorkout() method. Here, we didn't create a bean in the applicationContext, we just created an Annotation inside the Class and then we can use the methods of that class directly.
    	
 	4.2 Using Java Annotations and Autowiring by Constructors
 		
 		1. Here, we need to create an Interface like FortuneService which contains a method like getFortune. Then we need to have a class that implements this interface like HappyFortuneService. This class should also have the @Component label.
 		
 		2. Then, in the TennisCoach class, we need to write a parameterized Constructor which uses the FortuneService variable fortuneService. For this constructor, we should add the label @Autowired. We need to add the getDailyFortune() method to the Coach interface and then implement it in the TennisCoach as fortuneService.getFortune();
 		
 		3. Then Spring checks for the classes that are implementing the FortuneService Interface, here it is the HappyFortuneService class and then gets the method from there. This is called as Autowiring.
 		
 		
 	4.3 Using Java Annotations and Autowiring by Setters
 	
 		1. Here, we need to create a default constructor for the class like TennisCoach and then we just need to create a setter for the FortuneService and we need to add the @Autowired label for the setFortuneService() setter. Spring checks for the classes that are implementing the FortuneService Interface, here it is the HappyFortuneService class and then gets the method from there.
 		2. We don't need to write the Constructor here.
 		
 		
 	4.4 Using Java Annotations and Autowiring by methods
 	
 		1. We can use methods also in the place of Constructors and setters for Autowiring and we can just simply put the label @Autowired on the method.
 		
 	4.5 Using Java Annotations and Autowiring by Fields
 	
 		1. We can use the @Autowired label on the field itself instead of using it on setters or constructors.
 		
 	4.6 Multiple classes implementing the Interface
 		1. If there are multiple classes implementing the same interface, like HappyFortuneService, DatabaseFortuneService, RandomFortuneService, RESTFortuneService are implementing the same FortuneService Interface, then it throws an error.
 		
 		2. We can specify what class we want by using the @Qualifier("happyFortuneService").
 		
 	4.7 We can write the Init methods and Destroy methods by using the @PostConstruct and @PreDestroy annotations on the methods.
 	
 	
 	5. Spring Configuration with Java Code (No XML)
 	
 		5.1 We can use Java annotations and not use XML.
 		
 		5.2 Create a class like SportConfig.java, then add
 			@Configuration
			@ComponentScan("com.luv2code.springdemo")
			annotations.
		5.3 In the place of ClassPathXmlApplicationContext, we can use 
			AnnotationConfigApplicationContext and all the steps are same.
		 
	
	