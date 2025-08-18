package defpackage;

import android.content.Context;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import one.me.sdk.uikit.common.button.OneMeButton;

/* loaded from: classes2.dex */
public final class bh6 extends ConstraintLayout implements kre {
    public final yia G0;
    public final TextView H0;
    public final TextView I0;
    public final OneMeButton J0;

    public bh6(Context context) {
        super(context);
        yia yiaVar = new yia(context);
        yiaVar.setId(mea.c);
        this.G0 = yiaVar;
        TextView textView = new TextView(context);
        textView.setId(mea.e);
        textView.setText(context.getString(oea.c));
        i4f.o.b(textView, du4.b);
        this.H0 = textView;
        TextView textView2 = new TextView(context);
        textView2.setId(mea.d);
        i4f.s.b(textView2, du4.b);
        this.I0 = textView2;
        OneMeButton oneMeButton = new OneMeButton(context, null);
        oneMeButton.setId(mea.b);
        oneMeButton.setSize(c7a.a);
        oneMeButton.setMode(b7a.a);
        oneMeButton.setAppearance(z6a.c);
        oneMeButton.setText(oea.b);
        this.J0 = oneMeButton;
        setLayoutParams(new ti3(-1, -2));
        addView(yiaVar, 0, -2);
        addView(oneMeButton, 0, -2);
        addView(textView, 0, -2);
        addView(textView2, 0, -2);
        onThemeChanged(qp4.u0.j(this));
        dj3 dj3VarQ = fp3.q(this);
        int id = yiaVar.getId();
        dj3VarQ.d(id, 6, 0, 6);
        float f = 12;
        au1.p(f, fk4.d().getDisplayMetrics().density, new l2a(dj3VarQ, 6, id, 4));
        dj3VarQ.d(id, 3, 0, 3);
        dj3VarQ.d(id, 4, 0, 4);
        dj3VarQ.g(id).d.l0 = true;
        int id2 = textView.getId();
        dj3VarQ.d(id2, 6, yiaVar.getId(), 7);
        au1.p(f, fk4.d().getDisplayMetrics().density, new l2a(dj3VarQ, 6, id2, 4));
        dj3VarQ.d(id2, 3, 0, 3);
        dj3VarQ.d(id2, 4, textView2.getId(), 4);
        dj3VarQ.d(id2, 7, oneMeButton.getId(), 6);
        float f2 = 9;
        new l2a(dj3VarQ, 7, id2, 4).e(tu0.G(fk4.d().getDisplayMetrics().density * f2));
        dj3VarQ.g(id2).d.l0 = true;
        dj3VarQ.g(id2).d.W = 2;
        int id3 = textView2.getId();
        dj3VarQ.d(id3, 6, yiaVar.getId(), 7);
        new l2a(dj3VarQ, 6, id3, 4).e(tu0.G(fk4.d().getDisplayMetrics().density * f));
        dj3VarQ.d(id3, 3, textView.getId(), 3);
        dj3VarQ.d(id3, 4, 0, 4);
        dj3VarQ.d(id3, 7, oneMeButton.getId(), 6);
        new l2a(dj3VarQ, 7, id3, 4).e(tu0.G(f2 * fk4.d().getDisplayMetrics().density));
        dj3VarQ.g(id3).d.l0 = true;
        int id4 = oneMeButton.getId();
        dj3VarQ.d(id4, 7, 0, 7);
        au1.p(f, fk4.d().getDisplayMetrics().density, new l2a(dj3VarQ, 7, id4, 4));
        dj3VarQ.d(id4, 3, 0, 3);
        au1.p(f, fk4.d().getDisplayMetrics().density, new l2a(dj3VarQ, 3, id4, 4));
        dj3VarQ.d(id4, 4, 0, 4);
        new l2a(dj3VarQ, 4, id4, 4).e(tu0.G(f * fk4.d().getDisplayMetrics().density));
        dj3VarQ.g(id4).d.l0 = true;
        dj3VarQ.a(this);
    }

    @Override // defpackage.kre
    public final void onThemeChanged(fka fkaVar) {
        this.H0.setTextColor(fkaVar.getText().e);
        this.I0.setTextColor(fkaVar.getText().g);
        this.J0.onThemeChanged(fkaVar);
    }

    public final void setJoinAction(k56 k56Var) {
        OneMeButton oneMeButton = this.J0;
        if (k56Var == null) {
            oneMeButton.setOnClickListener(null);
        } else {
            tu0.K(oneMeButton, 300L, new m6(11, k56Var));
        }
    }
}
