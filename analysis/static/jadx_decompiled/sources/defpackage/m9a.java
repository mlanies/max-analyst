package defpackage;

import java.util.concurrent.ConcurrentHashMap;
import one.me.messages.list.loader.MessageModel;

/* loaded from: classes2.dex */
public final class m9a {
    public final String a = m9a.class.getName();
    public final je7 b;
    public final je7 c;
    public final je7 d;
    public final je7 e;

    public m9a(khe kheVar, khe kheVar2, je7 je7Var, je7 je7Var2) {
        this.b = kheVar;
        this.c = kheVar2;
        this.d = je7Var;
        this.e = je7Var2;
    }

    public static boolean d(zy7 zy7Var, MessageModel messageModel, u6b u6bVar) {
        if (messageModel.E0 == iu8.s0) {
            return true;
        }
        tz tzVar = messageModel.u0;
        if (tzVar.c || tzVar.b) {
            return true;
        }
        CharSequence charSequenceB = u6bVar.b(zy7Var.a);
        return (charSequenceB == null || charSequenceB.length() == 0) ^ true;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.az7 r5, kotlin.coroutines.Continuation r6) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.j9a
            if (r0 == 0) goto L13
            r0 = r6
            j9a r0 = (defpackage.j9a) r0
            int r1 = r0.Z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Z = r1
            goto L18
        L13:
            j9a r0 = new j9a
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.X
            tx3 r1 = defpackage.tx3.a
            int r2 = r0.Z
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            zy7 r4 = r0.o
            defpackage.od2.a0(r6)
            goto L65
        L29:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L31:
            defpackage.od2.a0(r6)
            zy7 r5 = (defpackage.zy7) r5
            one.me.messages.list.loader.MessageModel r6 = r5.b()
            ow8 r6 = r6.H0
            ow8 r2 = defpackage.ow8.d
            boolean r6 = defpackage.tpa.f(r6, r2)
            if (r6 != 0) goto L4b
            one.me.messages.list.loader.MessageModel r4 = r5.b()
            ow8 r4 = r4.H0
            return r4
        L4b:
            je7 r4 = r4.e
            java.lang.Object r4 = r4.getValue()
            ds3 r4 = (defpackage.ds3) r4
            one.me.messages.list.loader.MessageModel r6 = r5.b()
            r0.o = r5
            r0.Z = r3
            long r2 = r6.C0
            java.lang.Comparable r6 = r4.b(r2, r0)
            if (r6 != r1) goto L64
            return r1
        L64:
            r4 = r5
        L65:
            uj3 r6 = (defpackage.uj3) r6
            one.me.messages.list.loader.MessageModel r4 = r4.b()
            r5 = 0
            if (r6 == 0) goto L73
            java.lang.CharSequence r0 = r6.m()
            goto L74
        L73:
            r0 = r5
        L74:
            if (r6 == 0) goto L7c
            kk0 r5 = defpackage.kk0.b
            java.lang.String r5 = r6.p(r5)
        L7c:
            ow8 r6 = new ow8
            long r1 = r4.C0
            r6.<init>(r1, r0, r5)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.m9a.a(az7, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(defpackage.zy7 r7, int r8, int r9, int r10, kotlin.coroutines.Continuation r11) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r11 instanceof defpackage.k9a
            if (r0 == 0) goto L13
            r0 = r11
            k9a r0 = (defpackage.k9a) r0
            int r1 = r0.t0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.t0 = r1
            goto L18
        L13:
            k9a r0 = new k9a
            r0.<init>(r6, r11)
        L18:
            java.lang.Object r11 = r0.Z
            tx3 r1 = defpackage.tx3.a
            int r2 = r0.t0
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            int r10 = r0.Y
            az7 r7 = r0.X
            m9a r6 = r0.o
            defpackage.od2.a0(r11)
            goto L9c
        L2d:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L35:
            defpackage.od2.a0(r11)
            e52 r11 = r7.a
            boolean r11 = r11.M()
            r2 = 0
            if (r11 == 0) goto L43
            goto Lc4
        L43:
            e52 r11 = r7.a
            boolean r4 = r11.I()
            if (r4 == 0) goto L67
            boolean r4 = defpackage.ry8.d(r9)
            if (r4 != 0) goto L67
            boolean r7 = r11.X()
            je7 r6 = r6.b
            java.lang.Object r6 = r6.getValue()
            v5d r6 = (defpackage.v5d) r6
            java.lang.String r8 = r11.q()
            r9 = 4
            android.text.Layout r2 = defpackage.v5d.b(r6, r8, r7, r9)
            goto Lc4
        L67:
            boolean r11 = defpackage.ns0.b(r8)
            if (r11 == 0) goto Lc4
            boolean r11 = defpackage.ns0.c(r8)
            if (r11 != 0) goto L79
            boolean r8 = defpackage.ns0.a(r8)
            if (r8 == 0) goto Lc4
        L79:
            boolean r8 = defpackage.ry8.d(r9)
            if (r8 != 0) goto Lc4
            je7 r8 = r6.e
            java.lang.Object r8 = r8.getValue()
            ds3 r8 = (defpackage.ds3) r8
            one.me.messages.list.loader.MessageModel r9 = r7.b()
            r0.o = r6
            r0.X = r7
            r0.Y = r10
            r0.t0 = r3
            long r4 = r9.C0
            java.lang.Comparable r11 = r8.b(r4, r0)
            if (r11 != r1) goto L9c
            return r1
        L9c:
            uj3 r11 = (defpackage.uj3) r11
            r8 = 0
            if (r11 == 0) goto La8
            boolean r9 = r11.u()
            if (r9 != r3) goto La8
            goto La9
        La8:
            r3 = r8
        La9:
            je7 r6 = r6.b
            java.lang.Object r6 = r6.getValue()
            v5d r6 = (defpackage.v5d) r6
            zy7 r7 = (defpackage.zy7) r7
            u6b r7 = r7.b
            ida r8 = r7.a
            int r8 = r8.g()
            r7.c(r8)
            java.lang.CharSequence r7 = r7.h
            android.text.Layout r2 = r6.a(r10, r7, r3)
        Lc4:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.m9a.b(zy7, int, int, int, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final boolean c(zy7 zy7Var, MessageModel messageModel, MessageModel messageModel2) {
        if (messageModel2 == null || messageModel2.y0 != null || messageModel2.z0 != null) {
            return false;
        }
        long j = messageModel.c;
        long j2 = messageModel2.c;
        if ((j < 0 && j2 > 0) || (j > 0 && j2 < 0)) {
            return false;
        }
        ConcurrentHashMap concurrentHashMap = ((t6b) this.d.getValue()).c;
        long j3 = messageModel2.a;
        u6b u6bVar = (u6b) concurrentHashMap.get(Long.valueOf(j3));
        if (u6bVar == null) {
            hm9.m0(this.a, ey8.i(j3, "PreProcessedData for message=MessageModel(", ") is null"), new Object[0]);
            return false;
        }
        u6b u6bVar2 = zy7Var.b;
        u6bVar2.d();
        n34 n34Var = u6bVar2.n;
        u6bVar.d();
        return ((ay7.A(n34Var, u6bVar.n) ^ true) || messageModel.C0 != messageModel2.C0 || d(zy7Var, messageModel, zy7Var.b) || d(zy7Var, messageModel2, u6bVar)) ? false : true;
    }

    /* JADX WARN: Removed duplicated region for block: B:171:0x02a9  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0340  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x0343  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0358  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x0377 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:212:0x0378  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x03c2 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:231:0x03c3  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001a  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01a6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(final defpackage.zy7 r20, kotlin.coroutines.Continuation r21) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 969
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.m9a.e(zy7, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
