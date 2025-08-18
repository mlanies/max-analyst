package defpackage;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.google.android.material.tabs.TabLayout;

/* loaded from: classes.dex */
public final class aw4 extends qq9 {
    public final /* synthetic */ int w0;

    public /* synthetic */ aw4(int i) {
        this.w0 = i;
    }

    @Override // defpackage.qq9
    public final void n(TabLayout tabLayout, View view, View view2, float f, Drawable drawable) {
        float fSin;
        float fCos;
        switch (this.w0) {
            case 0:
                RectF rectFB = qq9.b(tabLayout, view);
                RectF rectFB2 = qq9.b(tabLayout, view2);
                if (rectFB.left < rectFB2.left) {
                    double d = (f * 3.141592653589793d) / 2.0d;
                    fSin = (float) (1.0d - Math.cos(d));
                    fCos = (float) Math.sin(d);
                } else {
                    double d2 = (f * 3.141592653589793d) / 2.0d;
                    fSin = (float) Math.sin(d2);
                    fCos = (float) (1.0d - Math.cos(d2));
                }
                drawable.setBounds(og.c((int) rectFB.left, fSin, (int) rectFB2.left), drawable.getBounds().top, og.c((int) rectFB.right, fCos, (int) rectFB2.right), drawable.getBounds().bottom);
                break;
            default:
                if (f >= 0.5f) {
                    view = view2;
                }
                RectF rectFB3 = qq9.b(tabLayout, view);
                float fB = f < 0.5f ? og.b(1.0f, 0.0f, 0.0f, 0.5f, f) : og.b(0.0f, 1.0f, 0.5f, 1.0f, f);
                drawable.setBounds((int) rectFB3.left, drawable.getBounds().top, (int) rectFB3.right, drawable.getBounds().bottom);
                drawable.setAlpha((int) (fB * 255.0f));
                break;
        }
    }
}
