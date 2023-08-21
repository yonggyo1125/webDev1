package exam04.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import exam04.models.member.*;
import org.springframework.context.annotation.FilterType;

@Configuration
@ComponentScan(basePackages = "exam04.models",
    excludeFilters = @ComponentScan.Filter(type= FilterType.ANNOTATION, classes= ManualBean.class))
public class AppCtx {
    /**
    @Bean
    public MemberDao memberDao() {
        System.out.println("수동 등록 빈!");
        return new MemberDao();
    }
    */
}
