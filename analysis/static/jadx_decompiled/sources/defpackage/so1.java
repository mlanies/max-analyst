package defpackage;

import java.util.Set;
import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class so1 {
    public final je7 a;
    public final je7 b;
    public final je7 c;
    public final je7 d;
    public final je7 e;

    public so1(je7 je7Var, je7 je7Var2, je7 je7Var3, je7 je7Var4, je7 je7Var5) {
        this.a = je7Var3;
        this.b = je7Var2;
        this.c = je7Var;
        this.d = je7Var4;
        this.e = je7Var5;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Comparable a(defpackage.so1 r6, kotlin.coroutines.Continuation r7) throws java.lang.Throwable {
        /*
            boolean r0 = r7 instanceof defpackage.qo1
            if (r0 == 0) goto L13
            r0 = r7
            qo1 r0 = (defpackage.qo1) r0
            int r1 = r0.Y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Y = r1
            goto L18
        L13:
            qo1 r0 = new qo1
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.o
            tx3 r1 = defpackage.tx3.a
            int r2 = r0.Y
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.od2.a0(r7)
            goto L51
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L2f:
            defpackage.od2.a0(r7)
            je7 r7 = r6.e
            java.lang.Object r7 = r7.getValue()
            blb r7 = (defpackage.blb) r7
            je7 r6 = r6.a
            java.lang.Object r6 = r6.getValue()
            q33 r6 = (defpackage.q33) r6
            hyc r6 = (defpackage.hyc) r6
            long r4 = r6.t()
            r0.Y = r3
            java.lang.Object r7 = r7.a(r4, r0)
            if (r7 != r1) goto L51
            goto L55
        L51:
            oab r7 = (defpackage.oab) r7
            uj3 r1 = r7.d
        L55:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.so1.a(so1, kotlin.coroutines.Continuation):java.lang.Comparable");
    }

    public final Object b(Set set, Continuation continuation) {
        return j47.t0(((w9a) ((kke) this.c.getValue())).b(), new oo1(set, this, null), continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(long r5, kotlin.coroutines.Continuation r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof defpackage.ro1
            if (r0 == 0) goto L13
            r0 = r7
            ro1 r0 = (defpackage.ro1) r0
            int r1 = r0.Y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Y = r1
            goto L18
        L13:
            ro1 r0 = new ro1
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.o
            tx3 r1 = defpackage.tx3.a
            int r2 = r0.Y
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.od2.a0(r7)
            goto L43
        L27:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2f:
            defpackage.od2.a0(r7)
            je7 r4 = r4.b
            java.lang.Object r4 = r4.getValue()
            ds3 r4 = (defpackage.ds3) r4
            r0.Y = r3
            java.lang.Comparable r7 = r4.b(r5, r0)
            if (r7 != r1) goto L43
            return r1
        L43:
            uj3 r7 = (defpackage.uj3) r7
            if (r7 == 0) goto L4b
            boolean r3 = r7.w()
        L4b:
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r3)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.so1.c(long, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final Object d(Set set, Continuation continuation) {
        boolean zIsEmpty = set.isEmpty();
        e5f e5fVar = e5f.a;
        if (zIsEmpty) {
            return e5fVar;
        }
        xb9 xb9Var = (xb9) this.d.getValue();
        gi9 gi9VarG = oag.G(set);
        int i = ft4.o;
        Object objT = xb9Var.t(gi9VarG, z7.R(30, kt4.SECONDS), continuation);
        return objT == tx3.a ? objT : e5fVar;
    }
}
