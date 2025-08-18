package defpackage;

import android.net.Uri;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlinx.coroutines.internal.ContextScope;

/* loaded from: classes2.dex */
public final class pb {
    public final je7 a;
    public final je7 b;
    public final je7 c;
    public final je7 d;
    public final je7 e;
    public final ContextScope f;
    public final AtomicBoolean g = new AtomicBoolean(false);
    public final q0e h;
    public final q0e i;
    public final w7c j;
    public final kld k;
    public final v7c l;

    public pb(kke kkeVar, je7 je7Var, je7 je7Var2, je7 je7Var3, je7 je7Var4, je7 je7Var5) {
        this.a = je7Var;
        this.b = je7Var2;
        this.c = je7Var3;
        this.d = je7Var4;
        this.e = je7Var5;
        this.f = j1e.a(((w9a) kkeVar).b());
        nz4 nz4Var = nz4.a;
        this.h = r0e.a(nz4Var);
        q0e q0eVarA = r0e.a(nz4Var);
        this.i = q0eVarA;
        this.j = new w7c(q0eVarA);
        kld kldVarB = lld.b(0, 0, 0, 7);
        this.k = kldVarB;
        this.l = new v7c(kldVarB);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(defpackage.pb r5, kotlin.coroutines.Continuation r6) throws java.lang.Throwable {
        /*
            r5.getClass()
            boolean r0 = r6 instanceof defpackage.nb
            if (r0 == 0) goto L16
            r0 = r6
            nb r0 = (defpackage.nb) r0
            int r1 = r0.s0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.s0 = r1
            goto L1b
        L16:
            nb r0 = new nb
            r0.<init>(r5, r6)
        L1b:
            java.lang.Object r6 = r0.Y
            tx3 r1 = defpackage.tx3.a
            int r2 = r0.s0
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3f
            if (r2 == r4) goto L39
            if (r2 != r3) goto L31
            java.lang.Object r5 = r0.X
            pb r1 = r0.o
            defpackage.od2.a0(r6)
            goto L6c
        L31:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L39:
            pb r5 = r0.o
            defpackage.od2.a0(r6)
            goto L57
        L3f:
            defpackage.od2.a0(r6)
            je7 r6 = r5.a
            java.lang.Object r6 = r6.getValue()
            ds3 r6 = (defpackage.ds3) r6
            r0.o = r5
            r0.s0 = r4
            el3 r6 = r6.a
            java.util.List r6 = r6.k()
            if (r6 != r1) goto L57
            goto L8f
        L57:
            r2 = r6
            java.util.List r2 = (java.util.List) r2
            q0e r4 = r5.h
            r0.o = r5
            r0.X = r6
            r0.s0 = r3
            r4.setValue(r2)
            e5f r2 = defpackage.e5f.a
            if (r2 != r1) goto L6a
            goto L8f
        L6a:
            r1 = r5
            r5 = r6
        L6c:
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            at r6 = new at
            r2 = 2
            r6.<init>(r2, r5)
            k8 r5 = new k8
            r2 = 7
            r5.<init>(r2)
            qk5 r5 = defpackage.l6d.a0(r6, r5)
            lx3 r6 = r0.b
            kotlinx.coroutines.internal.ContextScope r0 = defpackage.j1e.a(r6)
            mb r2 = new mb
            r3 = 0
            r2.<init>(r0, r6, r1, r3)
            r1f r1 = new r1f
            r1.<init>(r5, r2)
        L8f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pb.a(pb, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final ba b(uj3 uj3Var) {
        String string;
        Uri uri;
        String strQ = uj3Var.q(((hyc) ((q33) this.c.getValue())).q(), kk0.c);
        jqe eqeVar = uj3Var.t() ? new eqe(jpc.p) : new iqe(((w7b) this.d.getValue()).b(uj3Var));
        long jN = uj3Var.n();
        String strD = uj3Var.d();
        if (strD == null) {
            throw new IllegalArgumentException("Required value was null.".toString());
        }
        if (strQ == null || (uri = Uri.parse(strQ)) == null || (string = uri.toString()) == null) {
            string = Uri.EMPTY.toString();
        }
        return new ba(jN, strD, eqeVar, string, uj3Var.m(), uj3Var.u());
    }
}
