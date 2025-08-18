package defpackage;

/* loaded from: classes2.dex */
public final class mf9 extends gle {
    public final f52 X;
    public final long c;
    public final fs8 o;

    public /* synthetic */ mf9() {
        this(0L, null, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x0098  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final defpackage.mf9 c(defpackage.gy8 r15) {
        /*
            java.lang.String r0 = "payloadCatching catch error"
            java.lang.String r1 = "ServerPayload/PayloadCatching"
            boolean r2 = r15.m()
            if (r2 != 0) goto L11
            mf9 r15 = new mf9
            r15.<init>()
            goto Ld9
        L11:
            int r2 = r15.x0()
            if (r2 != 0) goto L1e
            mf9 r15 = new mf9
            r15.<init>()
            goto Ld9
        L1e:
            r3 = 0
            r4 = 0
            r6 = 0
            r9 = r3
            r10 = r9
            r7 = r4
        L25:
            if (r6 >= r2) goto Ld4
            r11 = 1
            java.lang.String r12 = defpackage.lz7.P(r15)     // Catch: java.lang.Throwable -> L2d
            goto L5c
        L2d:
            r12 = move-exception
            defpackage.hm9.l0(r1, r0, r12)
            java.util.concurrent.CopyOnWriteArraySet r13 = defpackage.u7d.a
            java.util.Iterator r13 = r13.iterator()
        L37:
            boolean r14 = r13.hasNext()
            if (r14 == 0) goto L4a
            java.lang.Object r14 = r13.next()
            r4a r14 = (defpackage.r4a) r14
            r14.getClass()
            defpackage.r4a.a(r12)
            goto L37
        L4a:
            int r13 = defpackage.k7d.a
            int r13 = defpackage.au1.s(r13)
            if (r13 == 0) goto L5b
            if (r13 == r11) goto L5a
            kotlin.NoWhenBranchMatchedException r15 = new kotlin.NoWhenBranchMatchedException
            r15.<init>()
            throw r15
        L5a:
            throw r12
        L5b:
            r12 = r3
        L5c:
            if (r12 != 0) goto L60
            goto Ld0
        L60:
            int r13 = r12.hashCode()
            r14 = -1361631597(0xffffffffaed72693, float:-9.78392E-11)
            if (r13 == r14) goto L90
            r11 = 3052376(0x2e9358, float:4.27729E-39)
            if (r13 == r11) goto L82
            r11 = 954925063(0x38eb0007, float:1.1205678E-4)
            if (r13 == r11) goto L74
            goto L98
        L74:
            java.lang.String r11 = "message"
            boolean r11 = r12.equals(r11)
            if (r11 != 0) goto L7d
            goto L98
        L7d:
            fs8 r9 = defpackage.tpa.z(r15)
            goto Ld0
        L82:
            java.lang.String r11 = "chat"
            boolean r11 = r12.equals(r11)
            if (r11 != 0) goto L8b
            goto L98
        L8b:
            f52 r10 = defpackage.f52.a(r15)
            goto Ld0
        L90:
            java.lang.String r13 = "chatId"
            boolean r12 = r12.equals(r13)
            if (r12 != 0) goto L9c
        L98:
            r15.z()
            goto Ld0
        L9c:
            long r7 = defpackage.lz7.M(r15, r4)     // Catch: java.lang.Throwable -> La1
            goto Ld0
        La1:
            r7 = move-exception
            defpackage.hm9.l0(r1, r0, r7)
            java.util.concurrent.CopyOnWriteArraySet r8 = defpackage.u7d.a
            java.util.Iterator r8 = r8.iterator()
        Lab:
            boolean r12 = r8.hasNext()
            if (r12 == 0) goto Lbe
            java.lang.Object r12 = r8.next()
            r4a r12 = (defpackage.r4a) r12
            r12.getClass()
            defpackage.r4a.a(r7)
            goto Lab
        Lbe:
            int r8 = defpackage.k7d.a
            int r8 = defpackage.au1.s(r8)
            if (r8 == 0) goto Lcf
            if (r8 == r11) goto Lce
            kotlin.NoWhenBranchMatchedException r15 = new kotlin.NoWhenBranchMatchedException
            r15.<init>()
            throw r15
        Lce:
            throw r7
        Lcf:
            r7 = r4
        Ld0:
            int r6 = r6 + 1
            goto L25
        Ld4:
            mf9 r15 = new mf9
            r15.<init>(r7, r9, r10)
        Ld9:
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mf9.c(gy8):mf9");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mf9)) {
            return false;
        }
        mf9 mf9Var = (mf9) obj;
        return this.c == mf9Var.c && tpa.f(this.o, mf9Var.o) && tpa.f(this.X, mf9Var.X);
    }

    public final int hashCode() {
        int iHashCode = Long.hashCode(this.c) * 31;
        fs8 fs8Var = this.o;
        int iHashCode2 = (iHashCode + (fs8Var == null ? 0 : fs8Var.hashCode())) * 31;
        f52 f52Var = this.X;
        return iHashCode2 + (f52Var != null ? f52Var.hashCode() : 0);
    }

    @Override // defpackage.zje
    public final String toString() {
        return "Response(chatId=" + this.c + ", message=" + this.o + ")";
    }

    public mf9(long j, fs8 fs8Var, f52 f52Var) {
        this.c = j;
        this.o = fs8Var;
        this.X = f52Var;
    }
}
