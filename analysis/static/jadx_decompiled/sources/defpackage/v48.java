package defpackage;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class v48 implements c58 {
    public final CharSequence a;
    public final List b;
    public final boolean c;

    public v48(CharSequence charSequence, ArrayList arrayList, boolean z) {
        this.a = charSequence;
        this.b = arrayList;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v48)) {
            return false;
        }
        v48 v48Var = (v48) obj;
        return tpa.f(this.a, v48Var.a) && tpa.f(this.b, v48Var.b) && this.c == v48Var.c;
    }

    public final int hashCode() {
        CharSequence charSequence = this.a;
        int iHashCode = (charSequence == null ? 0 : charSequence.hashCode()) * 31;
        List list = this.b;
        return Boolean.hashCode(this.c) + ((iHashCode + (list != null ? list.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FinishEditMessage(text=");
        sb.append((Object) this.a);
        sb.append(", media=");
        sb.append(this.b);
        sb.append(", mediaChanged=");
        return au1.j(sb, this.c, ")");
    }
}
