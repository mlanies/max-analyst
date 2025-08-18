package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;

/* loaded from: classes2.dex */
public final class f9f extends Drawable {
    public final sq4 a;
    public final wjc b;
    public m56 c;
    public final n5 d;
    public wv6 e;
    public wv6 f;
    public final int g;
    public String h;

    public f9f(Context context) {
        ma6 ma6Var = new ma6(context.getResources());
        ma6Var.b = 0;
        sq4 sq4Var = new sq4(ma6Var.a());
        umc umcVarE = sq4Var.e();
        if (umcVarE != null) {
            umcVarE.setCallback(new pf(4, this));
        }
        this.a = sq4Var;
        this.b = new wjc();
        this.d = new n5(4, this);
        this.g = tu0.G(32 * fk4.d().getDisplayMetrics().density);
        d();
    }

    public static wv6 b(wv6 wv6Var, int i, int i2) {
        xv6 xv6VarB = xv6.b(wv6Var);
        xv6VarB.d = (i <= 0 || i2 <= 0) ? null : new jic(0.0f, i, i2, 12);
        return xv6VarB.a();
    }

    public final void a(wv6 wv6Var, wv6 wv6Var2) {
        int iG;
        ide hv6Var;
        sq4 sq4Var = this.a;
        if (wv6Var == null) {
            sq4Var.i(null);
            return;
        }
        boolean zIsEmpty = getBounds().isEmpty();
        int iG2 = this.g;
        if (zIsEmpty) {
            iG = iG2;
        } else if (getBounds().width() < getBounds().height()) {
            int iWidth = getBounds().width();
            if (iWidth >= iG2) {
                iG2 = iWidth;
            }
            iG = tu0.G((iG2 / getBounds().width()) * getBounds().height());
        } else {
            int iHeight = getBounds().height();
            if (iHeight >= iG2) {
                iG2 = iHeight;
            }
            int i = iG2;
            iG2 = tu0.G((iG2 / getBounds().height()) * getBounds().width());
            iG = i;
        }
        if (wv6Var2 != null) {
            iv6 iv6VarO = s36.o();
            wv6 wv6VarB = b(wv6Var, iG2, iG);
            iv6VarO.getClass();
            hv6 hv6Var2 = new hv6(iv6VarO, wv6VarB, null);
            iv6 iv6VarO2 = s36.o();
            wv6 wv6VarB2 = b(wv6Var2, iG2, iG);
            iv6VarO2.getClass();
            hv6Var = new rz6(y53.M(hv6Var2, new hv6(iv6VarO2, wv6VarB2, null)), false);
        } else {
            iv6 iv6VarO3 = s36.o();
            wv6 wv6VarB3 = b(wv6Var, iG2, iG);
            iv6VarO3.getClass();
            hv6Var = new hv6(iv6VarO3, wv6VarB3, null);
        }
        this.b.a(hv6Var);
        if (sq4Var.X == null) {
            d();
        }
    }

    public final void c(Uri uri, String str) {
        Uri uriD;
        if (tpa.f(this.h, str)) {
            return;
        }
        this.h = str;
        this.e = (str == null || (uriD = fp3.d(str)) == null) ? null : xv6.d(uriD).a();
        wv6 wv6VarA = uri != null ? xv6.d(uri).a() : null;
        this.f = wv6VarA;
        wv6 wv6Var = this.e;
        sq4 sq4Var = this.a;
        if (wv6Var == null && wv6VarA == null) {
            sq4Var.h();
        } else {
            sq4Var.g();
        }
        a(this.e, this.f);
        invalidateSelf();
    }

    public final void d() {
        e2b e2bVar = s36.a.get();
        e2bVar.g = this.b;
        e2bVar.h = this.d;
        sq4 sq4Var = this.a;
        e2bVar.l = sq4Var.X;
        e2bVar.k = true;
        sq4Var.i(e2bVar.a());
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        umc umcVarE = this.a.e();
        if (umcVarE != null) {
            umcVarE.draw(canvas);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        umc umcVarE = this.a.e();
        if (umcVarE != null) {
            return umcVarE.getOpacity();
        }
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        umc umcVarE = this.a.e();
        if (umcVarE != null) {
            umcVarE.setBounds(0, 0, rect.width(), rect.height());
        }
        a(this.e, this.f);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        umc umcVarE = this.a.e();
        if (umcVarE != null) {
            umcVarE.setAlpha(i);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        umc umcVarE = this.a.e();
        if (umcVarE != null) {
            umcVarE.setColorFilter(colorFilter);
        }
    }

    public f9f(Context context, Uri uri, String str) {
        this(context);
        c(uri, str);
    }
}
