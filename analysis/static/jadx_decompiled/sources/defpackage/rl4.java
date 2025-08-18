package defpackage;

import android.graphics.Rect;
import android.view.View;

/* loaded from: classes2.dex */
public final class rl4 implements spf {
    public final /* synthetic */ Rect a;
    public final /* synthetic */ View b;
    public final /* synthetic */ View c;
    public final /* synthetic */ Rect d;
    public final /* synthetic */ int e;
    public final /* synthetic */ int f;

    public rl4(Rect rect, View view, View view2, Rect rect2, int i, int i2) {
        this.a = rect;
        this.b = view;
        this.c = view2;
        this.d = rect2;
        this.e = i;
        this.f = i2;
    }

    @Override // defpackage.spf
    public final void a() {
    }

    @Override // defpackage.spf
    public final void c(Rect rect, View view) {
        View view2 = this.b;
        int width = view2.getWidth();
        int height = view2.getHeight();
        Rect rect2 = this.a;
        rect2.set(0, 0, width, height);
        View view3 = this.c;
        Rect rect3 = this.d;
        mpf.d(rect3, view3);
        int i = this.e;
        rect3.inset(i, i);
        int i2 = (rect3.centerX() < rect.centerX() ? (char) 5 : (char) 3) | (rect3.centerY() < rect.centerY() ? 'P' : '0');
        if ((i2 & 5) == 5) {
            rect2.offsetTo(rect.right - rect2.width(), rect2.top);
        } else if ((i2 & 3) == 3) {
            rect2.offsetTo(rect.left, rect2.top);
        }
        int i3 = i2 & 80;
        int i4 = this.f;
        if (i3 == 80) {
            rect2.offsetTo(rect2.left, (rect.top - rect2.height()) - i4);
        } else if ((i2 & 48) == 48) {
            rect2.offsetTo(rect2.left, rect.bottom + i4);
        }
        if (!rect3.contains(rect2)) {
            int i5 = rect2.left;
            int i6 = rect3.left;
            if (i5 < i6) {
                rect2.offsetTo(i6, rect2.top);
            }
            int i7 = rect2.top;
            int i8 = rect3.top;
            if (i7 < i8) {
                rect2.offsetTo(rect2.left, i8);
            }
            int i9 = rect2.bottom;
            int i10 = rect3.bottom;
            if (i9 > i10) {
                rect2.offsetTo(rect2.left, i10 - rect2.height());
            }
            int i11 = rect2.right;
            int i12 = rect3.right;
            if (i11 > i12) {
                rect2.offsetTo(i12 - rect2.width(), rect2.top);
            }
        }
        view2.setX(rect2.left);
        view2.setY(rect2.top);
    }
}
