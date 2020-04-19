package com.liwq.ndk_signature;

import android.content.Context;

/**
 * Created by： liwq.
 * Created Time: 2020/4/19
 * Description：native层加密的套路
 */
public class SignatureUtils {


    // Used to load the 'native-lib' library on application startup.
    static {
        System.loadLibrary("native-lib");
    }

    /**
     * native 方法签名参数  方法是不能被混淆的, hook 到你调用的方法，自己写个项目
     * @return
     */
    public static native String signatureParams(String params);

    /**
     * 校验签名 ，只允许自己 App 可以使用这个 so
     * @param context
     * @return
     */
    public static native void signatureVerify(Context context);
}
