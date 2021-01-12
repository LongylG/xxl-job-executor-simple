package xxl.job.executor.simple.handler;

import com.xxl.job.core.biz.model.ReturnT;
import com.xxl.job.core.handler.annotation.XxlJob;
import org.springframework.stereotype.Component;


/**
 * @author liyulong
 * @date 2021-01-11 7:59 下午
 */
@Component
public class SimpleJob {

    @XxlJob("hello")
    public ReturnT<String> hello(String s) {
        System.out.println(s);
        return ReturnT.SUCCESS;
    }

    @XxlJob("list")
    public ReturnT<String> list(String s) {
        String[] ss = s.split(",");
        for (String s1 : ss) {
            System.out.println(s1);
        }
        return ReturnT.SUCCESS;
    }

    @XxlJob(value = "test", init = "init", destroy = "destroy")
    public ReturnT<String> test(String param) {
        return ReturnT.SUCCESS;
    }

    private void init() {
        System.out.println("init...");
    }

    private void destroy() {
        System.out.println("destroy...");
    }

}
