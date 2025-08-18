package defpackage;

import java.util.Collections;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final class z8d extends g9d {
    public static final /* synthetic */ int D0 = 0;
    public final float A0;
    public final boolean B0;
    public final long C0;
    public final er7 z0;

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002a, code lost:
    
        if (r0.b == 0.0d) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public z8d(defpackage.y8d r6) {
        /*
            r5 = this;
            r5.<init>(r6)
            er7 r0 = r6.m
            r5.z0 = r0
            float r1 = r6.n
            r5.A0 = r1
            long r1 = r6.o
            r5.C0 = r1
            r3 = 0
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 == 0) goto L30
            boolean r0 = r0.a()
            if (r0 == 0) goto L2c
            er7 r0 = r6.m
            double r1 = r0.a
            r3 = 0
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 != 0) goto L26
            goto L2c
        L26:
            double r0 = r0.b
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 != 0) goto L30
        L2c:
            r6 = 1
            r5.B0 = r6
            goto L34
        L30:
            boolean r6 = r6.l
            r5.B0 = r6
        L34:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.z8d.<init>(y8d):void");
    }

    @Override // defpackage.g9d
    public final bu8 y() {
        m20 m20Var = new m20();
        long jN = ((hyc) i()).n();
        long j = this.C0;
        long millis = j != Long.MAX_VALUE ? TimeUnit.SECONDS.toMillis(j) + jN : Long.MAX_VALUE;
        t10 t10Var = new t10();
        t10Var.a = this.z0;
        t10Var.g = this.A0;
        t10Var.b = j;
        t10Var.c = jN;
        t10Var.d = millis;
        e8d e8dVar = this.a;
        if (e8dVar == null) {
            e8dVar = null;
        }
        t10Var.f = ((ri4) e8dVar.d.getValue()).a();
        u10 u10VarA = t10Var.a();
        j10 j10Var = new j10();
        j10Var.v = u10VarA;
        j10Var.a = g20.x0;
        if (this.B0) {
            j10Var.i = d20.X;
        }
        m20Var.a = Collections.singletonList(j10Var.a());
        k8g k8gVarC = m20Var.c();
        bu8 bu8Var = new bu8();
        bu8Var.g = null;
        bu8Var.n = k8gVarC;
        return bu8Var;
    }

    @Override // defpackage.g9d
    public final long z(long j, e52 e52Var) {
        long jZ = super.z(j, e52Var);
        if (this.B0) {
            hm9.n("z8d", "specifyLocation, start TaskLocationRequest to define location");
            u().b(new s8d(((hyc) i()).o(), j, this.C0 != 0));
        }
        return jZ;
    }
}
