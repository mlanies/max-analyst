package defpackage;

import java.util.List;

/* loaded from: classes2.dex */
public final class hn3 extends gle {
    public List c;

    @Override // defpackage.gle
    public final void b(gy8 gy8Var, String str) {
        str.getClass();
        if (str.equals("contacts")) {
            this.c = wz.c(gy8Var);
        } else {
            gy8Var.z();
        }
    }

    @Override // defpackage.zje
    public final String toString() {
        return wg0.g(s5c.o(this.c), "{contactInfos=", "}");
    }
}
