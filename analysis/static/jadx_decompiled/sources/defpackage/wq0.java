package defpackage;

import android.content.Context;
import android.graphics.drawable.Animatable;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes.dex */
public final class wq0 extends ConstraintLayout implements kre {
    public final TextView G0;
    public final AppCompatImageView H0;
    public final caa I0;
    public int J0;
    public final vq0 K0;
    public c66 L0;

    public wq0(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TextView textView = new TextView(context);
        textView.setId(xoc.e);
        textView.setVisibility(0);
        textView.setLayoutParams(new ti3(-2, -2));
        i4f.w.b(textView, du4.b);
        this.G0 = textView;
        AppCompatImageView appCompatImageView = new AppCompatImageView(context, null);
        appCompatImageView.setId(xoc.d);
        float f = 28;
        appCompatImageView.setLayoutParams(new ViewGroup.LayoutParams(tu0.G(fk4.d().getDisplayMetrics().density * f), tu0.G(f * fk4.d().getDisplayMetrics().density)));
        appCompatImageView.setVisibility(0);
        this.H0 = appCompatImageView;
        caa caaVar = new caa(context);
        caaVar.setId(xoc.b);
        caaVar.setLayoutParams(new ti3(-2, -2));
        caaVar.setAppearance(x9a.o);
        caaVar.setHasBackgroundStroke(true);
        caaVar.setVisibility(8);
        this.I0 = caaVar;
        qaa qaaVar = new qaa(context);
        qaaVar.setId(xoc.c);
        float f2 = 6;
        ti3 ti3Var = new ti3(tu0.G(fk4.d().getDisplayMetrics().density * f2), tu0.G(fk4.d().getDisplayMetrics().density * f2));
        ti3Var.setMarginStart(tu0.G(7 * fk4.d().getDisplayMetrics().density));
        qaaVar.setLayoutParams(ti3Var);
        qaaVar.setAppearance(paa.c);
        qaaVar.setVisibility(8);
        this.J0 = 2;
        vq0 vq0Var = new vq0(0, this);
        this.K0 = vq0Var;
        this.L0 = vq0Var;
        setLayoutParams(new ViewGroup.LayoutParams(0, -1));
        addView(appCompatImageView);
        addView(caaVar);
        addView(qaaVar);
        addView(textView);
        dj3 dj3VarQ = fp3.q(this);
        int id = appCompatImageView.getId();
        dj3VarQ.d(id, 3, 0, 3);
        new l2a(dj3VarQ, 3, id, 4).e(tu0.G(f2 * fk4.d().getDisplayMetrics().density));
        dj3VarQ.d(id, 6, 0, 6);
        dj3VarQ.d(id, 7, 0, 7);
        int id2 = textView.getId();
        dj3VarQ.d(id2, 6, 0, 6);
        dj3VarQ.d(id2, 7, 0, 7);
        dj3VarQ.d(id2, 3, appCompatImageView.getId(), 4);
        float f3 = 2;
        new l2a(dj3VarQ, 3, id2, 4).e(tu0.G(fk4.d().getDisplayMetrics().density * f3));
        int id3 = caaVar.getId();
        dj3VarQ.d(id3, 6, appCompatImageView.getId(), 6);
        new l2a(dj3VarQ, 6, id3, 4).e(tu0.G(14 * fk4.d().getDisplayMetrics().density));
        dj3VarQ.d(id3, 4, appCompatImageView.getId(), 4);
        new l2a(dj3VarQ, 4, id3, 4).e(tu0.G(9 * fk4.d().getDisplayMetrics().density));
        int id4 = qaaVar.getId();
        dj3VarQ.d(id4, 3, appCompatImageView.getId(), 3);
        dj3VarQ.d(id4, 7, appCompatImageView.getId(), 7);
        new l2a(dj3VarQ, 7, id4, 4).e(-tu0.G(f3 * fk4.d().getDisplayMetrics().density));
        dj3VarQ.a(this);
    }

    @Override // defpackage.kre
    public final void onThemeChanged(fka fkaVar) {
        w();
    }

    public final void setCounter(int i) {
        int i2 = i > 0 ? 0 : 8;
        caa caaVar = this.I0;
        caaVar.setVisibility(i2);
        caaVar.g(i, true);
        if (i > 0) {
            w();
        }
    }

    public final void setIcon(int i) {
        this.H0.setImageDrawable(s36.n(getContext(), i));
        this.L0 = this.K0;
        w();
    }

    @Override // android.view.View
    public void setSelected(boolean z) {
        this.J0 = z ? 1 : 2;
        w();
        if (z) {
            Object drawable = this.H0.getDrawable();
            Animatable animatable = drawable instanceof Animatable ? (Animatable) drawable : null;
            if (animatable != null) {
                animatable.start();
            }
        }
        super.setSelected(z);
    }

    public final void setText(int i) {
        this.G0.setText(i);
    }

    public final void w() {
        int i;
        TextView textView = this.G0;
        int i2 = this.J0;
        pq9 pq9Var = qp4.u0;
        fka fkaVarJ = pq9Var.j(this);
        int iS = au1.s(i2);
        if (iS == 0) {
            i = fkaVarJ.getText().j;
        } else {
            if (iS != 1) {
                throw new NoWhenBranchMatchedException();
            }
            i = fkaVarJ.getText().g;
        }
        textView.setTextColor(i);
        this.L0.invoke(this.H0, Boolean.valueOf(this.J0 == 1), pq9Var.j(this));
        this.I0.f(pq9Var.j(this));
        invalidate();
    }

    public final void setText(CharSequence charSequence) {
        this.G0.setText(charSequence);
    }
}
