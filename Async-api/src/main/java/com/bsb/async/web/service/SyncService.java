package com.bsb.async.web.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

/**
 * @author : zengshuaizhi
 * @date : 2020-03-10 10:22
 */
@Service
public class SyncService implements ISyncService {


    private static final Logger log = LoggerFactory.getLogger(SyncService.class);

    @Override
    @Async("asyncServiceExecutor")
    public void execute() {
        log.info("异步线程正在执行任务");

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        log.info("异步线程任务执行完成");
    }
}
