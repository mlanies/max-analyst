package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class wp1 extends pnf {
    public static final kpa X = new kpa(oag.a("", Long.MIN_VALUE), e9f.c(x7a.J0).toString());
    public final je7 b;
    public final q0e c;
    public final w7c o;

    public wp1(je7 je7Var, je7 je7Var2, je7 je7Var3) {
        this.b = je7Var2;
        q0e q0eVarA = r0e.a(qp1.a);
        this.c = q0eVarA;
        this.o = new w7c(q0eVarA);
        od2.L(od2.F(new zn5(((yz0) ((ez0) je7Var2.getValue())).t0, new vp1(this, je7Var, null), 5), ((w9a) ((kke) je7Var3.getValue())).a()), this.a);
    }

    public static final kl7 q(wp1 wp1Var, List list) {
        wp1Var.getClass();
        boolean z = list.size() > 3;
        List<bo1> listY0 = x53.y0(list, z ? 2 : list.size());
        ArrayList arrayList = new ArrayList(z53.S(listY0, 10));
        for (bo1 bo1Var : listY0) {
            arrayList.add(new kpa(oag.a(bo1Var.j(), Long.valueOf(bo1Var.d())), bo1Var.q()));
        }
        kl7 kl7VarL = j1e.l();
        kl7VarL.addAll(arrayList);
        if (z) {
            kl7VarL.add(X);
        }
        return j1e.d(kl7VarL);
    }

    public static final CharSequence r(wp1 wp1Var, String str) {
        wp1Var.getClass();
        if (w9e.C0(str)) {
            return str;
        }
        List listP0 = w9e.P0(w9e.b1(str), new char[]{' '});
        if (listP0.size() < 2) {
            return str;
        }
        Object objG0 = x53.g0(listP0);
        CharSequence charSequence = (CharSequence) x53.p0(listP0);
        if (charSequence.length() == 0) {
            throw new NoSuchElementException("Char sequence is empty.");
        }
        return objG0 + " " + String.valueOf(charSequence.charAt(0)).toUpperCase(Locale.ROOT) + ".";
    }
}
