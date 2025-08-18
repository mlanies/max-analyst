package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes2.dex */
public final class w5f {
    public static final /* synthetic */ bc7[] j;
    public final j0e a;
    public final j0e b;
    public final sx3 c;
    public final kke d;
    public volatile boolean g;
    public final String e = w5f.class.getName();
    public final s35 f = new s35(1);
    public final AtomicBoolean h = new AtomicBoolean(false);
    public final w4d i = mqd.D();

    static {
        oi9 oi9Var = new oi9(w5f.class, "invalidateMarkerJob", "getInvalidateMarkerJob()Lkotlinx/coroutines/Job;");
        nec.a.getClass();
        j = new bc7[]{oi9Var};
    }

    public w5f(j0e j0eVar, j0e j0eVar2, sx3 sx3Var, kke kkeVar) {
        this.a = j0eVar;
        this.b = j0eVar2;
        this.c = sx3Var;
        this.d = kkeVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x008a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.e52 r12, defpackage.l29 r13, kotlin.coroutines.Continuation r14) {
        /*
            r11 = this;
            boolean r0 = r11.g
            e5f r1 = defpackage.e5f.a
            if (r0 != 0) goto Lce
            long r2 = defpackage.fm9.B(r12)
            int r0 = r13.f(r2)
            r4 = 1
            if (r0 >= 0) goto L16
            int r0 = java.lang.Math.abs(r0)
            int r0 = r0 - r4
        L16:
            java.util.List r5 = r13.a
            java.lang.Object r5 = defpackage.x53.j0(r0, r5)
            one.me.messages.list.loader.MessageModel r5 = (one.me.messages.list.loader.MessageModel) r5
            r6 = 0
            if (r5 == 0) goto L29
            long r7 = r5.c
            int r7 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r7 != 0) goto L29
            r7 = r4
            goto L2a
        L29:
            r7 = r6
        L2a:
            r8 = 0
            if (r0 != 0) goto L33
            boolean r9 = r13.c
            if (r9 == 0) goto L33
            if (r7 == 0) goto L35
        L33:
            if (r5 != 0) goto L6c
        L35:
            r11.g = r6
            java.lang.String r11 = r11.e
            ir6 r12 = defpackage.hm9.m
            if (r12 != 0) goto L3f
            goto Lce
        L3f:
            boolean r13 = r12.c()
            if (r13 == 0) goto Lce
            us7 r13 = defpackage.us7.X
            if (r5 == 0) goto L4e
            java.lang.String r14 = r5.m()
            goto L4f
        L4e:
            r14 = r8
        L4f:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r4 = "Can't find unreadMarker by chatReadMark:"
            r0.<init>(r4)
            r0.append(r2)
            java.lang.String r2 = ", isExact:"
            r0.append(r2)
            r0.append(r7)
            java.lang.String r2 = ", firstUnread:"
            java.lang.String r14 = defpackage.zr6.l(r0, r2, r14)
            r12.d(r13, r11, r14, r8)
            goto Lce
        L6c:
            long r5 = r5.c
            int r5 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r5 >= 0) goto L73
            goto L9b
        L73:
            if (r7 == 0) goto L97
            java.util.List r12 = r13.a
            int r0 = r0 + r4
            java.lang.Object r12 = defpackage.x53.j0(r0, r12)
            one.me.messages.list.loader.MessageModel r12 = (one.me.messages.list.loader.MessageModel) r12
            r5 = 1
            r9 = 0
            if (r12 == 0) goto L91
            long r2 = r12.b
            int r13 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1))
            if (r13 != 0) goto L8c
        L8a:
            r2 = r9
            goto L9b
        L8c:
            long r12 = r12.c
            long r12 = r12 - r5
            r2 = r12
            goto L9b
        L91:
            boolean r12 = r13.b
            if (r12 == 0) goto L8a
            long r2 = r2 + r5
            goto L9b
        L97:
            long r2 = defpackage.fm9.B(r12)
        L9b:
            java.lang.String r12 = r11.e
            ir6 r13 = defpackage.hm9.m
            if (r13 != 0) goto La2
            goto Lb3
        La2:
            boolean r0 = r13.c()
            if (r0 == 0) goto Lb3
            us7 r0 = defpackage.us7.X
            java.lang.String r5 = "Found unreadMarker, mark:"
            java.lang.String r5 = defpackage.ey8.h(r2, r5)
            r13.d(r0, r12, r5, r8)
        Lb3:
            r11.g = r4
            s35 r11 = r11.f
            r11.getClass()
            s5f r12 = new s5f
            r12.<init>(r2)
            si9 r11 = r11.b
            java.lang.Object r11 = r11.a(r12, r14)
            tx3 r12 = defpackage.tx3.a
            if (r11 != r12) goto Lca
            goto Lcb
        Lca:
            r11 = r1
        Lcb:
            if (r11 != r12) goto Lce
            return r11
        Lce:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.w5f.a(e52, l29, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void b(boolean z, k56 k56Var) {
        e52 e52Var = (e52) this.a.getValue();
        if (e52Var == null) {
            return;
        }
        AtomicBoolean atomicBoolean = this.h;
        if (z) {
            atomicBoolean.getAndSet(true);
            return;
        }
        if (!(e52Var.b.m > 0)) {
            atomicBoolean.getAndSet(false);
        } else if (atomicBoolean.getAndSet(false)) {
            this.i.o1(this, j[0], j47.S(this.c, ((w9a) this.d).a(), vx3.b, new v5f(this, e52Var, k56Var, null)));
        }
    }
}
