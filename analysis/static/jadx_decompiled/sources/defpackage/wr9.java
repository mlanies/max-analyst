package defpackage;

import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class wr9 extends gle {
    public ArrayList X;
    public ArrayList c;
    public ArrayList o;

    public wr9(gy8 gy8Var) {
        super(gy8Var);
    }

    @Override // defpackage.gle
    public final void b(gy8 gy8Var, String str) {
        ArrayList arrayList;
        int i;
        str.getClass();
        arrayList = null;
        i = 0;
        switch (str) {
            case "phones":
                if (gy8Var.n().a() == 7) {
                    arrayList = new ArrayList();
                    int iS0 = gy8Var.s0();
                    while (i < iS0) {
                        arrayList.add(lz7.P(gy8Var));
                        i++;
                    }
                } else {
                    gy8Var.z();
                }
                this.c = arrayList;
                break;
            case "rindex":
                if (gy8Var.n().a() == 7) {
                    arrayList = new ArrayList();
                    int iS02 = gy8Var.s0();
                    while (i < iS02) {
                        arrayList.add(Integer.valueOf(lz7.L(gy8Var)));
                        i++;
                    }
                } else {
                    gy8Var.z();
                }
                this.o = arrayList;
                break;
            case "ids":
                if (gy8Var.n().a() == 7) {
                    arrayList = new ArrayList();
                    int iS03 = gy8Var.s0();
                    while (i < iS03) {
                        arrayList.add(Long.valueOf(lz7.M(gy8Var, 0L)));
                        i++;
                    }
                } else {
                    gy8Var.z();
                }
                this.X = arrayList;
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
        return zr6.j(wg0.j("{phones=", iO, ", rindex=", iO2, ", ids="), s5c.o(this.X), "}");
    }
}
