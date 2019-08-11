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