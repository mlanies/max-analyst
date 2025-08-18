package defpackage;

import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public final class psd extends lz7 {
    public final /* synthetic */ int h = 1;

    @Override // defpackage.qsd
    public final float b(View view, ViewGroup viewGroup) {
        switch (this.h) {
            case 0:
                return view.getTranslationY() - viewGroup.getHeight();
            default:
                return view.getTranslationY() + viewGroup.getHeight();
        }
    }
}
