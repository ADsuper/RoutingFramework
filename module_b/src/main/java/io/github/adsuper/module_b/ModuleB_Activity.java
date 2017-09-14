package io.github.adsuper.module_b;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.alibaba.android.arouter.facade.annotation.Route;

//import com.chenenyu.router.annotation.Route;

//@Route("moduleb")
@Route(path = "/module_b/main")
public class ModuleB_Activity extends AppCompatActivity {

    private static final String TAG = "moduleb";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_module_b_);
        String key = getIntent().getStringExtra("key");
        Log.i(TAG, "onCreate: "+ key);
    }
}
