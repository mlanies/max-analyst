package defpackage;

import java.util.List;

/* loaded from: classes.dex */
public final /* synthetic */ class fe4 implements ue4, mq1, rj8, pj3 {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;

    public /* synthetic */ fe4(Object obj, boolean z, int i) {
        this.a = i;
        this.c = obj;
        this.b = z;
    }

    @Override // defpackage.pj3
    public void accept(Object obj) {
        ((x4b) obj).m0((h30) this.c, this.b);
    }

    @Override // defpackage.ue4
    public ffc i(int i, qze qzeVar, int[] iArr) {
        ww6 ww6VarI = zw6.i();
        for (int i2 = 0; i2 < qzeVar.a; i2++) {
            int i3 = i2;
            ww6VarI.a(new he4(i, qzeVar, i3, (ne4) this.c, iArr[i2], this.b));
        }
        return ww6VarI.j();
    }

    @Override // defpackage.rj8
    public Object k(ii8 ii8Var, oh8 oh8Var, int i) {
        switch (this.a) {
            case 2:
                ffc ffcVarN = zw6.n((tb8) this.c);
                boolean z = this.b;
                return ii8Var.q(oh8Var, ffcVarN, z ? -1 : ii8Var.s.p0(), z ? -9223372036854775807L : ii8Var.s.k());
            default:
                boolean z2 = this.b;
                return ii8Var.q(oh8Var, (ffc) ((List) this.c), z2 ? -1 : ii8Var.s.p0(), z2 ? -9223372036854775807L : ii8Var.s.k());
        }
    }

    @Override // defpackage.mq1
    public String q(lq1 lq1Var) {
        switch (this.a) {
            case 1:
                xs5 xs5Var = (xs5) this.c;
                xs5Var.getClass();
                xs5Var.b.execute(new av2(xs5Var, this.b, lq1Var, 1));
                return "enableExternalFlashAeMode";
            default:
                bye byeVar = (bye) this.c;
                byeVar.getClass();
                boolean z = this.b;
                byeVar.d.execute(new av2(byeVar, lq1Var, z, 5));
                return "enableTorch: " + z;
        }
    }
}
