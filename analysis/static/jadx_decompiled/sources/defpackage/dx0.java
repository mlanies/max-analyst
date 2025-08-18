package defpackage;

import java.io.File;

/* loaded from: classes.dex */
public abstract class dx0 implements Comparable {
    public final File X;
    public final long Y;
    public final String a;
    public final long b;
    public final long c;
    public final boolean o;

    public dx0(String str, long j, long j2, long j3, File file) {
        this.a = str;
        this.b = j;
        this.c = j2;
        this.o = file != null;
        this.X = file;
        this.Y = j3;
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int compareTo(dx0 dx0Var) {
        String str = dx0Var.a;
        String str2 = this.a;
        if (!str2.equals(str)) {
            return str2.compareTo(dx0Var.a);
        }
        long j = this.b - dx0Var.b;
        if (j == 0) {
            return 0;
        }
        return j < 0 ? -1 : 1;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(44);
        sb.append("[");
        sb.append(this.b);
        sb.append(", ");
        return zr6.k(sb, this.c, "]");
    }
}
