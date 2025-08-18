package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public final class s44 extends gle {
    public fm5 c;
    public List o;

    public s44(gy8 gy8Var) {
        super(gy8Var);
        if (this.o == null) {
            this.o = Collections.emptyList();
        }
    }

    @Override // defpackage.gle
    public final void b(gy8 gy8Var, String str) {
        str.getClass();
        if (str.equals("cmd")) {
            String strP = lz7.P(gy8Var);
            fm5 fm5Var = fm5.e;
            if (strP != null) {
                if (strP.equals("SYNC_CONTACTS")) {
                    fm5Var = fm5.g;
                } else if (strP.equals("SEND_LOG")) {
                    fm5Var = fm5.f;
                }
            }
            this.c = fm5Var;
            return;
        }
        if (!str.equals("args")) {
            gy8Var.z();
            return;
        }
        int iG = lz7.G(gy8Var);
        this.o = new ArrayList(iG);
        for (int i = 0; i < iG; i++) {
            this.o.add(lz7.P(gy8Var));
        }
    }

    @Override // defpackage.zje
    public final String toString() {
        return "{cmd='" + this.c + "', args=" + this.o + "}";
    }
}
