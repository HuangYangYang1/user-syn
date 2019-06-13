package com.oce.testsync.config;

import com.oce.testsync.client.WsClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;

/**
 *ws客户端的配置类
 *
 * @author yang.huang
 * @since 2019/6/12 11:38
 */
@Configuration
public class WSConfig {


    @Bean
    public Jaxb2Marshaller marshaller() {
        Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
        marshaller.setContextPath("com.dexcoder.ws");
        return marshaller;
    }

    @Bean
    public WsClient wsClient(Jaxb2Marshaller marshaller) {
        WsClient client = new WsClient();
        client.setDefaultUri("http://10.0.10.227/services/HrmService");
        client.setMarshaller(marshaller);
        client.setUnmarshaller(marshaller);
        return client;
    }
}
