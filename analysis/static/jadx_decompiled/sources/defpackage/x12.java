package defpackage;

import android.view.WindowInsets;

/* loaded from: classes2.dex */
public final class x12 extends w12 {
    @Override // android.view.ViewGroup, android.view.View
    public final WindowInsets dispatchApplyWindowInsets(WindowInsets windowInsets) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            getChildAt(i).dispatchApplyWindowInsets(windowInsets);
        }
        return windowInsets;
    }
}
