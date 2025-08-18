package defpackage;

import android.text.Layout;

/* loaded from: classes2.dex */
public final class zf5 implements o00 {
    public final long a;
    public final long b;
    public final String c;
    public final String d;
    public final Layout e;
    public final uf5 f;
    public final jqe g;
    public final String h;
    public final yf5 i;
    public final int j;
    public final yt6 k;
    public final wcf l;
    public final boolean m;
    public final j0e n;

    public zf5(long j, long j2, String str, String str2, Layout layout, uf5 uf5Var, jqe jqeVar, String str3, yf5 yf5Var, int i, yt6 yt6Var, wcf wcfVar, boolean z, q0e q0eVar) {
        this.a = j;
        this.b = j2;
        this.c = str;
        this.d = str2;
        this.e = layout;
        this.f = uf5Var;
        this.g = jqeVar;
        this.h = str3;
        this.i = yf5Var;
        this.j = i;
        this.k = yt6Var;
        this.l = wcfVar;
        this.m = z;
        this.n = q0eVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zf5)) {
            return false;
        }
        zf5 zf5Var = (zf5) obj;
        return this.b == zf5Var.b && this.a == zf5Var.a && tpa.f(this.c, zf5Var.c) && tpa.f(this.d, zf5Var.d) && tpa.f(this.e, zf5Var.e) && tpa.f(this.f, zf5Var.f) && tpa.f(this.g, zf5Var.g) && tpa.f(this.h, zf5Var.h) && this.j == zf5Var.j && tpa.f(this.k, zf5Var.k) && tpa.f(this.l, zf5Var.l) && this.m == zf5Var.m && tpa.f(this.i, zf5Var.i);
    }

    public final int hashCode() {
        int iHashCode = (this.f.hashCode() + ((this.e.hashCode() + rh4.d(rh4.d(h4f.m(Long.hashCode(this.b) * 31, 31, this.a), 31, this.c), 31, this.d)) * 31)) * 31;
        jqe jqeVar = this.g;
        int iHashCode2 = (iHashCode + (jqeVar != null ? jqeVar.hashCode() : 0)) * 31;
        String str = this.h;
        int iG = ey8.g(this.j, (iHashCode2 + (str != null ? str.hashCode() : 0)) * 31, 31);
        yt6 yt6Var = this.k;
        int iHashCode3 = (iG + (yt6Var != null ? yt6Var.hashCode() : 0)) * 31;
        wcf wcfVar = this.l;
        int iD = ms2.d((iHashCode3 + (wcfVar != null ? wcfVar.hashCode() : 0)) * 31, 31, this.m);
        yf5 yf5Var = this.i;
        return iD + (yf5Var != null ? yf5Var.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FileAttachModel(fileId=");
        sb.append(this.a);
        sb.append(", messageId=");
        sb.append(this.b);
        sb.append(", attachLocalId=");
        sb.append(this.c);
        sb.append(", fileName=");
        sb.append(this.d);
        sb.append(", fileNameLayout=");
        sb.append(this.e);
        sb.append(", extension=");
        sb.append(this.f);
        sb.append(", size=");
        sb.append(this.g);
        sb.append(", localPath=");
        sb.append(this.h);
        sb.append(", state=");
        sb.append(this.i);
        sb.append(", type=");
        int i = this.j;
        sb.append(i != 1 ? i != 2 ? i != 3 ? i != 4 ? "null" : "UNKNOWN" : "GIF" : "VIDEO" : "PHOTO");
        sb.append(", imageAttachConfig=");
        sb.append(this.k);
        sb.append(", videoAttachConfig=");
        sb.append(this.l);
        sb.append(", hasText=");
        sb.append(this.m);
        sb.append(", stateFlow=");
        sb.append(this.n);
        sb.append(")");
        return sb.toString();
    }
}
