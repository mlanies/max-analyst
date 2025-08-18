package defpackage;

import java.io.File;

/* loaded from: classes.dex */
public abstract class ex0 implements Comparable {
    public final File X;
    public final long Y;
    public final String a;
    public final long b;
    public final long c;
    public final boolean o;

    public ex0(String str, long j, long j2, long j3, File file) {
        this.a = str;
        this.b = j;
        this.c = j2;
        this.o = file != null;
        this.X = file;
        this.Y = j3;
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int compareTo(ex0 ex0Var) {
        String str = ex0Var.a;
        String str2 = this.a;
        if (!str2.equals(str)) {
            return str2.compareTo(ex0Var.a);
        }
        long j = this.b - ex0Var.b;
        if (j == 0) {
            return 0;
        }
        return j < 0 ? -1 : 1;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        sb.append(this.b);
        sb.append(", ");
        return zr6.k(sb, this.c, "]");
    }
}
