package com.imooc.mall;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @User:Mingaho
 * @Date:2021/07/12
 * @Time:10:58
 */
@Configuration  //这样启动的时候才会执行里面的方法
public class InterceptorConfig implements WebMvcConfigurer {
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new UserLoginInterceptor())  //配置拦截器
                .addPathPatterns("/**")   //默认对所有的url进行拦截
                .excludePathPatterns("/error", "/user/login", "/user/register", "/categories", "/products", "/products/*");  //注册跟登录不能拦截
    }
}
