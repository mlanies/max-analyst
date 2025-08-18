package defpackage;

import android.os.Looper;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class gh7 {
    public AtomicReference a = new AtomicReference(null);
    public final boolean b = true;
    public xb5 c = new xb5();
    public fg7 d;
    public final WeakReference e;
    public int f;
    public boolean g;
    public boolean h;
    public final ArrayList i;
    public final q0e j;

    public gh7(eh7 eh7Var) {
        fg7 fg7Var = fg7.b;
        this.d = fg7Var;
        this.i = new ArrayList();
        this.e = new WeakReference(eh7Var);
        this.j = r0e.a(fg7Var);
    }

    public final void a(ah7 ah7Var) {
        ug7 bc4Var;
        eh7 eh7Var;
        ArrayList arrayList = this.i;
        int i = 2;
        c("addObserver");
        fg7 fg7Var = this.d;
        fg7 fg7Var2 = fg7.a;
        if (fg7Var != fg7Var2) {
            fg7Var2 = fg7.b;
        }
        fh7 fh7Var = new fh7();
        HashMap map = ih7.a;
        boolean z = ah7Var instanceof ug7;
        boolean z2 = ah7Var instanceof zb4;
        Object obj = null;
        if (z && z2) {
            bc4Var = new bc4((zb4) ah7Var, i, (ug7) ah7Var);
        } else if (z2) {
            bc4Var = new bc4((zb4) ah7Var, i, obj);
        } else if (z) {
            bc4Var = (ug7) ah7Var;
        } else {
            Class<?> cls = ah7Var.getClass();
            if (ih7.b(cls) == 2) {
                List list = (List) ih7.b.get(cls);
                if (list.size() == 1) {
                    ih7.a((Constructor) list.get(0), ah7Var);
                    throw null;
                }
                int size = list.size();
                fa6[] fa6VarArr = new fa6[size];
                if (size > 0) {
                    ih7.a((Constructor) list.get(0), ah7Var);
                    throw null;
                }
                bc4Var = new fdc(i, fa6VarArr);
            } else {
                bc4Var = new bc4(ah7Var);
            }
        }
        fh7Var.b = bc4Var;
        fh7Var.a = fg7Var2;
        if (((fh7) this.c.b(ah7Var, fh7Var)) == null && (eh7Var = (eh7) this.e.get()) != null) {
            i = (this.f != 0 || this.g) ? 1 : 0;
            fg7 fg7VarB = b(ah7Var);
            this.f++;
            while (fh7Var.a.compareTo(fg7VarB) < 0 && this.c.X.containsKey(ah7Var)) {
                arrayList.add(fh7Var.a);
                cg7 cg7Var = eg7.Companion;
                fg7 fg7Var3 = fh7Var.a;
                cg7Var.getClass();
                int iOrdinal = fg7Var3.ordinal();
                eg7 eg7Var = iOrdinal != 1 ? iOrdinal != 2 ? iOrdinal != 3 ? null : eg7.ON_RESUME : eg7.ON_START : eg7.ON_CREATE;
                if (eg7Var == null) {
                    throw new IllegalStateException("no event up from " + fh7Var.a);
                }
                fh7Var.a(eh7Var, eg7Var);
                arrayList.remove(arrayList.size() - 1);
                fg7VarB = b(ah7Var);
            }
            if (i == 0) {
                g();
            }
            this.f--;
        }
    }

    public final fg7 b(ah7 ah7Var) {
        fh7 fh7Var;
        HashMap map = this.c.X;
        oqc oqcVar = map.containsKey(ah7Var) ? ((oqc) map.get(ah7Var)).o : null;
        fg7 fg7Var = (oqcVar == null || (fh7Var = (fh7) oqcVar.b) == null) ? null : fh7Var.a;
        ArrayList arrayList = this.i;
        fg7 fg7Var2 = arrayList.isEmpty() ^ true ? (fg7) wg0.f(arrayList, 1) : null;
        fg7 fg7Var3 = this.d;
        if (fg7Var == null || fg7Var.compareTo(fg7Var3) >= 0) {
            fg7Var = fg7Var3;
        }
        return (fg7Var2 == null || fg7Var2.compareTo(fg7Var) >= 0) ? fg7Var : fg7Var2;
    }

    public final void c(String str) {
        if (this.b) {
            ds.g0().d.getClass();
            if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
                throw new IllegalStateException(zr6.i("Method ", str, " must be called on the main thread").toString());
            }
        }
    }

    public final void d(eg7 eg7Var) {
        c("handleLifecycleEvent");
        e(eg7Var.a());
    }

    public final void e(fg7 fg7Var) {
        fg7 fg7Var2 = this.d;
        if (fg7Var2 == fg7Var) {
            return;
        }
        fg7 fg7Var3 = fg7.b;
        fg7 fg7Var4 = fg7.a;
        if (fg7Var2 == fg7Var3 && fg7Var == fg7Var4) {
            throw new IllegalStateException(("State must be at least CREATED to move to " + fg7Var + ", but was " + this.d + " in component " + this.e.get()).toString());
        }
        this.d = fg7Var;
        if (this.g || this.f != 0) {
            this.h = true;
            return;
        }
        this.g = true;
        g();
        this.g = false;
        if (this.d == fg7Var4) {
            this.c = new xb5();
        }
    }

    public final void f(ah7 ah7Var) {
        c("removeObserver");
        this.c.c(ah7Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0028, code lost:
    
        r11.h = false;
        r11.j.setValue(r11.d);
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0031, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void g() {
        /*
            Method dump skipped, instructions count: 383
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gh7.g():void");
    }
}
