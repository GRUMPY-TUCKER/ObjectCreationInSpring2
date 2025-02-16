package org.maven;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml"); //creates the container
        Alien obj = (Alien) context.getBean("alien1");
        obj.code();
        System.out.println( "Hello World!" );
        Alien obj2 = (Alien) context.getBean("alien1");
        obj2.code();
    }
}
