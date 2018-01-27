package filters;

import com.netflix.zuul.ZuulFilter;

/**
 * Created by ckelly on 1/27/18.
 */

public class ErrorFilter extends ZuulFilter
{

    @Override
    public String filterType() {
        return "error";
    }

    @Override
    public int filterOrder() {
        return 0;
    }

    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() {
        System.out.println("Using Route Filter");

        return null;
    }

}