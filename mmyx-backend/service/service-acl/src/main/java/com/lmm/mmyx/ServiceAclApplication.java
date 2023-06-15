package  com.lmm.mmyx;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;

//权限管理模块启动类
@SpringBootApplication
@EnableDiscoveryClient
@ComponentScan(value = "com.lmm")
public class ServiceAclApplication {
    public static void main(String[] args) {
        SpringApplication.run(ServiceAclApplication.class, args);
    }

}