package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import one.me.calls.ui.ui.call.CallScreen;
import one.me.sdk.uikit.common.button.OneMeButton;

/* loaded from: classes.dex */
public final class yl1 extends ConstraintLayout {
    public xl1 G0;
    public boolean H0;
    public final ufd I0;
    public final AppCompatTextView J0;

    public yl1(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        pq9 pq9Var = qp4.u0;
        setBackgroundColor(pq9Var.p(this).c.b().k);
        dy7.H(this, fk4.d().getDisplayMetrics().density * 16.0f);
        br7.d(this, new x27(0, new yq0(5, 2, false), 1), null);
        AppCompatImageView appCompatImageView = new AppCompatImageView(context, null);
        appCompatImageView.setId(y7a.M);
        float f = 48;
        appCompatImageView.setLayoutParams(new ti3(tu0.G(fk4.d().getDisplayMetrics().density * f), tu0.G(f * fk4.d().getDisplayMetrics().density)));
        appCompatImageView.setImageResource(x7a.s0);
        appCompatImageView.setImageTintList(ColorStateList.valueOf(pq9Var.p(appCompatImageView).c.getIcon().f));
        AppCompatTextView appCompatTextView = new AppCompatTextView(context, null);
        appCompatTextView.setId(y7a.B1);
        appCompatTextView.setLayoutParams(new ti3(-1, -2));
        appCompatTextView.setGravity(17);
        i4f.c.b(appCompatTextView, du4.b);
        appCompatTextView.setTextColor(pq9Var.p(appCompatTextView).c.getText().e);
        this.J0 = appCompatTextView;
        AppCompatTextView appCompatTextView2 = new AppCompatTextView(context, null);
        appCompatTextView2.setId(y7a.A1);
        appCompatTextView2.setLayoutParams(new ti3(-1, -2));
        appCompatTextView2.setGravity(17);
        i4f.p.b(appCompatTextView2, du4.b);
        appCompatTextView2.setTextColor(pq9Var.p(appCompatTextView2).c.getText().g);
        appCompatTextView2.setText(b8a.Y);
        OneMeButton oneMeButton = new OneMeButton(context, null);
        oneMeButton.setId(y7a.z1);
        oneMeButton.setLayoutParams(new ti3(-2, -2));
        oneMeButton.setMode(b7a.a);
        oneMeButton.setSize(c7a.b);
        oneMeButton.setCustomTheme(pq9Var.p(oneMeButton).c);
        oneMeButton.setAppearance(z6a.X);
        oneMeButton.setText(b8a.X);
        final int i = 0;
        tu0.K(oneMeButton, 300L, new View.OnClickListener(this) { // from class: wl1
            public final /* synthetic */ yl1 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                yl1 yl1Var = this.b;
                switch (i) {
                    case 0:
                        xl1 xl1Var = yl1Var.G0;
                        if (xl1Var != null) {
                            yxc yxcVar = CallScreen.R0;
                            ((ti1) xl1Var).a.D0().w(false, null);
                            break;
                        }
                        break;
                    default:
                        xl1 xl1Var2 = yl1Var.G0;
                        if (xl1Var2 != null) {
                            boolean z = !yl1Var.H0;
                            yxc yxcVar2 = CallScreen.R0;
                            ((ti1) xl1Var2).a.D0().c.h.a(z);
                            break;
                        }
                        break;
                }
            }
        });
        ufd ufdVar = new ufd(context, null);
        ufdVar.setId(y7a.C1);
        ufdVar.setStartIcon(x7a.t0);
        ufdVar.setTitle(new eqe(b8a.Q));
        ufdVar.setType(jfd.b);
        ufdVar.setEndView(new ffd(this.H0, true));
        ufdVar.setOnSwitchCheckedListener(new bk(3, this));
        float[] fArr = new float[8];
        for (int i2 = 0; i2 < 8; i2++) {
            fArr[i2] = fk4.d().getDisplayMetrics().density * 16.0f;
        }
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(fArr, null, null));
        shapeDrawable.getPaint().setColor(pq9Var.p(ufdVar).c.b().a.g);
        ufdVar.setBackground(shapeDrawable);
        ufdVar.setThemeDepended(pfd.b);
        final int i3 = 1;
        tu0.K(ufdVar, 300L, new View.OnClickListener(this) { // from class: wl1
            public final /* synthetic */ yl1 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                yl1 yl1Var = this.b;
                switch (i3) {
                    case 0:
                        xl1 xl1Var = yl1Var.G0;
                        if (xl1Var != null) {
                            yxc yxcVar = CallScreen.R0;
                            ((ti1) xl1Var).a.D0().w(false, null);
                            break;
                        }
                        break;
                    default:
                        xl1 xl1Var2 = yl1Var.G0;
                        if (xl1Var2 != null) {
                            boolean z = !yl1Var.H0;
                            yxc yxcVar2 = CallScreen.R0;
                            ((ti1) xl1Var2).a.D0().c.h.a(z);
                            break;
                        }
                        break;
                }
            }
        });
        this.I0 = ufdVar;
        addView(appCompatImageView);
        addView(this.J0);
        addView(appCompatTextView2);
        addView(oneMeButton);
        addView(ufdVar);
        dj3 dj3VarQ = fp3.q(this);
        int id = appCompatImageView.getId();
        dj3VarQ.d(id, 3, 0, 3);
        float f2 = 16;
        au1.p(f2, fk4.d().getDisplayMetrics().density, new l2a(dj3VarQ, 3, id, 4));
        dj3VarQ.d(id, 7, 0, 7);
        dj3VarQ.d(id, 6, 0, 6);
        dj3VarQ.d(id, 4, this.J0.getId(), 3);
        dj3VarQ.g(id).d.W = 2;
        int id2 = this.J0.getId();
        dj3VarQ.d(id2, 3, appCompatImageView.getId(), 4);
        au1.p(f2, fk4.d().getDisplayMetrics().density, new l2a(dj3VarQ, 3, id2, 4));
        dj3VarQ.d(id2, 7, 0, 7);
        au1.p(f2, fk4.d().getDisplayMetrics().density, new l2a(dj3VarQ, 7, id2, 4));
        dj3VarQ.d(id2, 6, 0, 6);
        new l2a(dj3VarQ, 6, id2, 4).e(tu0.G(fk4.d().getDisplayMetrics().density * f2));
        dj3VarQ.d(id2, 4, appCompatTextView2.getId(), 3);
        int id3 = appCompatTextView2.getId();
        dj3VarQ.d(id3, 3, this.J0.getId(), 4);
        au1.p(8, fk4.d().getDisplayMetrics().density, new l2a(dj3VarQ, 3, id3, 4));
        dj3VarQ.d(id3, 6, 0, 6);
        au1.p(f2, fk4.d().getDisplayMetrics().density, new l2a(dj3VarQ, 6, id3, 4));
        dj3VarQ.d(id3, 7, 0, 7);
        new l2a(dj3VarQ, 7, id3, 4).e(tu0.G(fk4.d().getDisplayMetrics().density * f2));
        dj3VarQ.d(id3, 4, oneMeButton.getId(), 3);
        new l2a(dj3VarQ, 4, id3, 4).e(tu0.G(5 * fk4.d().getDisplayMetrics().density));
        int id4 = oneMeButton.getId();
        dj3VarQ.d(id4, 3, appCompatTextView2.getId(), 4);
        au1.p(24, fk4.d().getDisplayMetrics().density, new l2a(dj3VarQ, 3, id4, 4));
        dj3VarQ.d(id4, 6, 0, 6);
        au1.p(f2, fk4.d().getDisplayMetrics().density, new l2a(dj3VarQ, 6, id4, 4));
        dj3VarQ.d(id4, 7, 0, 7);
        au1.p(f2, fk4.d().getDisplayMetrics().density, new l2a(dj3VarQ, 7, id4, 4));
        dj3VarQ.d(id4, 4, 0, 4);
        new l2a(dj3VarQ, 4, id4, 4).e(tu0.G(fk4.d().getDisplayMetrics().density * f2));
        int id5 = ufdVar.getId();
        dj3VarQ.d(id5, 6, 0, 6);
        au1.p(f2, fk4.d().getDisplayMetrics().density, new l2a(dj3VarQ, 6, id5, 4));
        dj3VarQ.d(id5, 7, 0, 7);
        au1.p(f2, fk4.d().getDisplayMetrics().density, new l2a(dj3VarQ, 7, id5, 4));
        dj3VarQ.d(id5, 4, 0, 4);
        new l2a(dj3VarQ, 4, id5, 4).e(tu0.G(112 * fk4.d().getDisplayMetrics().density));
        dj3VarQ.a(this);
    }

    public final void setListener(xl1 xl1Var) {
        this.G0 = xl1Var;
    }

    public final void setTitle(jqe jqeVar) {
        this.J0.setText(jqeVar.b(getContext()));
    }
}
