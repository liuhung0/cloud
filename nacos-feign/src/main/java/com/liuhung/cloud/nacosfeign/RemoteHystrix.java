package com.liuhung.cloud.nacosfeign;

import org.springframework.stereotype.Component;

@Component("remoteClient")
public class RemoteHystrix implements RemoteClient {
    @Override
    public String helloNacos() {
        return "请求超时了";
    }
}
