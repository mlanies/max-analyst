package defpackage;

import android.net.Uri;
import java.util.List;
import java.util.UUID;

/* loaded from: classes.dex */
public final class ya8 {
    public String a;
    public Uri b;
    public String c;
    public za8 d;
    public s74 e;
    public List f;
    public String g;
    public zw6 h;
    public xa8 i;
    public Object j;
    public long k;
    public gd8 l;
    public fb8 m;
    public lb8 n;

    public final tb8 a() {
        ib8 ib8Var;
        s74 s74Var = this.e;
        fm9.k(((Uri) s74Var.e) == null || ((UUID) s74Var.d) != null);
        Uri uri = this.b;
        if (uri != null) {
            s74 s74Var2 = this.e;
            ib8Var = new ib8(uri, this.c, ((UUID) s74Var2.d) != null ? s74Var2.a() : null, this.i, this.f, this.g, this.h, this.j, this.k);
        } else {
            ib8Var = null;
        }
        String str = this.a;
        if (str == null) {
            str = "";
        }
        String str2 = str;
        db8 db8VarC = this.d.c();
        hb8 hb8VarA = this.m.a();
        gd8 gd8Var = this.l;
        if (gd8Var == null) {
            gd8Var = gd8.J;
        }
        return new tb8(str2, db8VarC, ib8Var, hb8VarA, gd8Var, this.n);
    }

    public final void b(bb8 bb8Var) {
        this.d = bb8Var.a();
    }
}
