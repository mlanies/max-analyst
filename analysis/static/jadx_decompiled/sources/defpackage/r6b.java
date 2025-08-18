package defpackage;

import com.facebook.imagepipeline.image.CloseableStaticBitmap;
import java.util.Map;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class r6b extends rg4 {
    public final hab c;
    public final eab d;
    public final q6b e;
    public boolean f;
    public o43 g;
    public int h;
    public boolean i;
    public boolean j;
    public final /* synthetic */ un9 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r6b(un9 un9Var, fi0 fi0Var, hab habVar, q6b q6bVar, eab eabVar) {
        super(fi0Var);
        this.k = un9Var;
        this.g = null;
        this.h = 0;
        this.i = false;
        this.j = false;
        this.c = habVar;
        this.e = q6bVar;
        this.d = eabVar;
        ((oj0) eabVar).a(new wk4(1, this));
    }

    public static void m(r6b r6bVar, o43 o43Var, int i) throws Throwable {
        q6b q6bVar = r6bVar.e;
        if (!o43.n0(o43Var)) {
            throw new IllegalArgumentException();
        }
        if (!(((l43) o43Var.e0()) instanceof CloseableStaticBitmap)) {
            r6bVar.o(i, o43Var);
            return;
        }
        hab habVar = r6bVar.c;
        eab eabVar = r6bVar.d;
        habVar.j(eabVar, "PostprocessorProducer");
        v84 v84Var = null;
        Map mapA = null;
        try {
            try {
                v84 v84VarP = r6bVar.p((l43) o43Var.e0());
                try {
                    if (habVar.i(eabVar, "PostprocessorProducer")) {
                        mapA = dx6.a("Postprocessor", q6bVar.getName());
                    }
                    habVar.a(eabVar, "PostprocessorProducer", mapA);
                    r6bVar.o(i, v84VarP);
                    o43.S(v84VarP);
                } catch (Throwable th) {
                    th = th;
                    v84Var = v84VarP;
                    o43.S(v84Var);
                    throw th;
                }
            } catch (Exception e) {
                habVar.d(eabVar, "PostprocessorProducer", e, !habVar.i(eabVar, "PostprocessorProducer") ? null : dx6.a("Postprocessor", q6bVar.getName()));
                if (r6bVar.n()) {
                    r6bVar.b.e(e);
                }
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    @Override // defpackage.rg4, defpackage.fi0
    public final void d() {
        if (n()) {
            this.b.c();
        }
    }

    @Override // defpackage.rg4, defpackage.fi0
    public final void f(Throwable th) {
        if (n()) {
            this.b.e(th);
        }
    }

    @Override // defpackage.fi0
    public final void h(int i, Object obj) {
        o43 o43Var = (o43) obj;
        if (!o43.n0(o43Var)) {
            if (fi0.a(i)) {
                o(i, null);
                return;
            }
            return;
        }
        synchronized (this) {
            try {
                if (!this.f) {
                    o43 o43Var2 = this.g;
                    this.g = o43.o(o43Var);
                    this.h = i;
                    this.i = true;
                    boolean zQ = q();
                    o43.S(o43Var2);
                    if (zQ) {
                        ((Executor) this.k.d).execute(new q57(18, this));
                    }
                }
            } finally {
            }
        }
    }

    public final boolean n() {
        synchronized (this) {
            try {
                if (this.f) {
                    return false;
                }
                o43 o43Var = this.g;
                this.g = null;
                this.f = true;
                o43.S(o43Var);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0010  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void o(int r3, defpackage.o43 r4) {
        /*
            r2 = this;
            boolean r0 = defpackage.fi0.a(r3)
            if (r0 != 0) goto L10
            monitor-enter(r2)
            boolean r1 = r2.f     // Catch: java.lang.Throwable -> Ld
            monitor-exit(r2)
            if (r1 == 0) goto L18
            goto L10
        Ld:
            r3 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> Ld
            throw r3
        L10:
            if (r0 == 0) goto L1d
            boolean r0 = r2.n()
            if (r0 == 0) goto L1d
        L18:
            fi0 r2 = r2.b
            r2.g(r3, r4)
        L1d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.r6b.o(int, o43):void");
    }

    public final v84 p(l43 l43Var) {
        CloseableStaticBitmap closeableStaticBitmap = (CloseableStaticBitmap) l43Var;
        o43 o43VarA = this.e.a(closeableStaticBitmap.getUnderlyingBitmap(), (s2b) this.k.c);
        try {
            CloseableStaticBitmap closeableStaticBitmapOf = CloseableStaticBitmap.of(o43VarA, l43Var.getQualityInfo(), closeableStaticBitmap.getRotationAngle(), closeableStaticBitmap.getExifOrientation());
            closeableStaticBitmapOf.putExtras(closeableStaticBitmap.getExtras());
            return o43.o0(closeableStaticBitmapOf);
        } finally {
            o43.S(o43VarA);
        }
    }

    public final synchronized boolean q() {
        if (this.f || !this.i || this.j || !o43.n0(this.g)) {
            return false;
        }
        this.j = true;
        return true;
    }
}
