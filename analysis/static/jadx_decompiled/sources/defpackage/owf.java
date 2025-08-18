package defpackage;

/* loaded from: classes2.dex */
public final class owf extends w97 {
    public final String c;

    public owf(String str) {
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof owf) && tpa.f(this.c, ((owf) obj).c);
    }

    public final int hashCode() {
        return this.c.hashCode();
    }

    public final String toString() {
        return zr6.l(new StringBuilder("RequestDownloadFile(fileName="), this.c, ")");
    }
}
