package defpackage;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ProgressBar;

/* loaded from: classes.dex */
public final class uyc extends FrameLayout implements kre {
    @Override // defpackage.kre
    public final void onThemeChanged(fka fkaVar) {
        View childAt = getChildAt(0);
        ProgressBar progressBar = childAt instanceof ProgressBar ? (ProgressBar) childAt : null;
        if (progressBar != null) {
            ngg.H(progressBar, fkaVar.getIcon().i);
        }
    }
}
