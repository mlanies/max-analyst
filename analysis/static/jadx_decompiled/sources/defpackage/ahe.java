package defpackage;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public final class ahe extends gle {
    public List c;
    public Map o;

    public ahe(gy8 gy8Var) {
        super(gy8Var);
        if (this.c == null) {
            this.c = Collections.emptyList();
        }
        if (this.o == null) {
            this.o = Collections.emptyMap();
        }
    }

    @Override // defpackage.gle
    public final void b(gy8 gy8Var, String str) {
        str.getClass();
        if (!str.equals("phones")) {
            if (str.equals("contacts")) {
                this.c = wz.c(gy8Var);
                return;
            } else {
                gy8Var.z();
                return;
            }
        }
        this.o = new HashMap();
        int iN = lz7.N(gy8Var);
        for (int i = 0; i < iN; i++) {
            this.o.put(gy8Var.z0(), Long.valueOf(gy8Var.w0()));
        }
    }

    @Override // defpackage.zje
    public final String toString() {
        return wg0.h("{contacts=", s5c.o(this.c), ", phones=", s5c.S(this.o), "}");
    }
}
