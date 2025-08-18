package defpackage;

/* loaded from: classes.dex */
public final class k3g {
    public final boolean a;
    public final Integer b;
    public final boolean c;
    public final Integer d;
    public final boolean e;
    public final boolean f;

    public k3g(boolean z, Integer num, boolean z2, Integer num2, boolean z3, boolean z4) {
        this.a = z;
        this.b = num;
        this.c = z2;
        this.d = num2;
        this.e = z3;
        this.f = z4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k3g)) {
            return false;
        }
        k3g k3gVar = (k3g) obj;
        return this.a == k3gVar.a && tpa.f(this.b, k3gVar.b) && this.c == k3gVar.c && tpa.f(this.d, k3gVar.d) && this.e == k3gVar.e && this.f == k3gVar.f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        boolean z = this.a;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = i * 31;
        Integer num = this.b;
        int iHashCode = (i2 + (num != null ? num.hashCode() : 0)) * 31;
        boolean z2 = this.c;
        int i3 = z2;
        if (z2 != 0) {
            i3 = 1;
        }
        int i4 = (iHashCode + i3) * 31;
        Integer num2 = this.d;
        int iHashCode2 = (i4 + (num2 != null ? num2.hashCode() : 0)) * 31;
        boolean z3 = this.e;
        int i5 = z3;
        if (z3 != 0) {
            i5 = 1;
        }
        int i6 = (iHashCode2 + i5) * 31;
        boolean z4 = this.f;
        return i6 + (z4 ? 1 : z4 ? 1 : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WebSocketExtensions(perMessageDeflate=");
        sb.append(this.a);
        sb.append(", clientMaxWindowBits=");
        sb.append(this.b);
        sb.append(", clientNoContextTakeover=");
        sb.append(this.c);
        sb.append(", serverMaxWindowBits=");
        sb.append(this.d);
        sb.append(", serverNoContextTakeover=");
        sb.append(this.e);
        sb.append(", unknownValues=");
        return au1.j(sb, this.f, ")");
    }
}
