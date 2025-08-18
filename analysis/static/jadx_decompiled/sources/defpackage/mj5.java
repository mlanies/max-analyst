package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public final class mj5 extends gle {
    public List c;

    public mj5(gy8 gy8Var) {
        super(gy8Var);
        if (this.c == null) {
            this.c = Collections.emptyList();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v1, types: [nj5] */
    @Override // defpackage.gle
    public final void b(gy8 gy8Var, String str) {
        str.getClass();
        if (!str.equals("info")) {
            gy8Var.z();
            return;
        }
        int iG = lz7.G(gy8Var);
        this.c = new ArrayList(iG);
        for (int i = 0; i < iG; i++) {
            List list = this.c;
            int iN = lz7.N(gy8Var);
            String nj5Var = null;
            if (iN != 0) {
                String strP = null;
                long jM = 0;
                for (int i2 = 0; i2 < iN; i2++) {
                    String strZ0 = gy8Var.z0();
                    strZ0.getClass();
                    switch (strZ0) {
                        case "fileId":
                            jM = lz7.M(gy8Var, 0L);
                            break;
                        case "url":
                            strP = lz7.P(gy8Var);
                            break;
                        case "token":
                            nj5Var = lz7.P(gy8Var);
                            break;
                        default:
                            gy8Var.z();
                            break;
                    }
                }
                nj5Var = new nj5(jM, nj5Var, strP);
            }
            list.add(nj5Var);
        }
    }

    @Override // defpackage.zje
    public final String toString() {
        return "{info=" + this.c + "}";
    }
}
