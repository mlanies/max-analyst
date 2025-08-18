package defpackage;

import java.util.List;

/* loaded from: classes2.dex */
public final class xnd {
    public static final xnd c = new xnd(wnd.a, nz4.a);
    public final wnd a;
    public final List b;

    public xnd(wnd wndVar, List list) {
        this.a = wndVar;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xnd)) {
            return false;
        }
        xnd xndVar = (xnd) obj;
        return this.a == xndVar.a && tpa.f(this.b, xndVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ShowcaseState(state=");
        sb.append(this.a);
        sb.append(", content=");
        return au1.i(sb, this.b, ")");
    }
}
