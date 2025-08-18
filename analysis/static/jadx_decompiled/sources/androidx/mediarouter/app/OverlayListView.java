package androidx.mediarouter.app;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.util.AttributeSet;
import android.view.animation.Interpolator;
import android.widget.ListView;
import defpackage.coa;
import defpackage.dh8;
import defpackage.h7b;
import defpackage.z7b;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class OverlayListView extends ListView {
    public final ArrayList a;

    public OverlayListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = new ArrayList();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        boolean z;
        super.onDraw(canvas);
        ArrayList arrayList = this.a;
        if (arrayList.size() > 0) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                coa coaVar = (coa) it.next();
                BitmapDrawable bitmapDrawable = coaVar.a;
                if (bitmapDrawable != null) {
                    bitmapDrawable.draw(canvas);
                }
                long drawingTime = getDrawingTime();
                if (coaVar.l) {
                    z = false;
                } else {
                    float fMax = coaVar.k ? Math.max(0.0f, Math.min(1.0f, (drawingTime - coaVar.j) / coaVar.e)) : 0.0f;
                    Interpolator interpolator = coaVar.d;
                    float interpolation = interpolator == null ? fMax : interpolator.getInterpolation(fMax);
                    int i = (int) (coaVar.g * interpolation);
                    Rect rect = coaVar.f;
                    int i2 = rect.top + i;
                    Rect rect2 = coaVar.c;
                    rect2.top = i2;
                    rect2.bottom = rect.bottom + i;
                    float f = coaVar.h;
                    float f2 = z7b.f(coaVar.i, f, interpolation, f);
                    coaVar.b = f2;
                    BitmapDrawable bitmapDrawable2 = coaVar.a;
                    if (bitmapDrawable2 != null) {
                        bitmapDrawable2.setAlpha((int) (f2 * 255.0f));
                        bitmapDrawable2.setBounds(rect2);
                    }
                    if (coaVar.k && fMax >= 1.0f) {
                        coaVar.l = true;
                        h7b h7bVar = coaVar.m;
                        if (h7bVar != null) {
                            d dVar = (d) h7bVar.c;
                            dVar.T0.remove((dh8) h7bVar.b);
                            dVar.P0.notifyDataSetChanged();
                        }
                    }
                    z = !coaVar.l;
                }
                if (!z) {
                    it.remove();
                }
            }
        }
    }
}
