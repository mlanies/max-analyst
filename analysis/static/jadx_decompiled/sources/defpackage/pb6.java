package defpackage;

import android.content.Context;
import android.text.Spannable;
import java.util.List;
import java.util.regex.Pattern;

/* loaded from: classes2.dex */
public final class pb6 {
    public final je7 a;
    public final je7 b;

    public pb6(je7 je7Var, je7 je7Var2) {
        this.a = je7Var;
        this.b = je7Var2;
    }

    public final CharSequence a(String str, List list) {
        ida idaVar = (ida) this.a.getValue();
        Pattern pattern = bre.a;
        if (!oag.t(str)) {
            str = bre.i.matcher(str).replaceAll("\n");
        }
        Spannable spannableK = qx7.k(kp.z(idaVar.a(idaVar.k(idaVar.j.e(str), list, true, (int) (ck4.e(i4f.f.g(du4.b)) * fk4.d().getDisplayMetrics().density), true), false, false, false, true, list, true)), qp4.u0.b((Context) this.b.getValue()).i().a().d(true).d.b, (28 & 4) != 0, false, null);
        return spannableK == null ? "" : spannableK;
    }
}
