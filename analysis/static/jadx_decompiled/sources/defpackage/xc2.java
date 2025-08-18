package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;

/* loaded from: classes2.dex */
public final class xc2 extends ConstraintLayout implements kre {
    public final je7 G0;
    public final je7 H0;
    public final s5a I0;
    public final AppCompatTextView J0;
    public final AppCompatImageView K0;
    public final ImageView L0;

    public xc2(final Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        final int i = 0;
        this.G0 = tu0.r(3, new k56() { // from class: wc2
            @Override // defpackage.k56
            public final Object invoke() {
                xc2 xc2Var = this;
                Context context2 = context;
                switch (i) {
                    case 0:
                        AppCompatTextView appCompatTextView = new AppCompatTextView(context2, null);
                        appCompatTextView.setId(wea.I);
                        appCompatTextView.setLayoutParams(new ViewGroup.LayoutParams(0, -2));
                        appCompatTextView.setTextAlignment(2);
                        appCompatTextView.setMaxLines(1);
                        appCompatTextView.setEllipsize(TextUtils.TruncateAt.END);
                        appCompatTextView.setVisibility(8);
                        kqe kqeVar = os2.a;
                        i4f.j.b(appCompatTextView, du4.b);
                        appCompatTextView.setTextColor(qp4.u0.j(appCompatTextView).getText().e);
                        ay7.b(xc2Var, appCompatTextView, -1);
                        return appCompatTextView;
                    default:
                        nfa nfaVar = new nfa(context2);
                        nfaVar.setId(xoc.h);
                        pla.a(nfaVar, new re(8, nfaVar, nfaVar));
                        nfaVar.setSize(jfa.a);
                        nfaVar.setVisibility(0);
                        xc2Var.addView(nfaVar);
                        return nfaVar;
                }
            }
        });
        final int i2 = 1;
        je7 je7VarR = tu0.r(3, new k56() { // from class: wc2
            @Override // defpackage.k56
            public final Object invoke() {
                xc2 xc2Var = this;
                Context context2 = context;
                switch (i2) {
                    case 0:
                        AppCompatTextView appCompatTextView = new AppCompatTextView(context2, null);
                        appCompatTextView.setId(wea.I);
                        appCompatTextView.setLayoutParams(new ViewGroup.LayoutParams(0, -2));
                        appCompatTextView.setTextAlignment(2);
                        appCompatTextView.setMaxLines(1);
                        appCompatTextView.setEllipsize(TextUtils.TruncateAt.END);
                        appCompatTextView.setVisibility(8);
                        kqe kqeVar = os2.a;
                        i4f.j.b(appCompatTextView, du4.b);
                        appCompatTextView.setTextColor(qp4.u0.j(appCompatTextView).getText().e);
                        ay7.b(xc2Var, appCompatTextView, -1);
                        return appCompatTextView;
                    default:
                        nfa nfaVar = new nfa(context2);
                        nfaVar.setId(xoc.h);
                        pla.a(nfaVar, new re(8, nfaVar, nfaVar));
                        nfaVar.setSize(jfa.a);
                        nfaVar.setVisibility(0);
                        xc2Var.addView(nfaVar);
                        return nfaVar;
                }
            }
        });
        this.H0 = je7VarR;
        s5a s5aVar = new s5a(context);
        s5aVar.setId(wea.F);
        float f = 40;
        s5aVar.setLayoutParams(new ViewGroup.LayoutParams(tu0.G(fk4.d().getDisplayMetrics().density * f), tu0.G(f * fk4.d().getDisplayMetrics().density)));
        s5aVar.setAvatarShape(j5a.a);
        addView(s5aVar);
        this.I0 = s5aVar;
        AppCompatTextView appCompatTextView = new AppCompatTextView(context, null);
        appCompatTextView.setId(wea.L);
        appCompatTextView.setLayoutParams(new ViewGroup.LayoutParams(0, -2));
        appCompatTextView.setTextAlignment(2);
        appCompatTextView.setMaxLines(1);
        appCompatTextView.setEllipsize(TextUtils.TruncateAt.END);
        kqe kqeVar = os2.a;
        i4f.n.b(appCompatTextView, du4.b);
        addView(appCompatTextView);
        this.J0 = appCompatTextView;
        AppCompatImageView appCompatImageView = new AppCompatImageView(context, null);
        appCompatImageView.setId(wea.H);
        float f2 = 24;
        appCompatImageView.setLayoutParams(new ViewGroup.LayoutParams(tu0.G(fk4.d().getDisplayMetrics().density * f2), tu0.G(fk4.d().getDisplayMetrics().density * f2)));
        int i3 = gpc.u;
        pq9 pq9Var = qp4.u0;
        bs6 icon = pq9Var.j(appCompatImageView).getIcon();
        Drawable drawableB = kt3.b(appCompatImageView.getContext(), i3);
        ngg.G(drawableB, icon.f);
        appCompatImageView.setImageDrawable(drawableB);
        addView(appCompatImageView);
        this.K0 = appCompatImageView;
        ImageView imageView = new ImageView(context);
        imageView.setId(wea.J);
        imageView.setLayoutParams(new ViewGroup.LayoutParams(tu0.G(fk4.d().getDisplayMetrics().density * f2), tu0.G(f2 * fk4.d().getDisplayMetrics().density)));
        imageView.setImageDrawable(kt3.b(imageView.getContext(), woc.t0));
        addView(imageView);
        this.L0 = imageView;
        setLayoutParams(new ViewGroup.LayoutParams(-1, tu0.G(48 * fk4.d().getDisplayMetrics().density)));
        w();
        if (je7VarR.a()) {
            nfa nfaVar = (nfa) je7VarR.getValue();
            int iG = tu0.G(20 * fk4.d().getDisplayMetrics().density);
            ViewGroup.LayoutParams layoutParams = nfaVar.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
            layoutParams.width = iG;
            layoutParams.height = iG;
            nfaVar.setLayoutParams(layoutParams);
        }
        requestLayout();
        onThemeChanged(pq9Var.j(this));
    }

    @Override // defpackage.kre
    public final void onThemeChanged(fka fkaVar) {
        int i = fkaVar.d().a.a.d;
        setBackground(new RippleDrawable(ColorStateList.valueOf(i), null, new ColorDrawable(-65536)));
        je7 je7Var = this.G0;
        if (je7Var.a()) {
            ((AppCompatTextView) je7Var.getValue()).setTextColor(fkaVar.getText().e);
        }
        this.J0.setTextColor(fkaVar.getText().g);
        this.K0.setImageTintList(ColorStateList.valueOf(fkaVar.getIcon().f));
        this.L0.setImageTintList(ColorStateList.valueOf(fkaVar.getIcon().f));
    }

    public final void setChatTitle(String str) {
        this.J0.setText(str);
        w();
    }

    public final void setLink(String str) {
        AppCompatTextView appCompatTextView = (AppCompatTextView) this.G0.getValue();
        appCompatTextView.setText(str);
        appCompatTextView.setVisibility(0);
        je7 je7Var = this.H0;
        if (je7Var.a()) {
            ((nfa) je7Var.getValue()).setVisibility(8);
        }
        w();
    }

    public final void setLoading(boolean z) {
        je7 je7Var = this.H0;
        je7 je7Var2 = this.G0;
        if (z) {
            if (je7Var2.a()) {
                ((AppCompatTextView) je7Var2.getValue()).setVisibility(8);
            }
            ((nfa) je7Var.getValue()).setVisibility(0);
        } else {
            if (je7Var2.a()) {
                ((AppCompatTextView) je7Var2.getValue()).setVisibility(0);
            }
            ((nfa) je7Var.getValue()).setVisibility(8);
        }
        w();
    }

    public final void setOnMoreActionsClickListener(k56 k56Var) {
        tu0.K(this.L0, 300L, new m6(3, k56Var));
    }

    public final void w() {
        l2a l2aVar;
        float f;
        dj3 dj3VarQ = fp3.q(this);
        s5a s5aVar = this.I0;
        int id = s5aVar.getId();
        dj3VarQ.d(id, 6, 0, 6);
        float f2 = 12;
        au1.p(f2, fk4.d().getDisplayMetrics().density, new l2a(dj3VarQ, 6, id, 4));
        dj3VarQ.d(id, 3, 0, 3);
        dj3VarQ.d(id, 4, 0, 4);
        je7 je7Var = this.G0;
        boolean zA = je7Var.a();
        AppCompatImageView appCompatImageView = this.K0;
        if (zA) {
            int id2 = ((AppCompatTextView) je7Var.getValue()).getId();
            dj3VarQ.d(id2, 6, s5aVar.getId(), 7);
            new l2a(dj3VarQ, 6, id2, 4).e(tu0.G(fk4.d().getDisplayMetrics().density * f2));
            dj3VarQ.d(id2, 3, s5aVar.getId(), 3);
            dj3VarQ.d(id2, 7, appCompatImageView.getId(), 6);
            new l2a(dj3VarQ, 7, id2, 4).e(tu0.G(fk4.d().getDisplayMetrics().density * f2));
            ((AppCompatTextView) je7Var.getValue()).getId();
        } else {
            je7 je7Var2 = this.H0;
            int id3 = ((nfa) je7Var2.getValue()).getId();
            dj3VarQ.d(id3, 6, s5aVar.getId(), 7);
            au1.p(f2, fk4.d().getDisplayMetrics().density, new l2a(dj3VarQ, 6, id3, 4));
            dj3VarQ.d(id3, 3, 0, 3);
            new l2a(dj3VarQ, 3, id3, 4).e(tu0.G(6 * fk4.d().getDisplayMetrics().density));
            ((nfa) je7Var2.getValue()).getId();
        }
        int id4 = this.J0.getId();
        dj3VarQ.d(id4, 6, s5aVar.getId(), 7);
        new l2a(dj3VarQ, 6, id4, 4).e(tu0.G(fk4.d().getDisplayMetrics().density * f2));
        dj3VarQ.d(id4, 4, s5aVar.getId(), 4);
        dj3VarQ.d(id4, 7, appCompatImageView.getId(), 6);
        new l2a(dj3VarQ, 7, id4, 4).e(tu0.G(fk4.d().getDisplayMetrics().density * f2));
        int id5 = appCompatImageView.getId();
        ImageView imageView = this.L0;
        if (imageView.getVisibility() == 0) {
            dj3VarQ.d(id5, 7, imageView.getId(), 6);
            l2aVar = new l2a(dj3VarQ, 7, id5, 4);
            f = fk4.d().getDisplayMetrics().density;
        } else {
            dj3VarQ.d(id5, 7, 0, 7);
            l2aVar = new l2a(dj3VarQ, 7, id5, 4);
            f = fk4.d().getDisplayMetrics().density;
        }
        au1.p(f2, f, l2aVar);
        dj3VarQ.d(id5, 3, 0, 3);
        dj3VarQ.d(id5, 4, 0, 4);
        if (imageView.getVisibility() == 0) {
            int id6 = imageView.getId();
            dj3VarQ.d(id6, 7, 0, 7);
            au1.p(f2, fk4.d().getDisplayMetrics().density, new l2a(dj3VarQ, 7, id6, 4));
            dj3VarQ.d(id6, 3, 0, 3);
            dj3VarQ.d(id6, 4, 0, 4);
        }
        dj3VarQ.a(this);
    }
}
