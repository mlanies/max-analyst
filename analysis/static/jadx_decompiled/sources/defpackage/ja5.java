package defpackage;

import java.util.zip.ZipEntry;

/* loaded from: classes.dex */
public final class ja5 extends dle implements Comparable {
    public final int X;
    public final ZipEntry o;

    public ja5(String str, ZipEntry zipEntry, int i) {
        super(str, 12, String.valueOf(zipEntry.getCrc()));
        this.o = zipEntry;
        this.X = i;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return ((String) this.b).compareTo((String) ((ja5) obj).b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ja5.class != obj.getClass()) {
            return false;
        }
        ja5 ja5Var = (ja5) obj;
        return this.o.equals(ja5Var.o) && this.X == ja5Var.X;
    }

    public final int hashCode() {
        return this.o.hashCode() + (this.X * 31);
    }
}
