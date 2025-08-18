package defpackage;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class ds5 extends iqd implements w66 {
    public final /* synthetic */ int a;
    public final wq5 b;

    public /* synthetic */ ds5(p0 p0Var, int i) {
        this.a = i;
        this.b = p0Var;
    }

    @Override // defpackage.w66
    public final wq5 b() {
        switch (this.a) {
            case 0:
                return new cs5(this.b, null, 0);
            default:
                return new yr5(this.b, os.a, 1);
        }
    }

    @Override // defpackage.iqd
    public final void l(erd erdVar) {
        wq5 wq5Var = this.b;
        switch (this.a) {
            case 0:
                wq5Var.c(new zq5(erdVar, null));
                break;
            default:
                try {
                    ArrayList arrayList = new ArrayList();
                    p45 p45Var = q45.a;
                    wq5Var.c(new ks5(erdVar, arrayList));
                    break;
                } catch (Throwable th) {
                    c37.B(th);
                    iz4.c(th, erdVar);
                    return;
                }
        }
    }
}
