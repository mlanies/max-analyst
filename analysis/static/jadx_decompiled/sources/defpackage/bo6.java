package defpackage;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.datepicker.MaterialCalendar;

/* loaded from: classes2.dex */
public final class bo6 extends ndc {
    public final /* synthetic */ int a = 0;
    public final Object b;

    public bo6(em2 em2Var) {
        this.b = em2Var;
    }

    @Override // defpackage.ndc
    public void f(Rect rect, View view, RecyclerView recyclerView, zdc zdcVar) {
        switch (this.a) {
            case 2:
                super.f(rect, view, recyclerView, zdcVar);
                recyclerView.getClass();
                int iR = RecyclerView.R(view);
                em2 em2Var = (em2) this.b;
                Character chD = em2Var.d(iR);
                if (chD != null) {
                    char cCharValue = chD.charValue();
                    if (iR > 0) {
                        Character chD2 = em2Var.d(iR - 1);
                        if (chD2 == null || cCharValue != chD2.charValue()) {
                            rect.top = tu0.G(16 * fk4.d().getDisplayMetrics().density);
                            break;
                        }
                    }
                }
                break;
            default:
                super.f(rect, view, recyclerView, zdcVar);
                break;
        }
    }

    @Override // defpackage.ndc
    public void g(Canvas canvas, RecyclerView recyclerView, zdc zdcVar) {
        switch (this.a) {
            case 1:
                if ((recyclerView.getAdapter() instanceof t9g) && (recyclerView.getLayoutManager() instanceof GridLayoutManager)) {
                    ((MaterialCalendar) this.b).getClass();
                    throw null;
                }
                return;
            default:
                return;
        }
    }

    @Override // defpackage.ndc
    public void h(Canvas canvas, RecyclerView recyclerView) {
        switch (this.a) {
            case 0:
                int paddingLeft = recyclerView.getPaddingLeft();
                int width = recyclerView.getWidth() - recyclerView.getPaddingRight();
                int childCount = recyclerView.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    View childAt = recyclerView.getChildAt(i);
                    int bottom = childAt.getBottom() + ((ViewGroup.MarginLayoutParams) ((pdc) childAt.getLayoutParams())).bottomMargin;
                    Drawable drawable = (Drawable) this.b;
                    drawable.setBounds(paddingLeft, bottom, width, drawable.getIntrinsicHeight() + bottom);
                    drawable.draw(canvas);
                }
                break;
        }
    }

    public bo6(ColorDrawable colorDrawable) {
        this.b = colorDrawable.mutate();
    }

    public bo6(MaterialCalendar materialCalendar) {
        this.b = materialCalendar;
        jaf.d(null);
        jaf.d(null);
    }
}
