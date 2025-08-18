package defpackage;

import android.text.SpannableString;
import android.text.style.URLSpan;
import java.util.Set;
import java.util.function.UnaryOperator;

/* loaded from: classes2.dex */
public final /* synthetic */ class c52 implements UnaryOperator {
    public final /* synthetic */ int a;
    public final /* synthetic */ e52 b;

    public /* synthetic */ c52(e52 e52Var, int i) {
        this.a = i;
        this.b = e52Var;
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        e52 e52Var = this.b;
        switch (this.a) {
            case 0:
                mpa mpaVar = (mpa) obj;
                es8 es8Var = e52Var.X;
                gvd gvdVarL = null;
                if (es8Var == null) {
                    return null;
                }
                cu8 cu8Var = es8Var.a;
                if (mpaVar != null && ((Long) mpaVar.a).longValue() == cu8Var.b) {
                    return mpaVar;
                }
                ld2 ld2Var = (ld2) es8Var.s0;
                ld2Var.getClass();
                es8 es8Var2 = e52Var.X;
                SpannableString spannableStringF = es8Var2 == null ? null : ld2.f(ld2Var, e52Var, es8Var2, 1);
                if (oag.u(spannableStringF)) {
                    int i = gvd.a;
                    spannableStringF = crd.l(spannableStringF, true);
                    for (Object obj2 : spannableStringF.getSpans(0, spannableStringF.length(), Object.class)) {
                        if ((obj2 instanceof URLSpan) || (obj2 instanceof yz7)) {
                            spannableStringF.removeSpan(obj2);
                        }
                    }
                }
                Long lValueOf = Long.valueOf(cu8Var.b);
                if (!oag.t(spannableStringF)) {
                    int i2 = gvd.a;
                    gvdVarL = crd.l(spannableStringF, true);
                }
                return new mpa(lValueOf, gvdVarL);
            default:
                Set set = (Set) obj;
                set.add(e52Var);
                return set;
        }
    }
}
