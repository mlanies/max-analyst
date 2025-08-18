package defpackage;

import java.util.Arrays;

/* loaded from: classes2.dex */
public final class vbc implements xbc {
    public final long a;
    public final byte[] b;

    public vbc(long j, byte[] bArr) {
        this.a = j;
        this.b = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vbc)) {
            return false;
        }
        vbc vbcVar = (vbc) obj;
        return this.a == vbcVar.a && tpa.f(this.b, vbcVar.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.b) + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        String string = Arrays.toString(this.b);
        StringBuilder sb = new StringBuilder("AudioMsg(duration=");
        ms2.j(this.a, ", wave=", string, sb);
        sb.append(")");
        return sb.toString();
    }
}
