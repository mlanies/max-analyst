package defpackage;

import android.net.Uri;
import android.os.SystemClock;
import java.util.HashMap;
import java.util.UUID;
import java.util.concurrent.ExecutorService;
import org.apache.http.client.methods.HttpGet;

/* loaded from: classes2.dex */
public final class ble extends mr0 {
    public final je7 n;
    public u2a o;
    public ExecutorService p;

    public ble(je7 je7Var) {
        this.n = je7Var;
    }

    @Override // defpackage.mr0
    public final HashMap D(hf5 hf5Var, int i) {
        w2a w2aVar = (w2a) hf5Var;
        HashMap map = new HashMap(4);
        map.put("queue_time", Long.toString(w2aVar.e - w2aVar.d));
        map.put("fetch_time", Long.toString(w2aVar.f - w2aVar.e));
        map.put("total_time", Long.toString(w2aVar.f - w2aVar.d));
        map.put("image_size", Integer.toString(i));
        return map;
    }

    @Override // defpackage.mr0
    public final void P(hf5 hf5Var) {
        ((w2a) hf5Var).f = SystemClock.elapsedRealtime();
    }

    public final void c0(w2a w2aVar, h7b h7bVar, mhc mhcVar) {
        u2a u2aVar = this.o;
        je7 je7Var = this.n;
        if (u2aVar == null) {
            this.o = (u2a) je7Var.getValue();
        }
        u2a u2aVar2 = this.o;
        if (this.p == null) {
            this.p = ((u2a) je7Var.getValue()).a.h();
        }
        b8c b8cVarB = u2aVar2.b(mhcVar);
        ((oj0) w2aVar.b).a(new xq6(this, b8cVarB, false, 3));
        b8cVarB.e(new m5d(this, w2aVar, h7bVar, mhcVar, 15));
    }

    @Override // defpackage.mr0
    public final hf5 n(fi0 fi0Var, eab eabVar) {
        return new w2a(fi0Var, eabVar);
    }

    @Override // defpackage.mr0
    public final void t(hf5 hf5Var, h7b h7bVar) {
        w2a w2aVar = (w2a) hf5Var;
        w2aVar.d = SystemClock.elapsedRealtime();
        Uri uri = ((oj0) w2aVar.b).a.b;
        try {
            l84 l84Var = new l84();
            String string = new jw0(false, true, -1, -1, false, false, false, -1, -1, false, false, false, null).toString();
            if (string.length() == 0) {
                ((bj6) l84Var.c).g("Cache-Control");
            } else {
                ((bj6) l84Var.c).h("Cache-Control", string);
            }
            l84Var.S(uri.toString());
            ((bj6) l84Var.c).a("Accept", "image/webp,/;q=0.8");
            l84Var.G(HttpGet.METHOD_NAME, null);
            l84Var.Q(UUID.randomUUID().toString());
            c0(w2aVar, h7bVar, l84Var.r());
        } catch (Exception e) {
            h7bVar.d(e);
        }
    }
}
