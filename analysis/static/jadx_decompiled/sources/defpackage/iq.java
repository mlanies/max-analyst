package defpackage;

import android.view.View;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes.dex */
public final class iq extends hqd {
    @Override // defpackage.hqd
    /* renamed from: E, reason: merged with bridge method [inline-methods] */
    public final void A(eq eqVar) {
        int i;
        int iOrdinal = eqVar.a.ordinal();
        if (iOrdinal == 0) {
            i = o4a.l;
        } else if (iOrdinal == 1) {
            i = o4a.e;
        } else {
            if (iOrdinal != 2) {
                throw new NoWhenBranchMatchedException();
            }
            i = o4a.b;
        }
        View view = this.a;
        gq gqVar = (gq) view;
        gqVar.setTitle(z7.B(gqVar.getContext(), i));
        gq gqVar2 = (gq) view;
        Boolean bool = eqVar.b;
        gqVar2.setSelected(bool != null ? bool.booleanValue() : false);
    }
}
