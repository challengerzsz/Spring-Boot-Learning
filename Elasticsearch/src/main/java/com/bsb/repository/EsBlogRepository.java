package com.bsb.repository;

import com.bsb.domain.EsBlog;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

/**
 * Es资源库接口
 */
public interface EsBlogRepository extends ElasticsearchRepository<EsBlog,String> {

    Page<EsBlog> findDistinctEsBlogByTitleContainingOrSummaryContainingOrContentContaining(
            String title, String summary, String content, Pageable pageable);
}
