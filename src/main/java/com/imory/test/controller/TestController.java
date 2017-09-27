package com.imory.test.controller;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>名称</p>
 * <p/>
 * <p>wikiURL</p>
 *
 * @author zb.jiang
 * @version 1.0
 * @Date 2017/9/27
 */
@RestController
@RequestMapping("/test")
public class TestController {

    private static Logger logger = Logger.getLogger(TestController.class);

    @RequestMapping("/index")
    public String index()
    {
        logger.info("打印信息....");
        logger.error("错误信息....");
        logger.debug("debug信息.....");
        return "hello World";
    }
}
