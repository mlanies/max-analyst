package defpackage;

import android.graphics.Insets;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;

/* loaded from: classes2.dex */
public final class n6b implements View.OnLayoutChangeListener {
    public final /* synthetic */ float a;
    public final /* synthetic */ float b;
    public final /* synthetic */ View c;

    public n6b(View view, float f, float f2) {
        this.a = f;
        this.b = f2;
        this.c = view;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        Insets insets;
        view.removeOnLayoutChangeListener(this);
        int iG = tu0.G(this.a);
        int iG2 = tu0.G(this.b);
        View view2 = this.c;
        View rootView = view2.getRootView();
        Rect rect = o6b.a;
        rootView.getWindowVisibleDisplayFrame(rect);
        if (Build.VERSION.SDK_INT >= 30) {
            int i9 = rect.bottom;
            WindowInsets rootWindowInsets = rootView.getRootWindowInsets();
            rect.bottom = i9 - ((rootWindowInsets == null || (insets = rootWindowInsets.getInsets(8)) == null) ? 0 : insets.bottom);
        }
        float f = 8;
        int iQ = rh4.q(f, fk4.d().getDisplayMetrics().density, rect.bottom - iG2);
        int iQ2 = rh4.q(f, fk4.d().getDisplayMetrics().density, rect.top + iG2);
        int measuredHeight = view2.getMeasuredHeight();
        if (iQ > measuredHeight) {
            iG2 = rh4.c(f, fk4.d().getDisplayMetrics().density, iG2);
        } else if (iQ2 > measuredHeight) {
            iG2 = rh4.q(f, fk4.d().getDisplayMetrics().density, iG2 - measuredHeight);
        }
        int measuredWidth = view2.getMeasuredWidth();
        if (iG + measuredWidth >= rootView.getWidth()) {
            iG = (rootView.getWidth() - measuredWidth) - 8;
        }
        view2.setX(iG);
        view2.setY(iG2);
    }
}
