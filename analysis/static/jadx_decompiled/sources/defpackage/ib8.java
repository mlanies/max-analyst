package defpackage;

import android.net.Uri;
import java.util.List;

/* loaded from: classes.dex */
public final class ib8 {
    public static final String j;
    public static final String k;
    public static final String l;
    public static final String m;
    public static final String n;
    public static final String o;
    public static final String p;
    public static final String q;
    public final Uri a;
    public final String b;
    public final eb8 c;
    public final xa8 d;
    public final List e;
    public final String f;
    public final zw6 g;
    public final Object h;
    public final long i;

    static {
        int i = oaf.a;
        j = Integer.toString(0, 36);
        k = Integer.toString(1, 36);
        l = Integer.toString(2, 36);
        m = Integer.toString(3, 36);
        n = Integer.toString(4, 36);
        o = Integer.toString(5, 36);
        p = Integer.toString(6, 36);
        q = Integer.toString(7, 36);
    }

    public ib8(Uri uri, String str, eb8 eb8Var, xa8 xa8Var, List list, String str2, zw6 zw6Var, Object obj, long j2) {
        this.a = uri;
        this.b = ia9.l(str);
        this.c = eb8Var;
        this.d = xa8Var;
        this.e = list;
        this.f = str2;
        this.g = zw6Var;
        ww6 ww6VarI = zw6.i();
        for (int i = 0; i < zw6Var.size(); i++) {
            ww6VarI.d(new nb8(((pb8) zw6Var.get(i)).a()));
        }
        ww6VarI.j();
        this.h = obj;
        this.i = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ib8)) {
            return false;
        }
        ib8 ib8Var = (ib8) obj;
        return this.a.equals(ib8Var.a) && oaf.a(this.b, ib8Var.b) && oaf.a(this.c, ib8Var.c) && oaf.a(this.d, ib8Var.d) && this.e.equals(ib8Var.e) && oaf.a(this.f, ib8Var.f) && this.g.equals(ib8Var.g) && oaf.a(this.h, ib8Var.h) && Long.valueOf(this.i).equals(Long.valueOf(ib8Var.i));
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        eb8 eb8Var = this.c;
        int iHashCode3 = (iHashCode2 + (eb8Var == null ? 0 : eb8Var.hashCode())) * 31;
        xa8 xa8Var = this.d;
        int iHashCode4 = (this.e.hashCode() + ((iHashCode3 + (xa8Var == null ? 0 : xa8Var.hashCode())) * 31)) * 31;
        String str2 = this.f;
        int iHashCode5 = (this.g.hashCode() + ((iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31;
        return (int) (((iHashCode5 + (this.h != null ? r2.hashCode() : 0)) * 31) + this.i);
    }
}
