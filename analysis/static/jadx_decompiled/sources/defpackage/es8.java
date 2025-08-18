package defpackage;

import java.util.Collections;

/* loaded from: classes2.dex */
public class es8 implements vk6 {
    public static final /* synthetic */ int t0 = 0;
    public final u6b X;
    public final sw8 Y;
    public final zx8 Z;
    public final cu8 a;
    public final uj3 b;
    public final bw8 c;
    public final es8 o;
    public final lr2 s0;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public es8(cu8 cu8Var, uj3 uj3Var, bw8 bw8Var, es8 es8Var, u6b u6bVar, sw8 sw8Var, zx8 zx8Var, lr2 lr2Var) {
        this(cu8Var, uj3Var, bw8Var, es8Var, u6bVar, sw8Var, zx8Var, lr2Var, 0);
        Collections.emptySet();
    }

    public final es8 a() {
        bw8 bw8Var = this.c;
        if (bw8Var == null || bw8Var.a != 2) {
            return null;
        }
        return bw8Var.c;
    }

    public final CharSequence b(e52 e52Var) {
        u6b u6bVar = this.X;
        u6bVar.f = e52Var;
        ida idaVar = u6bVar.a;
        u6bVar.i(e52Var, idaVar.f(), idaVar.e());
        u6bVar.g(e52Var);
        return u6bVar.g;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0038, code lost:
    
        if (r1 != ((defpackage.p7b) ((defpackage.m7b) r0.a.get())).a.t()) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String c(defpackage.e52 r6) {
        /*
            r5 = this;
            zx8 r0 = r5.Z
            r0.getClass()
            boolean r1 = r6.I()
            cu8 r2 = r5.a
            if (r1 == 0) goto L13
            int r1 = r2.V0
            r3 = 4
            if (r1 != r3) goto L13
            goto L3a
        L13:
            boolean r1 = r6.Q()
            if (r1 == 0) goto L3f
            long r1 = r2.Y
            r3 = 0
            int r3 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r3 == 0) goto L3a
            bc7[] r3 = defpackage.zx8.b
            r4 = 0
            r3 = r3[r4]
            rm4 r0 = r0.a
            java.lang.Object r0 = r0.get()
            m7b r0 = (defpackage.m7b) r0
            p7b r0 = (defpackage.p7b) r0
            t33 r0 = r0.a
            long r3 = r0.t()
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 == 0) goto L3f
        L3a:
            java.lang.String r5 = r6.q()
            goto L47
        L3f:
            uj3 r5 = r5.b
            java.lang.String r5 = r5.d()
            if (r5 == 0) goto L48
        L47:
            return r5
        L48:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r6 = "Required value was null."
            java.lang.String r6 = r6.toString()
            r5.<init>(r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.es8.c(e52):java.lang.String");
    }

    public final boolean d() {
        return !this.b.Y;
    }

    @Override // defpackage.vk6
    /* renamed from: getId */
    public final long getA() {
        return this.a.b;
    }

    @Override // defpackage.vk6
    /* renamed from: k */
    public final long getC() {
        cu8 cu8Var = this.a;
        ng4 ng4Var = cu8Var.T0;
        return ng4Var != null ? ng4Var.a : cu8Var.o;
    }

    public final String toString() {
        return "Message{data=" + this.a + '}';
    }

    public es8(cu8 cu8Var, uj3 uj3Var, bw8 bw8Var, es8 es8Var, u6b u6bVar, sw8 sw8Var, zx8 zx8Var, lr2 lr2Var, int i) {
        this.a = cu8Var;
        this.b = uj3Var;
        this.c = bw8Var;
        this.o = es8Var;
        this.X = u6bVar;
        this.Y = sw8Var;
        this.Z = zx8Var;
        this.s0 = lr2Var;
    }
}
