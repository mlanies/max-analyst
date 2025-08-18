package defpackage;

import android.net.Uri;
import android.os.SystemClock;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes.dex */
public final class db4 implements fn6 {
    public final /* synthetic */ hb4 a;

    public db4(hb4 hb4Var) {
        this.a = hb4Var;
    }

    @Override // defpackage.fn6
    public final void b() {
        this.a.c.remove(this);
    }

    @Override // defpackage.fn6
    public final boolean e(Uri uri, wn7 wn7Var, boolean z) {
        HashMap map;
        fb4 fb4Var;
        hb4 hb4Var = this.a;
        if (((pm6) hb4Var.z0) == null) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            xm6 xm6Var = (xm6) hb4Var.y0;
            int i = maf.a;
            List list = xm6Var.e;
            int i2 = 0;
            int i3 = 0;
            while (true) {
                int size = list.size();
                map = hb4Var.b;
                if (i2 >= size) {
                    break;
                }
                fb4 fb4Var2 = (fb4) map.get(((vm6) list.get(i2)).a);
                if (fb4Var2 != null && jElapsedRealtime < fb4Var2.s0) {
                    i3++;
                }
                i2++;
            }
            ty4 ty4Var = new ty4(1, 0, ((xm6) hb4Var.y0).e.size(), i3, 1);
            ((buc) hb4Var.u0).getClass();
            b11 b11VarU = buc.u(ty4Var, wn7Var);
            if (b11VarU != null && b11VarU.b == 2 && (fb4Var = (fb4) map.get(uri)) != null) {
                fb4.a(fb4Var, b11VarU.c);
            }
        }
        return false;
    }
}
