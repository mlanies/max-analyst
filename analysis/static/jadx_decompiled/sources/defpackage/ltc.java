package defpackage;

import android.os.Bundle;
import android.view.Window;

/* loaded from: classes2.dex */
public final class ltc extends ir0 {
    @Override // defpackage.ir0, defpackage.fn, defpackage.ac3, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        int dimensionPixelSize;
        super.onCreate(bundle);
        try {
            dimensionPixelSize = getContext().getResources().getDimensionPixelSize(ltb.picker_width);
        } catch (Throwable unused) {
            dimensionPixelSize = -1;
        }
        Window window = getWindow();
        if (window != null) {
            window.setLayout(dimensionPixelSize, -1);
        }
    }
}
