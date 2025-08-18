package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.TextPaint;
import android.util.DisplayMetrics;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Locale;

/* loaded from: classes.dex */
public final class bw5 extends ndc implements kre {
    public final Object X;
    public final /* synthetic */ int a;
    public final Rect b;
    public final gaa c;
    public final Object o;

    public bw5(nw4 nw4Var) {
        this.a = 3;
        this.o = nw4Var;
        this.b = new Rect();
        TextPaint textPaint = new TextPaint();
        nw4Var.q(textPaint);
        this.X = textPaint;
        this.c = new gaa(17);
    }

    public static boolean i(RecyclerView recyclerView, int i) {
        hdc adapter = recyclerView.getAdapter();
        if (adapter == null || i == -1 || i == 0) {
            return false;
        }
        int iL = adapter.l(i);
        int i2 = oba.l;
        return iL == i2 && adapter.l(i - 1) != i2;
    }

    @Override // defpackage.ndc
    public final void f(Rect rect, View view, RecyclerView recyclerView, zdc zdcVar) {
        int iR;
        switch (this.a) {
            case 0:
                super.f(rect, view, recyclerView, zdcVar);
                hdc adapter = recyclerView.getAdapter();
                if (adapter != null && (iR = RecyclerView.R(view)) > 0 && adapter.l(iR) == oba.i) {
                    rect.top = (int) ((tu0.G(6 * fk4.d().getDisplayMetrics().density) * 2) + 0.5f);
                }
                this.c.E(rect, view, recyclerView);
                break;
            case 1:
                super.f(rect, view, recyclerView, zdcVar);
                recyclerView.getClass();
                if (i(recyclerView, RecyclerView.R(view))) {
                    rect.top = tu0.G(48 * fk4.d().getDisplayMetrics().density);
                }
                this.c.E(rect, view, recyclerView);
                break;
            case 2:
                super.f(rect, view, recyclerView, zdcVar);
                if (j(recyclerView, view)) {
                    rect.top = (int) ((tu0.G(10 * fk4.d().getDisplayMetrics().density) * 2) + 0.5f);
                }
                this.c.E(rect, view, recyclerView);
                break;
            default:
                super.f(rect, view, recyclerView, zdcVar);
                recyclerView.getClass();
                if (((nw4) this.o).m(RecyclerView.R(view))) {
                    int i = rect.top;
                    int iG = tu0.G(6 * fk4.d().getDisplayMetrics().density) * 2;
                    TextPaint textPaint = (TextPaint) this.X;
                    rect.top = iG + ((int) (textPaint.descent() - textPaint.ascent())) + i;
                }
                this.c.E(rect, view, recyclerView);
                break;
        }
    }

    @Override // defpackage.ndc
    public void g(Canvas canvas, RecyclerView recyclerView, zdc zdcVar) {
        int iR;
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
                    hdc adapter = recyclerView.getAdapter();
                    if (adapter != null && (iR = RecyclerView.R(childAt)) > 0 && adapter.l(iR) == oba.i) {
                        int iR2 = RecyclerView.R(childAt);
                        this.c.x(this.b, childAt, iR2);
                        float f = 12;
                        canvas.drawRect(rh4.c(f, fk4.d().getDisplayMetrics().density, r4.left), r4.top, rh4.q(f, fk4.d().getDisplayMetrics().density, r4.right), r4.bottom, (Paint) this.X);
                        float f2 = 24;
                        canvas.drawLine(rh4.c(f2, fk4.d().getDisplayMetrics().density, r4.left), r4.centerY(), rh4.q(f2, fk4.d().getDisplayMetrics().density, r4.right), r4.centerY(), (Paint) this.o);
                    }
                    i = i2;
                }
                break;
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
                    int iR3 = RecyclerView.R(childAt2);
                    if (i(recyclerView, iR3)) {
                        String upperCase = ((Context) this.o).getString(qba.b).toUpperCase(Locale.ROOT);
                        this.c.x(this.b, childAt2, iR3);
                        canvas.drawText(upperCase, r5.left + tu0.G(28 * fk4.d().getDisplayMetrics().density), r5.bottom - tu0.G(10 * fk4.d().getDisplayMetrics().density), (TextPaint) this.X);
                    }
                    i3 = i4;
                }
            default:
                return;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0028  */
    @Override // defpackage.ndc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void h(android.graphics.Canvas r16, androidx.recyclerview.widget.RecyclerView r17) {
        /*
            Method dump skipped, instructions count: 238
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bw5.h(android.graphics.Canvas, androidx.recyclerview.widget.RecyclerView):void");
    }

    public boolean j(RecyclerView recyclerView, View view) {
        int iR;
        hdc adapter = recyclerView.getAdapter();
        if (adapter == null || (iR = RecyclerView.R(view)) <= 0 || ((in3) this.X).c(iR)) {
            return false;
        }
        int iL = adapter.l(iR);
        int i = z8a.s;
        return iL == i && adapter.l(iR - 1) != i;
    }

    @Override // defpackage.kre
    public final void onThemeChanged(fka fkaVar) {
        switch (this.a) {
            case 0:
                ((Paint) this.o).setColor(fkaVar.i().b.b);
                ((Paint) this.X).setColor(fkaVar.b().g);
                break;
            case 1:
                kqe kqeVar = i4f.r;
                DisplayMetrics displayMetrics = ((Context) this.o).getResources().getDisplayMetrics();
                TextPaint textPaint = (TextPaint) this.X;
                kqeVar.a(textPaint, displayMetrics, du4.b);
                textPaint.setColor(fkaVar.getText().g);
                break;
            case 2:
                ((Paint) this.o).setColor(fkaVar.i().b.b);
                break;
            default:
                ((nw4) this.o).q((TextPaint) this.X);
                break;
        }
    }

    public bw5(fka fkaVar) {
        this.a = 0;
        Paint paint = new Paint();
        paint.setStrokeWidth(fk4.d().getDisplayMetrics().density * 0.5f);
        this.o = paint;
        this.X = new Paint();
        this.b = new Rect();
        this.c = new gaa(17);
        onThemeChanged(fkaVar);
    }

    public bw5(fka fkaVar, vyd vydVar) {
        this.a = 2;
        this.X = vydVar;
        Paint paint = new Paint();
        paint.setStrokeWidth(fk4.d().getDisplayMetrics().density * 0.5f);
        this.o = paint;
        this.b = new Rect();
        this.c = new gaa(17);
        onThemeChanged(fkaVar);
    }

    public bw5(Context context) {
        this.a = 1;
        this.o = context;
        this.b = new Rect();
        this.X = new TextPaint();
        onThemeChanged(qp4.u0.b(context).i());
        this.c = new gaa(17);
    }
}
