package no.nav.pto_elastic_proxy.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

@Slf4j
@RestController
@RequestMapping("/sink")
public class ProxySinkController {

    // Brukes for å teste at proxy er satt opp riktig lokalt

    @RequestMapping("**")
    public void sink(HttpServletRequest request) {
        String requestMethod = request.getMethod();
        String requestUri = request.getRequestURI();

        log.info("method={} uri={}", requestMethod, requestUri);
    }

}
