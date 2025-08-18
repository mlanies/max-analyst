package defpackage;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class i05 {
    public final i15 a;
    public final byte[] b;

    public i05(i15 i15Var, byte[] bArr) {
        if (i15Var == null) {
            throw new NullPointerException("encoding is null");
        }
        if (bArr == null) {
            throw new NullPointerException("bytes is null");
        }
        this.a = i15Var;
        this.b = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i05)) {
            return false;
        }
        i05 i05Var = (i05) obj;
        if (this.a.equals(i05Var.a)) {
            return Arrays.equals(this.b, i05Var.b);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.b) ^ ((this.a.hashCode() ^ 1000003) * 1000003);
    }

    public final String toString() {
        return "EncodedPayload{encoding=" + this.a + ", bytes=[...]}";
    }
}
