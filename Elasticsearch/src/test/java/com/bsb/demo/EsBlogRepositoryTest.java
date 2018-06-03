package com.bsb.demo;

import com.bsb.domain.EsBlog;
import com.bsb.repository.EsBlogRepository;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Repository;
import org.springframework.test.context.junit4.SpringRunner;


import static org.assertj.core.api.AssertionsForClassTypes.assertThat;


@RunWith(SpringRunner.class)
@SpringBootTest
public class EsBlogRepositoryTest {

    private final Logger logger = LoggerFactory.getLogger(EsBlogRepositoryTest.class);

    @Autowired
    private EsBlogRepository esBlogRepository;

    @Before
    public void initRepositoryData() {
//        清除所有数据
        esBlogRepository.deleteAll();

        esBlogRepository.save(new EsBlog("曾帅智", "我的测试", "我的测试1代码垃圾"));
        esBlogRepository.save(new EsBlog("曾帅智", "你的测试", "我的测试1代码优秀"));
        esBlogRepository.save(new EsBlog("曾帅智", "他的测试", "我的测试1代码一般"));
        esBlogRepository.save(new EsBlog("曾帅智", "她的测试", "我的测试1代码罢了"));
    }


    @Test
    public void testFindDistinctEsBlogByTitleContainingOrSummaryContainingOrContentContaining() {
        Pageable pageable =  new PageRequest(0, 20);
        String title = "我的";
        String summary = "我的";
        String content = "优秀";

        Page<EsBlog> page = esBlogRepository.findDistinctEsBlogByTitleContainingOrSummaryContainingOrContentContaining(title, summary, content, pageable);
        assertThat(page.getTotalElements()).isEqualTo(2);

        for (EsBlog blog : page.getContent()) {
            logger.info(blog.getContent());
        }
    }
}
