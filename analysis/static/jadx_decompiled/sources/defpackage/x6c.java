package defpackage;

import android.graphics.Rect;
import android.view.View;

/* loaded from: classes2.dex */
public final class x6c implements View.OnLayoutChangeListener {
    public final /* synthetic */ y6c a;
    public final /* synthetic */ View b;
    public final /* synthetic */ long c;

    public x6c(y6c y6cVar, View view, long j) {
        this.a = y6cVar;
        this.b = view;
        this.c = j;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        view.removeOnLayoutChangeListener(this);
        View view2 = this.b;
        y6c y6cVar = this.a;
        Rect rectC = y6c.c(y6cVar, view2);
        if (rectC == null) {
            return;
        }
        y6cVar.b.d(this.c, rectC);
    }
}
