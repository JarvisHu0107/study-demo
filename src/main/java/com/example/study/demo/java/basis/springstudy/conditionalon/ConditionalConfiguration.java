package com.example.study.demo.java.basis.springstudy.conditionalon;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingClass;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author huxin
 * @Description
 * @create 2020-08-31 4:24 下午
 */
@Configuration
public class ConditionalConfiguration {

    @Bean
    @ConditionalOnBean(name = "baseCondition")
    public ConditionProduct conditionProduct() {
        return new ConditionProduct();
    }

}
