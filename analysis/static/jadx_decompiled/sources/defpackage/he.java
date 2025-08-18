package defpackage;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public abstract class he {
    public static final Handler a = new Handler(Looper.getMainLooper());
    public static final float b = 1.0f;

    public static int a(float f) {
        if (f == 0.0f) {
            return 0;
        }
        return (int) Math.ceil(b * f);
    }

    public static boolean b() {
        return Looper.myLooper() == Looper.getMainLooper();
    }

    public static void c(ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        for (int i = 0; i < arrayList.size(); i++) {
            Bitmap bitmap = (Bitmap) arrayList.get(i);
            if (bitmap != null && !bitmap.isRecycled()) {
                arrayList2.add(new WeakReference(bitmap));
            }
        }
        d(new ge(arrayList2, 0));
    }

    public static void d(Runnable runnable) {
        e(runnable, 0L);
    }

    public static void e(Runnable runnable, long j) {
        Handler handler = a;
        if (j == 0) {
            handler.post(runnable);
        } else {
            handler.postDelayed(runnable, j);
        }
    }
}
