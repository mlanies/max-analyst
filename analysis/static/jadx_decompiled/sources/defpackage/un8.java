package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.SparseArray;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes2.dex */
public final class un8 extends ndc implements kre {
    public final /* synthetic */ int a;
    public final Paint b;
    public final Rect c;
    public final Object o;

    public un8(int i, fka fkaVar) {
        this.a = i;
        switch (i) {
            case 1:
                Paint paint = new Paint();
                paint.setAntiAlias(true);
                paint.setStyle(Paint.Style.FILL);
                this.b = paint;
                this.o = new RectF();
                this.c = new Rect();
                onThemeChanged(fkaVar);
                break;
            default:
                Paint paint2 = new Paint();
                paint2.setStrokeWidth(fk4.d().getDisplayMetrics().density * 0.5f);
                this.b = paint2;
                this.c = new Rect();
                this.o = new gaa(17);
                onThemeChanged(fkaVar);
                break;
        }
    }

    public static boolean i(RecyclerView recyclerView, View view) {
        hdc adapter = recyclerView.getAdapter();
        ppd ppdVar = adapter instanceof ppd ? (ppd) adapter : null;
        if (ppdVar == null) {
            return false;
        }
        int iR = RecyclerView.R(view);
        int i = iR - 1;
        if (iR <= 0) {
            return false;
        }
        int iL = ppdVar.l(iR);
        int iL2 = ppdVar.l(i);
        iv ivVar = ppdVar.o;
        Object objJ0 = x53.j0(iR, ivVar.f);
        jn8 jn8Var = objJ0 instanceof jn8 ? (jn8) objJ0 : null;
        boolean z = (jn8Var == null || jn8Var.t0) ? false : true;
        Object objJ02 = x53.j0(i, ivVar.f);
        jn8 jn8Var2 = objJ02 instanceof jn8 ? (jn8) objJ02 : null;
        return (iL == mda.F && iL2 == mda.D) || (z && (jn8Var2 != null && jn8Var2.t0));
    }

    @Override // defpackage.ndc
    public final void f(Rect rect, View view, RecyclerView recyclerView, zdc zdcVar) {
        int iR;
        switch (this.a) {
            case 0:
                super.f(rect, view, recyclerView, zdcVar);
                if (i(recyclerView, view)) {
                    rect.top = (int) ((tu0.G(10 * fk4.d().getDisplayMetrics().density) * 2) + 0.5f);
                }
                ((gaa) this.o).E(rect, view, recyclerView);
                break;
            default:
                dec decVarT = recyclerView.T(view);
                if (decVarT != null && (decVarT instanceof us2) && (iR = RecyclerView.R(view)) != -1) {
                    Boolean boolValueOf = Boolean.valueOf(((us2) decVarT).Y == vs2.b);
                    if (zdcVar.b == null) {
                        zdcVar.b = new SparseArray();
                    }
                    zdcVar.b.put(iR, boolValueOf);
                    break;
                }
                break;
        }
    }

    @Override // defpackage.ndc
    public void g(Canvas canvas, RecyclerView recyclerView, zdc zdcVar) {
        switch (this.a) {
            case 1:
                RectF rectF = (RectF) this.o;
                rectF.set(0.0f, 0.0f, 0.0f, 0.0f);
                int childCount = recyclerView.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    View childAt = recyclerView.getChildAt(i);
                    int iR = RecyclerView.R(childAt);
                    if (recyclerView.T(childAt) instanceof us2) {
                        SparseArray sparseArray = zdcVar.b;
                        boolean zF = tpa.f(sparseArray == null ? null : sparseArray.get(iR), Boolean.TRUE);
                        if (zF) {
                            Rect rect = this.c;
                            RecyclerView.V(rect, childAt);
                            if (rectF.height() == 0.0f) {
                                rectF.set(rect);
                            } else {
                                rectF.left = Math.min(rectF.left, rect.left);
                                rectF.top = Math.min(rectF.top, rect.top);
                                rectF.right = Math.max(rectF.right, rect.right);
                                rectF.bottom = Math.max(rectF.bottom, rect.bottom);
                            }
                        }
                        if ((!zF || i == recyclerView.getChildCount() - 1) && rectF.height() != 0.0f) {
                            canvas.drawRect(rectF, this.b);
                            rectF.set(0.0f, 0.0f, 0.0f, 0.0f);
                        }
                    }
                }
                break;
        }
    }

    @Override // defpackage.ndc
    public void h(Canvas canvas, RecyclerView recyclerView) {
        switch (this.a) {
            case 0:
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
                    if (i(recyclerView, childAt)) {
                        int iR = RecyclerView.R(childAt);
                        ((gaa) this.o).x(this.c, childAt, iR);
                        canvas.drawLine(r5.left, r5.centerY(), r5.right, r5.centerY(), this.b);
                    }
                    i = i2;
                }
            default:
                return;
        }
    }

    @Override // defpackage.kre
    public final void onThemeChanged(fka fkaVar) {
        switch (this.a) {
            case 0:
                this.b.setColor(fkaVar.i().b.b);
                break;
            default:
                this.b.setColor(fkaVar.b().m);
                break;
        }
    }
}
