package com.lighters.demos;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;
import butterknife.OnClick;
import com.lighters.demos.aidl.LocalClientActivity;
import com.lighters.demos.anim.FirstActivity;
import com.lighters.demos.app.base.BaseActivity;
import com.lighters.demos.jni.JniTestActivity;
import com.lighters.demos.reactnative.ToastRnActivity;
import com.lighters.demos.service.test.TestIntentActivity;
import com.lighters.demos.token.TokenTestActivity;

public class MainActivity extends BaseActivity {

    @Override
    protected int getLayoutId() {
        return R.layout.activity_main;
    }

    @Override
    protected void setView(Bundle savedInstanceState) {

    }

    @Override
    protected void initData() {

    }

    @OnClick(R.id.btn_screen_anim)
    void gotoAnimScreen() {
        startActivity(new Intent(this, FirstActivity.class));
    }

    @OnClick(R.id.btn_jni_test)
    void gotoJniTest() {
        startActivity(new Intent(this, JniTestActivity.class));
    }

    @OnClick(R.id.btn_token_test)
    void gotoTokenTest() {
        startActivity(new Intent(this, TokenTestActivity.class));
    }

    @OnClick(R.id.btn_intent_service_test)
    void gotoIntentServiceTest() {
        startActivity(new Intent(this, TestIntentActivity.class));
    }

    @OnClick(R.id.btn_instant_run_hot_test)
    void testInstantRunHotMode() {
        String abc = "Instant Run Test224";
        Toast.makeText(this, abc, Toast.LENGTH_SHORT).show();
    }

    @OnClick(R.id.btn_rn_test)
    void testReactNativeInvoke() {
        startActivity(new Intent(this, ToastRnActivity.class));
    }

    @OnClick(R.id.btn_aidl_test)
    void testAidl() {
        startActivity(new Intent(this, LocalClientActivity.class));
    }
}
