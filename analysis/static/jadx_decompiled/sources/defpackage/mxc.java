package defpackage;

import android.content.Context;
import ru.ok.tamtam.nano.Protos;

/* loaded from: classes2.dex */
public final class mxc extends ckc {
    public final /* synthetic */ int b;

    public /* synthetic */ mxc(int i) {
        this.b = i;
    }

    @Override // defpackage.ckc
    public final Object b(v4 v4Var) {
        switch (this.b) {
            case 0:
                return new hu8(v4Var.d(r79.class), v4Var.d(s8g.class));
            case 1:
                return new mb6(v4Var.d(blb.class), v4Var.d(q33.class), v4Var.d(zua.class));
            case 2:
                return new hhb((av0) v4Var.c(av0.class), v4Var.d(kke.class));
            case 3:
                return new cz3((av0) v4Var.c(av0.class), (kke) v4Var.c(kke.class));
            case 4:
                return new dxa((av0) v4Var.c(av0.class), (kke) v4Var.c(kke.class));
            case 5:
                return new b6e(v4Var.d(a4e.class), v4Var.d(y4e.class), (o2e) v4Var.c(o2e.class), (kke) v4Var.c(kke.class));
            case 6:
                return new g6e(v4Var.d(a4e.class), v4Var.d(y4e.class), (kke) v4Var.c(kke.class));
            case 7:
                return new gc6(v4Var.d(pk.class), v4Var.d(uc6.class));
            case 8:
                return new uc6(v4Var.d(b9a.class), v4Var.d(ds3.class), v4Var.d(bn3.class));
            case 9:
                return new ysf(v4Var);
            case 10:
                return new ejf(v4Var.d(Context.class), v4Var.d(eua.class), v4Var.d(zi5.class));
            case 11:
                return (ygf) v4Var.c(ejf.class);
            case Protos.Attaches.Attach.PRESENT /* 12 */:
                return new o60(v4Var.d(Context.class), v4Var.d(eua.class), v4Var.d(zi5.class));
            case 13:
                return new pk7(v4Var.d(al.class));
            default:
                return new lac();
        }
    }
}
