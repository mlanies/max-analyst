package defpackage;

import android.graphics.Bitmap;

/* loaded from: classes2.dex */
public final class iqb {
    public final CharSequence a;
    public final CharSequence b;
    public final Bitmap c;

    public iqb(String str, String str2, Bitmap bitmap) {
        this.a = str;
        this.b = str2;
        this.c = bitmap;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iqb)) {
            return false;
        }
        iqb iqbVar = (iqb) obj;
        return tpa.f(this.a, iqbVar.a) && tpa.f(this.b, iqbVar.b) && tpa.f(this.c, iqbVar.c);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        CharSequence charSequence = this.b;
        int iHashCode2 = (iHashCode + (charSequence == null ? 0 : charSequence.hashCode())) * 31;
        Bitmap bitmap = this.c;
        return iHashCode2 + (bitmap != null ? bitmap.hashCode() : 0);
    }

    public final String toString() {
        return "QrCodeData(name=" + ((Object) this.a) + ", shortName=" + ((Object) this.b) + ", qrCode=" + this.c + ")";
    }
}
