package exam05.config;

import exam05.Message;
import exam05.Message2;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppCtx {
    @Bean
    public Message message() {
        return new Message();
    }

    @Bean(initMethod = "init", destroyMethod = "close")
    public Message2 message2() {
        return new Message2();
    }
}
