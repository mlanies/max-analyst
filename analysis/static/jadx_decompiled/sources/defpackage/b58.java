package defpackage;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class b58 implements c58 {
    public final CharSequence a;
    public final List b;
    public final boolean c;

    public b58(CharSequence charSequence, ArrayList arrayList, boolean z) {
        this.a = charSequence;
        this.b = arrayList;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b58)) {
            return false;
        }
        b58 b58Var = (b58) obj;
        return tpa.f(this.a, b58Var.a) && tpa.f(this.b, b58Var.b) && this.c == b58Var.c;
    }

    public final int hashCode() {
        CharSequence charSequence = this.a;
        return Boolean.hashCode(this.c) + k7d.g(this.b, (charSequence == null ? 0 : charSequence.hashCode()) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SendMedia(caption=");
        sb.append((Object) this.a);
        sb.append(", media=");
        sb.append(this.b);
        sb.append(", sendAsFile=");
        return au1.j(sb, this.c, ")");
    }
}
