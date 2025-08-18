package defpackage;

import android.util.SparseIntArray;

/* loaded from: classes.dex */
public abstract class n84 {
    public static final SparseIntArray a = new SparseIntArray(0);

    public static final n5b a() {
        int iMin = (int) Math.min(Runtime.getRuntime().maxMemory(), 2147483647L);
        return new n5b(0, iMin > 16777216 ? (iMin / 4) * 3 : iMin / 2, a, -1);
    }
}
