package defpackage;

import android.R;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes2.dex */
public final class c03 extends ndc implements kre {
    public Drawable X;
    public final k56 a;
    public final m56 b;
    public final m56 c;
    public final m56 o;
    public final Rect Y = new Rect();
    public final Rect Z = new Rect();
    public final int[] s0 = {R.attr.state_checked};
    public final int[] t0 = {-16842912};

    public c03(k56 k56Var, m56 m56Var, m56 m56Var2, m56 m56Var3) {
        this.a = k56Var;
        this.b = m56Var;
        this.c = m56Var2;
        this.o = m56Var3;
        this.X = (Drawable) k56Var.invoke();
    }

    @Override // defpackage.ndc
    public final void f(Rect rect, View view, RecyclerView recyclerView, zdc zdcVar) {
        recyclerView.getClass();
        if (((Boolean) this.c.invoke(Integer.valueOf(RecyclerView.R(view)))).booleanValue()) {
            rect.left = rh4.c(36, fk4.d().getDisplayMetrics().density, rect.left);
        }
    }

    @Override // defpackage.ndc
    public final void g(Canvas canvas, RecyclerView recyclerView, zdc zdcVar) {
        int childCount = recyclerView.getChildCount();
        for (int i = 0; i < childCount; i++) {
            if (((Boolean) this.c.invoke(Integer.valueOf(i))).booleanValue()) {
                Drawable background = recyclerView.getChildAt(i).getBackground();
                RippleDrawable rippleDrawable = background instanceof RippleDrawable ? (RippleDrawable) background : null;
                if (rippleDrawable != null) {
                    f8.D(rippleDrawable, tu0.G((-36) * fk4.d().getDisplayMetrics().density), 0, 0, 14);
                }
            }
        }
    }

    @Override // defpackage.ndc
    public final void h(Canvas canvas, RecyclerView recyclerView) {
        int iG = tu0.G(12 * fk4.d().getDisplayMetrics().density);
        int iG2 = tu0.G(24 * fk4.d().getDisplayMetrics().density) / 2;
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
            recyclerView.getClass();
            int iR = RecyclerView.R(childAt);
            if (((Boolean) this.o.invoke(Integer.valueOf(iR))).booleanValue()) {
                Rect rect = this.Y;
                RecyclerView.V(rect, childAt);
                Rect rect2 = this.Z;
                childAt.getDrawingRect(rect2);
                int iHeight = (rect.height() - rect2.height()) / 2;
                this.X.setAlpha(tu0.G(childAt.getAlpha() * 255));
                if (((Boolean) this.b.invoke(Integer.valueOf(iR))).booleanValue()) {
                    Drawable drawable = this.X;
                    drawable.setState(this.s0);
                    drawable.setBounds(rect.left + iG, (rect.centerY() - iG2) + iHeight, (iG2 * 2) + rect.left + iG, rect.centerY() + iG2 + iHeight);
                    drawable.draw(canvas);
                } else {
                    Drawable drawable2 = this.X;
                    drawable2.setState(this.t0);
                    drawable2.setBounds(rect.left + iG, (rect.centerY() - iG2) + iHeight, (iG2 * 2) + rect.left + iG, rect.centerY() + iG2 + iHeight);
                    drawable2.draw(canvas);
                }
            }
            i = i2;
        }
    }

    @Override // defpackage.kre
    public final void onThemeChanged(fka fkaVar) {
        this.X = (Drawable) this.a.invoke();
    }
}
