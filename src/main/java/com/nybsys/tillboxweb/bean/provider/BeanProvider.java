package com.nybsys.tillboxweb.bean.provider;

import com.nybsys.tillboxweb.broker.client.MqttSubscribePublished;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class BeanProvider implements ApplicationContextAware {

    private ApplicationContext applicationContext;

    @Bean
    @Scope(BeanDefinition.SCOPE_PROTOTYPE)
    public MqttSubscribePublished mqttSubscribePublished() {
        return new MqttSubscribePublished();
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }
}
