package defpackage;

import java.util.Arrays;

/* loaded from: classes2.dex */
public final class vne {
    public final long a;
    public final iua b;
    public final goe c;
    public final int d;
    public final long e;
    public final int f;
    public final byte[] g;
    public final long h;

    public vne(long j, iua iuaVar, goe goeVar, int i, long j2, int i2, byte[] bArr, long j3) {
        this.a = j;
        this.b = iuaVar;
        this.c = goeVar;
        this.d = i;
        this.e = j2;
        this.f = i2;
        this.g = bArr;
        this.h = j3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vne)) {
            return false;
        }
        vne vneVar = (vne) obj;
        return this.a == vneVar.a && this.b == vneVar.b && this.c == vneVar.c && this.d == vneVar.d && this.e == vneVar.e && this.f == vneVar.f && tpa.f(this.g, vneVar.g) && this.h == vneVar.h;
    }

    public final int hashCode() {
        return Long.hashCode(this.h) + ((Arrays.hashCode(this.g) + k7d.e(this.f, h4f.m(k7d.e(this.d, (this.c.hashCode() + ((this.b.hashCode() + (Long.hashCode(this.a) * 31)) * 31)) * 31, 31), 31, this.e), 31)) * 31);
    }

    public final String toString() {
        String string = Arrays.toString(this.g);
        StringBuilder sb = new StringBuilder("TaskEntity(id=");
        sb.append(this.a);
        sb.append(", type=");
        sb.append(this.b);
        sb.append(", status=");
        sb.append(this.c);
        sb.append(", failsCount=");
        sb.append(this.d);
        sb.append(", dependsRequestId=");
        sb.append(this.e);
        sb.append(", dependencyType=");
        sb.append(this.f);
        sb.append(", data=");
        sb.append(string);
        sb.append(", createdTime=");
        return zr6.k(sb, this.h, ")");
    }
}
