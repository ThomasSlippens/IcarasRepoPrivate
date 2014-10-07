package nl.rsvier.icaras.test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotatiesTestSimple {

 public static void main(String[] args) {
  ClassPathXmlApplicationContext springContext = new ClassPathXmlApplicationContext(
    "cuvosdb-context.xml");
  springContext.close();
 }

}