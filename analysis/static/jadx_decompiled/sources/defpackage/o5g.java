package defpackage;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class o5g {
    public static int f;
    public ArrayList a;
    public int b;
    public int c;
    public ArrayList d;
    public int e;

    public final void a(ArrayList arrayList) {
        int size = this.a.size();
        if (this.e != -1 && size > 0) {
            for (int i = 0; i < arrayList.size(); i++) {
                o5g o5gVar = (o5g) arrayList.get(i);
                if (this.e == o5gVar.b) {
                    c(this.c, o5gVar);
                }
            }
        }
        if (size == 0) {
            arrayList.remove(this);
        }
    }

    public final int b(zh7 zh7Var, int i) {
        int iN;
        int iN2;
        ArrayList arrayList = this.a;
        if (arrayList.size() == 0) {
            return 0;
        }
        ij3 ij3Var = (ij3) ((hj3) arrayList.get(0)).T;
        zh7Var.t();
        ij3Var.b(zh7Var, false);
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            ((hj3) arrayList.get(i2)).b(zh7Var, false);
        }
        if (i == 0 && ij3Var.z0 > 0) {
            i24.a(ij3Var, zh7Var, arrayList, 0);
        }
        if (i == 1 && ij3Var.A0 > 0) {
            i24.a(ij3Var, zh7Var, arrayList, 1);
        }
        try {
            zh7Var.p();
        } catch (Exception e) {
            e.printStackTrace();
        }
        this.d = new ArrayList();
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            hj3 hj3Var = (hj3) arrayList.get(i3);
            sp3 sp3Var = new sp3();
            new WeakReference(hj3Var);
            zh7.n(hj3Var.I);
            zh7.n(hj3Var.J);
            zh7.n(hj3Var.K);
            zh7.n(hj3Var.L);
            zh7.n(hj3Var.M);
            this.d.add(sp3Var);
        }
        if (i == 0) {
            iN = zh7.n(ij3Var.I);
            iN2 = zh7.n(ij3Var.K);
            zh7Var.t();
        } else {
            iN = zh7.n(ij3Var.J);
            iN2 = zh7.n(ij3Var.L);
            zh7Var.t();
        }
        return iN2 - iN;
    }

    public final void c(int i, o5g o5gVar) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            hj3 hj3Var = (hj3) it.next();
            ArrayList arrayList = o5gVar.a;
            if (!arrayList.contains(hj3Var)) {
                arrayList.add(hj3Var);
            }
            int i2 = o5gVar.b;
            if (i == 0) {
                hj3Var.n0 = i2;
            } else {
                hj3Var.o0 = i2;
            }
        }
        this.e = o5gVar.b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        int i = this.c;
        sb.append(i == 0 ? "Horizontal" : i == 1 ? "Vertical" : i == 2 ? "Both" : "Unknown");
        sb.append(" [");
        String strJ = zr6.j(sb, this.b, "] <");
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            hj3 hj3Var = (hj3) it.next();
            StringBuilder sbO = rh4.o(strJ, " ");
            sbO.append(hj3Var.h0);
            strJ = sbO.toString();
        }
        return au1.g(strJ, " >");
    }
}
