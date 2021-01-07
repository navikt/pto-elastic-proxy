package no.nav.pto_elastic_proxy.config;

import no.nav.pto_elastic_proxy.filter.PostRequestZuulFilter;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Bean;

@EnableZuulProxy
@Configuration
public class ApplicationConfig {

    @Bean
    public PostRequestZuulFilter postRequestZuulFilter() {
        return new PostRequestZuulFilter();
    }

}
