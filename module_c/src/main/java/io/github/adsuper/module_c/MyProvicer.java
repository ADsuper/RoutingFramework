package io.github.adsuper.module_c;

import android.content.Context;
import android.content.Intent;

import com.spinytech.macore.MaAction;
import com.spinytech.macore.MaActionResult;
import com.spinytech.macore.MaProvider;

import java.util.HashMap;

/**
 * 作者：luoshen/rsf411613593@gmail.com
 * 时间：2017年09月14日
 * 说明：
 */

class MyProvicer extends MaProvider {
    @Override
    protected void registerActions() {
        registerAction("MycAction", new MycAction());
    }

    private class MycAction extends MaAction {
        private String mName;
        private String mAge;
        //是否支持异步
        @Override
        public boolean isAsync(Context context, HashMap<String, String> requestData) {
            return true;
        }

        @Override
        public MaActionResult invoke(Context context, HashMap<String, String> requestData) {

            context.startActivity(new Intent(context, Module_c_ACtivity.class));
            //如果是耗时操作的话，需要开线程
            String result2 = "";
            if (requestData != null) {
                mName = requestData.get("name");
                mAge = requestData.get("age");
                result2 = mName + mAge;
            }
            //将处理过的数据返回
            MaActionResult result = new MaActionResult.Builder()
                    .code(MaActionResult.CODE_SUCCESS)
                    .msg("success")
                    .data(result2)
                    .object(null)
                    .build();






            return result;
        }
    }
}
