package defpackage;

import android.view.View;
import one.me.sdk.uikit.common.button.OneMeButton;

/* loaded from: classes.dex */
public final class qr3 extends hqd {
    @Override // defpackage.hqd
    /* renamed from: E, reason: merged with bridge method [inline-methods] */
    public final void A(pr3 pr3Var) {
        aba abaVar = (aba) this.a;
        pr3Var.getClass();
        abaVar.setIcon(woc.J0);
        abaVar.setTitle(new eqe(a9a.r));
        abaVar.setSubtitle(new eqe(pr3Var.a));
    }

    public final void F(Integer num, k56 k56Var) {
        View view = this.a;
        if (num != null) {
            aba abaVar = (aba) view;
            abaVar.x(abaVar.getContext().getString(num.intValue()), new m6(7, k56Var));
        } else {
            OneMeButton oneMeButton = ((aba) view).J0;
            oneMeButton.setText((CharSequence) null);
            oneMeButton.setOnClickListener(null);
            oneMeButton.setVisibility(8);
        }
    }
}
