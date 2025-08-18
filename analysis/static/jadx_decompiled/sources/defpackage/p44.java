package defpackage;

/* loaded from: classes2.dex */
public class p44 implements uue {
    public final long a;
    public boolean b;
    public final Object c;

    public p44(long j) {
        this.a = j;
        this.b = true;
        this.c = new es3(6, this);
    }

    @Override // defpackage.uue
    public uue a() {
        return new p44(((uue) this.c).a(), this.a);
    }

    @Override // defpackage.uue
    public boolean hasNext() {
        return !this.b && ((uue) this.c).hasNext();
    }

    @Override // defpackage.uue
    public long next() {
        fm9.k(hasNext());
        long next = ((uue) this.c).next();
        if (this.a <= next) {
            this.b = true;
        }
        return next;
    }

    public p44(uue uueVar, long j) {
        this.c = uueVar;
        this.a = j;
    }
}
