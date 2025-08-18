package defpackage;

import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.view.View;
import ru.ok.messages.views.widgets.TamAvatarView;

/* loaded from: classes2.dex */
public abstract class sd0 extends View {
    public sq4 a;
    public Drawable b;
    public ld0 c;
    public ida o;
    public p82 s0;
    public pd0 t0;
    public t33 u0;
    public u7b v0;
    public boolean w0;
    public boolean x0;

    static {
        Math.round(Resources.getSystem().getDisplayMetrics().density * 40.0f);
    }

    public final void a(uj3 uj3Var, boolean z) {
        Drawable drawableB;
        wv6 wv6VarA;
        this.w0 = z;
        int i = this.v0.b(uj3Var.n()).a;
        int i2 = (i == 10 || i == 20 || i == 40) ? ((TamAvatarView) this).x0 ? gpc.B0 : gpc.A0 : 0;
        if (i2 == 0) {
            drawableB = null;
        } else {
            drawableB = kt3.b(getContext(), i2);
            if (i == 40) {
                c(drawableB);
            }
        }
        this.b = drawableB;
        ld0 ld0Var = new ld0(this.o, this.s0, this.t0, uj3Var);
        this.c = ld0Var;
        sq4 sq4Var = this.a;
        if (sq4Var != null) {
            rq4 rq4Var = sq4Var.o;
            rq4Var.getClass();
            ((la6) rq4Var).i(ld0Var.c(getContext()), 1);
        }
        t33 t33Var = this.u0;
        sq4 sq4Var2 = this.a;
        Uri uriB = this.c.b(t33Var.q());
        uv6 uv6Var = uv6.a;
        if (uriB == null || oag.t(uriB.getPath())) {
            wv6VarA = null;
        } else {
            xv6 xv6VarD = xv6.d(uriB);
            xv6VarD.g = uv6Var;
            xv6VarD.l = getPostprocessor();
            wv6VarA = xv6VarD.a();
            s36.o().f(wv6VarA, null);
        }
        e2b e2bVar = s36.a.get();
        e2bVar.l = sq4Var2.X;
        e2bVar.k = true;
        if (wv6VarA != null) {
            e2bVar.e = wv6VarA;
        }
        if (wv6VarA == null) {
            sq4Var2.i(null);
        } else {
            sq4Var2.i(e2bVar.a());
        }
    }

    public final void b(Canvas canvas) {
        if (!this.w0 || this.b == null) {
            return;
        }
        double width = (int) ((getWidth() / 2.0f) - (getContext().getResources().getDisplayMetrics().density * 0.5f));
        canvas.save();
        canvas.translate((((int) ((-0.6946583704589973d) * width)) + r0) - (this.b.getIntrinsicWidth() / 2.0f), (r0 + (-((int) (width * (-0.7193398003386512d))))) - (this.b.getIntrinsicHeight() / 2.0f));
        Drawable drawable = this.b;
        drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), this.b.getIntrinsicHeight());
        this.b.draw(canvas);
        canvas.restore();
    }

    public abstract void c(Drawable drawable);

    public sq4 getDraweeHolder() {
        return this.a;
    }

    public Drawable getForegroundCompat() {
        return getForeground();
    }

    public q6b getPostprocessor() {
        return new doa();
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        sq4 sq4Var = this.a;
        if (sq4Var != null) {
            sq4Var.g();
        }
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        sq4 sq4Var = this.a;
        if (sq4Var != null) {
            sq4Var.h();
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        if (isInEditMode()) {
            super.onDraw(canvas);
            return;
        }
        int width = getWidth();
        int height = getHeight();
        umc umcVarE = this.a.e();
        try {
            umcVarE.setBounds(0, 0, width, height);
            umcVarE.draw(canvas);
        } catch (Throwable th) {
            hm9.p("sd0", "failure to onDraw", th);
        }
        if (getContext().getResources().getConfiguration().getLayoutDirection() == 1) {
            canvas.save();
            canvas.scale(-1.0f, 1.0f, getWidth() / 2.0f, getHeight() / 2.0f);
            canvas.restore();
        }
    }

    @Override // android.view.View
    public final void onDrawForeground(Canvas canvas) {
        super.onDrawForeground(canvas);
        b(canvas);
    }

    @Override // android.view.View
    public final void onFinishTemporaryDetach() {
        super.onFinishTemporaryDetach();
        sq4 sq4Var = this.a;
        if (sq4Var != null) {
            sq4Var.g();
        }
    }

    @Override // android.view.View
    public final void onStartTemporaryDetach() {
        super.onStartTemporaryDetach();
        sq4 sq4Var = this.a;
        if (sq4Var != null) {
            sq4Var.h();
        }
    }

    public void setForegroundCompat(Drawable drawable) {
        setForeground(drawable);
    }

    public void setSmallOnlineImage(boolean z) {
        this.x0 = z;
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        sq4 sq4Var = this.a;
        if (sq4Var == null || sq4Var.e() != drawable) {
            return super.verifyDrawable(drawable);
        }
        return true;
    }
}
