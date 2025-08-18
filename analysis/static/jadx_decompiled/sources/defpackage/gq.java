package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.util.AttributeSet;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;

/* loaded from: classes.dex */
public final class gq extends ConstraintLayout implements kre {
    public final AppCompatTextView G0;
    public final AppCompatImageView H0;

    public gq(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        AppCompatTextView appCompatTextView = new AppCompatTextView(context, null);
        appCompatTextView.setId(n4a.c);
        appCompatTextView.setGravity(8388611);
        i4f.j.b(appCompatTextView, du4.b);
        pq9 pq9Var = qp4.u0;
        appCompatTextView.setTextColor(pq9Var.j(appCompatTextView).getText().e);
        this.G0 = appCompatTextView;
        AppCompatImageView appCompatImageView = new AppCompatImageView(context, null);
        appCompatImageView.setId(n4a.b);
        float f = 24;
        appCompatImageView.setLayoutParams(new ti3(tu0.G(fk4.d().getDisplayMetrics().density * f), tu0.G(f * fk4.d().getDisplayMetrics().density)));
        appCompatImageView.setImageTintList(ColorStateList.valueOf(pq9Var.j(appCompatImageView).getIcon().k));
        appCompatImageView.setImageResource(woc.m);
        this.H0 = appCompatImageView;
        setId(n4a.a);
        setLayoutParams(new ViewGroup.LayoutParams(-1, tu0.G(48 * fk4.d().getDisplayMetrics().density)));
        setBackgroundColor(pq9Var.j(this).b().g);
        addView(appCompatTextView);
        addView(appCompatImageView);
        dj3 dj3VarQ = fp3.q(this);
        int id = appCompatImageView.getId();
        dj3VarQ.d(id, 3, 0, 3);
        dj3VarQ.d(id, 4, 0, 4);
        dj3VarQ.d(id, 6, 0, 6);
        l2a l2aVar = new l2a(dj3VarQ, 6, id, 4);
        float f2 = 12;
        l2aVar.e(tu0.G(fk4.d().getDisplayMetrics().density * f2));
        int id2 = appCompatTextView.getId();
        dj3VarQ.d(id2, 3, 0, 3);
        dj3VarQ.d(id2, 4, 0, 4);
        dj3VarQ.d(id2, 6, appCompatImageView.getId(), 7);
        new l2a(dj3VarQ, 6, id2, 4).e(tu0.G(f2 * fk4.d().getDisplayMetrics().density));
        dj3VarQ.a(this);
    }

    @Override // defpackage.kre
    public final void onThemeChanged(fka fkaVar) {
        setBackgroundColor(fkaVar.b().g);
        this.H0.setImageTintList(ColorStateList.valueOf(fkaVar.getIcon().k));
        this.G0.setTextColor(fkaVar.getText().e);
    }

    @Override // android.view.View
    public void setSelected(boolean z) {
        this.H0.setVisibility(z ^ true ? 4 : 0);
    }

    public final void setTitle(CharSequence charSequence) {
        this.G0.setText(charSequence);
    }
}
