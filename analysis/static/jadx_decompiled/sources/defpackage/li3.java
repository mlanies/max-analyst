package defpackage;

/* loaded from: classes.dex */
public final class li3 implements uue {
    public final long X;
    public int Y;
    public final float a;
    public final double b;
    public final int c;
    public final long o;

    public li3(float f, long j, long j2) {
        boolean z = false;
        fm9.f(j2 > 0);
        fm9.f(f > 0.0f);
        if (0 <= j && j < j2) {
            z = true;
        }
        fm9.f(z);
        this.o = j;
        this.X = j2;
        this.a = f;
        this.c = Math.round(((j2 - j) / 1000000.0f) * f);
        this.b = 1000000.0f / f;
    }

    @Override // defpackage.uue
    public final uue a() {
        return new li3(this.a, this.o, this.X);
    }

    @Override // defpackage.uue
    public final boolean hasNext() {
        return this.Y < this.c;
    }

    @Override // defpackage.uue
    public final long next() {
        fm9.k(hasNext());
        int i = this.Y;
        this.Y = i + 1;
        long jRound = Math.round(this.b * i) + this.o;
        fm9.k(jRound >= 0);
        return jRound;
    }
}
