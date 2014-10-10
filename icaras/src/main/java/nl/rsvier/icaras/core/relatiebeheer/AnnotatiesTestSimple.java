package nl.rsvier.icaras.core.relatiebeheer;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotatiesTestSimple {

 public static void main(String[] args) {
  ClassPathXmlApplicationContext springContext = new ClassPathXmlApplicationContext(
    "icarasdb-context.xml");
  springContext.close();
 }

}