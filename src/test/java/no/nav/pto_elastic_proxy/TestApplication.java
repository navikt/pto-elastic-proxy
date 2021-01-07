package no.nav.pto_elastic_proxy;

import no.nav.pto_elastic_proxy.config.TestApplicationConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Import;

@EnableAutoConfiguration
@Import(TestApplicationConfig.class)
public class TestApplication {

    public static void main(String[] args) {
        SpringApplication application = new SpringApplication(TestApplication.class);
        application.setAdditionalProfiles("local");
        application.run(args);
    }

}

