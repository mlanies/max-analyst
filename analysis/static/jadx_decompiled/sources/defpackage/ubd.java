package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public final class ubd extends gle {
    public List c;

    public ubd(gy8 gy8Var) {
        super(gy8Var);
        if (this.c == null) {
            this.c = Collections.emptyList();
        }
    }

    @Override // defpackage.gle
    public final void b(gy8 gy8Var, String str) {
        str.getClass();
        if (!str.equals("sessions")) {
            gy8Var.z();
            return;
        }
        int iG = lz7.G(gy8Var);
        this.c = new ArrayList(iG);
        for (int i = 0; i < iG; i++) {
            List list = this.c;
            int iN = lz7.N(gy8Var);
            w9d w9dVar = null;
            if (iN != 0) {
                boolean zU0 = false;
                String strZ0 = null;
                String strZ02 = null;
                String strZ03 = null;
                long jW0 = 0;
                for (int i2 = 0; i2 < iN; i2++) {
                    String strZ04 = gy8Var.z0();
                    strZ04.getClass();
                    switch (strZ04) {
                        case "client":
                            strZ0 = gy8Var.z0();
                            break;
                        case "info":
                            strZ02 = gy8Var.z0();
                            break;
                        case "time":
                            jW0 = gy8Var.w0();
                            break;
                        case "current":
                            zU0 = gy8Var.u0();
                            break;
                        case "location":
                            strZ03 = gy8Var.z0();
                            break;
                        default:
                            gy8Var.z();
                            break;
                    }
                }
                w9dVar = new w9d(jW0, strZ0, strZ02, strZ03, zU0);
            }
            list.add(w9dVar);
        }
    }

    @Override // defpackage.zje
    public final String toString() {
        return wg0.g(s5c.o(this.c), "{sessions=", "}");
    }
}
