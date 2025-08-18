package defpackage;

import android.os.Parcelable;

/* loaded from: classes2.dex */
public final class dma extends wm9 {
    public final Parcelable b;
    public final String c;

    public dma(xw8 xw8Var, String str) {
        super(e5f.a);
        this.b = xw8Var;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dma)) {
            return false;
        }
        dma dmaVar = (dma) obj;
        return tpa.f(this.b, dmaVar.b) && tpa.f(this.c, dmaVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + (this.b.hashCode() * 31);
    }

    public final String toString() {
        return "OpenImageLegacy(message=" + this.b + ", attachLocalId=" + this.c + ")";
    }
}
