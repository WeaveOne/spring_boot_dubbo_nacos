package cn.willvi.dubbo.service.impl;

import cn.willvi.dubbo.service.TestService;
import com.alibaba.dubbo.config.annotation.Service;
import org.springframework.stereotype.Component;

/**
 * @ClassName : TestServiceImpl
 * @Description : TODO
 * @Author : WillVi
 * @Date : 2019/2/15 10:08
 * @Version : 1.0
 */
@Service(interfaceClass = TestService.class)
@Component
public class TestServiceImpl implements TestService {
    @Override
    public String hello(String name) {
        return "hello "+ name;
    }

    @Override
    public String go() {
        return "go";
    }
}
