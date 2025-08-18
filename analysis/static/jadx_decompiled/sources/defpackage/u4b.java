package defpackage;

/* loaded from: classes.dex */
public final /* synthetic */ class u4b implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ v4b b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int o;

    public /* synthetic */ u4b(v4b v4bVar, int i, int i2, int i3) {
        this.a = i3;
        this.b = v4bVar;
        this.c = i;
        this.o = i2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                x4b x4bVar = this.b.g;
                if (x4bVar.t1(25) || x4bVar.t1(33)) {
                    boolean zT1 = x4bVar.t1(33);
                    int i = this.c;
                    if (!zT1) {
                        x4bVar.I0(i);
                        break;
                    } else {
                        x4bVar.L(i, this.o);
                        break;
                    }
                }
                break;
            default:
                x4b x4bVar2 = this.b.g;
                if (x4bVar2.t1(26) || x4bVar2.t1(34)) {
                    int i2 = this.c;
                    int i3 = this.o;
                    if (i2 == -100) {
                        if (!x4bVar2.t1(34)) {
                            x4bVar2.q0(true);
                            break;
                        } else {
                            x4bVar2.H(i3, true);
                            break;
                        }
                    } else if (i2 == -1) {
                        if (!x4bVar2.t1(34)) {
                            x4bVar2.J();
                            break;
                        } else {
                            x4bVar2.g0(i3);
                            break;
                        }
                    } else if (i2 == 1) {
                        if (!x4bVar2.t1(34)) {
                            x4bVar2.D0();
                            break;
                        } else {
                            x4bVar2.N(i3);
                            break;
                        }
                    } else if (i2 == 100) {
                        if (!x4bVar2.t1(34)) {
                            x4bVar2.q0(false);
                            break;
                        } else {
                            x4bVar2.H(i3, false);
                            break;
                        }
                    } else if (i2 == 101) {
                        if (!x4bVar2.t1(34)) {
                            x4bVar2.q0(!x4bVar2.T0());
                            break;
                        } else {
                            x4bVar2.H(i3, !x4bVar2.T0());
                            break;
                        }
                    } else {
                        ey8.k(i2, "onAdjustVolume: Ignoring unknown direction: ");
                        break;
                    }
                }
                break;
        }
    }
}
