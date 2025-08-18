package defpackage;

import android.util.Base64;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class hc0 {
    public final String a;
    public final byte[] b;
    public final z8b c;

    public hc0(String str, byte[] bArr, z8b z8bVar) {
        this.a = str;
        this.b = bArr;
        this.c = z8bVar;
    }

    public static vq7 a() {
        vq7 vq7Var = new vq7();
        vq7Var.o = z8b.a;
        return vq7Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof hc0)) {
            return false;
        }
        hc0 hc0Var = (hc0) obj;
        return this.a.equals(hc0Var.a) && Arrays.equals(this.b, hc0Var.b) && this.c.equals(hc0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() ^ ((((this.a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.b)) * 1000003);
    }

    public final String toString() {
        byte[] bArr = this.b;
        return "TransportContext(" + this.a + ", " + this.c + ", " + (bArr == null ? "" : Base64.encodeToString(bArr, 2)) + ")";
    }
}
