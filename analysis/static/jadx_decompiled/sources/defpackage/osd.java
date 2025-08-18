package defpackage;

import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public final class osd extends dy7 {
    public final /* synthetic */ int o;

    @Override // defpackage.qsd
    public final float a(View view, ViewGroup viewGroup) {
        switch (this.o) {
            case 0:
                break;
            case 1:
                if (viewGroup.getLayoutDirection() != 1) {
                    break;
                } else {
                    break;
                }
            case 2:
                break;
            default:
                if (viewGroup.getLayoutDirection() != 1) {
                    break;
                } else {
                    break;
                }
        }
        return view.getTranslationX() + viewGroup.getWidth();
    }
}
