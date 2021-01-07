package no.nav.pto_elastic_proxy;

import no.nav.common.utils.SslUtils;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

    public static void main(String... args) {
        SslUtils.setupTruststore();
        SpringApplication.run(Application.class, args);
    }

}
