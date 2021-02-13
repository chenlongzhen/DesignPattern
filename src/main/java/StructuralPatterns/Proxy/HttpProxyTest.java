package StructuralPatterns.Proxy;

import org.junit.Test;

import static org.junit.Assert.*;

public class HttpProxyTest {

    @Test
    public void test() {
        HttpUtil httpUtil = new HttpUtil();
        HttpProxy proxy = new HttpProxy(httpUtil);
        proxy.request("request data");
        proxy.onSuccess("received result");
    }


}