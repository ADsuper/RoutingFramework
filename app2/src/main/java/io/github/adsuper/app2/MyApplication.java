package io.github.adsuper.app2;

import com.spinytech.macore.MaApplication;
import com.spinytech.macore.router.WideRouter;

import io.github.adsuper.module_c.MyLogic;
import io.github.adsuper.module_c.MyService;

/**
 * 作者：luoshen/rsf411613593@gmail.com
 * 时间：2017年09月14日
 * 说明：
 */

public class MyApplication extends MaApplication {

    // 注册多个进程的本地路由器，
    @Override
    public void initializeAllProcessRouter() {

        WideRouter.registerLocalRouter("io.github.adsuper.app2:music",MyService.class);

    }
    // 注册Application逻辑
    @Override
    protected void initializeLogic() {

        registerApplicationLogic("io.github.adsuper.app2",999,MyLogic.class);

    }
    // 标记该App是否是多进程的，如果是多进程则返回true，否则返回false
    @Override
    public boolean needMultipleProcess() {
        return true;
    }
}
