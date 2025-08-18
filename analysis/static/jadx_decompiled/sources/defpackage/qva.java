package defpackage;

import java.io.Serializable;

/* loaded from: classes.dex */
public final class qva implements Serializable {
    public boolean X;
    public boolean Y;
    public boolean Z;
    public int a;
    public long b;
    public boolean c;
    public String o;
    public int s0;
    public String t0;
    public int u0;
    public String v0;

    public final boolean equals(Object obj) {
        qva qvaVar;
        return (obj instanceof qva) && (qvaVar = (qva) obj) != null && (this == qvaVar || (this.a == qvaVar.a && this.b == qvaVar.b && this.o.equals(qvaVar.o) && this.Y == qvaVar.Y && this.s0 == qvaVar.s0 && this.t0.equals(qvaVar.t0) && this.u0 == qvaVar.u0 && this.v0.equals(qvaVar.v0)));
    }

    public final int hashCode() {
        return ((this.v0.hashCode() + ey8.g(this.u0, rh4.d((((rh4.d((Long.valueOf(this.b).hashCode() + ((2173 + this.a) * 53)) * 53, 53, this.o) + (this.Y ? 1231 : 1237)) * 53) + this.s0) * 53, 53, this.t0), 53)) * 53) + 1237;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Country Code: ");
        sb.append(this.a);
        sb.append(" National Number: ");
        sb.append(this.b);
        if (this.X && this.Y) {
            sb.append(" Leading Zero(s): true");
        }
        if (this.Z) {
            sb.append(" Number of leading zeros: ");
            sb.append(this.s0);
        }
        if (this.c) {
            sb.append(" Extension: ");
            sb.append(this.o);
        }
        return sb.toString();
    }
}
