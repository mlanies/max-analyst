package defpackage;

import java.util.List;

/* loaded from: classes2.dex */
public final class iq3 extends gle {
    public List c;
    public int o;

    @Override // defpackage.gle
    public final void b(gy8 gy8Var, String str) {
        str.getClass();
        if (!str.equals("result")) {
            if (str.equals("total")) {
                this.o = gy8Var.v0();
                return;
            } else {
                gy8Var.z();
                return;
            }
        }
        int i = wz.a;
        int iG = lz7.G(gy8Var);
        wz wzVar = new wz(iG);
        for (int i2 = 0; i2 < iG; i2++) {
            wzVar.add(kq3.a(gy8Var));
        }
        this.c = wzVar;
    }

    @Override // defpackage.zje
    public final String toString() {
        return wg0.h("{contacts=", s5c.o(this.c), ", total=", this.o, "}");
    }
}
