package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewStub;
import one.me.sdk.gallery.view.NumericCheckButton;
import one.me.sdk.gallery.view.VideoInfoTextView;
import one.me.sdk.uikit.common.views.OneMeDraweeView;

/* loaded from: classes2.dex */
public final class z86 extends a96 {
    public final z96 F0;
    public NumericCheckButton G0;
    public final OneMeDraweeView H0;
    public final VideoInfoTextView I0;

    public z86(View view, z96 z96Var) {
        sme smeVarR;
        sme smeVarR2;
        super(view);
        this.F0 = z96Var;
        OneMeDraweeView oneMeDraweeView = (OneMeDraweeView) view.findViewById(fga.e);
        this.H0 = oneMeDraweeView;
        ViewStub viewStub = (ViewStub) view.findViewById(fga.c);
        this.I0 = (VideoInfoTextView) view.findViewById(fga.f);
        Drawable drawableB = kt3.b(view.getContext(), gpc.D);
        if (view.isInEditMode()) {
            smeVarR = ee4.e0;
        } else {
            Context context = view.getContext();
            khe kheVar = sme.a0;
            smeVarR = fm9.R(context);
        }
        drawableB.setTint(ote.b0(smeVarR.w, 0.3f));
        la6 la6Var = (la6) oneMeDraweeView.getHierarchy();
        if (la6Var != null) {
            la6Var.i(drawableB, 1);
        }
        if (view.isInEditMode()) {
            smeVarR2 = ee4.e0;
        } else {
            Context context2 = view.getContext();
            khe kheVar2 = sme.a0;
            smeVarR2 = fm9.R(context2);
        }
        oneMeDraweeView.setBackgroundColor(smeVarR2.H);
        if (z96Var.b.c) {
            viewStub.setOnInflateListener(new ViewStub.OnInflateListener() { // from class: y86
                @Override // android.view.ViewStub.OnInflateListener
                public final void onInflate(ViewStub viewStub2, View view2) {
                    View viewFindViewById = view2.findViewById(fga.b);
                    NumericCheckButton numericCheckButton = (NumericCheckButton) view2.findViewById(fga.a);
                    z86 z86Var = this.a;
                    z86Var.G0 = numericCheckButton;
                    int iG = tu0.G(10 * z86Var.a.getContext().getResources().getDisplayMetrics().density);
                    if (viewFindViewById == null) {
                        return;
                    }
                    viewFindViewById.post(new uc3(numericCheckButton, iG, iG, iG, iG, viewFindViewById, 1));
                }
            });
            viewStub.inflate();
        }
    }
}
