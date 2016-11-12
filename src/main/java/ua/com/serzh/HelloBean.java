package ua.com.serzh;

import org.springframework.stereotype.Component;

/**
 * Created by Serzh on 11/11/16.
 */
@Component
public class HelloBean {

    public  String sayHello() {
        return "Say Hello or Ola!";
    }

}
