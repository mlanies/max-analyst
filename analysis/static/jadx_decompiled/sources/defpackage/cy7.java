package defpackage;

import android.os.Handler;
import android.os.Looper;

/* loaded from: classes2.dex */
public final class cy7 extends av0 {
    public final Handler i = new Handler(Looper.getMainLooper());

    @Override // defpackage.av0
    public final void c(Object obj) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            super.c(obj);
        } else {
            this.i.post(new by7(this, obj, 0));
        }
    }

    @Override // defpackage.av0
    public final void d(Object obj) {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            this.i.post(new by7(this, obj, 1));
        } else {
            try {
                super.d(obj);
            } catch (Exception unused) {
            }
        }
    }

    @Override // defpackage.av0
    public final void f(Object obj) {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            this.i.post(new by7(this, obj, 2));
        } else {
            try {
                super.f(obj);
            } catch (Exception unused) {
            }
        }
    }
}
