package ma.mundiapolis.ioc.pres;

import ma.mundiapolis.ioc.metier.IMetier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation. AnnotationConfigApplicationContext;

public class PresenSpringAnnotation {
    public static void main(String[] args) {


    ApplicationContext applicationContext =
            new AnnotationConfigApplicationContext("ma.mundiapolis.ioc.", "ma.mundiapolis.ioc.metier");
    IMetier metier = applicationContext.getBean(IMetier.class);
System.out.println("RES="+metier.calcul());

}}