package defpackage;

import java.util.List;

/* loaded from: classes2.dex */
public final class dua implements j0e {
    public final ti9 X;
    public final String[] a;
    public final je7 b = fua.a.b();
    public final je7 c;
    public final ti9 o;

    public dua(String[] strArr) {
        this.a = strArr;
        je7 je7VarR = tu0.r(3, new zj7(27, this));
        this.c = je7VarR;
        this.o = (ti9) je7VarR.getValue();
        this.X = (ti9) je7VarR.getValue();
    }

    @Override // defpackage.gld
    public final List b() {
        return this.o.b();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.mn5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(defpackage.on5 r5, kotlin.coroutines.Continuation r6) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.cua
            if (r0 == 0) goto L13
            r0 = r6
            cua r0 = (defpackage.cua) r0
            int r1 = r0.Y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Y = r1
            goto L18
        L13:
            cua r0 = new cua
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.o
            tx3 r1 = defpackage.tx3.a
            int r2 = r0.Y
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 == r3) goto L2b
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2b:
            defpackage.od2.a0(r6)
            goto L43
        L2f:
            defpackage.od2.a0(r6)
            je7 r4 = r4.c
            java.lang.Object r4 = r4.getValue()
            ti9 r4 = (defpackage.ti9) r4
            r0.Y = r3
            java.lang.Object r4 = r4.d(r5, r0)
            if (r4 != r1) goto L43
            return r1
        L43:
            kotlin.KotlinNothingValueException r4 = new kotlin.KotlinNothingValueException
            r4.<init>()
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dua.d(on5, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // defpackage.j0e
    public final Object getValue() {
        return (bua) this.X.getValue();
    }

    public final void h() {
        ((ti9) this.c.getValue()).setValue(((eua) this.b.getValue()).b(this.a) ? bua.a : bua.b);
    }

    public final boolean j() {
        return ((bua) this.X.getValue()) == bua.a;
    }
}
