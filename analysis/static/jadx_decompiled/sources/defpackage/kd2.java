package defpackage;

import android.text.SpannableStringBuilder;
import android.text.SpannedString;

/* loaded from: classes.dex */
public final class kd2 extends mw7 {
    public final /* synthetic */ je7 g;
    public final /* synthetic */ je7 h;
    public final /* synthetic */ ld2 i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kd2(je7 je7Var, je7 je7Var2, ld2 ld2Var) {
        super(100);
        this.g = je7Var;
        this.h = je7Var2;
        this.i = ld2Var;
    }

    @Override // defpackage.mw7
    public final Object a(Object obj) {
        Object njcVar;
        hd2 hd2Var = (hd2) obj;
        je7 je7Var = this.g;
        je7 je7Var2 = this.h;
        ld2 ld2Var = this.i;
        try {
            String strD = ((mz6) je7Var.getValue()).d(hd2Var.a);
            if (strD != null) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                spannableStringBuilder.append(((ida) je7Var2.getValue()).j.e(eae.g0(strD)), new mse(qp4.u0.b(ld2Var.a).i(), new we1(16)), 33);
                tpa.d(spannableStringBuilder, (char) 8203, new bvd(tu0.G(20 * fk4.d().getDisplayMetrics().density) + tu0.G(4 * fk4.d().getDisplayMetrics().density)), 33);
                njcVar = new SpannedString(spannableStringBuilder);
            } else {
                njcVar = null;
            }
        } catch (Throwable th) {
            njcVar = new njc(th);
        }
        Throwable thA = pjc.a(njcVar);
        if (thA != null) {
            hm9.p(ld2Var.u, "Fail process typing", thA);
        }
        return (CharSequence) (njcVar instanceof njc ? null : njcVar);
    }
}
