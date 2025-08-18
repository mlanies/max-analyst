package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public final class up3 extends gle {
    public int X;
    public List c;
    public List o;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v9 */
    @Override // defpackage.gle
    public final void b(gy8 gy8Var, String str) {
        List listEmptyList;
        int i;
        List listEmptyList2;
        str.getClass();
        listEmptyList = 0;
        listEmptyList2 = 0;
        i = 0;
        switch (str) {
            case "ids":
                if (gy8Var.n().a() == 7) {
                    listEmptyList = new ArrayList();
                    int iS0 = gy8Var.s0();
                    while (i < iS0) {
                        listEmptyList.add(Long.valueOf(lz7.M(gy8Var, 0L)));
                        i++;
                    }
                } else {
                    gy8Var.z();
                }
                if (listEmptyList == 0) {
                    listEmptyList = Collections.emptyList();
                }
                this.o = listEmptyList;
                break;
            case "urls":
                if (gy8Var.n().a() == 7) {
                    listEmptyList2 = new ArrayList();
                    int iS02 = gy8Var.s0();
                    while (i < iS02) {
                        listEmptyList2.add(lz7.P(gy8Var));
                        i++;
                    }
                } else {
                    gy8Var.z();
                }
                if (listEmptyList2 == 0) {
                    listEmptyList2 = Collections.emptyList();
                }
                this.c = listEmptyList2;
                break;
            case "total":
                this.X = gy8Var.v0();
                break;
            default:
                gy8Var.z();
                break;
        }
    }

    @Override // defpackage.zje
    public final String toString() {
        int iO = s5c.o(this.c);
        int iO2 = s5c.o(this.o);
        return zr6.j(wg0.j("{urls=", iO, ", ids=", iO2, ", total="), this.X, "}");
    }
}
