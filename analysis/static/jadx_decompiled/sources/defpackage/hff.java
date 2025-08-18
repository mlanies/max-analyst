package defpackage;

/* loaded from: classes.dex */
public final class hff {
    public int a;
    public int b;
    public int c;
    public int d;
    public float e;
    public int f;
    public int g;
    public boolean h;

    public final iff a() {
        fm9.j("Bitrate can not be set if enabling high quality targeting.", !this.h || this.a == -1);
        fm9.j("Bitrate mode must be VBR if enabling high quality targeting.", !this.h || this.b == 1);
        return new iff(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h);
    }

    public final void b() {
        this.h = false;
    }

    public final void c(int i) {
        this.a = i;
    }

    public final void d() {
        this.c = -1;
        this.d = -1;
    }
}
