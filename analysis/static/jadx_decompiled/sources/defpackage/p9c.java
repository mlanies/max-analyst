package defpackage;

import java.util.List;
import java.util.Locale;

/* loaded from: classes2.dex */
public final class p9c {
    public final jlc a;
    public final q33 b;

    public p9c(jlc jlcVar, q33 q33Var) {
        this.a = jlcVar;
        this.b = q33Var;
    }

    public static t28 d(d9c d9cVar, h9c h9cVar) {
        long j = h9cVar.b;
        t9c t9cVar = h9cVar.a;
        if (j > 0) {
            d9cVar.getClass();
            xlc xlcVarA = xlc.a(2, "SELECT * FROM recent WHERE recent_type=? AND server_id=?");
            xlcVarA.j(1, t9cVar.a);
            xlcVarA.j(2, j);
            return new t28(new b9c(d9cVar, xlcVarA, 3));
        }
        int iOrdinal = t9cVar.ordinal();
        int i = t9cVar.a;
        if (iOrdinal == 1) {
            d9cVar.getClass();
            xlc xlcVarA2 = xlc.a(2, "SELECT * FROM recent WHERE recent_type=? AND emoji=?");
            xlcVarA2.j(1, i);
            String str = ((by4) h9cVar).c;
            if (str == null) {
                xlcVarA2.W(2);
            } else {
                xlcVarA2.f(2, str);
            }
            return new t28(new b9c(d9cVar, xlcVarA2, 1));
        }
        if (iOrdinal == 2) {
            d9cVar.getClass();
            xlc xlcVarA3 = xlc.a(2, "SELECT * FROM recent WHERE recent_type=? AND sticker_id=?");
            xlcVarA3.j(1, i);
            xlcVarA3.j(2, ((j3e) h9cVar).c);
            return new t28(new b9c(d9cVar, xlcVarA3, 0));
        }
        if (iOrdinal != 3) {
            Locale locale = Locale.ENGLISH;
            throw new IllegalStateException("Unexpected value: " + t9cVar);
        }
        long j2 = ((vc6) h9cVar).c.s0;
        d9cVar.getClass();
        xlc xlcVarA4 = xlc.a(2, "SELECT * FROM recent WHERE recent_type=? AND gif_id=?");
        xlcVarA4.j(1, i);
        xlcVarA4.j(2, j2);
        return new t28(new b9c(d9cVar, xlcVarA4, 2));
    }

    public final qy9 a(List list) {
        return new q28(b(), new z72(21, list), 3).i(new z72(22, list), Integer.MAX_VALUE);
    }

    public final uqd b() {
        return this.a.n().h(new p4c(10));
    }

    public final qa3 c(List list) {
        return new qa3(this.a.n(), 2, new o9c(this, list, 1));
    }
}
