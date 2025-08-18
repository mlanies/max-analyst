package defpackage;

import android.net.Uri;

/* loaded from: classes2.dex */
public final class wcf implements a53 {
    public static final wcf k;
    public final long a;
    public final Uri b;
    public final int c;
    public final int d;
    public final int e;
    public final long f;
    public final String g;
    public final Uri h;
    public final jic i;
    public final d20 j;

    static {
        Uri uri = Uri.EMPTY;
        int i = ft4.o;
        k = new wcf(0L, uri, -1, -1, -1, 0L, null, null, null, d20.a);
    }

    public wcf(long j, Uri uri, int i, int i2, int i3, long j2, String str, Uri uri2, jic jicVar, d20 d20Var) {
        this.a = j;
        this.b = uri;
        this.c = i;
        this.d = i2;
        this.e = i3;
        this.f = j2;
        this.g = str;
        this.h = uri2;
        this.i = jicVar;
        this.j = d20Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wcf)) {
            return false;
        }
        wcf wcfVar = (wcf) obj;
        return this.a == wcfVar.a && tpa.f(this.b, wcfVar.b) && this.c == wcfVar.c && this.d == wcfVar.d && this.e == wcfVar.e && ft4.d(this.f, wcfVar.f) && tpa.f(this.g, wcfVar.g) && tpa.f(this.h, wcfVar.h) && tpa.f(this.i, wcfVar.i) && this.j == wcfVar.j;
    }

    public final int hashCode() {
        int iE = k7d.e(this.e, k7d.e(this.d, k7d.e(this.c, (this.b.hashCode() + (Long.hashCode(this.a) * 31)) * 31, 31), 31), 31);
        int i = ft4.o;
        int iM = h4f.m(iE, 31, this.f);
        String str = this.g;
        int iHashCode = (iM + (str == null ? 0 : str.hashCode())) * 31;
        Uri uri = this.h;
        int iHashCode2 = (iHashCode + (uri == null ? 0 : uri.hashCode())) * 31;
        jic jicVar = this.i;
        return this.j.hashCode() + ((iHashCode2 + (jicVar != null ? jicVar.hashCode() : 0)) * 31);
    }

    @Override // defpackage.a53
    public final String i() {
        return this.g;
    }

    public final String toString() {
        return "VideoAttachConfig(videoId=" + this.a + ", previewUri=" + this.b + ", width=" + this.c + ", height=" + this.d + ", maxImageViewHeight=" + this.e + ", duration=" + ft4.j(this.f) + ", attachId=" + this.g + ", lowResUri=" + this.h + ", previewResizeOptions=" + this.i + ", status=" + this.j + ")";
    }
}
