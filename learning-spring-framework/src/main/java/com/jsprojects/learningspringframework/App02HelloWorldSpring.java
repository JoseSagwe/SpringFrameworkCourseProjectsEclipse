package com.jsprojects.learningspringframework;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.jsprojects.learningspringframework.game.Mario;
import com.jsprojects.learningspringframework.game.MarioRunner;
import com.jsprojects.learningspringframework.game.PacManGame;
import com.jsprojects.learningspringframework.game.SuperContraGame;

public class App02HelloWorldSpring {

	public static void main(String[] args) {
	
		var context = new AnnotationConfigApplicationContext(HelloworldConfiguration.class);

		//using bean class to retrieve the objects
        System.out.println(context.getBean("name"));
        System.out.println("The addition result is " + context.getBean("add"));
        System.out.println(context.getBean("person"));
        System.out.println(context.getBean("customerAddress"));
        System.out.println(context.getBean("person1")); // injecting methods of existing beans
        System.out.println(context.getBean("person2")); //injecting bean names parameters
        
        //You can use also the class name context
        System.out.println(context.getBean(Address.class));
	}

}
