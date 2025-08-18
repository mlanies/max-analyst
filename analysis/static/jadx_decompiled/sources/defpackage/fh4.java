package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import one.me.sdk.uikit.common.button.OneMeButton;

/* loaded from: classes2.dex */
public final class fh4 extends kgb {
    public fh4(Context context) {
        OneMeButton oneMeButton = new OneMeButton(context, null);
        super(oneMeButton);
        oneMeButton.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        oneMeButton.setSize(c7a.c);
        oneMeButton.setMode(b7a.c);
        oneMeButton.setAppearance(z6a.b);
    }

    @Override // defpackage.hqd
    public final void A(ol7 ol7Var) {
        View view = this.a;
        ((OneMeButton) view).setText(((gh4) ol7Var).a.b(view.getContext()));
    }
}
