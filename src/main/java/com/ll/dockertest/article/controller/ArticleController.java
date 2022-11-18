package com.ll.dockertest.article.controller;

import com.ll.dockertest.article.entity.Article;
import com.ll.dockertest.article.service.ArticleService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;


@Controller
@RequiredArgsConstructor
@RequestMapping("/article")
public class ArticleController {

    private final ArticleService articleService;

    @RequestMapping("/getList")
    @ResponseBody
    public List<Article> getList() {
        return articleService.getList();
    }
}
