package defpackage;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class wze {
    public final int a;
    public final byte[] b;
    public final int c;
    public final int d;

    public wze(int i, int i2, int i3, byte[] bArr) {
        this.a = i;
        this.b = bArr;
        this.c = i2;
        this.d = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || wze.class != obj.getClass()) {
            return false;
        }
        wze wzeVar = (wze) obj;
        return this.a == wzeVar.a && this.c == wzeVar.c && this.d == wzeVar.d && Arrays.equals(this.b, wzeVar.b);
    }

    public final int hashCode() {
        return ((((Arrays.hashCode(this.b) + (this.a * 31)) * 31) + this.c) * 31) + this.d;
    }
}
