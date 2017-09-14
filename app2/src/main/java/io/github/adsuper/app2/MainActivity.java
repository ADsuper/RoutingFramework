package io.github.adsuper.app2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.Button;

import com.spinytech.macore.MaApplication;
import com.spinytech.macore.router.LocalRouter;
import com.spinytech.macore.router.RouterRequest;
import com.spinytech.macore.router.RouterResponse;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.btn)
    Button mBtn;
    private RouterResponse mResponse;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.btn)
    public void oniewClicked() {

//        startActivity(new Intent(MainActivity.this, Module_c_ACtivity.class));

        try {
            mResponse = LocalRouter.getInstance(MaApplication.getMaApplication())
                    .route(MainActivity.this, RouterRequest.obtain(MainActivity.this)
                            .provider("MyProvicer")
                            .action("MycAction")
                            .data("name", "a")
                            .data("age", "a")
                    );
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            Log.i("MainActivity",mResponse.get());
        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
