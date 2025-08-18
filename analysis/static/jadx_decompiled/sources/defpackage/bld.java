package defpackage;

import android.graphics.Rect;

/* loaded from: classes.dex */
public final class bld extends fm9 {
    public final /* synthetic */ int j;
    public final /* synthetic */ Rect k;

    public /* synthetic */ bld(int i, Rect rect) {
        this.j = i;
        this.k = rect;
    }

    @Override // defpackage.fm9
    public final Rect H() {
        switch (this.j) {
            case 0:
                Rect rect = this.k;
                if (rect.isEmpty()) {
                    return null;
                }
                return rect;
            default:
                return this.k;
        }
    }
}
