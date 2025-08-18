package defpackage;

import android.os.Handler;
import android.os.Looper;

/* loaded from: classes2.dex */
public final class tif implements uif {
    public final uif a;
    public final Handler b;

    public tif(ejf ejfVar) {
        this.a = ejfVar;
        Looper looperMyLooper = Looper.myLooper();
        this.b = new Handler(looperMyLooper == null ? Looper.getMainLooper() : looperMyLooper);
    }

    @Override // defpackage.uif
    public final void c() {
        this.b.post(new ule(13, this.a));
    }

    public final boolean equals(Object obj) {
        return this.a.equals(obj);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
