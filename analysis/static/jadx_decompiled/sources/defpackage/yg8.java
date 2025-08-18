package defpackage;

import android.os.Handler;
import android.os.Message;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class yg8 extends Handler {
    public final ArrayList a = new ArrayList();
    public final ArrayList b = new ArrayList();
    public final /* synthetic */ ah8 c;

    public yg8(ah8 ah8Var) {
        this.c = ah8Var;
    }

    public static void a(xg8 xg8Var, int i, Object obj) {
        eh8 eh8Var = xg8Var.a;
        int i2 = 65280 & i;
        lz7 lz7Var = xg8Var.b;
        if (i2 != 256) {
            if (i2 != 512) {
                if (i2 == 768 && i == 769) {
                    au1.r(obj);
                    lz7Var.B();
                    return;
                }
                return;
            }
            switch (i) {
                case 513:
                    lz7Var.s();
                    break;
                case 514:
                    lz7Var.u();
                    break;
                case 515:
                    lz7Var.t();
                    break;
            }
        }
        dh8 dh8Var = (i == 264 || i == 262) ? (dh8) ((mpa) obj).b : (dh8) obj;
        if (i == 264 || i == 262) {
        }
        if (dh8Var != null) {
            if ((xg8Var.d & 2) == 0 && !dh8Var.h(xg8Var.c)) {
                eh8.c();
                return;
            }
            switch (i) {
                case 257:
                    lz7Var.v();
                    break;
                case 258:
                    lz7Var.x();
                    break;
                case 259:
                    lz7Var.w(dh8Var);
                    break;
                case 260:
                    lz7Var.A(dh8Var);
                    break;
                case 261:
                    lz7Var.getClass();
                    break;
                case 262:
                    lz7Var.y(dh8Var);
                    break;
                case 263:
                    lz7Var.z();
                    break;
                case 264:
                    lz7Var.y(dh8Var);
                    break;
            }
        }
    }

    public final void b(int i, Object obj) {
        obtainMessage(i, obj).sendToTarget();
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int iL;
        ArrayList arrayList = this.a;
        int i = message.what;
        Object obj = message.obj;
        ah8 ah8Var = this.c;
        if (i == 259 && ah8Var.f().c.equals(((dh8) obj).c)) {
            ah8Var.n(true);
        }
        ArrayList arrayList2 = this.b;
        if (i == 262) {
            dh8 dh8Var = (dh8) ((mpa) obj).b;
            ah8Var.c.r(dh8Var);
            if (ah8Var.p != null && dh8Var.d()) {
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    ah8Var.c.q((dh8) it.next());
                }
                arrayList2.clear();
            }
        } else if (i != 264) {
            switch (i) {
                case 257:
                    ah8Var.c.p((dh8) obj);
                    break;
                case 258:
                    ah8Var.c.q((dh8) obj);
                    break;
                case 259:
                    jie jieVar = ah8Var.c;
                    dh8 dh8Var2 = (dh8) obj;
                    jieVar.getClass();
                    if (dh8Var2.c() != jieVar && (iL = jieVar.l(dh8Var2)) >= 0) {
                        jieVar.w((mie) jieVar.C0.get(iL));
                        break;
                    }
                    break;
            }
        } else {
            dh8 dh8Var3 = (dh8) ((mpa) obj).b;
            arrayList2.add(dh8Var3);
            ah8Var.c.p(dh8Var3);
            ah8Var.c.r(dh8Var3);
        }
        try {
            int size = ah8Var.f.size();
            while (true) {
                size--;
                if (size < 0) {
                    int size2 = arrayList.size();
                    for (int i2 = 0; i2 < size2; i2++) {
                        a((xg8) arrayList.get(i2), i, obj);
                    }
                    arrayList.clear();
                    return;
                }
                ArrayList arrayList3 = ah8Var.f;
                eh8 eh8Var = (eh8) ((WeakReference) arrayList3.get(size)).get();
                if (eh8Var == null) {
                    arrayList3.remove(size);
                } else {
                    arrayList.addAll(eh8Var.b);
                }
            }
        } catch (Throwable th) {
            arrayList.clear();
            throw th;
        }
    }
}
