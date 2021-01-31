package qycf.samples.springboot.context.lifecircle;

import org.springframework.context.SmartLifecycle;
import org.springframework.stereotype.Component;

/**
 * 将isAutoStartup设置为true为容器自动调用
 *
 *
 * */
@Component
public class QycfSmartLifeCircle implements SmartLifecycle {
    @Override
    public boolean isAutoStartup() {
        return false;
    }

    @Override
    public void stop(Runnable callback) {

    }

    @Override
    public int getPhase() {
        return 0;
    }

    @Override
    public void start() {

    }

    @Override
    public void stop() {

    }

    @Override
    public boolean isRunning() {
        return false;
    }
}
