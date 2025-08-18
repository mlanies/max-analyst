package defpackage;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.SparseArray;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class k84 implements Runnable {
    public final Object X;
    public final /* synthetic */ Object Y;
    public final /* synthetic */ int a = 1;
    public final int b;
    public final int c;
    public final Object o;

    public k84(l84 l84Var, vf vfVar, wn0 wn0Var, int i, int i2) {
        this.Y = l84Var;
        this.o = vfVar;
        this.X = wn0Var;
        this.b = i;
        this.c = i2;
    }

    public boolean a(int i, int i2) {
        o43 o43VarE;
        l84 l84Var = (l84) this.Y;
        int i3 = 2;
        vf vfVar = (vf) this.o;
        try {
            if (i2 == 1) {
                wn0 wn0Var = (wn0) this.X;
                vfVar.a0();
                vfVar.V();
                o43VarE = wn0Var.e();
            } else {
                if (i2 != 2) {
                    return false;
                }
                try {
                    o43VarE = ((s2b) l84Var.a).c(vfVar.a0(), vfVar.V(), (Bitmap.Config) l84Var.c);
                    i3 = -1;
                } catch (RuntimeException e) {
                    l84Var.getClass();
                    ta5.i(l84.class, "Failed to create frame bitmap", e);
                    return false;
                }
            }
            boolean zB = b(i, o43VarE, i2);
            o43.S(o43VarE);
            return (zB || i3 == -1) ? zB : a(i, i3);
        } catch (Throwable th) {
            o43.S(null);
            throw th;
        }
    }

    public boolean b(int i, o43 o43Var, int i2) {
        if (!o43.n0(o43Var) || o43Var == null || !((te) ((l84) this.Y).b).d((Bitmap) o43Var.e0(), i)) {
            return false;
        }
        ((l84) this.Y).getClass();
        ta5.d(l84.class, Integer.valueOf(i), "Frame %d ready.");
        synchronized (((SparseArray) ((l84) this.Y).e)) {
            ((wn0) this.X).d(i, o43Var);
        }
        return true;
    }

    @Override // java.lang.Runnable
    public final void run() throws RemoteException {
        SparseArray sparseArray;
        s68 s68Var;
        switch (this.a) {
            case 0:
                try {
                    if (((wn0) this.X).a(this.b)) {
                        ((l84) this.Y).getClass();
                        ta5.d(l84.class, Integer.valueOf(this.b), "Frame %d is cached already.");
                        l84 l84Var = (l84) this.Y;
                        sparseArray = (SparseArray) l84Var.e;
                        synchronized (sparseArray) {
                            ((SparseArray) l84Var.e).remove(this.c);
                        }
                    } else {
                        if (a(this.b, 1)) {
                            ((l84) this.Y).getClass();
                            ta5.d(l84.class, Integer.valueOf(this.b), "Prepared frame %d.");
                        } else {
                            ((l84) this.Y).getClass();
                            ta5.b(l84.class, "Could not prepare frame %d.", Integer.valueOf(this.b));
                        }
                        l84 l84Var2 = (l84) this.Y;
                        sparseArray = (SparseArray) l84Var2.e;
                        synchronized (sparseArray) {
                            ((SparseArray) l84Var2.e).remove(this.c);
                        }
                    }
                    return;
                } catch (Throwable th) {
                    l84 l84Var3 = (l84) this.Y;
                    synchronized (((SparseArray) l84Var3.e)) {
                        ((SparseArray) l84Var3.e).remove(this.c);
                        throw th;
                    }
                }
            default:
                b78 b78Var = (b78) this.o;
                IBinder binder = ((c78) b78Var).a.getBinder();
                gaa gaaVar = (gaa) this.Y;
                ((cj8) gaaVar.a).X.remove(binder);
                cj8 cj8Var = (cj8) gaaVar.a;
                Iterator it = cj8Var.o.iterator();
                while (true) {
                    s68Var = null;
                    if (it.hasNext()) {
                        s68 s68Var2 = (s68) it.next();
                        if (s68Var2.c == this.b) {
                            if (TextUtils.isEmpty((String) this.X) || this.c <= 0) {
                                s68Var = new s68((cj8) gaaVar.a, s68Var2.a, s68Var2.b, s68Var2.c, (c78) b78Var);
                            }
                            it.remove();
                        }
                    }
                }
                if (s68Var == null) {
                    s68Var = new s68((cj8) gaaVar.a, (String) this.X, this.c, this.b, (c78) b78Var);
                }
                cj8Var.X.put(binder, s68Var);
                try {
                    binder.linkToDeath(s68Var, 0);
                    return;
                } catch (RemoteException unused) {
                    return;
                }
        }
    }

    public k84(int i, int i2, c78 c78Var, gaa gaaVar, Bundle bundle, String str) {
        this.Y = gaaVar;
        this.o = c78Var;
        this.b = i;
        this.X = str;
        this.c = i2;
    }
}
