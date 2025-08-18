package defpackage;

import android.content.Context;
import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;

/* loaded from: classes2.dex */
public final class rte extends dec implements wme {
    public final AppCompatTextView F0;

    public rte(View view) {
        sme smeVarR;
        super(view);
        this.F0 = (AppCompatTextView) view;
        if (view.isInEditMode()) {
            smeVarR = ee4.e0;
        } else {
            Context context = view.getContext();
            khe kheVar = sme.a0;
            smeVarR = fm9.R(context);
        }
        z(smeVarR);
    }

    @Override // defpackage.wme
    public final void z(sme smeVar) {
        this.F0.setTextColor(smeVar.F);
    }
}
