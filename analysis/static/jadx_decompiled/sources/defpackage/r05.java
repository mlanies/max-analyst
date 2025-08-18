package defpackage;

/* loaded from: classes.dex */
public final /* synthetic */ class r05 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ d15 b;

    public /* synthetic */ r05(d15 d15Var, int i) {
        this.a = i;
        this.b = d15Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                d15 d15Var = this.b;
                kq0.a(d15Var.a(), new re6(13, d15Var), d15Var.h);
                return;
            case 1:
                d15 d15Var2 = this.b;
                d15Var2.h.execute(new r05(d15Var2, 2));
                return;
            case 2:
                d15 d15Var3 = this.b;
                if (d15Var3.v) {
                    d15Var3.w = null;
                    d15Var3.j();
                    d15Var3.v = false;
                    return;
                }
                return;
            case 3:
                d15 d15Var4 = this.b;
                int iS = au1.s(d15Var4.D);
                if (iS == 1) {
                    d15Var4.g();
                    return;
                } else {
                    if (iS == 6 || iS == 8) {
                        throw new IllegalStateException("Encoder is released");
                    }
                    return;
                }
            case 4:
                d15 d15Var5 = this.b;
                switch (au1.s(d15Var5.D)) {
                    case 0:
                    case 1:
                    case 2:
                    case 7:
                        d15Var5.f();
                        return;
                    case 3:
                    case 4:
                    case 5:
                        d15Var5.i(7);
                        return;
                    case 6:
                    case 8:
                        return;
                    default:
                        throw new IllegalStateException("Unknown state: ".concat(rh4.r(d15Var5.D)));
                }
            default:
                d15 d15Var6 = this.b;
                d15Var6.A = true;
                if (d15Var6.z) {
                    d15Var6.e.stop();
                    d15Var6.h();
                    return;
                }
                return;
        }
    }
}
