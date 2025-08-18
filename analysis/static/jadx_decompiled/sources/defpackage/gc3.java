package defpackage;

/* loaded from: classes.dex */
public final class gc3 extends ar0 {
    public final ja7 c;
    public int o;

    public gc3(sh0 sh0Var, ja7 ja7Var) {
        super(sh0Var);
        this.c = ja7Var;
    }

    @Override // defpackage.ar0
    public final void k() {
        this.a = true;
        this.o++;
    }

    @Override // defpackage.ar0
    public final void l() {
        this.a = false;
        u("\n");
        int i = this.o;
        for (int i2 = 0; i2 < i; i2++) {
            u(this.c.a.g);
        }
    }

    @Override // defpackage.ar0
    public final void n() {
        if (this.a) {
            this.a = false;
        } else {
            l();
        }
    }

    @Override // defpackage.ar0
    public final void x() {
        t(' ');
    }

    @Override // defpackage.ar0
    public final void y() {
        this.o--;
    }
}
