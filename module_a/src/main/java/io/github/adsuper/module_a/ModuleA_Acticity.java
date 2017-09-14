package io.github.adsuper.module_a;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.alibaba.android.arouter.launcher.ARouter;

//import com.chenenyu.router.Router;

public class ModuleA_Acticity extends AppCompatActivity {

    private Button mBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_module_a__acticity);

        mBtn = (Button) findViewById(R.id.button);
        mBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ARouter.getInstance().build("/module_b/main")
                        .withString("key","传递的数据")
                        .navigation();

//                Router.build("moduleb").with("key","传递的数据").go(ModuleA_Acticity.this);

            }
        });
    }
}
