package io.github.adsuper.module_c;

import com.spinytech.macore.multiprocess.BaseApplicationLogic;
import com.spinytech.macore.router.LocalRouter;

/**
 * 作者：luoshen/rsf411613593@gmail.com
 * 时间：2017年09月14日
 * 说明：
 */

public class MyLogic extends BaseApplicationLogic {


    @Override
    public void onCreate() {

        LocalRouter.getInstance(mApplication).registerProvider("MyProvicer",new MyProvicer());

    }

    @Override
    public void onTerminate() {
        super.onTerminate();
    }
}
