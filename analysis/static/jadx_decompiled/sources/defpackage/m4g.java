package defpackage;

/* loaded from: classes.dex */
public final class m4g implements Comparable {
    public final int a;
    public final e4g b;

    public m4g(int i, e4g e4gVar) {
        this.a = i;
        this.b = e4gVar;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return Integer.compare(this.a, ((m4g) obj).a);
    }
}
