package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes2.dex */
public final class ch5 extends View {
    public is0 a;
    public final oh5 b;
    public final yi5 c;
    public final ph5 o;

    public ch5(Context context) {
        super(context, null);
        pq9 pq9Var = qp4.u0;
        this.a = pq9Var.j(this).a().d(true);
        int i = pq9Var.j(this).a().d(true).b.f;
        oh5 oh5Var = new oh5(context);
        oh5Var.setCallback(this);
        this.b = oh5Var;
        yi5 yi5Var = new yi5();
        float f = 12;
        int iG = tu0.G(2 * fk4.d().getDisplayMetrics().density) * 2;
        int iG2 = tu0.G(fk4.d().getDisplayMetrics().density * f) - iG;
        int iG3 = tu0.G(f * fk4.d().getDisplayMetrics().density) - iG;
        int iG4 = tu0.G(5 * fk4.d().getDisplayMetrics().density);
        wi5 wi5Var = yi5Var.h;
        wi5Var.c = wmd.m(wi5Var.c, iG2, 0.0f, 2);
        wi5Var.d = wmd.m(wi5Var.d, iG3, 0.0f, 2);
        wi5Var.b = wmd.m(wi5Var.b, iG4, 0.0f, 2);
        yi5Var.c(i, i);
        yi5Var.setCallback(this);
        this.c = yi5Var;
        ph5 ph5Var = new ph5(context, oh5Var);
        ph5Var.setCallback(this);
        this.o = ph5Var;
        this.a = this.a;
        ph5Var.onThemeChanged(pq9Var.j(this));
        uf5 uf5Var = ph5Var.c;
        if (uf5Var == null) {
            return;
        }
        int iC = pq9Var.j(this).a().c(uf5Var.b().o);
        yi5Var.c(iC, iC);
    }

    public final void a(Drawable drawable, Canvas canvas) {
        int iSave = canvas.save();
        canvas.translate((getWidth() - drawable.getBounds().width()) * 0.5f, (getHeight() - drawable.getBounds().height()) * 0.5f);
        try {
            drawable.draw(canvas);
        } finally {
            canvas.restoreToCount(iSave);
        }
    }

    public final void b(uf5 uf5Var, boolean z) {
        yi5 yi5Var = this.c;
        if (!wmd.o(yi5Var.f, 0.0f, 0.01f)) {
            yi5Var.f = 0.0f;
            if (!z) {
                yi5Var.e = 0.0f;
            }
            yi5Var.invalidateSelf();
        }
        ph5 ph5Var = this.o;
        ph5Var.a(uf5Var);
        uf5 uf5Var2 = ph5Var.c;
        if (uf5Var2 == null) {
            return;
        }
        int iC = qp4.u0.j(this).a().c(uf5Var2.b().o);
        yi5Var.c(iC, iC);
    }

    public final void c(uf5 uf5Var, float f, boolean z) {
        float f2 = f / 100.0f;
        yi5 yi5Var = this.c;
        ui5 ui5Var = yi5Var.c;
        ui5 ui5Var2 = ui5.b;
        xi5 xi5Var = yi5Var.i;
        if (ui5Var != ui5Var2 || !wmd.o(xi5Var.h, f2, 0.01f) || !wmd.o(yi5Var.f, 1.0f, 0.01f)) {
            boolean zB = yi5Var.b();
            wi5 wi5Var = yi5Var.h;
            if (!zB) {
                yi5Var.b = ui5Var2;
                wi5Var.h = 1.0f;
                wi5Var.i = 1.0f;
                wi5Var.j = 1.0f;
                xi5Var.i = 1.0f;
                xi5Var.k = 1.0f;
            }
            yi5Var.c = ui5Var2;
            yi5Var.f = 1.0f;
            xi5Var.h = f2;
            wi5Var.j = 1.0f;
            if (!z) {
                yi5Var.b = ui5Var2;
                xi5Var.g = f2;
                xi5Var.i = 1.0f;
                xi5Var.k = 1.0f;
                wi5Var.h = 1.0f;
                wi5Var.i = 1.0f;
                wi5Var.j = 1.0f;
                yi5Var.e = 1.0f;
            }
            yi5Var.invalidateSelf();
        }
        ph5 ph5Var = this.o;
        ph5Var.a(uf5Var);
        uf5 uf5Var2 = ph5Var.c;
        if (uf5Var2 == null) {
            return;
        }
        int iC = qp4.u0.j(this).a().c(uf5Var2.b().o);
        yi5Var.c(iC, iC);
    }

    public final void d(uf5 uf5Var, boolean z) {
        yi5 yi5Var = this.c;
        ui5 ui5Var = yi5Var.c;
        ui5 ui5Var2 = ui5.a;
        wi5 wi5Var = yi5Var.h;
        if (ui5Var != ui5Var2 || !wmd.o(wi5Var.j, 0.0f, 0.01f) || !wmd.o(yi5Var.f, 1.0f, 0.01f)) {
            boolean zB = yi5Var.b();
            xi5 xi5Var = yi5Var.i;
            if (!zB) {
                yi5Var.b = ui5Var2;
                wi5Var.h = 1.0f;
                wi5Var.i = 0.0f;
                wi5Var.j = 0.0f;
                xi5Var.i = 0.0f;
                xi5Var.k = 0.0f;
            }
            yi5Var.c = ui5Var2;
            wi5Var.j = 0.0f;
            yi5Var.f = 1.0f;
            if (!z) {
                yi5Var.b = ui5Var2;
                wi5Var.h = 1.0f;
                wi5Var.i = 0.0f;
                wi5Var.j = 0.0f;
                xi5Var.i = 0.0f;
                xi5Var.k = 0.0f;
                yi5Var.e = 1.0f;
            }
            yi5Var.invalidateSelf();
        }
        ph5 ph5Var = this.o;
        ph5Var.a(uf5Var);
        uf5 uf5Var2 = ph5Var.c;
        if (uf5Var2 == null) {
            return;
        }
        int iC = qp4.u0.j(this).a().c(uf5Var2.b().o);
        yi5Var.c(iC, iC);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        a(this.b, canvas);
        long drawingTime = getDrawingTime();
        yi5 yi5Var = this.c;
        boolean zB = yi5Var.b();
        wi5 wi5Var = yi5Var.h;
        if (zB) {
            float fD = yi5Var.j == 0 ? 0.0f : ote.d((drawingTime - r6) / 1000.0f, 0.0f, 0.1f) * yi5Var.g;
            yi5Var.j = drawingTime;
            float f = 3.0f * fD;
            if (wmd.o(yi5Var.f, yi5Var.e, f)) {
                yi5Var.e = yi5Var.f;
            } else {
                float f2 = yi5Var.e;
                yi5Var.e = (Math.signum(yi5Var.f - f2) * f) + f2;
                yi5Var.invalidateSelf();
            }
            int iOrdinal = yi5Var.a().ordinal();
            if (iOrdinal != 0) {
                int i = 1;
                xi5 xi5Var = yi5Var.i;
                if (iOrdinal == 1) {
                    yi5Var.invalidateSelf();
                    float f3 = wi5Var.i + f;
                    wi5Var.i = f3;
                    if (f3 >= 1.0d) {
                        wi5Var.i = 1.0f;
                        yi5Var.b = ui5.b;
                        xi5Var.i = 1.0f;
                        xi5Var.f = 0.0f;
                        xi5Var.g = 0.0f;
                    }
                } else if (iOrdinal == 2) {
                    yi5Var.invalidateSelf();
                    float f4 = fD * 2.0f;
                    float f5 = xi5Var.g - f4;
                    xi5Var.g = f5;
                    if (f5 <= 0.0f) {
                        xi5Var.g = 0.0f;
                    } else {
                        i = 0;
                    }
                    float f6 = xi5Var.k - f;
                    xi5Var.k = f6;
                    if (f6 <= 0.0f) {
                        xi5Var.k = 0.0f;
                        i++;
                    }
                    float f7 = xi5Var.f + f4;
                    xi5Var.f = f7;
                    if (f7 > 0.9900000002235174d) {
                        xi5Var.f = 1.0f;
                        i++;
                    }
                    if (i == 3) {
                        xi5Var.i = 0.0f;
                        xi5Var.k = 0.0f;
                        wi5Var.j = 0.0f;
                        wi5Var.i = 1.0f;
                        wi5Var.h = 1.0f;
                        yi5Var.b = ui5.a;
                    }
                } else {
                    if (iOrdinal != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    yi5Var.invalidateSelf();
                    float f8 = 2.0f * fD;
                    xi5Var.f = (xi5Var.f + fD) % 1.0f;
                    xi5Var.i = 1.0f;
                    xi5Var.k = Math.min(1.0f, xi5Var.k + f);
                    if (wmd.o(xi5Var.g, xi5Var.h, f8)) {
                        xi5Var.g = xi5Var.h;
                    } else {
                        float f9 = xi5Var.g;
                        xi5Var.g = (Math.signum(xi5Var.h - f9) * f8) + f9;
                    }
                }
            } else if (wmd.o(wi5Var.j, wi5Var.i, f)) {
                wi5Var.i = wi5Var.j;
            } else {
                float f10 = wi5Var.i;
                wi5Var.i = (Math.signum(wi5Var.j - f10) * f) + f10;
                yi5Var.invalidateSelf();
            }
        }
        int iSqrt = (int) (((float) Math.sqrt(Math.max(1.0f - yi5Var.e, 1.0f - wi5Var.i))) * 255.0f);
        ph5 ph5Var = this.o;
        ph5Var.setAlpha(iSqrt);
        ph5Var.draw(canvas);
        a(yi5Var, canvas);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int iG = tu0.G(40 * fk4.d().getDisplayMetrics().density);
        this.b.setBounds(0, 0, tu0.G(28 * fk4.d().getDisplayMetrics().density), tu0.G(36 * fk4.d().getDisplayMetrics().density));
        float f = 20;
        this.c.setBounds(0, 0, tu0.G(fk4.d().getDisplayMetrics().density * f), tu0.G(f * fk4.d().getDisplayMetrics().density));
        this.o.setBounds(0, 0, iG, iG);
        setMeasuredDimension(iG, iG);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(null);
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        if (!super.verifyDrawable(drawable) && drawable != this.c) {
            ph5 ph5Var = this.o;
            if (ph5Var == drawable) {
                ph5Var.getClass();
            } else if (ph5Var.b != drawable) {
                return false;
            }
        }
        return true;
    }
}
