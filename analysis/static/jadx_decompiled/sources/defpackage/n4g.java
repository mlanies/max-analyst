package defpackage;

/* loaded from: classes.dex */
public final class n4g implements Comparable {
    public final int a;
    public final f4g b;

    public n4g(int i, f4g f4gVar) {
        this.a = i;
        this.b = f4gVar;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return Integer.compare(this.a, ((n4g) obj).a);
    }
}
