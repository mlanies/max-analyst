package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.text.Layout;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.work.WorkRequest;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes2.dex */
public final class p50 extends ViewGroup implements x5d, k34, l7c, jw8, u5d {
    public static final int V0 = tu0.G(44 * fk4.d().getDisplayMetrics().density);
    public static final int W0 = tu0.G(36 * fk4.d().getDisplayMetrics().density);
    public static final int X0 = tu0.G(24 * fk4.d().getDisplayMetrics().density);
    public final je7 A0;
    public final j34 B0;
    public final int C0;
    public final u70 D0;
    public final AppCompatTextView E0;
    public boolean F0;
    public is0 G0;
    public final int H0;
    public final int I0;
    public final int J0;
    public final int K0;
    public final int L0;
    public final int M0;
    public final int N0;
    public Long O0;
    public Long P0;
    public v50 Q0;
    public String R0;
    public x77 S0;
    public x77 T0;
    public o50 U0;
    public final m56 a;
    public final k56 b;
    public final r6c c;
    public final dw8 o;
    public final s5d s0;
    public final y5d t0;
    public final int u0;
    public final AppCompatImageView v0;
    public final je7 w0;
    public final je7 x0;
    public final je7 y0;
    public final je7 z0;

    public p50(Context context, om8 om8Var, p59 p59Var) {
        r6c r6cVar = new r6c();
        dw8 dw8Var = new dw8();
        s5d s5dVar = new s5d();
        super(context);
        this.a = om8Var;
        this.b = p59Var;
        this.c = r6cVar;
        this.o = dw8Var;
        this.s0 = s5dVar;
        this.t0 = new y5d(this);
        int i = V0;
        this.u0 = i;
        AppCompatImageView appCompatImageView = new AppCompatImageView(context, null);
        appCompatImageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        this.v0 = appCompatImageView;
        this.w0 = tu0.r(3, new a5(context, 1));
        this.x0 = tu0.r(3, new m(15));
        this.y0 = tu0.r(3, new x5(15, this));
        this.z0 = tu0.r(3, new a5(context, 2));
        this.A0 = tu0.r(3, new a5(context, 3));
        j34 j34Var = new j34(context);
        j34Var.setBackgroundEnabled$message_list_release(false);
        this.B0 = j34Var;
        int iG = tu0.G(24 * fk4.d().getDisplayMetrics().density);
        this.C0 = iG;
        u70 u70Var = new u70(context);
        this.D0 = u70Var;
        AppCompatTextView appCompatTextView = new AppCompatTextView(context, null);
        kqe kqeVar = i4f.a;
        os2.d.b(appCompatTextView, du4.b);
        this.E0 = appCompatTextView;
        pq9 pq9Var = qp4.u0;
        this.G0 = pq9Var.j(this).a().d(this.F0);
        this.H0 = tu0.G(10 * fk4.d().getDisplayMetrics().density);
        float f = 4;
        this.I0 = tu0.G(fk4.d().getDisplayMetrics().density * f);
        float f2 = 8;
        this.J0 = tu0.G(fk4.d().getDisplayMetrics().density * f2);
        this.K0 = tu0.G(f2 * fk4.d().getDisplayMetrics().density);
        this.L0 = tu0.G(fk4.d().getDisplayMetrics().density * f);
        this.M0 = tu0.G(fk4.d().getDisplayMetrics().density * f);
        this.N0 = tu0.G(f * fk4.d().getDisplayMetrics().density);
        this.R0 = "";
        r6cVar.b = this;
        dw8Var.b = this;
        s5dVar.b = this;
        setLayoutParams(new ViewGroup.MarginLayoutParams(-2, -2));
        addView(j34Var, new ViewGroup.LayoutParams(-2, -2));
        addView(appCompatTextView, new ViewGroup.LayoutParams(-2, -2));
        addView(appCompatImageView, new ViewGroup.LayoutParams(i, i));
        addView(u70Var, new ViewGroup.LayoutParams(-1, iG));
        qx7 qx7Var = vs8.y;
        fka fkaVarJ = pq9Var.j(this);
        qx7Var.getClass();
        setBackground(qx7.e(fkaVarJ));
        setClipChildren(true);
        setOutlineProvider(ViewOutlineProvider.BACKGROUND);
        setWillNotDraw(false);
        setTransitionGroup(true);
        u70Var.setListener(new rxd(3, this));
    }

    public static LayerDrawable a(p50 p50Var) {
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{p50Var.getProgressDrawable(), p50Var.getDrawableInsideProgress()});
        int i = W0;
        layerDrawable.setLayerSize(0, i, i);
        int i2 = X0;
        int i3 = (i - i2) / 2;
        layerDrawable.setLayerSize(1, i2, i2);
        layerDrawable.setLayerInset(1, i3, i3, i3, i3);
        return layerDrawable;
    }

    private final Drawable getDrawableInsideProgress() {
        return (Drawable) this.w0.getValue();
    }

    private final InsetDrawable getPauseDrawable() {
        return (InsetDrawable) this.A0.getValue();
    }

    private final InsetDrawable getPlayDrawable() {
        return (InsetDrawable) this.z0.getValue();
    }

    private final sz6 getProgressDrawable() {
        return (sz6) this.x0.getValue();
    }

    private final LayerDrawable getProgressDrawableWithIcon() {
        return (LayerDrawable) this.y0.getValue();
    }

    public final void b() {
        is0 is0VarD = qp4.u0.j(this).a().d(this.F0);
        this.G0 = is0VarD;
        AppCompatImageView appCompatImageView = this.v0;
        appCompatImageView.setBackground(hm9.S(Integer.valueOf(is0VarD.a.e), null, null));
        appCompatImageView.setColorFilter(this.G0.b.a);
        Drawable drawableInsideProgress = getDrawableInsideProgress();
        if (drawableInsideProgress != null) {
            drawableInsideProgress.setTint(this.G0.b.a);
        }
        getProgressDrawable().b = new int[]{this.G0.b.a, 0};
        this.D0.setIncomingMessage(this.F0);
        this.E0.setTextColor(this.G0.d.c);
        this.B0.setTextColor$message_list_release(this.G0.d.m);
    }

    @Override // defpackage.jw8
    public final void c(is0 is0Var) {
        this.o.c(is0Var);
    }

    public final void d(l30 l30Var) {
        boolean zEquals = l30Var.equals(dp3.a);
        AppCompatImageView appCompatImageView = this.v0;
        if (zEquals) {
            appCompatImageView.setImageDrawable(getProgressDrawableWithIcon());
            return;
        }
        if (l30Var.equals(sp3.a)) {
            appCompatImageView.setImageDrawable(getPauseDrawable());
        } else {
            if (!l30Var.equals(o84.c) && !l30Var.equals(vu4.a)) {
                throw new NoWhenBranchMatchedException();
            }
            appCompatImageView.setImageDrawable(getPlayDrawable());
        }
    }

    @Override // defpackage.l7c
    public final void f(ix8 ix8Var, boolean z) {
        this.c.f(ix8Var, z);
    }

    @Override // defpackage.k34
    public final void g(CharSequence charSequence, boolean z) {
        bc7[] bc7VarArr = j34.D0;
        this.B0.c(charSequence, false);
    }

    public int getAliasWidthWithPaddings() {
        return this.s0.h0();
    }

    @Override // defpackage.l7c
    public final void k(is0 is0Var, boolean z) {
        this.c.k(is0Var, z);
    }

    @Override // defpackage.jw8
    public final void l() {
        this.o.l();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        y5d y5dVar = this.t0;
        boolean zH = br7.H(y5dVar.b);
        int i5 = this.J0;
        int i6 = this.H0;
        int iK = zH ? i5 : i6;
        je7 je7Var = y5dVar.b;
        if (br7.H(je7Var)) {
            int iA = y5dVar.a() + iK;
            y5dVar.c(i6, iK);
            iK = this.N0 + iA;
        }
        s5d s5dVar = this.s0;
        if (br7.H((je7) s5dVar.c) && br7.H(je7Var)) {
            s5dVar.T((getMeasuredWidth() - i6) - s5dVar.L(), ((y5dVar.a() / 2) - (s5dVar.K() / 2)) + i5);
        }
        dw8 dw8Var = this.o;
        if (br7.H((je7) dw8Var.c)) {
            dw8Var.T(i6, iK);
            iK += dw8Var.K() + this.M0;
        }
        AppCompatImageView appCompatImageView = this.v0;
        int measuredWidth = appCompatImageView.getMeasuredWidth() + i6;
        int measuredHeight = appCompatImageView.getMeasuredHeight() + iK;
        View view = (View) appCompatImageView.getParent();
        if (c54.K(appCompatImageView)) {
            appCompatImageView.layout(view.getMeasuredWidth() - measuredWidth, iK, view.getMeasuredWidth() - i6, measuredHeight);
        } else {
            appCompatImageView.layout(i6, iK, measuredWidth, measuredHeight);
        }
        int measuredWidth2 = appCompatImageView.getMeasuredWidth() + this.K0 + i6;
        int iQ = rh4.q(6, fk4.d().getDisplayMetrics().density, measuredWidth2);
        u70 u70Var = this.D0;
        int measuredWidth3 = u70Var.getMeasuredWidth() + measuredWidth2;
        int measuredHeight2 = u70Var.getMeasuredHeight() + iK;
        View view2 = (View) u70Var.getParent();
        if (c54.K(u70Var)) {
            u70Var.layout(view2.getMeasuredWidth() - measuredWidth3, iK, view2.getMeasuredWidth() - iQ, measuredHeight2);
        } else {
            u70Var.layout(iQ, iK, measuredWidth3, measuredHeight2);
        }
        int measuredHeight3 = u70Var.getMeasuredHeight() + this.L0 + iK;
        AppCompatTextView appCompatTextView = this.E0;
        int measuredWidth4 = appCompatTextView.getMeasuredWidth() + measuredWidth2;
        int measuredHeight4 = appCompatTextView.getMeasuredHeight() + measuredHeight3;
        View view3 = (View) appCompatTextView.getParent();
        if (c54.K(appCompatTextView)) {
            appCompatTextView.layout(view3.getMeasuredWidth() - measuredWidth4, measuredHeight3, view3.getMeasuredWidth() - measuredWidth2, measuredHeight4);
        } else {
            appCompatTextView.layout(measuredWidth2, measuredHeight3, measuredWidth4, measuredHeight4);
        }
        int bottom = appCompatImageView.getBottom();
        r6c r6cVar = this.c;
        if (br7.H((je7) r6cVar.c)) {
            float f = 10;
            r6cVar.T(tu0.G(f * fk4.d().getDisplayMetrics().density), rh4.c(f, fk4.d().getDisplayMetrics().density, bottom));
        }
        int measuredWidth5 = getMeasuredWidth();
        j34 j34Var = this.B0;
        int measuredWidth6 = (measuredWidth5 - j34Var.getMeasuredWidth()) - i6;
        int measuredHeight5 = (getMeasuredHeight() - j34Var.getMeasuredHeight()) - this.I0;
        int measuredWidth7 = j34Var.getMeasuredWidth() + measuredWidth6;
        int measuredHeight6 = j34Var.getMeasuredHeight() + measuredHeight5;
        View view4 = (View) j34Var.getParent();
        if (c54.K(j34Var)) {
            j34Var.layout(view4.getMeasuredWidth() - measuredWidth7, measuredHeight5, view4.getMeasuredWidth() - measuredWidth6, measuredHeight6);
        } else {
            j34Var.layout(measuredWidth6, measuredHeight5, measuredWidth7, measuredHeight6);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int size;
        if (this.P0 != null) {
            int size2 = View.MeasureSpec.getSize(i);
            float f = 192;
            size = (int) ((rh4.q(f, fk4.d().getDisplayMetrics().density, size2) * ((ote.f(r0.longValue(), 1000L, WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS) - 1000) / 29000)) + tu0.G(fk4.d().getDisplayMetrics().density * f));
        } else {
            size = View.MeasureSpec.getSize(i);
        }
        y5d y5dVar = this.t0;
        boolean zH = br7.H(y5dVar.b);
        int i3 = this.H0;
        int iK = zH ? this.J0 : i3;
        s5d s5dVar = this.s0;
        if (br7.H((je7) s5dVar.c) && br7.H(y5dVar.b)) {
            s5dVar.U(View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), i2);
        }
        if (br7.H(y5dVar.b)) {
            y5dVar.d(View.MeasureSpec.makeMeasureSpec(size - i3, Integer.MIN_VALUE), i2);
            iK += y5dVar.a() + this.N0;
        }
        dw8 dw8Var = this.o;
        if (br7.H((je7) dw8Var.c)) {
            dw8Var.U(View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), i2);
            iK += dw8Var.K() + this.M0;
        }
        this.B0.measure(i, i2);
        AppCompatTextView appCompatTextView = this.E0;
        appCompatTextView.measure(View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), i2);
        AppCompatImageView appCompatImageView = this.v0;
        int i4 = this.u0;
        appCompatImageView.measure(View.MeasureSpec.makeMeasureSpec(i4, 1073741824), View.MeasureSpec.makeMeasureSpec(i4, 1073741824));
        float f2 = 10;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(((tu0.G(6 * fk4.d().getDisplayMetrics().density) * 2) + ((size - appCompatImageView.getMeasuredWidth()) - this.K0)) - (tu0.G(fk4.d().getDisplayMetrics().density * f2) * 2), 1073741824);
        int i5 = this.C0;
        this.D0.measure(iMakeMeasureSpec, View.MeasureSpec.makeMeasureSpec(i5, 1073741824));
        int iMax = Math.max(appCompatImageView.getMeasuredHeight() + i3, appCompatTextView.getMeasuredHeight() + i5 + this.L0 + this.I0) + iK;
        r6c r6cVar = this.c;
        if (br7.H((je7) r6cVar.c)) {
            r6cVar.U(View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), i2);
            iMax = wg0.d(f2, fk4.d().getDisplayMetrics().density, r6cVar.K(), iMax);
        }
        setMeasuredDimension(size, iMax);
    }

    @Override // defpackage.l7c
    public final void q(boolean z) {
        this.c.q(z);
    }

    @Override // defpackage.u5d
    public void setAlias(Layout layout) {
        this.s0.setAlias(layout);
    }

    @Override // defpackage.u5d
    public void setAliasColor(int i) {
        this.s0.setAliasColor(i);
    }

    public final void setAudio(k50 k50Var) {
        o50 o50Var;
        this.O0 = Long.valueOf(k50Var.b);
        long j = k50Var.j;
        this.P0 = Long.valueOf(j);
        boolean z = k50Var.c;
        this.F0 = z;
        this.R0 = k50Var.d;
        u70 u70Var = this.D0;
        u70Var.setIncomingMessage(z);
        u70Var.b(j, k50Var.h);
        this.E0.setText(k50Var.i);
        tu0.K(this.v0, 300L, new l50(this, k50Var, 1));
        this.U0 = new o50(this, 0, k50Var);
        if (isAttachedToWindow() && (o50Var = this.U0) != null) {
            o50Var.onViewAttachedToWindow(this);
        }
        addOnAttachStateChangeListener(this.U0);
        requestLayout();
    }

    @Override // defpackage.l7c
    public void setChipObserver(w5c w5cVar) {
        this.c.setChipObserver(w5cVar);
    }

    @Override // defpackage.k34
    public void setDateBackgroundColor(int i) {
        this.B0.setBackgroundColor(i);
    }

    @Override // defpackage.k34
    public void setDateTextColor(int i) {
        this.B0.setTextColor$message_list_release(i);
    }

    @Override // defpackage.k34
    public void setDateViewStatus(zof zofVar) {
        this.B0.setStatus$message_list_release(zofVar);
    }

    @Override // defpackage.jw8
    public void setForwardClickListener(m56 m56Var) {
        this.o.X = m56Var;
    }

    @Override // defpackage.l7c
    public void setIsIncoming(boolean z) {
        this.c.o = z;
    }

    @Override // defpackage.jw8
    public void setLink(cw8 cw8Var) {
        this.o.setLink(cw8Var);
    }

    @Override // defpackage.l7c
    public void setOnClickListener(m56 m56Var) {
        this.c.X = m56Var;
    }

    @Override // defpackage.jw8
    public void setReplyClickListener(a66 a66Var) {
        this.o.o = a66Var;
    }

    @Override // defpackage.x5d
    public void setSenderName(Layout layout) {
        this.t0.e(layout);
    }

    @Override // defpackage.x5d
    public void setSenderNameColor(int i) {
        this.t0.f(i);
    }

    @Override // defpackage.l7c
    public void setStackFromEnd(boolean z) {
        this.c.Z = z;
    }
}
