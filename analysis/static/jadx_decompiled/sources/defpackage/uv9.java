package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import java.util.BitSet;
import java.util.LinkedHashMap;

/* loaded from: classes2.dex */
public final class uv9 extends ViewGroup implements kre {
    public final Path a;
    public final Rect b;
    public final LinkedHashMap c;
    public tv9 o;
    public final BitSet s0;
    public final int t0;
    public final int u0;
    public final rz7 v0;
    public final rz7 w0;
    public final caa x0;

    public uv9(Context context) {
        super(context, null);
        this.a = new Path();
        this.b = new Rect();
        this.c = new LinkedHashMap();
        this.o = new tv9(0, false, false, false);
        BitSet bitSet = new BitSet(3);
        this.s0 = bitSet;
        this.t0 = 1;
        this.u0 = 2;
        rz7 rz7Var = new rz7(context);
        rz7Var.setId(xoc.k0);
        rz7Var.setIcon(woc.k1);
        rz7Var.setFocusable(0);
        this.v0 = rz7Var;
        rz7 rz7Var2 = new rz7(context);
        rz7Var2.setId(xoc.l0);
        rz7Var2.setIcon(woc.T);
        rz7Var2.setFocusable(0);
        float f = 20;
        rz7Var2.setLayoutParams(new ViewGroup.MarginLayoutParams(tu0.G(fk4.d().getDisplayMetrics().density * f), tu0.G(f * fk4.d().getDisplayMetrics().density)));
        this.w0 = rz7Var2;
        caa caaVar = new caa(context);
        caaVar.setId(xoc.j0);
        caaVar.setFocusable(0);
        this.x0 = caaVar;
        addView(caaVar);
        addView(rz7Var);
        addView(rz7Var2);
        bitSet.set(0, bitSet.size(), false);
    }

    private final void setupMention(boolean z) {
        BitSet bitSet = this.s0;
        boolean z2 = false;
        bitSet.set(0, z);
        if (!z && this.o.b) {
            z2 = true;
        }
        bitSet.set(this.t0, z2);
        pq9 pq9Var = qp4.u0;
        rz7 rz7Var = this.v0;
        rz7Var.setBackgroundColor(pq9Var.j(rz7Var).b().a.m);
        pq9Var.j(rz7Var).getIcon();
        rz7Var.setIconColor(-1);
        requestLayout();
    }

    private final void setupReaction(boolean z) {
        int i;
        this.s0.set(this.t0, z && !this.o.c);
        boolean z2 = this.o.d;
        pq9 pq9Var = qp4.u0;
        rz7 rz7Var = this.w0;
        fka fkaVarJ = pq9Var.j(rz7Var);
        if (z2) {
            i = fkaVarJ.getIcon().j;
        } else {
            fkaVarJ.getIcon();
            i = -1;
        }
        boolean z3 = this.o.d;
        fka fkaVarJ2 = pq9Var.j(rz7Var);
        rz7Var.setBackgroundColor(z3 ? fkaVarJ2.b().a.g : fkaVarJ2.f().a);
        rz7Var.setIconColor(i);
        requestLayout();
    }

    public final void a(View view) {
        Path path = this.a;
        path.reset();
        int left = view.getLeft();
        int top = view.getTop();
        int right = view.getRight();
        int bottom = view.getBottom();
        Rect rect = this.b;
        rect.set(left, top, right, bottom);
        if (view instanceof rz7) {
            path.addCircle(rect.exactCenterX(), rect.exactCenterY(), Math.min(rect.width(), rect.height()) / 2.0f, Path.Direction.CCW);
        } else if (view instanceof caa) {
            float f = rect.left;
            float f2 = rect.top;
            float f3 = rect.right;
            float f4 = rect.bottom;
            Path.Direction direction = Path.Direction.CCW;
            path.addRect(f, f2, f3, f4, direction);
            BitSet bitSet = this.s0;
            rz7 rz7Var = bitSet.get(0) ? this.v0 : bitSet.get(this.t0) ? this.w0 : null;
            if (rz7Var != null) {
                Rect rect2 = new Rect(rz7Var.getLeft(), rz7Var.getTop(), rz7Var.getRight(), rz7Var.getBottom());
                Path path2 = new Path();
                path2.addCircle(rect2.exactCenterX(), rect2.exactCenterY(), (Math.min(rect2.width(), rect2.height()) / 2.0f) + tu0.G(2 * fk4.d().getDisplayMetrics().density), direction);
                path.op(path2, Path.Op.DIFFERENCE);
            }
        }
        Path path3 = (Path) this.c.get(view);
        if (path3 != null) {
            path3.set(path);
        }
    }

    public final void b(boolean z, fka fkaVar) {
        int i;
        if (z) {
            i = fkaVar.getIcon().j;
        } else {
            fkaVar.getIcon();
            i = -1;
        }
        int i2 = z ? fkaVar.b().a.g : fkaVar.f().a;
        rz7 rz7Var = this.w0;
        rz7Var.setBackgroundColor(i2);
        rz7Var.setIconColor(i);
        int i3 = fkaVar.b().a.m;
        rz7 rz7Var2 = this.v0;
        rz7Var2.setBackgroundColor(i3);
        rz7Var2.setIconColor(-1);
        this.x0.setAppearance(z ? x9a.c : x9a.a);
        invalidate();
    }

    public final void c(boolean z) {
        tv9 tv9Var = this.o;
        boolean z2 = tv9Var.c;
        this.o = tv9.a(tv9Var, 0, false, z, false, 11);
        if (z2 != z) {
            setupMention(z);
        }
    }

    public final void d(boolean z) {
        tv9 tv9Var = this.o;
        boolean z2 = tv9Var.b;
        this.o = tv9.a(tv9Var, 0, z, false, false, 13);
        if (z2 != z) {
            setupReaction(z);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        Object obj = this.c.get(view);
        if (obj == null) {
            throw new IllegalArgumentException("Required value was null.".toString());
        }
        int iSave = canvas.save();
        canvas.clipPath((Path) obj);
        try {
            return super.drawChild(canvas, view, j);
        } finally {
            canvas.restoreToCount(iSave);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int paddingStart = getPaddingStart();
        BitSet bitSet = this.s0;
        if (bitSet.get(this.t0)) {
            int paddingStart2 = getPaddingStart();
            int paddingTop = getPaddingTop();
            int paddingStart3 = getPaddingStart();
            rz7 rz7Var = this.w0;
            c54.L(paddingStart2, paddingTop, rz7Var.getMeasuredWidth() + paddingStart3, rz7Var.getMeasuredHeight() + getPaddingTop(), this.w0, this);
            a(rz7Var);
            paddingStart += rz7Var.getMeasuredWidth();
        }
        if (bitSet.get(0)) {
            int paddingStart4 = getPaddingStart();
            int paddingTop2 = getPaddingTop();
            int paddingStart5 = getPaddingStart();
            rz7 rz7Var2 = this.v0;
            c54.L(paddingStart4, paddingTop2, rz7Var2.getMeasuredWidth() + paddingStart5, rz7Var2.getMeasuredHeight() + getPaddingTop(), this.v0, this);
            a(rz7Var2);
            paddingStart += rz7Var2.getMeasuredWidth();
        }
        int i5 = paddingStart;
        if (bitSet.get(this.u0)) {
            int measuredWidth = getMeasuredWidth() - getPaddingEnd();
            int paddingTop3 = getPaddingTop();
            int paddingTop4 = getPaddingTop();
            caa caaVar = this.x0;
            c54.L(i5, paddingTop3, measuredWidth, caaVar.getMeasuredHeight() + paddingTop4, this.x0, this);
            a(caaVar);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int measuredWidth;
        BitSet bitSet = this.s0;
        int i3 = bitSet.get(0) ? 0 : 8;
        rz7 rz7Var = this.v0;
        rz7Var.setVisibility(i3);
        int i4 = bitSet.get(this.t0) ? 0 : 8;
        rz7 rz7Var2 = this.w0;
        rz7Var2.setVisibility(i4);
        int i5 = this.u0;
        int i6 = bitSet.get(i5) ? 0 : 8;
        caa caaVar = this.x0;
        caaVar.setVisibility(i6);
        float f = 20;
        int iG = tu0.G(fk4.d().getDisplayMetrics().density * f);
        if (bitSet.get(0)) {
            rz7Var.measure(View.MeasureSpec.makeMeasureSpec(tu0.G(fk4.d().getDisplayMetrics().density * f), 1073741824), View.MeasureSpec.makeMeasureSpec(tu0.G(fk4.d().getDisplayMetrics().density * f), 1073741824));
            measuredWidth = rz7Var.getMeasuredWidth();
        } else {
            measuredWidth = 0;
        }
        if (rz7Var2.getVisibility() == 0) {
            rz7Var2.measure(View.MeasureSpec.makeMeasureSpec(tu0.G(fk4.d().getDisplayMetrics().density * f), 1073741824), View.MeasureSpec.makeMeasureSpec(tu0.G(fk4.d().getDisplayMetrics().density * f), 1073741824));
            measuredWidth += rz7Var2.getMeasuredWidth();
        }
        if (bitSet.get(i5)) {
            caaVar.measure(0, View.MeasureSpec.makeMeasureSpec(tu0.G(f * fk4.d().getDisplayMetrics().density), 1073741824));
            measuredWidth += caaVar.getMeasuredWidth();
        }
        setMeasuredDimension(measuredWidth, iG);
    }

    @Override // defpackage.kre
    public final void onThemeChanged(fka fkaVar) {
        b(this.o.d, fkaVar);
        this.x0.f(fkaVar);
    }

    @Override // android.view.ViewGroup
    public final void onViewAdded(View view) {
        super.onViewAdded(view);
        this.c.put(view, new Path());
    }

    @Override // android.view.ViewGroup
    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        this.c.remove(view);
    }
}
