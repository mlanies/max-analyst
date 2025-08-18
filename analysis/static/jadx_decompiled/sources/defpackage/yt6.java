package defpackage;

import android.net.Uri;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;

/* loaded from: classes2.dex */
public final class yt6 implements a53 {
    public static final yt6 m = new yt6(0, Uri.parse("error"), -1, -1, false, -1, false, null, null, null, null, 3584);
    public final long a;
    public final Uri b;
    public final int c;
    public final int d;
    public final boolean e;
    public final int f;
    public final boolean g;
    public final Uri h;
    public final jic i;
    public final rsc j;
    public final String k;
    public final Uri l;

    public yt6(long j, Uri uri, int i, int i2, boolean z, int i3, boolean z2, Uri uri2, jic jicVar, String str, Uri uri3, int i4) {
        jic jicVar2 = (i4 & 256) != 0 ? null : jicVar;
        ssc sscVar = ssc.l;
        String str2 = (i4 & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) != 0 ? null : str;
        Uri uri4 = (i4 & 2048) == 0 ? uri3 : null;
        this.a = j;
        this.b = uri;
        this.c = i;
        this.d = i2;
        this.e = z;
        this.f = i3;
        this.g = z2;
        this.h = uri2;
        this.i = jicVar2;
        this.j = sscVar;
        this.k = str2;
        this.l = uri4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yt6)) {
            return false;
        }
        yt6 yt6Var = (yt6) obj;
        return this.a == yt6Var.a && tpa.f(this.b, yt6Var.b) && this.c == yt6Var.c && this.d == yt6Var.d && this.e == yt6Var.e && this.f == yt6Var.f && this.g == yt6Var.g && tpa.f(this.h, yt6Var.h) && tpa.f(this.i, yt6Var.i) && tpa.f(this.j, yt6Var.j) && tpa.f(this.k, yt6Var.k) && tpa.f(this.l, yt6Var.l);
    }

    public final int hashCode() {
        int iD = ms2.d(k7d.e(this.f, ms2.d(k7d.e(this.d, k7d.e(this.c, (this.b.hashCode() + (Long.hashCode(this.a) * 31)) * 31, 31), 31), 31, this.e), 31), 31, this.g);
        Uri uri = this.h;
        int iHashCode = (iD + (uri == null ? 0 : uri.hashCode())) * 31;
        jic jicVar = this.i;
        int iHashCode2 = (this.j.hashCode() + ((iHashCode + (jicVar == null ? 0 : jicVar.hashCode())) * 31)) * 31;
        String str = this.k;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        Uri uri2 = this.l;
        return iHashCode3 + (uri2 != null ? uri2.hashCode() : 0);
    }

    @Override // defpackage.a53
    public final String i() {
        return this.k;
    }

    public final String toString() {
        return "ImageAttachConfig(photoId=" + this.a + ", uri=" + this.b + ", width=" + this.c + ", height=" + this.d + ", isGif=" + this.e + ", maxImageViewHeight=" + this.f + ", isAutoLoadImageDisabled=" + this.g + ", lowResUri=" + this.h + ", resizeOptions=" + this.i + ", scaleType=" + this.j + ", attachId=" + this.k + ", gifUri=" + this.l + ")";
    }
}
