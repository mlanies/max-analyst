package defpackage;

/* loaded from: classes2.dex */
public final class jle implements hle {
    public final je7 a;
    public final khe b;
    public final khe c;
    public final khe d;
    public final khe e;
    public final je7 f;
    public final khe g;
    public final khe h;

    public jle(khe kheVar, khe kheVar2) {
        this.a = kheVar;
        this.f = kheVar2;
        this.c = new khe(new z30(28, kheVar));
        this.d = new khe(new z30(29, kheVar));
        this.b = new khe(new ile(0, kheVar));
        this.e = new khe(new ile(1, kheVar));
        this.g = new khe(new ile(2, kheVar));
        this.h = new khe(new ile(3, kheVar));
    }

    public final ztc a() {
        return (ztc) this.b.getValue();
    }

    public final ztc b() {
        return (ztc) this.f.getValue();
    }
}
