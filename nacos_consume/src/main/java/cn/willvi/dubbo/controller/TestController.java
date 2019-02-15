package cn.willvi.dubbo.controller;

import cn.willvi.dubbo.service.TestService;
import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName : TestController
 * @Description : TODO
 * @Author : WillVi
 * @Date : 2019/2/15 10:26
 * @Version : 1.0
 */
@RestController
public class TestController {
    @Reference
    TestService testService;

    @GetMapping("/hello")
    public String hello(String name){
        String hello = testService.hello(name);
        return hello;
    }
    @GetMapping("/go")
    public String go(String name){
        return testService.go();
    }
}
