package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes2.dex */
public final class ohd extends ndc implements kre {
    public final float a = 0.5f;
    public final Rect b = new Rect();
    public final Paint c;

    public ohd(Context context) {
        Paint paint = new Paint();
        paint.setColor(qp4.u0.b(context).i().i().b.b);
        this.c = paint;
    }

    @Override // defpackage.ndc
    public final void f(Rect rect, View view, RecyclerView recyclerView, zdc zdcVar) {
        dec decVarU;
        hdc hdcVar = recyclerView.A0;
        long j = (hdcVar == null || !hdcVar.b || (decVarU = RecyclerView.U(view)) == null) ? -1L : decVarU.X;
        if (j != -1 && j == jha.h) {
            rect.bottom = rh4.c(this.a, fk4.d().getDisplayMetrics().density, rect.bottom);
        }
    }

    @Override // defpackage.ndc
    public final void h(Canvas canvas, RecyclerView recyclerView) {
        dec decVarU;
        int i = 0;
        while (true) {
            if (!(i < recyclerView.getChildCount())) {
                return;
            }
            int i2 = i + 1;
            View childAt = recyclerView.getChildAt(i);
            if (childAt == null) {
                throw new IndexOutOfBoundsException();
            }
            hdc hdcVar = recyclerView.A0;
            long j = -1;
            if (hdcVar != null && hdcVar.b && (decVarU = RecyclerView.U(childAt)) != null) {
                j = decVarU.X;
            }
            if (j == jha.h) {
                int left = childAt.getLeft();
                Rect rect = this.b;
                rect.left = left;
                rect.top = childAt.getBottom();
                rect.bottom = rh4.c(this.a, fk4.d().getDisplayMetrics().density, childAt.getBottom());
                rect.right = childAt.getRight();
                canvas.drawRect(rect, this.c);
                return;
            }
            i = i2;
        }
    }

    @Override // defpackage.kre
    public final void onThemeChanged(fka fkaVar) {
        this.c.setColor(fkaVar.i().b.b);
    }
}
