package defpackage;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes2.dex */
public final class h62 extends gle {
    public List c;
    public HashMap o;

    public h62(gy8 gy8Var) {
        super(gy8Var);
        if (this.c == null) {
            this.c = Collections.emptyList();
        }
    }

    @Override // defpackage.gle
    public final void b(gy8 gy8Var, String str) {
        str.getClass();
        if (str.equals("commands")) {
            this.c = lz7.W(gy8Var, new yb9());
            return;
        }
        if (!str.equals("contacts")) {
            gy8Var.z();
            return;
        }
        this.o = new HashMap();
        int iN = lz7.N(gy8Var);
        for (int i = 0; i < iN; i++) {
            long jW0 = gy8Var.w0();
            this.o.put(Long.valueOf(jW0), wm3.e(gy8Var));
        }
    }

    @Override // defpackage.zje
    public final String toString() {
        return wg0.h("{commands=", s5c.o(this.c), ", contacts=", s5c.S(this.o), "}");
    }
}
