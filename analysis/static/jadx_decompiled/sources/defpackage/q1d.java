package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes2.dex */
public final class q1d extends ndc implements kre {
    public final RectF X;
    public final Rect Y;
    public final bi9 Z;
    public final o1d a;
    public final int b;
    public final m56 c;
    public final Paint o;
    public final bi9 s0;
    public final bi9 t0;
    public final float[] u0;
    public final Path v0;
    public final gaa w0;

    public q1d(fka fkaVar, o1d o1dVar, l lVar, int i) {
        int i2 = 4;
        int i3 = (i & 4) != 0 ? 4 : 0;
        m56 w8cVar = (i & 8) != 0 ? new w8c(i2) : lVar;
        this.a = o1dVar;
        this.b = i3;
        this.c = w8cVar;
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL);
        this.o = paint;
        this.X = new RectF();
        this.Y = new Rect();
        bi9 bi9Var = k37.a;
        this.Z = new bi9();
        this.s0 = new bi9();
        this.t0 = new bi9();
        this.u0 = new float[8];
        this.v0 = new Path();
        this.w0 = new gaa(17);
        onThemeChanged(fkaVar);
    }

    public static final void i(q1d q1dVar, Canvas canvas) {
        Path path = q1dVar.v0;
        RectF rectF = q1dVar.X;
        Path.Direction direction = Path.Direction.CCW;
        float[] fArr = q1dVar.u0;
        path.addRoundRect(rectF, fArr, direction);
        Path path2 = q1dVar.v0;
        canvas.drawPath(path2, q1dVar.o);
        path2.reset();
        rectF.set(Float.MAX_VALUE, Float.MAX_VALUE, Float.MIN_VALUE, Float.MIN_VALUE);
        ys.a0(fArr, 0.0f);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ndc
    public final void f(Rect rect, View view, RecyclerView recyclerView, zdc zdcVar) {
        recyclerView.getClass();
        int iR = RecyclerView.R(view);
        if (iR == -1) {
            return;
        }
        int i = this.a.i(iR);
        bi9 bi9Var = this.Z;
        bi9Var.h(iR);
        bi9 bi9Var2 = this.s0;
        bi9Var2.h(iR);
        bi9 bi9Var3 = this.t0;
        bi9Var3.h(iR);
        int i2 = i == 0 ? -1 : p1d.$EnumSwitchMapping$0[au1.s(i)];
        if (i2 != -1) {
            int i3 = this.b;
            if (i2 == 1) {
                rect.top = rh4.c(i3, fk4.d().getDisplayMetrics().density, rect.top);
                bi9Var.a(iR);
                mkc mkcVar = view instanceof mkc ? (mkc) view : null;
                if (mkcVar != null) {
                    mkcVar.setRippleMask(new RoundRectShape(new float[]{fk4.d().getDisplayMetrics().density * 16.0f, fk4.d().getDisplayMetrics().density * 16.0f, fk4.d().getDisplayMetrics().density * 16.0f, fk4.d().getDisplayMetrics().density * 16.0f, 0.0f, 0.0f, 0.0f, 0.0f}, null, null));
                }
            } else if (i2 == 2) {
                rect.bottom = rh4.c(i3, fk4.d().getDisplayMetrics().density, rect.bottom);
                bi9Var3.a(iR);
                mkc mkcVar2 = view instanceof mkc ? (mkc) view : null;
                if (mkcVar2 != null) {
                    mkcVar2.setRippleMask(new RoundRectShape(new float[]{0.0f, 0.0f, 0.0f, 0.0f, fk4.d().getDisplayMetrics().density * 16.0f, fk4.d().getDisplayMetrics().density * 16.0f, fk4.d().getDisplayMetrics().density * 16.0f, fk4.d().getDisplayMetrics().density * 16.0f}, null, null));
                }
            } else if (i2 == 3) {
                float f = i3;
                rect.top = rh4.c(f, fk4.d().getDisplayMetrics().density, rect.top);
                rect.bottom = rh4.c(f, fk4.d().getDisplayMetrics().density, rect.bottom);
                bi9Var.a(iR);
                bi9Var3.a(iR);
                mkc mkcVar3 = view instanceof mkc ? (mkc) view : null;
                if (mkcVar3 != null) {
                    mkcVar3.setRippleMask(new RoundRectShape(new float[]{fk4.d().getDisplayMetrics().density * 16.0f, fk4.d().getDisplayMetrics().density * 16.0f, fk4.d().getDisplayMetrics().density * 16.0f, fk4.d().getDisplayMetrics().density * 16.0f, fk4.d().getDisplayMetrics().density * 16.0f, fk4.d().getDisplayMetrics().density * 16.0f, fk4.d().getDisplayMetrics().density * 16.0f, fk4.d().getDisplayMetrics().density * 16.0f}, null, null));
                }
            } else {
                if (i2 != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                bi9Var2.a(iR);
            }
        }
        this.w0.E(rect, view, recyclerView);
    }

    @Override // defpackage.ndc
    public final void g(Canvas canvas, RecyclerView recyclerView, zdc zdcVar) {
        RectF rectF = this.X;
        rectF.set(Float.MAX_VALUE, Float.MAX_VALUE, Float.MIN_VALUE, Float.MIN_VALUE);
        int childCount = recyclerView.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = recyclerView.getChildAt(i);
            int iR = RecyclerView.R(childAt);
            gaa gaaVar = this.w0;
            Rect rect = this.Y;
            gaaVar.v(rect, childAt, iR);
            bi9 bi9Var = this.Z;
            boolean zC = bi9Var.c(iR);
            int i2 = this.b;
            float[] fArr = this.u0;
            if (zC) {
                float f = fk4.d().getDisplayMetrics().density * 16.0f;
                fArr[0] = f;
                fArr[1] = f;
                fArr[2] = f;
                fArr[3] = f;
                rectF.set(rect.left, rect.top, rect.right, rect.bottom);
                int i3 = -tu0.G(i2 * fk4.d().getDisplayMetrics().density);
                Drawable background = childAt.getBackground();
                RippleDrawable rippleDrawable = background instanceof RippleDrawable ? (RippleDrawable) background : null;
                if (rippleDrawable != null) {
                    f8.D(rippleDrawable, 0, i3, 0, 13);
                }
            }
            boolean zC2 = this.s0.c(iR);
            bi9 bi9Var2 = this.t0;
            if (zC2 || bi9Var2.c(iR)) {
                rectF.left = Math.min(rectF.left, rect.left);
                rectF.top = Math.min(rectF.top, rect.top);
                rectF.right = Math.max(rectF.right, rect.right);
                rectF.bottom = Math.max(rectF.bottom, rect.bottom);
                if (bi9Var2.c(iR)) {
                    float f2 = fk4.d().getDisplayMetrics().density * 16.0f;
                    fArr[4] = f2;
                    fArr[5] = f2;
                    fArr[6] = f2;
                    fArr[7] = f2;
                    int iQ = bi9Var.c(iR) ? rh4.q(i2, fk4.d().getDisplayMetrics().density, rect.height()) : rect.height();
                    Drawable background2 = childAt.getBackground();
                    RippleDrawable rippleDrawable2 = background2 instanceof RippleDrawable ? (RippleDrawable) background2 : null;
                    if (rippleDrawable2 != null) {
                        f8.D(rippleDrawable2, 0, 0, iQ, 7);
                    }
                    i(this, canvas);
                }
            }
        }
        if (rectF.height() > 0.0f) {
            i(this, canvas);
        }
    }

    @Override // defpackage.kre
    public final void onThemeChanged(fka fkaVar) {
        this.o.setColor(((Number) this.c.invoke(fkaVar)).intValue());
    }
}
