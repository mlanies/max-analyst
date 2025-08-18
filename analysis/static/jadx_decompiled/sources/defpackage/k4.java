package defpackage;

import android.view.accessibility.AccessibilityNodeInfo;

/* loaded from: classes.dex */
public final class k4 {
    public final Object a;

    public k4(AccessibilityNodeInfo.CollectionItemInfo collectionItemInfo) {
        this.a = collectionItemInfo;
    }

    public static k4 a(boolean z, int i, int i2, int i3, int i4) {
        return new k4(AccessibilityNodeInfo.CollectionItemInfo.obtain(i, i2, i3, i4, false, z));
    }
}
