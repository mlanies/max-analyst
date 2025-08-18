package defpackage;

/* loaded from: classes2.dex */
public abstract class g9d extends d8d {
    public final z07 X;
    public final long Y;
    public final boolean Z;
    public final String b = getClass().getName();
    public final long c;
    public final bw8 o;
    public final String s0;
    public final int t0;
    public long u0;
    public final long v0;
    public final String w0;
    public final long x0;
    public final ng4 y0;

    public g9d(long j, bw8 bw8Var, z07 z07Var, long j2, boolean z, int i, String str, long j3, String str2, long j4, ng4 ng4Var) {
        this.c = j;
        this.o = bw8Var;
        this.X = z07Var;
        this.Y = j2;
        this.Z = z;
        this.t0 = i;
        this.s0 = str;
        this.v0 = j3;
        this.w0 = str2;
        this.x0 = j4;
        this.y0 = ng4Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x029d  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x02ab  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x02b5  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x02c2  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x02cf  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x02d7  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x02e7  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x02fe  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0312  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0317  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x034c  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x03d5  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x041f  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0424  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0429  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0434  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0458  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x04a0  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x04fb  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x04fd  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0505  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x050a  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0510  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0519  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x051d  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0526  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x05a3  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x05ad  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x05b1  */
    /* JADX WARN: Removed duplicated region for block: B:260:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x029b  */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r8v27, types: [java.util.List] */
    @Override // defpackage.d8d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void x() {
        /*
            Method dump skipped, instructions count: 1592
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.g9d.x():void");
    }

    public abstract bu8 y();

    public long z(long j, e52 e52Var) {
        long j2;
        long j3;
        long jN;
        long j4 = e52Var.b.a;
        long jT = ((hyc) i()).t();
        if (e52Var.M()) {
            if (e52Var.b.f(jT)) {
                jN = jT;
            } else {
                uj3 uj3VarL = e52Var.l();
                jN = uj3VarL != null ? uj3VarL.n() : 0L;
            }
            j3 = jN;
            j2 = jN != 0 ? 0L : j4;
        } else {
            j2 = j4;
            j3 = 0;
        }
        p82 p82VarB = b();
        cqc.a(new y72(p82VarB, e52Var.a, ((p7b) p82VarB.n).a.n(), 1), p82VarB.z, null, new un0(20), null);
        if (!e52Var.b.f(jT)) {
            p82 p82VarB2 = b();
            long j5 = this.c;
            p82VarB2.getClass();
            p82VarB2.h(j5, false, new l01(false, 1));
        }
        String str = this.b;
        ir6 ir6Var = hm9.m;
        if (ir6Var != null && ir6Var.c()) {
            ir6Var.d(us7.X, str, ey8.h(j, "Service task finish process and call msgSend, msgId = "), null);
        }
        pk pkVarA = a();
        long j6 = e52Var.a;
        long j7 = this.Y;
        boolean z = this.Z;
        long j8 = this.x0;
        k4a k4aVar = (k4a) pkVarA;
        if (k4aVar.p(j)) {
            return k4aVar.z().c(new jf9(((p7b) k4aVar.y()).a.o(), j, j6, j2, j3, z, j8), false, j7, 1);
        }
        return 0L;
    }

    public g9d(f9d f9dVar) {
        this.c = f9dVar.a;
        this.o = f9dVar.b;
        this.X = f9dVar.c;
        this.Y = f9dVar.d;
        this.Z = f9dVar.e;
        this.t0 = f9dVar.g;
        this.s0 = f9dVar.h;
        this.v0 = f9dVar.i;
        this.w0 = f9dVar.j;
        this.x0 = f9dVar.f;
        this.y0 = f9dVar.k;
    }
}
