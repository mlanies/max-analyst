package defpackage;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class q0f implements su0 {
    public final qze a;
    public final int[] b;
    public final int c;
    public final boolean[] o;

    public q0f(qze qzeVar, int[] iArr, int i, boolean[] zArr) {
        int length = iArr.length;
        int i2 = qzeVar.a;
        np8.d(i2 == length && i2 == zArr.length);
        this.a = qzeVar;
        this.b = (int[]) iArr.clone();
        this.c = i;
        this.o = (boolean[]) zArr.clone();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || q0f.class != obj.getClass()) {
            return false;
        }
        q0f q0fVar = (q0f) obj;
        return this.c == q0fVar.c && this.a.equals(q0fVar.a) && Arrays.equals(this.b, q0fVar.b) && Arrays.equals(this.o, q0fVar.o);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.o) + ((((Arrays.hashCode(this.b) + (this.a.hashCode() * 31)) * 31) + this.c) * 31);
    }
}
