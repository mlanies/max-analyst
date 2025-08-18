package defpackage;

import android.os.Handler;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class aie {
    public static final ArrayList b = new ArrayList(50);
    public final Handler a;

    public aie(Handler handler) {
        this.a = handler;
    }

    public static yhe b() {
        yhe yheVar;
        ArrayList arrayList = b;
        synchronized (arrayList) {
            try {
                yheVar = arrayList.isEmpty() ? new yhe() : (yhe) arrayList.remove(arrayList.size() - 1);
            } catch (Throwable th) {
                throw th;
            }
        }
        return yheVar;
    }

    public final yhe a(int i, Object obj) {
        yhe yheVarB = b();
        yheVarB.a = this.a.obtainMessage(i, obj);
        return yheVarB;
    }

    public final boolean c(int i) {
        return this.a.sendEmptyMessage(i);
    }
}
