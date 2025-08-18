package defpackage;

import android.os.Message;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class bh8 {
    public final tg8 a;
    public final int b;
    public final dh8 c;
    public final dh8 d;
    public final dh8 e;
    public final ArrayList f;
    public final WeakReference g;
    public final bm7 h = null;
    public boolean i = false;
    public boolean j = false;

    public bh8(ah8 ah8Var, dh8 dh8Var, tg8 tg8Var, int i, dh8 dh8Var2, ArrayList arrayList) {
        this.g = new WeakReference(ah8Var);
        this.d = dh8Var;
        this.a = tg8Var;
        this.b = i;
        this.c = ah8Var.r;
        this.e = dh8Var2;
        this.f = arrayList != null ? new ArrayList(arrayList) : null;
        ah8Var.m.postDelayed(new nn6(13, this), 15000L);
    }

    public final void a() {
        bm7 bm7Var;
        eh8.b();
        if (this.i || this.j) {
            return;
        }
        WeakReference weakReference = this.g;
        ah8 ah8Var = (ah8) weakReference.get();
        tg8 tg8Var = this.a;
        if (ah8Var == null || ah8Var.z != this || ((bm7Var = this.h) != null && bm7Var.isCancelled())) {
            if (this.i || this.j) {
                return;
            }
            this.j = true;
            if (tg8Var != null) {
                tg8Var.h(0);
                tg8Var.d();
                return;
            }
            return;
        }
        this.i = true;
        ah8Var.z = null;
        ah8 ah8Var2 = (ah8) weakReference.get();
        int i = this.b;
        dh8 dh8Var = this.c;
        if (ah8Var2 != null && ah8Var2.r == dh8Var) {
            Message messageObtainMessage = ah8Var2.m.obtainMessage(263, dh8Var);
            messageObtainMessage.arg1 = i;
            messageObtainMessage.sendToTarget();
            tg8 tg8Var2 = ah8Var2.s;
            if (tg8Var2 != null) {
                tg8Var2.h(i);
                ah8Var2.s.d();
            }
            HashMap map = ah8Var2.v;
            if (!map.isEmpty()) {
                for (tg8 tg8Var3 : map.values()) {
                    tg8Var3.h(i);
                    tg8Var3.d();
                }
                map.clear();
            }
            ah8Var2.s = null;
        }
        ah8 ah8Var3 = (ah8) weakReference.get();
        if (ah8Var3 == null) {
            return;
        }
        dh8 dh8Var2 = this.d;
        ah8Var3.r = dh8Var2;
        ah8Var3.s = tg8Var;
        yg8 yg8Var = ah8Var3.m;
        dh8 dh8Var3 = this.e;
        if (dh8Var3 == null) {
            Message messageObtainMessage2 = yg8Var.obtainMessage(262, new mpa(dh8Var, dh8Var2));
            messageObtainMessage2.arg1 = i;
            messageObtainMessage2.sendToTarget();
        } else {
            Message messageObtainMessage3 = yg8Var.obtainMessage(264, new mpa(dh8Var3, dh8Var2));
            messageObtainMessage3.arg1 = i;
            messageObtainMessage3.sendToTarget();
        }
        ah8Var3.v.clear();
        ah8Var3.g();
        ah8Var3.k();
        ArrayList arrayList = this.f;
        if (arrayList != null) {
            ah8Var3.r.n(arrayList);
        }
    }
}
