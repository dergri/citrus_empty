package niav.citrus;


import com.consol.citrus.annotations.CitrusTest;
import com.consol.citrus.dsl.junit.JUnit4CitrusTestDesigner;
import org.junit.Test;

/**
 * This is a sample Java DSL Citrus integration test.
 *
 * @author Citrus
 */
public class SampleJavaIT extends JUnit4CitrusTestDesigner {

    @Test
    @CitrusTest
    public void echoToday() {
        variable("now", "citrus:currentDate()");

        echo("Today is: ${now}");
    }

    @CitrusTest(name = "SampleJavaTest.sayHello")
    public void sayHello() {
        echo("Hello Citrus!");
    }
}
