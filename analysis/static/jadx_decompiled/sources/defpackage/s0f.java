package defpackage;

/* loaded from: classes.dex */
public final class s0f implements Comparable {
    public final Runnable a;
    public final long b;
    public final int c;
    public volatile boolean o;

    public s0f(Runnable runnable, Long l, int i) {
        this.a = runnable;
        this.b = l.longValue();
        this.c = i;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        s0f s0fVar = (s0f) obj;
        int iCompare = Long.compare(this.b, s0fVar.b);
        return iCompare == 0 ? Integer.compare(this.c, s0fVar.c) : iCompare;
    }
}
