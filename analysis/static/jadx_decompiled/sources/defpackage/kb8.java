package defpackage;

import android.net.Uri;
import java.util.List;

/* loaded from: classes.dex */
public final class kb8 {
    public final Uri a;
    public final List c;
    public final zw6 e;
    public final Object f;
    public final String b = null;
    public final String d = null;

    public kb8(Uri uri, br7 br7Var, List list, ffc ffcVar) {
        this.a = uri;
        this.c = list;
        this.e = ffcVar;
        ww6 ww6VarI = zw6.i();
        for (int i = 0; i < ffcVar.size(); i++) {
            ww6VarI.d(new mb8(((mb8) ffcVar.get(i)).a()));
        }
        ww6VarI.j();
        this.f = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kb8)) {
            return false;
        }
        kb8 kb8Var = (kb8) obj;
        if (this.a.equals(kb8Var.a) && maf.a(this.b, kb8Var.b)) {
            kb8Var.getClass();
            if (maf.a(null, null) && maf.a(null, null) && this.c.equals(kb8Var.c) && maf.a(this.d, kb8Var.d) && this.e.equals(kb8Var.e) && maf.a(this.f, kb8Var.f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        int iHashCode2 = (this.c.hashCode() + ((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + 0) * 961)) * 31;
        String str2 = this.d;
        int iHashCode3 = (this.e.hashCode() + ((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31;
        Object obj = this.f;
        return iHashCode3 + (obj != null ? obj.hashCode() : 0);
    }
}
