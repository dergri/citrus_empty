package niav.citrus;

import com.consol.citrus.annotations.CitrusXmlTest;
import com.consol.citrus.junit.AbstractJUnit4CitrusTest;
import org.junit.Test;

/**
 * This is a sample Citrus integration test for loading XML syntax test case.
 *
 * @author Citrus
 */
public class SampleXmlIT extends AbstractJUnit4CitrusTest {

    @Test
    @CitrusXmlTest(name = "SampleXmlIT")
    public void sampleXml() {}
}
