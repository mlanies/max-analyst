package defpackage;

import java.util.List;

/* loaded from: classes2.dex */
public final class rfb extends ka1 {
    public final jqe b;
    public final jqe c;
    public final List d;

    public rfb(jqe jqeVar, jqe jqeVar2, List list) {
        super(9);
        this.b = jqeVar;
        this.c = jqeVar2;
        this.d = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rfb)) {
            return false;
        }
        rfb rfbVar = (rfb) obj;
        return tpa.f(this.b, rfbVar.b) && tpa.f(this.c, rfbVar.c) && tpa.f(this.d, rfbVar.d);
    }

    public final int hashCode() {
        int iHashCode = this.b.hashCode() * 31;
        jqe jqeVar = this.c;
        return this.d.hashCode() + ((iHashCode + (jqeVar == null ? 0 : jqeVar.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ShowConfirmation(title=");
        sb.append(this.b);
        sb.append(", description=");
        sb.append(this.c);
        sb.append(", buttons=");
        return au1.i(sb, this.d, ")");
    }
}
