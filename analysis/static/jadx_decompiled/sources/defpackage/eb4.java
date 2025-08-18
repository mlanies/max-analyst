package defpackage;

import android.net.Uri;
import android.os.SystemClock;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes.dex */
public final class eb4 implements gn6 {
    public final /* synthetic */ hb4 a;

    public eb4(hb4 hb4Var) {
        this.a = hb4Var;
    }

    @Override // defpackage.gn6
    public final void b() {
        this.a.c.remove(this);
    }

    @Override // defpackage.gn6
    public final boolean c(Uri uri, wn7 wn7Var, boolean z) {
        HashMap map;
        gb4 gb4Var;
        hb4 hb4Var = this.a;
        if (((qm6) hb4Var.z0) == null) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            ym6 ym6Var = (ym6) hb4Var.y0;
            int i = oaf.a;
            List list = ym6Var.e;
            int i2 = 0;
            int i3 = 0;
            while (true) {
                int size = list.size();
                map = hb4Var.b;
                if (i2 >= size) {
                    break;
                }
                gb4 gb4Var2 = (gb4) map.get(((wm6) list.get(i2)).a);
                if (gb4Var2 != null && jElapsedRealtime < gb4Var2.s0) {
                    i3++;
                }
                i2++;
            }
            ty4 ty4Var = new ty4(1, 0, ((ym6) hb4Var.y0).e.size(), i3, 2);
            ((huc) hb4Var.u0).getClass();
            b11 b11VarO = huc.o(ty4Var, wn7Var);
            if (b11VarO != null && b11VarO.b == 2 && (gb4Var = (gb4) map.get(uri)) != null) {
                gb4.a(gb4Var, b11VarO.c);
            }
        }
        return false;
    }
}
