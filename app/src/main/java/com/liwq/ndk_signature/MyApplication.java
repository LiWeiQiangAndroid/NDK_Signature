package com.liwq.ndk_signature;

import android.app.Application;

/**
 * Created by： liwq.
 * Created Time: 2020/4/19
 * Description：
 */
public class MyApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        //验证签名
        SignatureUtils.signatureVerify(this);
    }
}
