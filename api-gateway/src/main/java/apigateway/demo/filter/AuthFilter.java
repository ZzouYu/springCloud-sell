/*
package apigateway.demo.filter;

import apigateway.demo.constant.RedisConstant;
import apigateway.demo.utils.CookieUtil;
import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;

import static org.springframework.cloud.netflix.zuul.filters.support.FilterConstants.PRE_DECORATION_FILTER_ORDER;
import static org.springframework.cloud.netflix.zuul.filters.support.FilterConstants.PRE_TYPE;

*/
/**
 * 鉴权
 *//*

@Component
public class AuthFilter extends ZuulFilter {
    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    @Override
    public String filterType() {
        return PRE_TYPE;
    }

    @Override
    public int filterOrder() {
        return PRE_DECORATION_FILTER_ORDER-1;
    }

    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() throws ZuulException {
        RequestContext requestContext = RequestContext.getCurrentContext();
        HttpServletRequest request = requestContext.getRequest();
        */
/**
         * /order/create 只能买家访问
         * /order/finish 只能卖家访问
         * /product/list 都能访问
         *//*

         //只能买家访问,买家cookie里面存的是openid
         if("/order/order/create".equals(request.getRequestURI())){
             Cookie cookie = CookieUtil.getCookie(request, "openid");
             if(cookie ==null || StringUtils.isEmpty(cookie.getValue())){
                 requestContext.setSendZuulResponse(false);
                 requestContext.setResponseStatusCode(HttpStatus.UNAUTHORIZED.value());
             }
         }
        //只能卖家访问,买家cookie里面存的是token,redis存的是token_id
        if("/order/order/finish".equals(request.getRequestURI())){
            Cookie cookie = CookieUtil.getCookie(request, "token");
            if(cookie ==null || StringUtils.isEmpty(cookie.getValue())
                    || StringUtils.isEmpty(stringRedisTemplate.opsForValue().get(String.format(RedisConstant.TOKEN_TEMPLATE, cookie.getValue())))){
                requestContext.setSendZuulResponse(false);
                requestContext.setResponseStatusCode(HttpStatus.UNAUTHORIZED.value());
            }
        }
        return null;
    }
}
*/
