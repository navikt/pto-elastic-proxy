package no.nav.pto_elastic_proxy;

import no.nav.pto_elastic_proxy.config.TestApplicationConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = {TestApplicationConfig.class})
public class BootstrapTest {

    @Test
    public void should_start() {}

}
