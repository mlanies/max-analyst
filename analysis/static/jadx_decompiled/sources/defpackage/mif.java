package defpackage;

import kotlinx.coroutines.internal.Symbol;

/* loaded from: classes2.dex */
public final class mif implements y3b {
    public final je7 X;
    public final v7c Y;
    public final w7c Z;
    public final kke a;
    public final nif b;
    public final je7 c;
    public final je7 o;

    public mif(sx3 sx3Var, je7 je7Var, je7 je7Var2, je7 je7Var3, kke kkeVar, nif nifVar) {
        this.a = kkeVar;
        this.b = nifVar;
        this.c = je7Var;
        this.o = je7Var2;
        this.X = je7Var3;
        v7c v7cVar = nifVar.Z;
        ap8 ap8Var = new ap8(v7cVar, this, 16);
        nd2 nd2Var = wld.b;
        ty tyVarJ = i24.j(ap8Var, 0);
        kld kldVarA = lld.a(0, tyVarJ.a, tyVarJ.b);
        Symbol symbol = lld.a;
        j47.S(sx3Var, (lx3) tyVarJ.o, tpa.f(nd2Var, wld.a) ? vx3.a : vx3.o, new iq5(nd2Var, (mn5) tyVarJ.c, kldVarA, symbol, null));
        this.Y = new v7c(kldVarA);
        this.Z = od2.X(new ovc(v7cVar, 8), sx3Var, nd2Var, Float.valueOf(0.0f));
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object e(defpackage.mif r12, defpackage.ijf r13, kotlin.coroutines.Continuation r14) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 215
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mif.e(mif, ijf, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // defpackage.y3b
    public final void a() {
        nif nifVar = this.b;
        dkf dkfVar = nifVar.X;
        if (dkfVar == null || !dkfVar.b()) {
            dkf dkfVar2 = nifVar.X;
            if (dkfVar2 != null) {
                dkfVar2.play();
                return;
            }
            return;
        }
        dkf dkfVar3 = nifVar.X;
        if (dkfVar3 != null) {
            dkfVar3.pause();
        }
    }

    @Override // defpackage.y3b
    public final void b() {
        dkf dkfVar = this.b.X;
        if (dkfVar != null) {
            dkfVar.N0();
        }
    }

    @Override // defpackage.y3b
    public final void c(d3b d3bVar) {
    }

    @Override // defpackage.y3b
    public final c64 d(Long l, boolean z) {
        ijf ijfVar;
        if (l == null || (ijfVar = (ijf) x53.i0(this.b.Z.a.b())) == null) {
            return null;
        }
        n0b n0bVar = n0b.c;
        long jLongValue = l.longValue();
        n0bVar.getClass();
        return n0b.Z1(jLongValue, ijfVar.a, z);
    }
}
