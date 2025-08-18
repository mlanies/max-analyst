package defpackage;

import android.net.Uri;
import java.util.Collections;

/* loaded from: classes.dex */
public final class rb8 implements su0 {
    public static final wa8 Y;
    public final cb8 X;
    public final String a;
    public final kb8 b;
    public final gb8 c;
    public final fd8 o;

    static {
        za8 za8Var = new za8();
        ls5 ls5Var = zw6.b;
        ffc ffcVar = ffc.X;
        Collections.emptyList();
        ffc ffcVar2 = ffc.X;
        za8Var.b();
        fd8 fd8Var = fd8.S0;
        Y = new wa8(0);
    }

    public rb8(String str, cb8 cb8Var, kb8 kb8Var, gb8 gb8Var, fd8 fd8Var) {
        this.a = str;
        this.b = kb8Var;
        this.c = gb8Var;
        this.o = fd8Var;
        this.X = cb8Var;
    }

    public static rb8 a(Uri uri) {
        za8 za8Var = new za8();
        ls5 ls5Var = zw6.b;
        ffc ffcVar = ffc.X;
        return new rb8("", new cb8(za8Var), uri != null ? new kb8(uri, null, Collections.emptyList(), ffc.X) : null, new gb8(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L, -3.4028235E38f, -3.4028235E38f), fd8.S0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rb8)) {
            return false;
        }
        rb8 rb8Var = (rb8) obj;
        return maf.a(this.a, rb8Var.a) && this.X.equals(rb8Var.X) && maf.a(this.b, rb8Var.b) && maf.a(this.c, rb8Var.c) && maf.a(this.o, rb8Var.o);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        kb8 kb8Var = this.b;
        return this.o.hashCode() + ((this.X.hashCode() + ((this.c.hashCode() + ((iHashCode + (kb8Var != null ? kb8Var.hashCode() : 0)) * 31)) * 31)) * 31);
    }
}
