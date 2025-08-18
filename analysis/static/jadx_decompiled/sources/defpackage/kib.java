package defpackage;

import java.util.List;

/* loaded from: classes2.dex */
public final class kib extends cjb {
    public final List a;
    public final List b;
    public final boolean c;

    public kib(List list, List list2, boolean z) {
        this.a = list;
        this.b = list2;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kib)) {
            return false;
        }
        kib kibVar = (kib) obj;
        return tpa.f(this.a, kibVar.a) && tpa.f(this.b, kibVar.b) && this.c == kibVar.c;
    }

    @Override // defpackage.ol7
    public final long getItemId() {
        return 1;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + k7d.g(this.b, this.a.hashCode() * 31, 31);
    }

    @Override // defpackage.ol7
    /* renamed from: l */
    public final int getI0() {
        return 1;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ButtonsStack(buttons=");
        sb.append(this.a);
        sb.append(", contextMenuButtons=");
        sb.append(this.b);
        sb.append(", isMoreButtonEnabled=");
        return au1.j(sb, this.c, ")");
    }
}
