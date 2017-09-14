package io.github.adsuper.routingframework;

import android.app.Application;

import com.alibaba.android.arouter.launcher.ARouter;

/**
 * 作者：luoshen/rsf411613593@gmail.com
 * 时间：2017年09月08日
 * 说明：
 */

public class MyApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        ARouter.openLog();     // 打印日志
        ARouter.openDebug();   // 开启调试模式(如果在InstantRun模式下运行，必须开启调试模式！线上版本需要关闭,否则有安全风险)
        ARouter.init(this);


//        Router.initialize(this);
    }
}
