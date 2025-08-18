package defpackage;

import android.os.Handler;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class bie implements di6 {
    public static final ArrayList b = new ArrayList(50);
    public final Handler a;

    public bie(Handler handler) {
        this.a = handler;
    }

    public static zhe c() {
        zhe zheVar;
        ArrayList arrayList = b;
        synchronized (arrayList) {
            try {
                zheVar = arrayList.isEmpty() ? new zhe() : (zhe) arrayList.remove(arrayList.size() - 1);
            } catch (Throwable th) {
                throw th;
            }
        }
        return zheVar;
    }

    public final zhe a(int i, Object obj) {
        zhe zheVarC = c();
        zheVarC.a = this.a.obtainMessage(i, obj);
        return zheVarC;
    }

    public final zhe b(Object obj, int i, int i2, int i3) {
        zhe zheVarC = c();
        zheVarC.a = this.a.obtainMessage(i, i2, i3, obj);
        return zheVarC;
    }

    public final boolean d(Runnable runnable) {
        return this.a.post(runnable);
    }

    public final void e(int i) {
        fm9.f(i != 0);
        this.a.removeMessages(i);
    }

    public final boolean f(int i) {
        return this.a.sendEmptyMessage(i);
    }

    public final boolean g() {
        return this.a.sendEmptyMessageDelayed(3, 10);
    }
}
