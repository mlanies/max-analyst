package defpackage;

import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public final class kof implements qdc {
    @Override // defpackage.qdc
    public final void b(View view) {
    }

    @Override // defpackage.qdc
    public final void d(View view) {
        pdc pdcVar = (pdc) view.getLayoutParams();
        if (((ViewGroup.MarginLayoutParams) pdcVar).width != -1 || ((ViewGroup.MarginLayoutParams) pdcVar).height != -1) {
            throw new IllegalStateException("Pages must fill the whole ViewPager2 (use match_parent)");
        }
    }
}
