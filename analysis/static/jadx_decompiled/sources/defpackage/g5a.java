package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* loaded from: classes2.dex */
public final class g5a extends Drawable {
    public final Context a;
    public final m5a b;
    public final String c;
    public final sq4 d;
    public int e;
    public final wjc f;
    public final n5 g;
    public String h;
    public wv6 i;
    public final int j;

    public /* synthetic */ g5a(Context context) {
        this(context, j5a.a);
    }

    public final void a(wv6 wv6Var) throws NumberFormatException {
        int iG;
        sq4 sq4Var = this.d;
        if (wv6Var == null) {
            sq4Var.i(null);
        } else {
            boolean zIsEmpty = getBounds().isEmpty();
            int iG2 = this.j;
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
            vc0 vc0Var = h5a.a;
            jic jicVar = (iG2 <= 0 || iG <= 0) ? null : new jic(0.0f, iG2, iG, 12);
            m5a m5aVar = this.b;
            xv6 xv6VarD = xv6.d(wv6Var.b);
            xv6VarD.g = uv6.b;
            xv6VarD.l = h5a.a(m5aVar);
            if (jicVar != null) {
                xv6VarD.d = jicVar;
            }
            xv6VarD.k = a9b.c;
            wv6 wv6VarA = xv6VarD.a();
            iv6 iv6VarO = s36.o();
            iv6VarO.getClass();
            hv6 hv6Var = new hv6(iv6VarO, wv6VarA, null);
            wjc wjcVar = this.f;
            wjcVar.a(hv6Var);
            if (sq4Var.X == null) {
                e2b e2bVarA = s36.a.get();
                e2bVarA.g = wjcVar;
                e2bVarA.h = this.g;
                e2bVarA.l = sq4Var.X;
                e2bVarA.k = true;
                sq4Var.i(e2bVarA.a());
            }
        }
        invalidateSelf();
    }

    public final void b(uc0 uc0Var, String str) {
        wv6 wv6VarB;
        m5a m5aVar = this.b;
        boolean zF = tpa.f(this.h, str);
        sq4 sq4Var = this.d;
        if (!zF) {
            this.h = str;
            if (str == null || str.length() == 0) {
                wv6VarB = null;
            } else {
                vc0 vc0Var = h5a.a;
                wv6VarB = h5a.b(str, m5aVar, 4);
            }
            this.i = wv6VarB;
            if (wv6VarB != null) {
                sq4Var.g();
            } else {
                sq4Var.h();
            }
            a(this.i);
            invalidateSelf();
        }
        if (uc0Var != null && uc0Var != uc0.c && (uc0Var.a != 0 || uc0Var.b.length() != 0)) {
            tc0 tc0Var = new tc0(m5aVar, uc0Var, qp4.u0.b(this.a).i());
            rq4 rq4Var = sq4Var.o;
            rq4Var.getClass();
            ((la6) rq4Var).i(tc0Var, 1);
            this.e = 3;
        } else if (this.e == 3) {
            rq4 rq4Var2 = sq4Var.o;
            rq4Var2.getClass();
            ((la6) rq4Var2).i(null, 1);
            this.e = 1;
        }
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        umc umcVarE = this.d.e();
        if (umcVarE != null) {
            Drawable.Callback callback = umcVarE.getCallback();
            umcVarE.setCallback(null);
            umcVarE.draw(canvas);
            umcVarE.setCallback(callback);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g5a)) {
            return false;
        }
        g5a g5aVar = (g5a) obj;
        return tpa.f(this.b, g5aVar.b) && tpa.f(this.h, g5aVar.h);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        umc umcVarE = this.d.e();
        return umcVarE != null ? umcVarE.getAlpha() : super.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        this.d.getClass();
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        this.d.getClass();
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    public final int hashCode() {
        int iHashCode = this.b.hashCode() * 31;
        String str = this.h;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) throws NumberFormatException {
        super.onBoundsChange(rect);
        umc umcVarE = this.d.e();
        if (umcVarE != null) {
            Drawable.Callback callback = umcVarE.getCallback();
            umcVarE.setCallback(null);
            umcVarE.setBounds(0, 0, rect.width(), rect.height());
            umcVarE.setCallback(callback);
        }
        a(this.i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        umc umcVarE = this.d.e();
        if (umcVarE != null) {
            umcVarE.setAlpha(i);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        umc umcVarE = this.d.e();
        if (umcVarE != null) {
            umcVarE.setColorFilter(colorFilter);
        }
    }

    public g5a(Context context, m5a m5aVar) {
        this.a = context;
        this.b = m5aVar;
        this.c = g5a.class.getName();
        ma6 ma6Var = new ma6(context.getResources());
        ma6Var.b = 0;
        sq4 sq4Var = new sq4(ma6Var.a());
        umc umcVarE = sq4Var.e();
        if (umcVarE != null) {
            umcVarE.setCallback(new pf(2, this));
        }
        this.d = sq4Var;
        this.e = 1;
        wjc wjcVar = new wjc();
        this.f = wjcVar;
        n5 n5Var = new n5(1, this);
        this.g = n5Var;
        this.j = tu0.G(32 * fk4.d().getDisplayMetrics().density);
        e2b e2bVarA = s36.a.get();
        e2bVarA.g = wjcVar;
        e2bVarA.h = n5Var;
        e2bVarA.l = sq4Var.X;
        e2bVarA.k = true;
        sq4Var.i(e2bVarA.a());
    }
}
