package defpackage;

import android.view.ViewGroup;
import android.widget.FrameLayout;

/* loaded from: classes.dex */
public final class ze1 extends hqd {
    public final /* synthetic */ int F0 = 0;
    public final Object G0;
    public final ViewGroup H0;

    public ze1(c8a c8aVar, f fVar) {
        super(c8aVar);
        this.G0 = fVar;
        this.H0 = c8aVar;
    }

    @Override // defpackage.hqd
    public final void A(ol7 ol7Var) {
        switch (this.F0) {
            case 0:
                ((vl1) this.H0).setListener((ul1) this.G0);
                break;
            default:
                opd opdVar = ol7Var instanceof opd ? (opd) ol7Var : null;
                if (opdVar != null) {
                    c8a c8aVar = (c8a) this.H0;
                    CharSequence charSequenceB = opdVar.a.b(c8aVar.getContext());
                    if (charSequenceB == null) {
                        charSequenceB = "";
                    }
                    c8aVar.setTextTitle(charSequenceB);
                    CharSequence charSequenceB2 = opdVar.b.b(c8aVar.getContext());
                    CharSequence charSequence = charSequenceB2 != null ? charSequenceB2 : "";
                    c8aVar.setTextSubtitle(charSequence);
                    tu0.K(c8aVar, 300L, new tb(this, 8, charSequence));
                    break;
                }
                break;
        }
    }

    public ze1(FrameLayout frameLayout, ul1 ul1Var) {
        super(frameLayout);
        this.G0 = ul1Var;
        this.H0 = (vl1) frameLayout.findViewById(rvb.call_copy_link_preview);
    }
}
