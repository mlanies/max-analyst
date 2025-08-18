package defpackage;

import android.graphics.Rect;
import android.view.View;

/* loaded from: classes2.dex */
public final class cye implements View.OnLayoutChangeListener {
    public final /* synthetic */ View a;
    public final /* synthetic */ Rect b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;

    public cye(View view, Rect rect, int i, int i2) {
        this.a = view;
        this.b = rect;
        this.c = i;
        this.d = i2;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        view.removeOnLayoutChangeListener(this);
        View view2 = this.a;
        Rect rect = this.b;
        view2.getHitRect(rect);
        int iWidth = rect.width();
        int i9 = this.c;
        if (iWidth < i9) {
            int iWidth2 = (i9 - rect.width()) / 2;
            rect.left -= iWidth2;
            rect.right += iWidth2;
        }
        int iHeight = rect.height();
        int i10 = this.d;
        if (iHeight < i10) {
            int iHeight2 = (i10 - rect.height()) / 2;
            rect.top -= iHeight2;
            rect.bottom += iHeight2;
        }
        view2.setTouchDelegate(new o85(rect, view2));
    }
}
