package hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
    @Before
    public void setUp(){

        System.out.println("Before methodu calisti");
    }
    @After
    public void tearDowv(){
        System.out.println("After metodu calisti");
    }
}
