package defpackage;

import android.content.Context;
import android.net.Uri;

/* loaded from: classes2.dex */
public final class xcf {
    public final fwa a;
    public final je7 b;
    public final khe c;
    public final khe d = new khe(new rzd(11, this));

    public xcf(Context context, je7 je7Var, je7 je7Var2, fwa fwaVar) {
        this.a = fwaVar;
        this.b = je7Var2;
        this.c = new khe(new md(je7Var, context, 3));
    }

    public final wcf a(k20 k20Var, l20 l20Var, String str) {
        Uri uri;
        Uri uriN = j47.N(l20Var.s);
        Uri uriN2 = j47.N(k20Var.d);
        Uri uriC = ((o20) ((t00) this.b.getValue())).c(l20Var, false);
        if (uriN2 == null && uriN != null) {
            uri = uriN;
        } else if (uriN2 != null) {
            uri = uriN2;
        } else if (uriC != null) {
            uri = uriC;
        } else {
            uriN = null;
            uri = uriN;
        }
        khe kheVar = this.d;
        fwa fwaVar = this.a;
        int i = k20Var.f;
        int i2 = k20Var.e;
        long j = k20Var.c;
        d20 d20Var = l20Var.o;
        if (uri != null) {
            int iIntValue = ((Number) kheVar.getValue()).intValue();
            int i3 = ft4.o;
            long jS = z7.S(j, kt4.MILLISECONDS);
            jic jicVarA = fwaVar.a(i2, i, true);
            return new wcf(k20Var.a, uri, k20Var.e, k20Var.f, iIntValue, jS, str, uriC, jicVarA, d20Var);
        }
        wcf wcfVar = wcf.k;
        int iIntValue2 = ((Number) kheVar.getValue()).intValue();
        int i4 = ft4.o;
        long jS2 = z7.S(j, kt4.MILLISECONDS);
        jic jicVarA2 = fwaVar.a(i2, i, true);
        return new wcf(k20Var.a, wcfVar.b, k20Var.e, k20Var.f, iIntValue2, jS2, str, uriC, jicVarA2, d20Var);
    }
}
