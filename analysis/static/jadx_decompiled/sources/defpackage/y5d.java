package defpackage;

import android.text.Layout;
import android.text.TextPaint;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes2.dex */
public final class y5d {
    public final ViewGroup a;
    public final je7 b = tu0.r(3, new lwa(25, this));

    public y5d(ViewGroup viewGroup) {
        this.a = viewGroup;
    }

    public final int a() {
        return ((w5d) this.b.getValue()).getMeasuredHeight();
    }

    public final int b() {
        return ((w5d) this.b.getValue()).getMeasuredWidth();
    }

    public final void c(int i, int i2) {
        ote.E((View) this.b.getValue(), i, i2, 0, 12);
    }

    public final void d(int i, int i2) {
        ((w5d) this.b.getValue()).measure(i, i2);
    }

    public final void e(Layout layout) {
        je7 je7Var = this.b;
        if (layout == null) {
            if (je7Var.a()) {
                ((w5d) je7Var.getValue()).setVisibility(8);
                return;
            }
            return;
        }
        w5d w5dVar = (w5d) je7Var.getValue();
        w5dVar.a = layout;
        TextPaint paint = layout.getPaint();
        if (paint != null) {
            paint.setColor(w5dVar.b);
        }
        w5dVar.requestLayout();
        w5dVar.invalidate();
        if (w5dVar.getParent() == null) {
            this.a.addView(w5dVar, new ViewGroup.LayoutParams(-2, -2));
        }
        w5dVar.setVisibility(0);
    }

    public final void f(int i) {
        TextPaint paint;
        je7 je7Var = this.b;
        if (je7Var.a()) {
            w5d w5dVar = (w5d) je7Var.getValue();
            w5dVar.b = i;
            Layout layout = w5dVar.a;
            if (layout != null && (paint = layout.getPaint()) != null) {
                paint.setColor(i);
            }
            w5dVar.invalidate();
        }
    }
}
