package defpackage;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public final class xp3 extends gle {
    public Map c;
    public long o;

    @Override // defpackage.gle
    public final void b(gy8 gy8Var, String str) {
        str.getClass();
        if (!str.equals("presence")) {
            if (str.equals("time")) {
                this.o = gy8Var.w0();
                return;
            } else {
                gy8Var.z();
                return;
            }
        }
        this.c = new HashMap();
        int iN = lz7.N(gy8Var);
        for (int i = 0; i < iN; i++) {
            this.c.put(Long.valueOf(gy8Var.w0()), s7b.a(gy8Var));
        }
    }

    @Override // defpackage.zje
    public final String toString() {
        return "{presence=" + s5c.S(this.c) + ", time=" + this.o + "}";
    }
}
