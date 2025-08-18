package defpackage;

/* loaded from: classes.dex */
public final class kje implements Comparable {
    public final int a;
    public final int b;
    public final String c;
    public final String o;

    public kje(String str, int i, int i2, String str2) {
        this.a = i;
        this.b = i2;
        this.c = str;
        this.o = str2;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        kje kjeVar = (kje) obj;
        int i = this.a - kjeVar.a;
        return i == 0 ? this.b - kjeVar.b : i;
    }
}
