package com.my.tracker.obfuscated;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.my.tracker.MyTrackerConfig;
import java.io.OutputStream;

/* loaded from: classes.dex */
public abstract class c0 {

    public interface a {
        String a();

        void a(OutputStream outputStream);
    }

    public static final class b {
        boolean a;
        Object b;
        String c;

        private b() {
        }

        public static b c() {
            return new b();
        }

        public Object a() {
            return this.b;
        }

        public boolean b() {
            return this.a;
        }
    }

    public static boolean a(Context context) {
        NetworkInfo activeNetworkInfo;
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        if (connectivityManager == null || (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) == null) {
            return false;
        }
        return activeNetworkInfo.isConnected();
    }

    public abstract b a(String str);

    public static c0 a(a aVar, MyTrackerConfig.OkHttpClientProvider okHttpClientProvider, boolean z) {
        if (okHttpClientProvider != null) {
            try {
                return new m0(aVar, okHttpClientProvider, z);
            } catch (Throwable th) {
                y0.a("HttpRequest error: error while creating OkHttpPostRequest", th);
            }
        }
        return new b0(aVar, z);
    }
}
