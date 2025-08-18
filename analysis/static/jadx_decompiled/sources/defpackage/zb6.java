package defpackage;

import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes2.dex */
public final class zb6 extends gle {
    public final /* synthetic */ int c;
    public ArrayList o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zb6(gy8 gy8Var, int i) {
        super(gy8Var);
        this.c = i;
        switch (i) {
            case 1:
                super(gy8Var);
                if (this.o == null) {
                    this.o = new ArrayList();
                    break;
                }
                break;
            default:
                break;
        }
    }

    @Override // defpackage.gle
    public final void b(gy8 gy8Var, String str) {
        switch (this.c) {
            case 0:
                str.getClass();
                if (str.equals("calls")) {
                    this.o = new ArrayList();
                    int iG = lz7.G(gy8Var);
                    for (int i = 0; i < iG; i++) {
                        this.o.add(idf.a(gy8Var));
                    }
                    break;
                } else {
                    gy8Var.z();
                    break;
                }
            default:
                if (tpa.f(str, "members")) {
                    int iG2 = lz7.G(gy8Var);
                    this.o = new ArrayList();
                    j37 j37VarY = ote.Y(0, iG2);
                    ArrayList arrayList = new ArrayList(z53.S(j37VarY, 10));
                    Iterator it = j37VarY.iterator();
                    while (((i37) it).c) {
                        ((i37) it).a();
                        arrayList.add(dk2.a(gy8Var));
                    }
                    ArrayList arrayList2 = this.o;
                    if (arrayList2 == null) {
                        arrayList2 = null;
                    }
                    arrayList2.addAll(arrayList);
                    break;
                } else {
                    gy8Var.z();
                    break;
                }
        }
    }

    @Override // defpackage.zje
    public final String toString() {
        switch (this.c) {
            case 0:
                return "Response{calls=" + this.o + "}";
            default:
                ArrayList arrayList = this.o;
                if (arrayList == null) {
                    arrayList = null;
                }
                return zr6.i("{members : [", x53.n0(arrayList, null, null, null, new w8c(25), 31), "]}");
        }
    }
}
