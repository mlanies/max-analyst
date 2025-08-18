package defpackage;

import android.net.Uri;

/* loaded from: classes2.dex */
public final class b24 extends ok0 {
    public final String j;
    public final int k;
    public final int l;

    public b24(String str, String str2, long j, long j2, long j3, boolean z, uy uyVar, boolean z2, int i, int i2, int i3, int i4) {
        super(i, i2, j2, j, j3, uyVar, str, z, z2);
        this.j = str2;
        this.k = i3;
        this.l = i4;
    }

    @Override // defpackage.ok0
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b24.class != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        b24 b24Var = (b24) obj;
        if (this.k == b24Var.k && this.l == b24Var.l) {
            return this.j.equals(b24Var.j);
        }
        return false;
    }

    @Override // defpackage.fef
    public final int getHeight() {
        return this.l;
    }

    @Override // defpackage.fef
    public final int getWidth() {
        return this.k;
    }

    @Override // defpackage.ok0
    public final int hashCode() {
        return ((rh4.d(super.hashCode() * 31, 31, this.j) + this.k) * 31) + this.l;
    }

    @Override // defpackage.fef
    public final int j() {
        return 2;
    }

    @Override // defpackage.fef
    public final Uri l() {
        return Uri.parse(this.j);
    }
}
