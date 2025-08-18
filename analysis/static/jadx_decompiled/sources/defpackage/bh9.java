package defpackage;

import java.util.Map;

/* loaded from: classes2.dex */
public final class bh9 {
    public final CharSequence a;
    public final CharSequence b;
    public final Map c;

    public bh9(CharSequence charSequence, CharSequence charSequence2, Map map) {
        this.a = charSequence;
        this.b = charSequence2;
        this.c = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bh9)) {
            return false;
        }
        bh9 bh9Var = (bh9) obj;
        return tpa.f(this.a, bh9Var.a) && tpa.f(this.b, bh9Var.b) && tpa.f(this.c, bh9Var.c);
    }

    public final int hashCode() {
        CharSequence charSequence = this.a;
        return this.c.hashCode() + rh4.f(this.b, (charSequence == null ? 0 : charSequence.hashCode()) * 31, 31);
    }

    public final String toString() {
        return "MediaMetadata(artist=" + ((Object) this.a) + ", track=" + ((Object) this.b) + ", extras=" + this.c + ")";
    }
}
