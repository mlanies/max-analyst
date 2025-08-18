package defpackage;

import android.graphics.RectF;

/* loaded from: classes2.dex */
public final class ds2 {
    public final String a;
    public final String b;
    public final RectF c;

    public ds2(String str, String str2, RectF rectF) {
        this.a = str;
        this.b = str2;
        this.c = rectF;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ds2)) {
            return false;
        }
        ds2 ds2Var = (ds2) obj;
        return tpa.f(this.a, ds2Var.a) && tpa.f(this.b, ds2Var.b) && tpa.f(this.c, ds2Var.c);
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        RectF rectF = this.c;
        return iHashCode2 + (rectF != null ? rectF.hashCode() : 0);
    }

    public final String toString() {
        return "ChatTitleIconState(newIconPath=" + this.a + ", croppedIconPath=" + this.b + ", relativeCrop=" + this.c + ")";
    }
}
