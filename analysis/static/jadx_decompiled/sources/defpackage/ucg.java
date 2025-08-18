package defpackage;

/* loaded from: classes2.dex */
public final class ucg {
    public final int a;
    public final boolean b;

    public ucg(int i, boolean z) {
        this.a = i;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ucg)) {
            return false;
        }
        ucg ucgVar = (ucg) obj;
        return this.a == ucgVar.a && this.b == ucgVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (au1.s(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NetworkParameters(condition=");
        sb.append(zr6.s(this.a));
        sb.append(", preferHardwareVPX=");
        return au1.j(sb, this.b, ")");
    }
}
