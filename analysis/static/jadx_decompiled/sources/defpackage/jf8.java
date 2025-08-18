package defpackage;

import android.media.MediaRoute2Info;
import android.media.MediaRouter2;
import android.media.MediaRouter2$TransferCallback;
import android.text.TextUtils;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public final class jf8 extends MediaRouter2$TransferCallback {
    public final /* synthetic */ kf8 a;

    public jf8(kf8 kf8Var) {
        this.a = kf8Var;
    }

    public final void onStop(MediaRouter2.RoutingController routingController) {
        tg8 tg8Var = (tg8) this.a.v0.remove(routingController);
        if (tg8Var == null) {
            Objects.toString(routingController);
            return;
        }
        ah8 ah8Var = (ah8) this.a.u0.b;
        if (tg8Var != ah8Var.s) {
            if (eh8.c) {
                Objects.toString(tg8Var);
            }
        } else {
            dh8 dh8VarC = ah8Var.c();
            if (ah8Var.f() != dh8VarC) {
                ah8Var.i(dh8VarC, 2);
            }
        }
    }

    public final void onTransfer(MediaRouter2.RoutingController routingController, MediaRouter2.RoutingController routingController2) {
        dh8 dh8Var;
        this.a.v0.remove(routingController);
        if (routingController2 == this.a.t0.getSystemController()) {
            ah8 ah8Var = (ah8) this.a.u0.b;
            dh8 dh8VarC = ah8Var.c();
            if (ah8Var.f() != dh8VarC) {
                ah8Var.i(dh8VarC, 3);
                return;
            }
            return;
        }
        List selectedRoutes = routingController2.getSelectedRoutes();
        if (selectedRoutes.isEmpty()) {
            return;
        }
        String id = c4.i(selectedRoutes.get(0)).getId();
        this.a.v0.put(routingController2, new gf8(this.a, routingController2, id));
        ah8 ah8Var2 = (ah8) this.a.u0.b;
        Iterator it = ah8Var2.g.iterator();
        while (true) {
            if (!it.hasNext()) {
                dh8Var = null;
                break;
            }
            dh8Var = (dh8) it.next();
            if (dh8Var.c() == ah8Var2.e && TextUtils.equals(id, dh8Var.b)) {
                break;
            }
        }
        if (dh8Var != null) {
            ah8Var2.i(dh8Var, 3);
        }
        this.a.k(routingController2);
    }

    public final void onTransferFailure(MediaRoute2Info mediaRoute2Info) {
        Objects.toString(mediaRoute2Info);
    }
}
