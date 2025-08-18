package defpackage;

import android.content.Context;
import android.os.HandlerThread;
import android.os.Looper;
import android.util.SparseArray;
import androidx.media3.muxer.Muxer$MuxerException;
import androidx.media3.transformer.ExportException;
import java.util.ArrayList;
import java.util.Objects;

/* loaded from: classes.dex */
public final class l1f {
    public final Context a;
    public final dd3 b;
    public final boolean c;
    public final k8g d;
    public final ece e;
    public final di6 f;
    public final she g;
    public final long h;
    public final HandlerThread i;
    public final bie j;
    public final ArrayList k;
    public final Object l;
    public final die m;
    public final ArrayList n;
    public final hj9 o;
    public final ae3 p;
    public final Object q;
    public final Object r;
    public final fm5 s;
    public boolean t;
    public long u;
    public int v;
    public RuntimeException w;
    public int x;
    public int y;
    public volatile boolean z;

    public l1f(Context context, dd3 dd3Var, f1f f1fVar, vt vtVar, yb9 yb9Var, zff zffVar, v43 v43Var, hj9 hj9Var, ece eceVar, x99 x99Var, di6 di6Var, xw0 xw0Var, she sheVar, long j) {
        zw6 zw6Var;
        int i;
        this.a = context;
        this.b = dd3Var;
        this.d = new k8g(v43Var);
        this.e = eceVar;
        this.f = di6Var;
        this.g = sheVar;
        this.h = j;
        this.o = hj9Var;
        Integer.toHexString(System.identityHashCode(this));
        int i2 = oaf.a;
        HandlerThread handlerThread = new HandlerThread("Transformer:Internal");
        this.i = handlerThread;
        handlerThread.start();
        this.k = new ArrayList();
        Looper looper = handlerThread.getLooper();
        this.l = new Object();
        die dieVar = new die();
        dieVar.a = new ArrayList();
        for (int i3 = 0; i3 < dd3Var.a.size(); i3++) {
            ((ArrayList) dieVar.a).add(new i1f());
        }
        dieVar.b = new SparseArray();
        dieVar.c = new SparseArray();
        dieVar.o = new SparseArray();
        this.m = dieVar;
        int i4 = 0;
        while (true) {
            zw6Var = dd3Var.a;
            if (i4 >= zw6Var.size()) {
                break;
            }
            k1f k1fVar = new k1f(this, i4, dd3Var, f1fVar, yb9Var, zffVar, x99Var, xw0Var);
            mv4 mv4Var = (mv4) zw6Var.get(i4);
            this.k.add(new e6d(mv4Var, dd3Var.d, vtVar, new md3(f1fVar.d, dd3Var.h), k1fVar, sheVar, looper));
            if (mv4Var.b) {
                i = 1;
            } else {
                i = 1;
                this.v++;
            }
            i4 += i;
        }
        this.c = this.v != zw6Var.size();
        this.q = new Object();
        this.p = new ae3(1, false);
        this.r = new Object();
        this.s = new fm5(9);
        this.n = new ArrayList();
        this.j = sheVar.a(looper, new hl4(6, this));
    }

    /* JADX WARN: Removed duplicated region for block: B:120:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0050 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x009b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c() {
        /*
            Method dump skipped, instructions count: 577
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.l1f.c():void");
    }

    public final void d(int i, ExportException exportException) {
        int i2 = 2;
        int i3 = 0;
        ww6 ww6Var = new ww6(4);
        for (int i4 = 0; i4 < this.k.size(); i4++) {
            e6d e6dVar = (e6d) this.k.get(i4);
            e6dVar.h();
            ww6Var.e(e6dVar.j.j());
        }
        boolean z = i == 1;
        boolean z2 = this.z;
        ExportException exportExceptionD = null;
        if (!this.z) {
            this.z = true;
            synchronized (this.r) {
                this.x = 0;
                this.y = 0;
            }
            Integer.toHexString(System.identityHashCode(this));
            int i5 = oaf.a;
            nc8.b();
            for (int i6 = 0; i6 < this.n.size(); i6++) {
                try {
                    ((yqc) this.n.get(i6)).o();
                } catch (RuntimeException e) {
                    if (exportExceptionD == null) {
                        exportExceptionD = ExportException.e(e);
                        this.w = e;
                    }
                }
            }
            for (int i7 = 0; i7 < this.k.size(); i7++) {
                try {
                    ((e6d) this.k.get(i7)).release();
                } catch (RuntimeException e2) {
                    if (exportExceptionD == null) {
                        exportExceptionD = ExportException.e(e2);
                        this.w = e2;
                    }
                }
            }
            try {
                hj9 hj9Var = this.o;
                if (i != 0) {
                    if (i == 1) {
                        i3 = 1;
                    } else {
                        if (i != 2) {
                            throw new IllegalStateException(zr6.h(i, "Unexpected end reason "));
                        }
                        i3 = 2;
                    }
                }
                hj9Var.c(i3);
            } catch (Muxer$MuxerException e3) {
                if (exportExceptionD == null) {
                    exportExceptionD = ExportException.d(e3, 7001);
                }
            } catch (RuntimeException e4) {
                if (exportExceptionD == null) {
                    ExportException exportExceptionE = ExportException.e(e4);
                    this.w = e4;
                    exportExceptionD = exportExceptionE;
                }
            }
            bie bieVar = this.j;
            HandlerThread handlerThread = this.i;
            Objects.requireNonNull(handlerThread);
            bieVar.d(new ule(7, handlerThread));
        }
        if (z) {
            this.p.g();
            return;
        }
        if (exportException == null) {
            exportException = exportExceptionD;
        }
        if (exportException != null) {
            if (z2) {
                return;
            }
            fm9.k(((bie) this.f).a.post(new ewc(this, ww6Var, exportException, 8)));
            return;
        }
        if (z2) {
            return;
        }
        fm9.k(((bie) this.f).a.post(new fre(this, i2, ww6Var)));
    }

    public final int e(fm5 fm5Var) {
        int i;
        if (this.z) {
            return 0;
        }
        synchronized (this.r) {
            try {
                i = this.x;
                if (i == 2) {
                    fm5Var.b = this.y;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return i;
    }

    public final void f(yqc yqcVar) {
        this.n.add(yqcVar);
        if (this.t) {
            return;
        }
        this.j.f(3);
        this.t = true;
    }

    public final void g() {
        fm9.j("Internal thread is dead.", this.i.isAlive());
    }
}
