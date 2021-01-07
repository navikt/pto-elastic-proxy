package no.nav.pto_elastic_proxy.config;

import no.nav.pto_elastic_proxy.controller.ProxySinkController;
import no.nav.pto_elastic_proxy.filter.PostRequestZuulFilter;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@EnableZuulProxy
@Configuration
@Import({ProxySinkController.class})
public class TestApplicationConfig {

    @Bean
    public PostRequestZuulFilter proxyPostFilter() {
        return new PostRequestZuulFilter();
    }

}
