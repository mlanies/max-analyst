package defpackage;

import android.net.Uri;
import java.io.File;

/* loaded from: classes2.dex */
public final class wc6 extends ok0 {
    public final zi5 j;
    public final l20 k;

    public wc6(zi5 zi5Var, l20 l20Var) {
        super(-1, -1, 0L, 0L, 0L, null, null, false, true);
        this.j = zi5Var;
        this.k = l20Var;
    }

    @Override // defpackage.ok0
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || wc6.class != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        wc6 wc6Var = (wc6) obj;
        return this.j.equals(wc6Var.j) && this.k.equals(wc6Var.k);
    }

    @Override // defpackage.fef
    public final int getHeight() {
        return this.k.b.o;
    }

    @Override // defpackage.fef
    public final int getWidth() {
        return this.k.b.c;
    }

    @Override // defpackage.ok0
    public final int hashCode() {
        return au1.s(3) + ((this.k.hashCode() + ((this.j.hashCode() + (super.hashCode() * 31)) * 31)) * 31);
    }

    @Override // defpackage.fef
    public final int j() {
        return 3;
    }

    @Override // defpackage.fef
    public final Uri l() {
        l20 l20Var = this.k;
        if (!oag.t(l20Var.s)) {
            return Uri.parse(l20Var.s);
        }
        File fileK = ((kk5) this.j).k(l20Var.b.s0);
        return fileK.exists() ? Uri.fromFile(fileK) : Uri.fromFile(new File(l20Var.s));
    }
}
