package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.view.accessibility.AccessibilityNodeInfo;

/* loaded from: classes.dex */
public final class j4 {
    public static j4 b;
    public final Object a;

    public j4() {
        this.a = new Object();
        new Handler(Looper.getMainLooper(), new fud(0, this));
    }

    public static j4 a(int i, int i2, int i3) {
        return new j4(AccessibilityNodeInfo.CollectionInfo.obtain(i, i2, false, i3));
    }

    public j4(AccessibilityNodeInfo.CollectionInfo collectionInfo) {
        this.a = collectionInfo;
    }
}
