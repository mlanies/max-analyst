package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes2.dex */
public final class so9 extends ndc implements kre {
    public final Paint X;
    public final /* synthetic */ int a;
    public final m56 b;
    public final gaa c;
    public final RectF o;

    public so9(zo9 zo9Var, Context context) {
        this.a = 0;
        this.b = zo9Var;
        this.c = new gaa(17);
        Paint paint = new Paint(1);
        paint.setStrokeWidth(fk4.d().getDisplayMetrics().density * 3.0f);
        paint.setStyle(Paint.Style.STROKE);
        this.X = paint;
        this.o = new RectF();
        onThemeChanged(qp4.u0.b(context).i());
    }

    @Override // defpackage.ndc
    public final void f(Rect rect, View view, RecyclerView recyclerView, zdc zdcVar) {
        switch (this.a) {
            case 0:
                int iG = tu0.G(6 * fk4.d().getDisplayMetrics().density);
                rect.set(iG, iG, iG, iG);
                this.c.E(rect, view, recyclerView);
                break;
            default:
                int iG2 = tu0.G(2 * fk4.d().getDisplayMetrics().density);
                rect.set(iG2, iG2, iG2, iG2);
                this.c.E(rect, view, recyclerView);
                break;
        }
    }

    @Override // defpackage.ndc
    public final void h(Canvas canvas, RecyclerView recyclerView) {
        switch (this.a) {
            case 0:
                int childCount = recyclerView.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    View childAt = recyclerView.getChildAt(i);
                    int iR = RecyclerView.R(childAt);
                    if (iR != -1) {
                        if (((Boolean) this.b.invoke(Integer.valueOf(iR))).booleanValue()) {
                            int iG = tu0.G(6 * fk4.d().getDisplayMetrics().density);
                            float left = childAt.getLeft() - iG;
                            float top = childAt.getTop() - iG;
                            float right = childAt.getRight() + iG;
                            float bottom = childAt.getBottom() + iG;
                            RectF rectF = this.o;
                            rectF.set(left, top, right, bottom);
                            float f = 2;
                            canvas.drawRoundRect(rectF, rectF.width() / f, rectF.width() / f, this.X);
                        }
                    }
                }
                break;
            default:
                int childCount2 = recyclerView.getChildCount();
                for (int i2 = 0; i2 < childCount2; i2++) {
                    View childAt2 = recyclerView.getChildAt(i2);
                    int iR2 = RecyclerView.R(childAt2);
                    if (iR2 != -1) {
                        if (((Boolean) this.b.invoke(Integer.valueOf(iR2))).booleanValue()) {
                            int iG2 = tu0.G(4 * fk4.d().getDisplayMetrics().density);
                            float left2 = childAt2.getLeft() - iG2;
                            float top2 = childAt2.getTop() - iG2;
                            float right2 = childAt2.getRight() + iG2;
                            float bottom2 = childAt2.getBottom() + iG2;
                            RectF rectF2 = this.o;
                            rectF2.set(left2, top2, right2, bottom2);
                            canvas.drawRoundRect(rectF2, fk4.d().getDisplayMetrics().density * 12.0f, fk4.d().getDisplayMetrics().density * 12.0f, this.X);
                        }
                    }
                }
                break;
        }
    }

    @Override // defpackage.kre
    public final void onThemeChanged(fka fkaVar) {
        switch (this.a) {
            case 0:
                this.X.setColor(fkaVar.b().a.m);
                break;
            default:
                this.X.setColor(fkaVar.i().h);
                break;
        }
    }

    public so9(Context context, nq nqVar) {
        this.a = 1;
        this.b = nqVar;
        this.c = new gaa(17);
        this.o = new RectF();
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(fk4.d().getDisplayMetrics().density * 2.0f);
        this.X = paint;
        onThemeChanged(qp4.u0.b(context).i());
    }
}
