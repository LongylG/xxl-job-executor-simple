package xxl.job.executor.simple.jobHandler;

import com.xxl.job.core.handler.annotation.XxlJob;
import org.springframework.stereotype.Component;

import java.util.concurrent.TimeUnit;

/**
 * @author liyulong
 * @date 2021-01-11 7:59 下午
 */
@Component
public class SimpleJob {

    @XxlJob("demoJobHandler")
    public void demoJobHandler() throws Exception {

        for (int i = 0; i < 5; i++) {
            TimeUnit.SECONDS.sleep(2);
        }
    }
}
