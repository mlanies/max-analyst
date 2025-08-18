package defpackage;

/* loaded from: classes.dex */
public final class qhg extends rhg {
    public final /* synthetic */ rhg X;
    public final transient int c;
    public final transient int o;

    public qhg(rhg rhgVar, int i, int i2) {
        this.X = rhgVar;
        this.c = i;
        this.o = i2;
    }

    @Override // defpackage.ohg
    public final Object[] a() {
        return this.X.a();
    }

    @Override // defpackage.ohg
    public final int b() {
        return this.X.b() + this.c;
    }

    @Override // defpackage.ohg
    public final int c() {
        return this.X.b() + this.c + this.o;
    }

    @Override // defpackage.ohg
    public final boolean d() {
        return true;
    }

    @Override // defpackage.rhg, java.util.List
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public final rhg subList(int i, int i2) {
        lz7.b0(i, i2, this.o);
        int i3 = this.c;
        return this.X.subList(i + i3, i2 + i3);
    }

    @Override // java.util.List
    public final Object get(int i) {
        lz7.a0(i, this.o);
        return this.X.get(i + this.c);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.o;
    }
}
