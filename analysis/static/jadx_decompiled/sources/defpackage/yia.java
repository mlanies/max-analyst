package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public final class yia extends ViewGroup {
    public int a;
    public int b;
    public int c;
    public final Paint o;
    public final je7 s0;
    public final pf t0;
    public final ArrayList u0;

    public yia(Context context) {
        super(context);
        this.a = tu0.G(28 * fk4.d().getDisplayMetrics().density);
        this.b = tu0.G(10 * fk4.d().getDisplayMetrics().density);
        this.c = tu0.G(2 * fk4.d().getDisplayMetrics().density);
        Paint paint = new Paint(1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        this.o = paint;
        this.s0 = tu0.r(3, new xda(context, 6));
        this.t0 = new pf(3, this);
        this.u0 = new ArrayList();
    }

    private final int getAvatarsWidth() {
        return (this.u0.size() * this.a) - ((r1.size() - 1) * this.b);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        float f = this.a / 2.0f;
        float measuredHeight = (getMeasuredHeight() / 2.0f) - f;
        float f2 = fk4.d().getDisplayMetrics().density * 0.0f;
        int iSaveLayer = canvas.saveLayer(0.0f, 0.0f, getWidth(), getHeight(), null);
        ArrayList arrayList = this.u0;
        Iterator it = arrayList.iterator();
        int i = 0;
        while (it.hasNext()) {
            Object next = it.next();
            int i2 = i + 1;
            if (i < 0) {
                y53.R();
                throw null;
            }
            Drawable drawable = (Drawable) next;
            int iSave = canvas.save();
            canvas.translate(f2, measuredHeight);
            try {
                int i3 = this.a;
                int i4 = i3 - this.b;
                float f3 = i3 / 2.0f;
                float f4 = i4;
                f2 += f4;
                drawable.draw(canvas);
                if (i != y53.L(arrayList)) {
                    canvas.drawCircle(f4 + f, f3, this.c + f, this.o);
                }
                canvas.restoreToCount(iSave);
                i = i2;
            } catch (Throwable th) {
                canvas.restoreToCount(iSave);
                throw th;
            }
        }
        canvas.restoreToCount(iSaveLayer);
        super.dispatchDraw(canvas);
    }

    public final int getAvatarOffset() {
        return this.b;
    }

    public final int getAvatarSize() {
        return this.a;
    }

    public final int getStrokeWidth() {
        return this.c;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        View viewZ = br7.z(this.s0);
        if (viewZ == null) {
            return;
        }
        int iC = rh4.c(8, fk4.d().getDisplayMetrics().density, getAvatarsWidth());
        viewZ.layout(iC, (getMeasuredHeight() / 2) - (viewZ.getMeasuredHeight() / 2), viewZ.getMeasuredWidth() + iC, (viewZ.getMeasuredHeight() / 2) + (getMeasuredHeight() / 2));
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int avatarsWidth = getAvatarsWidth();
        int iMax = this.a;
        View viewZ = br7.z(this.s0);
        if (viewZ != null) {
            float f = 8;
            int iQ = rh4.q(f, fk4.d().getDisplayMetrics().density, size - avatarsWidth);
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
            int i3 = iQ - (marginLayoutParams != null ? marginLayoutParams.leftMargin : 0);
            ViewGroup.LayoutParams layoutParams2 = getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams2 : null;
            int i4 = i3 - (marginLayoutParams2 != null ? marginLayoutParams2.rightMargin : 0);
            if (i4 < 0) {
                i4 = 0;
            }
            viewZ.measure(View.MeasureSpec.makeMeasureSpec(i4, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(0, 0));
            avatarsWidth = wg0.d(f, fk4.d().getDisplayMetrics().density, viewZ.getMeasuredWidth(), avatarsWidth);
            iMax = Math.max(this.a, viewZ.getMeasuredHeight());
        }
        setMeasuredDimension(avatarsWidth, iMax);
    }

    public final void setAvatarOffset(int i) {
        this.b = i;
        requestLayout();
        invalidate();
    }

    public final void setAvatarSize(int i) {
        this.a = i;
        requestLayout();
        invalidate();
    }

    public final void setAvatars(List<kpa> list) {
        ArrayList arrayList = this.u0;
        arrayList.clear();
        if (list == null) {
            requestLayout();
            invalidate();
            return;
        }
        for (kpa kpaVar : list) {
            uc0 uc0Var = (uc0) kpaVar.a;
            String str = (String) kpaVar.b;
            g5a g5aVar = new g5a(getContext());
            g5aVar.setCallback(this.t0);
            int i = this.a;
            g5aVar.setBounds(0, 0, i, i);
            g5aVar.b(uc0Var, str);
            arrayList.add(g5aVar);
        }
        requestLayout();
        invalidate();
    }

    public final void setStrokeWidth(int i) {
        this.c = i;
        requestLayout();
        invalidate();
    }

    public final void setTitle(jqe jqeVar) {
        je7 je7Var = this.s0;
        if (jqeVar == null) {
            ((TextView) je7Var.getValue()).setText((CharSequence) null);
            ((TextView) je7Var.getValue()).setVisibility(8);
        } else {
            ay7.b(this, (View) je7Var.getValue(), -1);
            ((TextView) je7Var.getValue()).setText(jqeVar.b(getContext()));
            ((TextView) je7Var.getValue()).setVisibility(0);
        }
    }
}
