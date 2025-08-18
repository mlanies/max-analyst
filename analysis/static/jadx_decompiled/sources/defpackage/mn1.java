package defpackage;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Point;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.animation.LinearInterpolator;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import one.me.calls.ui.ui.call.panels.CallTopPanelWidget;

/* loaded from: classes.dex */
public final class mn1 extends ConstraintLayout {
    public static final /* synthetic */ int V0 = 0;
    public ln1 G0;
    public Boolean H0;
    public final je7 I0;
    public ywe J0;
    public AnimatorSet K0;
    public final Handler L0;
    public final b M0;
    public vwe N0;
    public final TextView O0;
    public final TextView P0;
    public final knc Q0;
    public final knc R0;
    public final ViewStub S0;
    public final je7 T0;
    public Boolean U0;

    public mn1(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.I0 = tu0.r(3, new a5(context, 13));
        this.L0 = new Handler(Looper.getMainLooper());
        this.M0 = new b(23, this);
        knc kncVar = new knc(context, null);
        kncVar.setId(rvb.call_collapsing);
        knc.B(kncVar, ztb.ic_down_chevron_24);
        kncVar.setAccessibility(Integer.valueOf(f0c.call_collapsing_accessibility));
        fnc fncVar = fnc.a;
        kncVar.setMode(fncVar);
        final int i = 0;
        kncVar.setListener(new hnc(this) { // from class: kn1
            public final /* synthetic */ mn1 b;

            {
                this.b = this;
            }

            @Override // defpackage.hnc
            public final void b() {
                mn1 mn1Var = this.b;
                switch (i) {
                    case 0:
                        ln1 ln1Var = mn1Var.G0;
                        if (ln1Var != null) {
                            bc7[] bc7VarArr = CallTopPanelWidget.o;
                            pnf.o(((CallTopPanelWidget) ((o9g) ln1Var).b).n0().b.M0, cj1.D);
                            break;
                        }
                        break;
                    default:
                        ln1 ln1Var2 = mn1Var.G0;
                        if (ln1Var2 != null) {
                            bc7[] bc7VarArr2 = CallTopPanelWidget.o;
                            pnf.o(((CallTopPanelWidget) ((o9g) ln1Var2).b).n0().b.M0, sj1.D);
                            break;
                        }
                        break;
                }
            }
        });
        float f = 40;
        kncVar.setImageSize(new gnc(tu0.G(fk4.c() * f), tu0.G(fk4.c() * f)));
        kncVar.setLayoutParams(new ti3(-2, -2));
        float f2 = 3;
        kncVar.setButtonPadding(tu0.G(fk4.c() * f2));
        TextView textView = new TextView(context);
        textView.setId(rvb.call_name);
        textView.setGravity(8388611);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        textView.setMaxLines(1);
        i4f.j.b(textView, du4.b);
        pq9 pq9Var = qp4.u0;
        textView.setTextColor(pq9Var.p(textView).c.getText().e);
        textView.setVisibility(8);
        this.O0 = textView;
        TextView textView2 = new TextView(context);
        textView2.setId(rvb.call_status);
        textView2.setEllipsize(truncateAt);
        textView2.setMaxLines(1);
        textView2.setGravity(8388611);
        i4f.p.b(textView2, du4.b);
        textView2.setTextColor(pq9Var.p(textView2).c.getText().h);
        textView2.setVisibility(8);
        this.P0 = textView2;
        knc kncVar2 = new knc(context, null);
        kncVar2.setId(y7a.i0);
        kncVar2.setMode(fncVar);
        knc.B(kncVar2, x7a.p0);
        kncVar2.setAccessibility(Integer.valueOf(b8a.j0));
        kncVar2.setListener(new f9(this, 11, kncVar2));
        kncVar2.setButtonPadding(tu0.G(fk4.c() * f2));
        kncVar2.setImageSize(new gnc(tu0.G(fk4.c() * f), tu0.G(fk4.c() * f)));
        kncVar2.setLayoutParams(new ti3(-2, -2));
        this.Q0 = kncVar2;
        knc kncVar3 = new knc(context, null);
        kncVar3.setId(y7a.y1);
        knc.B(kncVar3, x7a.y);
        kncVar3.setAccessibility(Integer.valueOf(b8a.U1));
        kncVar3.setMode(fncVar);
        kncVar3.setButtonPadding(tu0.G(fk4.c() * f2));
        kncVar3.setImageSize(new gnc(tu0.G(fk4.c() * f), tu0.G(fk4.c() * f)));
        kncVar3.setLayoutParams(new ti3(-2, -2));
        final int i2 = 1;
        kncVar3.setListener(new hnc(this) { // from class: kn1
            public final /* synthetic */ mn1 b;

            {
                this.b = this;
            }

            @Override // defpackage.hnc
            public final void b() {
                mn1 mn1Var = this.b;
                switch (i2) {
                    case 0:
                        ln1 ln1Var = mn1Var.G0;
                        if (ln1Var != null) {
                            bc7[] bc7VarArr = CallTopPanelWidget.o;
                            pnf.o(((CallTopPanelWidget) ((o9g) ln1Var).b).n0().b.M0, cj1.D);
                            break;
                        }
                        break;
                    default:
                        ln1 ln1Var2 = mn1Var.G0;
                        if (ln1Var2 != null) {
                            bc7[] bc7VarArr2 = CallTopPanelWidget.o;
                            pnf.o(((CallTopPanelWidget) ((o9g) ln1Var2).b).n0().b.M0, sj1.D);
                            break;
                        }
                        break;
                }
            }
        });
        this.R0 = kncVar3;
        this.T0 = tu0.r(3, new x2(context, 16, this));
        setLayoutParams(new ti3(-1, -2));
        int iG = tu0.G(fk4.c() * f);
        ViewStub viewStub = new ViewStub(context);
        viewStub.setId(y7a.h0);
        this.S0 = viewStub;
        addView(kncVar);
        addView(textView, 0, -2);
        addView(textView2, 0, -2);
        addView(kncVar2);
        addView(viewStub, iG, iG);
        addView(kncVar3);
        dj3 dj3VarQ = fp3.q(this);
        int id = kncVar.getId();
        dj3VarQ.d(id, 6, 0, 6);
        dj3VarQ.d(id, 3, 0, 3);
        dj3VarQ.d(id, 4, 0, 4);
        int id2 = textView.getId();
        dj3VarQ.d(id2, 6, kncVar.getId(), 7);
        float f3 = 8;
        new l2a(dj3VarQ, 6, id2, 4).e(tu0.G(fk4.c() * f3));
        dj3VarQ.d(id2, 3, kncVar.getId(), 3);
        dj3VarQ.d(id2, 4, textView2.getId(), 3);
        dj3VarQ.d(id2, 7, kncVar3.getId(), 6);
        new l2a(dj3VarQ, 7, id2, 4).e(tu0.G(fk4.c() * f3));
        dj3VarQ.g(id2).d.l0 = true;
        dj3VarQ.g(id2).d.W = 2;
        int id3 = textView2.getId();
        dj3VarQ.d(id3, 6, textView.getId(), 6);
        dj3VarQ.d(id3, 3, textView.getId(), 4);
        dj3VarQ.d(id3, 7, textView.getId(), 7);
        dj3VarQ.d(id3, 4, kncVar.getId(), 4);
        dj3VarQ.g(id3).d.l0 = true;
        int id4 = kncVar3.getId();
        dj3VarQ.d(id4, 7, kncVar2.getId(), 6);
        dj3VarQ.d(id4, 3, 0, 3);
        dj3VarQ.d(id4, 4, 0, 4);
        int id5 = kncVar2.getId();
        dj3VarQ.d(id5, 7, viewStub.getId(), 6);
        dj3VarQ.d(id5, 3, 0, 3);
        dj3VarQ.d(id5, 4, 0, 4);
        int id6 = viewStub.getId();
        dj3VarQ.d(id6, 7, 0, 7);
        dj3VarQ.d(id6, 3, 0, 3);
        dj3VarQ.d(id6, 4, 0, 4);
        dj3VarQ.a(this);
    }

    private final View getRecordButton() {
        return (View) this.T0.getValue();
    }

    private final mcc getRecordDrawable() {
        return (mcc) this.I0.getValue();
    }

    public static View w(Context context, mn1 mn1Var) {
        View view = new View(context);
        view.setId(y7a.h0);
        view.setVisibility(8);
        float f = 40;
        view.setLayoutParams(new ViewGroup.MarginLayoutParams(tu0.G(fk4.c() * f), tu0.G(fk4.c() * f)));
        tu0.K(view, 300L, new c5(mn1Var, view));
        view.setBackground(mn1Var.getRecordDrawable());
        return view;
    }

    public static void x(mn1 mn1Var, boolean z) {
        mn1Var.K0 = null;
        mn1Var.getRecordButton().setVisibility(z ? 0 : 8);
        b bVar = mn1Var.M0;
        Handler handler = mn1Var.L0;
        knc kncVar = mn1Var.Q0;
        if (z) {
            ViewGroup.LayoutParams layoutParams = kncVar.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            }
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.rightMargin = tu0.G(fk4.c() * 8);
            kncVar.setLayoutParams(marginLayoutParams);
            mn1Var.getRecordDrawable().start();
            handler.post(bVar);
            return;
        }
        ViewGroup.LayoutParams layoutParams2 = kncVar.getLayoutParams();
        if (layoutParams2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
        marginLayoutParams2.rightMargin = 0;
        kncVar.setLayoutParams(marginLayoutParams2);
        mn1Var.getRecordDrawable().stop();
        handler.removeCallbacks(bVar);
        ywe yweVar = mn1Var.J0;
        if (yweVar != null) {
            yweVar.a();
        }
    }

    public final void A(vwe vweVar) {
        this.N0 = null;
        if (vweVar == null) {
            ywe yweVar = this.J0;
            if (yweVar != null) {
                yweVar.dismiss();
                return;
            }
            return;
        }
        ywe yweVar2 = this.J0;
        if (yweVar2 == null || !yweVar2.isShowing()) {
            int[] iArr = new int[2];
            getRecordButton().getLocationOnScreen(iArr);
            Point point = new Point(((br7.D(getContext()) - iArr[0]) - (getRecordButton().getWidth() / 2)) - tu0.G(fk4.c() * 18), getRecordButton().getHeight() + iArr[1]);
            ywe yweVar3 = this.J0;
            if (yweVar3 != null) {
                yweVar3.dismiss();
            }
            final int i = 1;
            ywe yweVar4 = new ywe(getContext(), getRecordButton(), new k56(this) { // from class: jn1
                public final /* synthetic */ mn1 b;

                {
                    this.b = this;
                }

                @Override // defpackage.k56
                public final Object invoke() {
                    Object value;
                    mn1 mn1Var = this.b;
                    switch (i) {
                        case 0:
                            ln1 ln1Var = mn1Var.G0;
                            if (ln1Var != null) {
                                bc7[] bc7VarArr = CallTopPanelWidget.o;
                                q0e q0eVar = ((vvc) ((CallTopPanelWidget) ((o9g) ln1Var).b).n0().c.i).s0;
                                do {
                                    value = q0eVar.getValue();
                                } while (!q0eVar.c(value, wvc.a((wvc) value, null, null, true, null, 11)));
                            }
                            return e5f.a;
                        default:
                            return qp4.u0.p(mn1Var).c;
                    }
                }
            }, new dk1(11), (k56) null, 1, 3);
            yweVar4.d(vweVar.a);
            TextView textView = yweVar4.t0;
            textView.setText(vweVar.b.b(textView.getContext()));
            CharSequence text = textView.getText();
            textView.setVisibility((text == null || text.length() == 0) ^ true ? 0 : 8);
            final int i2 = 0;
            k56 k56Var = new k56(this) { // from class: jn1
                public final /* synthetic */ mn1 b;

                {
                    this.b = this;
                }

                @Override // defpackage.k56
                public final Object invoke() {
                    Object value;
                    mn1 mn1Var = this.b;
                    switch (i2) {
                        case 0:
                            ln1 ln1Var = mn1Var.G0;
                            if (ln1Var != null) {
                                bc7[] bc7VarArr = CallTopPanelWidget.o;
                                q0e q0eVar = ((vvc) ((CallTopPanelWidget) ((o9g) ln1Var).b).n0().c.i).s0;
                                do {
                                    value = q0eVar.getValue();
                                } while (!q0eVar.c(value, wvc.a((wvc) value, null, null, true, null, 11)));
                            }
                            return e5f.a;
                        default:
                            return qp4.u0.p(mn1Var).c;
                    }
                }
            };
            ImageView imageView = yweVar4.u0;
            imageView.setVisibility(0);
            tu0.K(imageView, 300L, new v7d(k56Var, 15, yweVar4));
            TextView textView2 = yweVar4.s0;
            ViewGroup.LayoutParams layoutParams = textView2.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            }
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.setMarginEnd(tu0.G(12 * fk4.d().getDisplayMetrics().density));
            textView2.setLayoutParams(marginLayoutParams);
            yweVar4.showAtLocation(yweVar4.a, 8388661, point.x - (yweVar4.getWidth() / 2), point.y);
            View contentView = yweVar4.getContentView();
            if (contentView != null) {
                ywe.b(yweVar4, contentView, true, null, 6);
            }
            yweVar4.setOnDismissListener(new m11(2, this));
            this.J0 = yweVar4;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (br7.G(this.S0) && getRecordButton().getVisibility() == 0) {
            getRecordDrawable().start();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (br7.G(this.S0)) {
            getRecordDrawable().stop();
        }
    }

    public final void setAddUserCount(int i) {
        this.R0.setCounter(i);
    }

    public final void setAddUserState(boolean z) {
        ft.g(this.R0, z, 0L, null, 6);
    }

    public final void setClickListener(ln1 ln1Var) {
        this.G0 = ln1Var;
    }

    public final void setMoreButtonVisible(boolean z) {
        ft.g(this.Q0, z, 0L, null, 6);
    }

    public final void setStatus(CharSequence charSequence) {
        TextView textView = this.P0;
        if (tpa.f(textView.getText(), charSequence)) {
            return;
        }
        textView.setText(charSequence);
    }

    public final void setTitle(CharSequence charSequence) {
        TextView textView = this.O0;
        if (tpa.f(textView.getText(), charSequence)) {
            return;
        }
        textView.setText(charSequence);
    }

    public final void y(boolean z, vwe vweVar) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        ViewStub viewStub = this.S0;
        if (br7.G(viewStub)) {
            AnimatorSet animatorSet = this.K0;
            boolean z2 = animatorSet != null && animatorSet.isRunning();
            if (ft.l(getRecordButton()) && z2 && vweVar != null) {
                this.N0 = vweVar;
            } else if (getRecordButton().getVisibility() != 0 || vweVar == null) {
                this.L0.removeCallbacks(this.M0);
                ywe yweVar = this.J0;
                if (yweVar != null) {
                    yweVar.a();
                }
            } else {
                A(vweVar);
            }
        }
        if ((z || br7.G(viewStub)) && !tpa.f(this.U0, Boolean.valueOf(z))) {
            this.U0 = Boolean.valueOf(z);
            br7.F(viewStub, getRecordButton(), null);
            this.N0 = vweVar;
            AnimatorSet animatorSet2 = this.K0;
            if (animatorSet2 != null) {
                animatorSet2.cancel();
            }
            View recordButton = getRecordButton();
            k81 k81Var = new k81(this, z, 1);
            AnimatorSet animatorSet3 = new AnimatorSet();
            int i = y7a.m;
            String str = z ? "fade_in" : "fade_out";
            knc kncVar = this.Q0;
            if (z) {
                ViewGroup.LayoutParams layoutParams = kncVar.getLayoutParams();
                marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
                ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(marginLayoutParams != null ? marginLayoutParams.rightMargin : 0, recordButton.getWidth());
                valueAnimatorOfInt.addUpdateListener(new zf(kncVar, 1));
                animatorSet3.playSequentially(valueAnimatorOfInt, ObjectAnimator.ofFloat(recordButton, (Property<View, Float>) View.ALPHA, 0.0f, 1.0f));
            } else {
                ViewGroup.LayoutParams layoutParams2 = kncVar.getLayoutParams();
                marginLayoutParams = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams2 : null;
                ValueAnimator valueAnimatorOfInt2 = ValueAnimator.ofInt(marginLayoutParams != null ? marginLayoutParams.rightMargin : 0, -recordButton.getWidth());
                valueAnimatorOfInt2.addUpdateListener(new zf(kncVar, 2));
                animatorSet3.playTogether(valueAnimatorOfInt2, ObjectAnimator.ofFloat(recordButton, (Property<View, Float>) View.ALPHA, 1.0f, 0.0f));
            }
            animatorSet3.setDuration(150L);
            animatorSet3.setInterpolator(new LinearInterpolator());
            animatorSet3.addListener(new sg(recordButton, i, str, k81Var));
            animatorSet3.start();
            this.K0 = animatorSet3;
        }
    }
}
