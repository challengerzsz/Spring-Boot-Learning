package com.bsb.async.web.controller;

import com.bsb.async.web.service.ISyncService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : zengshuaizhi
 * @date : 2020-03-10 10:25
 */
@RestController
public class SyncController {

    private static final Logger log = LoggerFactory.getLogger(SyncController.class);

    @Autowired
    private ISyncService syncService;

    @RequestMapping("/")
    public void sync() {
        log.info("controller enter");
        syncService.execute();
        log.info("controller exit");
    }
}
