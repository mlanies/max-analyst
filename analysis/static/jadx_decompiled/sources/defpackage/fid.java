package defpackage;

import android.view.View;
import one.me.sdk.uikit.common.button.OneMeButton;

/* loaded from: classes2.dex */
public final class fid extends hqd {
    @Override // defpackage.hqd
    public final void A(ol7 ol7Var) {
        if (ol7Var instanceof i1d) {
            View view = this.a;
            i1d i1dVar = (i1d) ol7Var;
            ((OneMeButton) view).setText(i1dVar.a.a(this));
            jqe jqeVar = i1dVar.c;
            if (jqeVar != null) {
                ((OneMeButton) view).setTextBadge(jqeVar.a(this));
            }
        }
    }
}
