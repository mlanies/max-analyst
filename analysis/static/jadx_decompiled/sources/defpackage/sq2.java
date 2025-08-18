package defpackage;

import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public final class sq2 extends gle {
    public String X;
    public List c;
    public int o;

    public sq2(gy8 gy8Var) {
        super(gy8Var);
        if (this.c == null) {
            this.c = Collections.emptyList();
        }
    }

    @Override // defpackage.gle
    public final void b(gy8 gy8Var, String str) {
        str.getClass();
        switch (str) {
            case "marker":
                this.X = lz7.P(gy8Var);
                break;
            case "result":
                this.c = wz.f(gy8Var);
                break;
            case "total":
                this.o = gy8Var.v0();
                break;
            default:
                gy8Var.z();
                break;
        }
    }

    @Override // defpackage.zje
    public final String toString() {
        int iO = s5c.o(this.c);
        int i = this.o;
        return zr6.l(wg0.j("{result=", iO, ", total=", i, ", marker='"), this.X, "'}");
    }
}
