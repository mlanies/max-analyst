package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.List;

/* loaded from: classes.dex */
public final class dm1 extends ConstraintLayout implements pv3, zj1, em1 {
    public final je7 G0;
    public final je7 H0;
    public final je7 I0;
    public final AppCompatTextView J0;
    public final AppCompatImageView K0;
    public final AppCompatImageView L0;
    public cm1 M0;
    public Boolean N0;
    public Boolean O0;
    public Boolean P0;
    public CharSequence Q0;
    public gg1 R0;
    public iaf S0;
    public qv3 T0;
    public fm1 U0;
    public i1b V0;

    public dm1(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.G0 = tu0.r(3, new dk1(8));
        this.H0 = tu0.r(3, new a5(context, 10));
        this.I0 = tu0.r(3, new md1(2, this));
        this.R0 = gg1.c;
        setLayoutParams(new ti3(-1, -2));
        float f = 32;
        setPadding(tu0.G(fk4.d().getDisplayMetrics().density * f), 0, tu0.G(f * fk4.d().getDisplayMetrics().density), 0);
        AppCompatImageView appCompatImageView = new AppCompatImageView(context, null);
        appCompatImageView.setId(rvb.call_video_rotation);
        appCompatImageView.setBackground(getBackgroundView());
        appCompatImageView.setImageResource(ztb.ic_rotation_view_16);
        float f2 = 5;
        int iG = tu0.G(fk4.d().getDisplayMetrics().density * f2);
        appCompatImageView.setPadding(iG, iG, iG, iG);
        appCompatImageView.setVisibility(8);
        pq9 pq9Var = qp4.u0;
        appCompatImageView.setImageTintList(ColorStateList.valueOf(pq9Var.p(appCompatImageView).c.getIcon().f));
        this.K0 = appCompatImageView;
        AppCompatImageView appCompatImageView2 = new AppCompatImageView(context, null);
        appCompatImageView2.setId(rvb.call_pin);
        appCompatImageView2.setImageResource(ztb.ic_pin_13);
        appCompatImageView2.setBackground(getBackgroundView());
        appCompatImageView2.setImageTintList(ColorStateList.valueOf(pq9Var.p(appCompatImageView2).c.getIcon().f));
        int iG2 = tu0.G(f2 * fk4.d().getDisplayMetrics().density);
        appCompatImageView2.setPadding(iG2, iG2, iG2, iG2);
        appCompatImageView2.setVisibility(8);
        tu0.K(appCompatImageView2, 300L, new bm1(this, 1));
        this.L0 = appCompatImageView2;
        AppCompatTextView appCompatTextView = new AppCompatTextView(context, null);
        appCompatTextView.setId(rvb.call_user_full_name);
        appCompatTextView.setMaxLines(1);
        i4f.p.b(appCompatTextView, du4.b);
        appCompatTextView.setTextColor(pq9Var.p(appCompatTextView).c.getText().e);
        appCompatTextView.setBackground(getBackgroundView());
        appCompatTextView.setGravity(17);
        float f3 = 8;
        float f4 = 7;
        appCompatTextView.setPadding(tu0.G(fk4.d().getDisplayMetrics().density * f3), tu0.G(fk4.d().getDisplayMetrics().density * f4), tu0.G(f3 * fk4.d().getDisplayMetrics().density), tu0.G(f4 * fk4.d().getDisplayMetrics().density));
        appCompatTextView.setVisibility(8);
        np8.n(appCompatTextView);
        this.J0 = appCompatTextView;
        float f5 = 26;
        addView(appCompatImageView2, tu0.G(fk4.d().getDisplayMetrics().density * f5), tu0.G(fk4.d().getDisplayMetrics().density * f5));
        addView(appCompatImageView, tu0.G(fk4.d().getDisplayMetrics().density * f5), tu0.G(f5 * fk4.d().getDisplayMetrics().density));
        addView(appCompatTextView, -2, -2);
        if (!isLaidOut() || isLayoutRequested()) {
            addOnLayoutChangeListener(new qq0(1, this));
        } else {
            A(this.Q0);
        }
        dj3 dj3VarQ = fp3.q(this);
        int id = appCompatImageView2.getId();
        dj3VarQ.d(id, 3, 0, 3);
        dj3VarQ.d(id, 4, 0, 4);
        dj3VarQ.d(id, 7, appCompatTextView.getId(), 6);
        dj3VarQ.d(id, 6, 0, 6);
        dj3VarQ.g(id).d.V = 2;
        int id2 = appCompatTextView.getId();
        dj3VarQ.d(id2, 3, 0, 3);
        dj3VarQ.d(id2, 4, 0, 4);
        dj3VarQ.d(id2, 6, appCompatImageView2.getId(), 7);
        float f6 = 4;
        new l2a(dj3VarQ, 6, id2, 4).e(tu0.G(fk4.d().getDisplayMetrics().density * f6));
        dj3VarQ.d(id2, 7, appCompatImageView.getId(), 6);
        new l2a(dj3VarQ, 7, id2, 4).e(tu0.G(f6 * fk4.d().getDisplayMetrics().density));
        dj3VarQ.g(id2).d.l0 = true;
        int id3 = appCompatImageView.getId();
        dj3VarQ.d(id3, 3, 0, 3);
        dj3VarQ.d(id3, 4, 0, 4);
        dj3VarQ.d(id3, 6, appCompatTextView.getId(), 7);
        dj3VarQ.d(id3, 7, 0, 7);
        dj3VarQ.a(this);
    }

    private final float[] getBG_RADIUS() {
        return (float[]) this.G0.getValue();
    }

    private final Drawable getBackgroundView() {
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(getBG_RADIUS(), null, null));
        shapeDrawable.getPaint().setColor(Color.parseColor("#CC393A40"));
        return shapeDrawable;
    }

    private final ivc getCallScreen() {
        return (ivc) this.H0.getValue();
    }

    private final int getTargetWidth() {
        return ((Number) this.I0.getValue()).intValue();
    }

    public static int w(dm1 dm1Var) {
        return wg0.m(8, fk4.d().getDisplayMetrics().density, 2, wg0.m(32, fk4.d().getDisplayMetrics().density, 2, wg0.m(4, fk4.d().getDisplayMetrics().density, 2, wg0.m(26, fk4.d().getDisplayMetrics().density, 2, dm1Var.getCallScreen().b))));
    }

    public final void A(CharSequence charSequence) {
        int targetWidth = getTargetWidth();
        AppCompatTextView appCompatTextView = this.J0;
        appCompatTextView.post(new f5(appCompatTextView, dy7.f(charSequence, appCompatTextView, targetWidth), this, 10));
    }

    @Override // defpackage.pv3
    public final List H(nv3 nv3Var, nv3 nv3Var2) {
        kl7 kl7VarL = j1e.l();
        kl7VarL.add(z7.C(this, (Math.abs(nv3Var.d) - nv3Var.f) * nv3Var.c));
        if (tpa.f(this.P0, Boolean.TRUE)) {
            kl7VarL.add(z7.o(this, nv3Var2.a));
        }
        return j1e.d(kl7VarL);
    }

    @Override // defpackage.zj1
    public final void f(kl7 kl7Var, boolean z, long j) {
        float f = z ? 0.0f : 1.0f;
        float f2 = z ? 1.0f : 0.0f;
        if (ft.q(this, z)) {
            kl7Var.add(ft.c(this, z, f, f2, j));
        }
    }

    public /* bridge */ /* synthetic */ boolean getShouldScaleMainOpponent() {
        return false;
    }

    @Override // defpackage.zj1
    public final void o(boolean z) {
        if (z) {
            setAlpha(1.0f);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        fm1 fm1Var = this.U0;
        if (fm1Var != null) {
            ((gm1) fm1Var).a.add(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        fm1 fm1Var = this.U0;
        if (fm1Var != null) {
            ((gm1) fm1Var).a.remove(this);
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        A(this.Q0);
    }

    @Override // defpackage.em1
    public final void p() {
        y();
    }

    public final void setActive(boolean z) {
        if (tpa.f(this.P0, Boolean.valueOf(z))) {
            return;
        }
        this.P0 = Boolean.valueOf(z);
        y();
    }

    public final void setCallSpeakerMediator(fm1 fm1Var) {
        this.U0 = fm1Var;
    }

    public final void setControlsMediator(qv3 qv3Var) {
        this.T0 = qv3Var;
    }

    public final void setLabel(CharSequence charSequence) {
        if (tpa.f(this.Q0, charSequence)) {
            return;
        }
        this.Q0 = charSequence;
        A(charSequence);
    }

    public final void setListener(cm1 cm1Var) {
        this.M0 = cm1Var;
    }

    public final void setParticipantId(gg1 gg1Var) {
        this.R0 = gg1Var;
    }

    public final void setPipBoundariesController(i1b i1bVar) {
        this.V0 = i1bVar;
    }

    public final void x() {
        Boolean bool = this.O0;
        boolean zBooleanValue = bool != null ? bool.booleanValue() : false;
        CharSequence string = this.Q0;
        if (string == null) {
            string = "";
        }
        AppCompatTextView appCompatTextView = this.J0;
        if (zBooleanValue) {
            string = getContext().getString(f0c.call_user_talking_accessibility);
        }
        appCompatTextView.setContentDescription(string);
    }

    public final void y() {
        ov3 ov3Var;
        qv3 qv3Var = this.T0;
        ft.g(this, (qv3Var == null || (ov3Var = ((uv3) qv3Var).j) == null || ov3Var.c) ? tpa.f(this.P0, Boolean.TRUE) : false, 0L, new l(20, this), 2);
    }
}
