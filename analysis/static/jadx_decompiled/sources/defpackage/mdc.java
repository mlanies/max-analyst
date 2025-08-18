package defpackage;

import java.util.ArrayList;

/* loaded from: classes.dex */
public abstract class mdc {
    public re6 a;
    public ArrayList b;
    public long c;
    public long d;
    public long e;
    public long f;

    public static void b(dec decVar) {
        int i = decVar.u0;
        if (!decVar.n() && (i & 4) == 0) {
            decVar.g();
        }
    }

    public abstract boolean a(dec decVar, dec decVar2, jt jtVar, jt jtVar2);

    /* JADX WARN: Removed duplicated region for block: B:33:0x0072  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(defpackage.dec r9) {
        /*
            r8 = this;
            re6 r8 = r8.a
            if (r8 == 0) goto La6
            r0 = 1
            r9.v(r0)
            dec r1 = r9.s0
            r2 = 0
            if (r1 == 0) goto L13
            dec r1 = r9.t0
            if (r1 != 0) goto L13
            r9.s0 = r2
        L13:
            r9.t0 = r2
            int r1 = r9.u0
            r1 = r1 & 16
            if (r1 == 0) goto L1d
            goto La6
        L1d:
            java.lang.Object r8 = r8.b
            androidx.recyclerview.widget.RecyclerView r8 = (androidx.recyclerview.widget.RecyclerView) r8
            r8.C0()
            l0f r1 = r8.t0
            java.lang.Object r2 = r1.X
            g03 r2 = (defpackage.g03) r2
            java.lang.Object r3 = r1.o
            sy4 r3 = (defpackage.sy4) r3
            int r4 = r1.b
            r5 = 0
            android.view.View r6 = r9.a
            if (r4 != r0) goto L45
            java.lang.Object r0 = r1.c
            android.view.View r0 = (android.view.View) r0
            if (r0 != r6) goto L3d
        L3b:
            r0 = r5
            goto L70
        L3d:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "Cannot call removeViewIfHidden within removeView(At) for a different view"
            r8.<init>(r9)
            throw r8
        L45:
            r7 = 2
            if (r4 == r7) goto L9e
            r1.b = r7     // Catch: java.lang.Throwable -> L5b
            java.lang.Object r4 = r3.b     // Catch: java.lang.Throwable -> L5b
            androidx.recyclerview.widget.RecyclerView r4 = (androidx.recyclerview.widget.RecyclerView) r4     // Catch: java.lang.Throwable -> L5b
            int r4 = r4.indexOfChild(r6)     // Catch: java.lang.Throwable -> L5b
            r7 = -1
            if (r4 != r7) goto L5d
            r1.X(r6)     // Catch: java.lang.Throwable -> L5b
        L58:
            r1.b = r5
            goto L70
        L5b:
            r8 = move-exception
            goto L9b
        L5d:
            boolean r7 = r2.S(r4)     // Catch: java.lang.Throwable -> L5b
            if (r7 == 0) goto L6d
            r2.Z(r4)     // Catch: java.lang.Throwable -> L5b
            r1.X(r6)     // Catch: java.lang.Throwable -> L5b
            r3.M(r4)     // Catch: java.lang.Throwable -> L5b
            goto L58
        L6d:
            r1.b = r5
            goto L3b
        L70:
            if (r0 == 0) goto L8a
            dec r1 = androidx.recyclerview.widget.RecyclerView.U(r6)
            vdc r2 = r8.c
            r2.k(r1)
            vdc r2 = r8.c
            r2.h(r1)
            boolean r1 = androidx.recyclerview.widget.RecyclerView.M1
            if (r1 == 0) goto L8a
            java.util.Objects.toString(r6)
            r8.toString()
        L8a:
            r1 = r0 ^ 1
            r8.D0(r1)
            if (r0 != 0) goto La6
            boolean r9 = r9.r()
            if (r9 == 0) goto La6
            r8.removeDetachedView(r6, r5)
            goto La6
        L9b:
            r1.b = r5
            throw r8
        L9e:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "Cannot call removeViewIfHidden within removeViewIfHidden"
            r8.<init>(r9)
            throw r8
        La6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mdc.c(dec):void");
    }

    public abstract void d(dec decVar);

    public abstract void e();

    public abstract boolean f();
}
