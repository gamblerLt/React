package lt.code.academy.config;

import lt.code.academy.MarkDao;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import java.util.List;

@Configuration
@ComponentScan("lt.code.academy")
@EnableAspectJAutoProxy(proxyTargetClass = true)
public class ApplicationConfig {
    @Bean
    public MarkDao customMarkDao() {
        return () -> List.of(4.9, 5.0, 5.5, 7.8);
    }
}
