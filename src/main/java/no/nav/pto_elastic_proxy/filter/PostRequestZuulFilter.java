package no.nav.pto_elastic_proxy.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class PostRequestZuulFilter extends ZuulFilter {

    @Override
    public String filterType() {
        return "post";
    }

    @Override
    public int filterOrder() {
        return 1;
    }

    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() {
        RequestContext ctx = RequestContext.getCurrentContext();

        String requestMethod = ctx.getRequest().getMethod();
        int responseStatus = ctx.getResponse().getStatus();
        String requestUri = ctx.getRequest().getRequestURI();

        log.info("method={} status={} URI={}", requestMethod, responseStatus, requestUri);
        return null;
    }

}
