package defpackage;

import android.content.Context;
import android.net.Uri;
import java.util.Collections;

/* loaded from: classes.dex */
public final class kz2 {
    public final Context a;
    public final u7b b;
    public final w7b c;

    public kz2(Context context, u7b u7bVar, w7b w7bVar) {
        this.a = context;
        this.b = u7bVar;
        this.c = w7bVar;
    }

    public final nn3 a(uj3 uj3Var) {
        CharSequence string;
        int i = this.b.b(uj3Var.n()).a;
        boolean z = i == 10 || i == 20 || i == 40;
        String strP = uj3Var.p(kk0.b);
        if (uj3Var.k() != 0 || uj3Var.w()) {
            string = null;
        } else {
            boolean z2 = uj3Var.Y;
            Context context = this.a;
            string = z2 ? context.getString(dpc.F) : (uj3Var.t() && uj3Var.v()) ? context.getString(jpc.O2) : uj3Var.t() ? context.getString(jpc.p) : this.c.b(uj3Var);
        }
        long jN = uj3Var.n();
        String strD = uj3Var.d();
        if (strD == null) {
            strD = "";
        }
        return new nn3(jN, strD, bre.b(uj3Var.g()), Collections.singletonList(Long.valueOf(uj3Var.o())), string, null, strP != null ? Uri.parse(strP) : null, z, uj3Var.u(), uj3Var.m(), false, null, 0, uj3Var.t(), 27648);
    }

    public final v8c b(uj3 uj3Var) {
        int i = this.b.b(uj3Var.n()).a;
        return new v8c(uj3Var.n(), uj3Var.e(), uj3Var.p(kk0.c), uj3Var.m(), i == 10 || i == 20 || i == 40, uj3Var.u(), false, 192);
    }
}
