package defpackage;

import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public final class tp7 {
    public final je7 a;
    public final je7 b;

    public tp7(je7 je7Var, je7 je7Var2) {
        this.a = je7Var;
        this.b = je7Var2;
    }

    public static q1a a(tp7 tp7Var, long j) {
        tp7Var.getClass();
        return b(tp7Var, j, true, 26);
    }

    public static q1a b(final tp7 tp7Var, final long j, final boolean z, int i) {
        tp7Var.getClass();
        final long j2 = 0;
        final long j3 = 0;
        final long j4 = 0;
        return new q1a(2, new Callable() { // from class: sp7
            /* JADX WARN: Removed duplicated region for block: B:17:0x0059  */
            @Override // java.util.concurrent.Callable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object call() throws java.lang.Throwable {
                /*
                    r9 = this;
                    long r0 = r4
                    r2 = 0
                    int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                    r5 = 0
                    tp7 r6 = r9.a
                    long r7 = r9
                    if (r4 == 0) goto L1a
                    je7 r2 = r6.a
                    java.lang.Object r2 = r2.getValue()
                    au8 r2 = (defpackage.au8) r2
                    cu8 r0 = r2.j(r7, r0)
                    goto L4d
                L1a:
                    long r0 = r7
                    int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                    if (r2 != 0) goto L2f
                    je7 r0 = r6.a
                    java.lang.Object r0 = r0.getValue()
                    au8 r0 = (defpackage.au8) r0
                    long r1 = r2
                    cu8 r0 = r0.q(r1)
                    goto L4d
                L2f:
                    je7 r2 = r6.a
                    java.lang.Object r2 = r2.getValue()
                    au8 r2 = (defpackage.au8) r2
                    c34 r2 = r2.a
                    k24 r2 = (defpackage.k24) r2
                    vlc r2 = r2.c
                    t19 r3 = r2.d()
                    ru8 r0 = r3.h(r7, r0)
                    if (r0 == 0) goto L4c
                    cu8 r0 = r2.b(r0)
                    goto L4d
                L4c:
                    r0 = r5
                L4d:
                    if (r0 == 0) goto L65
                    boolean r9 = r6
                    if (r9 != 0) goto L59
                    vx8 r9 = defpackage.vx8.DELETED
                    vx8 r1 = r0.v0
                    if (r1 == r9) goto L65
                L59:
                    je7 r9 = r6.b
                    java.lang.Object r9 = r9.getValue()
                    zu8 r9 = (defpackage.zu8) r9
                    es8 r5 = defpackage.zu8.a(r9, r0)
                L65:
                    if (r5 == 0) goto L68
                    return r5
                L68:
                    java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                    java.lang.String r0 = "message not found or deleted"
                    r9.<init>(r0)
                    throw r9
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.sp7.call():java.lang.Object");
            }
        });
    }
}
