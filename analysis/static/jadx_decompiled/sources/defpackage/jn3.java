package defpackage;

import android.R;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.util.DisplayMetrics;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public final class jn3 extends ndc implements kre {
    public final Object X;
    public Object Y;
    public final Object Z;
    public final /* synthetic */ int a;
    public final Rect b;
    public final Object c;
    public final Object o;

    public jn3(em2 em2Var, fka fkaVar, in3 in3Var) {
        this.a = 0;
        this.o = em2Var;
        this.X = in3Var;
        this.b = new Rect();
        bi9 bi9Var = k37.a;
        this.Y = new bi9();
        Paint paint = new Paint();
        paint.setStrokeWidth(fk4.d().getDisplayMetrics().density * 0.5f);
        this.Z = paint;
        this.c = new gaa(17);
        onThemeChanged(fkaVar);
    }

    public static boolean j(int i, Integer num, Integer num2) {
        int i2 = gja.r;
        return i == i2 && (num == null || num.intValue() != i2) && (num2 == null || num2.intValue() != i2);
    }

    public static final void k(jn3 jn3Var, Canvas canvas) {
        Path path = (Path) jn3Var.Y;
        RectF rectF = (RectF) jn3Var.o;
        Path.Direction direction = Path.Direction.CCW;
        float[] fArr = (float[]) jn3Var.X;
        path.addRoundRect(rectF, fArr, direction);
        Path path2 = (Path) jn3Var.Y;
        canvas.drawPath(path2, (Paint) jn3Var.Z);
        path2.reset();
        rectF.set(Float.MAX_VALUE, Float.MAX_VALUE, Float.MIN_VALUE, Float.MIN_VALUE);
        ys.a0(fArr, 0.0f);
    }

    public static final void l(jn3 jn3Var) {
        RectF rectF = (RectF) jn3Var.o;
        float f = rectF.left;
        Rect rect = jn3Var.b;
        rectF.left = Math.min(f, rect.left);
        RectF rectF2 = (RectF) jn3Var.o;
        rectF2.top = Math.min(rectF2.top, rect.top);
        rectF2.right = Math.max(rectF2.right, rect.right);
        rectF2.bottom = Math.max(rectF2.bottom, rect.bottom);
    }

    /* JADX WARN: Removed duplicated region for block: B:68:0x0106  */
    @Override // defpackage.ndc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void f(android.graphics.Rect r6, android.view.View r7, androidx.recyclerview.widget.RecyclerView r8, defpackage.zdc r9) {
        /*
            Method dump skipped, instructions count: 442
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jn3.f(android.graphics.Rect, android.view.View, androidx.recyclerview.widget.RecyclerView, zdc):void");
    }

    @Override // defpackage.ndc
    public void g(Canvas canvas, RecyclerView recyclerView, zdc zdcVar) {
        switch (this.a) {
            case 2:
                RectF rectF = (RectF) this.o;
                rectF.set(Float.MAX_VALUE, Float.MAX_VALUE, Float.MIN_VALUE, Float.MIN_VALUE);
                float f = fk4.d().getDisplayMetrics().density * 16.0f;
                hdc adapter = recyclerView.getAdapter();
                ppd ppdVar = adapter instanceof ppd ? (ppd) adapter : null;
                if (ppdVar != null) {
                    int childCount = recyclerView.getChildCount();
                    char c = 0;
                    int i = 0;
                    while (i < childCount) {
                        View childAt = recyclerView.getChildAt(i);
                        int iR = RecyclerView.R(childAt);
                        if (iR == -1) {
                            break;
                        } else {
                            ((gaa) this.c).v(this.b, childAt, iR);
                            iv ivVar = ppdVar.o;
                            ol7 ol7Var = (ol7) x53.j0(iR - 1, ivVar.f);
                            Integer numValueOf = ol7Var != null ? Integer.valueOf(ol7Var.getI0()) : null;
                            int iL = ppdVar.l(iR);
                            ol7 ol7Var2 = (ol7) x53.j0(iR + 1, ivVar.f);
                            Integer numValueOf2 = ol7Var2 != null ? Integer.valueOf(ol7Var2.getI0()) : null;
                            int i2 = gja.r;
                            char c2 = (iL != i2 || (numValueOf != null && numValueOf.intValue() == i2) || numValueOf2 == null || numValueOf2.intValue() != i2) ? c : (char) 1;
                            float[] fArr = (float[]) this.X;
                            if (c2 != 0 || j(iL, numValueOf, numValueOf2)) {
                                fArr[c] = f;
                                fArr[1] = f;
                                fArr[2] = f;
                                fArr[3] = f;
                                rectF.set(r12.left, r12.top, r12.right, r12.bottom);
                            }
                            if ((iL == i2 && numValueOf != null && numValueOf.intValue() == i2 && (numValueOf2 == null || numValueOf2.intValue() != i2)) || j(iL, numValueOf, numValueOf2)) {
                                l(this);
                                fArr[4] = f;
                                fArr[5] = f;
                                fArr[6] = f;
                                fArr[7] = f;
                                k(this, canvas);
                            } else if (iL == i2 && numValueOf != null && numValueOf.intValue() == i2 && numValueOf2 != null && numValueOf2.intValue() == i2) {
                                l(this);
                            }
                            i++;
                            c = 0;
                        }
                    }
                    if (rectF.height() > 0.0f) {
                        k(this, canvas);
                        break;
                    }
                }
                break;
        }
    }

    @Override // defpackage.ndc
    public void h(Canvas canvas, RecyclerView recyclerView) {
        switch (this.a) {
            case 0:
                int iG = tu0.G(12 * fk4.d().getDisplayMetrics().density);
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
                    if (((bi9) this.Y).c(iR)) {
                        ((gaa) this.c).x(this.b, childAt, iR);
                        canvas.drawLine(r6.left + iG, r6.centerY(), r6.right - iG, r6.centerY(), (Paint) this.Z);
                    }
                    i = i2;
                }
            case 1:
                int i3 = 0;
                while (true) {
                    if (!(i3 < recyclerView.getChildCount())) {
                        return;
                    }
                    int i4 = i3 + 1;
                    View childAt2 = recyclerView.getChildAt(i3);
                    if (childAt2 == null) {
                        throw new IndexOutOfBoundsException();
                    }
                    recyclerView.getClass();
                    int iR2 = RecyclerView.R(childAt2);
                    if (iR2 != -1 && i(iR2)) {
                        String str = (String) ((m56) this.Y).invoke(Integer.valueOf(iR2));
                        gaa gaaVar = (gaa) this.c;
                        Rect rect = this.b;
                        gaaVar.x(rect, childAt2, iR2);
                        float f = rect.left;
                        float fC = rh4.c(10, fk4.d().getDisplayMetrics().density, rect.top);
                        TextPaint textPaint = (TextPaint) this.Z;
                        canvas.drawText(str, f, textPaint.descent() + fC, textPaint);
                    }
                    i3 = i4;
                }
                break;
            case 2:
            default:
                return;
            case 3:
                int iG2 = tu0.G(4 * fk4.d().getDisplayMetrics().density);
                int iG3 = tu0.G(24 * fk4.d().getDisplayMetrics().density);
                int i5 = 0;
                while (true) {
                    if (!(i5 < recyclerView.getChildCount())) {
                        return;
                    }
                    int i6 = i5 + 1;
                    View childAt3 = recyclerView.getChildAt(i5);
                    if (childAt3 == null) {
                        throw new IndexOutOfBoundsException();
                    }
                    recyclerView.getClass();
                    int iR3 = RecyclerView.R(childAt3);
                    Rect rect2 = this.b;
                    RecyclerView.V(rect2, childAt3);
                    if (((Boolean) ((m56) this.X).invoke(Integer.valueOf(iR3))).booleanValue()) {
                        ((Drawable) this.Y).setState((int[]) this.Z);
                    } else {
                        ((Drawable) this.Y).setState((int[]) this.c);
                    }
                    Drawable drawable = (Drawable) this.Y;
                    drawable.setAlpha(tu0.G(childAt3.getAlpha() * 255));
                    int i7 = rect2.right - iG2;
                    int i8 = rect2.top;
                    drawable.setBounds(i7 - iG3, i8 + iG2, i7, i8 + iG3 + iG2);
                    drawable.draw(canvas);
                    i5 = i6;
                }
        }
    }

    public boolean i(int i) {
        if (i <= 0) {
            return false;
        }
        jv5 jv5Var = (jv5) this.X;
        if (jv5Var.j() <= 0) {
            return false;
        }
        qo9 qo9VarJ = jv5Var.J(i - 1);
        Integer numValueOf = qo9VarJ != null ? Integer.valueOf(qo9VarJ.c) : null;
        return !tpa.f(numValueOf, jv5Var.J(i) != null ? Integer.valueOf(r2.c) : null);
    }

    @Override // defpackage.kre
    public final void onThemeChanged(fka fkaVar) {
        switch (this.a) {
            case 0:
                ((Paint) this.Z).setColor(fkaVar.i().b.b);
                break;
            case 1:
                kqe kqeVar = i4f.o;
                RecyclerView recyclerView = (RecyclerView) this.o;
                DisplayMetrics displayMetrics = recyclerView.getResources().getDisplayMetrics();
                TextPaint textPaint = (TextPaint) this.Z;
                kqeVar.a(textPaint, displayMetrics, du4.b);
                textPaint.setColor(qp4.u0.j(recyclerView).getText().i);
                break;
            case 2:
                ((Paint) this.Z).setColor(fkaVar.b().g);
                break;
            default:
                this.Y = (Drawable) ((k56) this.o).invoke();
                break;
        }
    }

    public jn3(gg9 gg9Var, hg9 hg9Var) {
        this.a = 3;
        this.o = gg9Var;
        this.X = hg9Var;
        this.Y = (Drawable) gg9Var.invoke();
        this.b = new Rect();
        this.Z = new int[]{R.attr.state_checked};
        this.c = new int[]{-16842912};
    }

    public jn3(fka fkaVar) {
        this.a = 2;
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL);
        this.Z = paint;
        this.o = new RectF();
        this.b = new Rect();
        this.X = new float[8];
        this.Y = new Path();
        this.c = new gaa(17);
        onThemeChanged(fkaVar);
    }

    public jn3(RecyclerView recyclerView, jv5 jv5Var, zo9 zo9Var) {
        this.a = 1;
        this.o = recyclerView;
        this.X = jv5Var;
        this.Y = zo9Var;
        this.b = new Rect();
        this.Z = new TextPaint();
        onThemeChanged(qp4.u0.j(recyclerView));
        this.c = new gaa(17);
    }
}
