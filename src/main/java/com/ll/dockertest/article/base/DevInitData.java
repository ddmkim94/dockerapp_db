package com.ll.dockertest.article.base;

import com.ll.dockertest.article.service.ArticleService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;


@Configuration
@Profile("dev") // dev 설정 파일 활성화
public class DevInitData {
    @Bean
    public CommandLineRunner initDevData(ArticleService articleService) {
        return args -> {
            articleService.write("DRX 데프트 남아줘 제발");
            articleService.write("제목2");
            articleService.write("DRX 제카 남아줘 제발");
        };
    }
}