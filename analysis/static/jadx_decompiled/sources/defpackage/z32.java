package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.text.TextUtils;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;

/* loaded from: classes2.dex */
public final class z32 extends ConstraintLayout implements kre {
    public final AppCompatTextView G0;
    public final AppCompatTextView H0;
    public final AppCompatImageView I0;

    public z32(Context context) {
        super(context);
        AppCompatTextView appCompatTextView = new AppCompatTextView(context, null);
        appCompatTextView.setId(wea.u);
        appCompatTextView.setLayoutParams(new ViewGroup.LayoutParams(0, -2));
        appCompatTextView.setTextAlignment(2);
        appCompatTextView.setSingleLine(true);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        appCompatTextView.setEllipsize(truncateAt);
        appCompatTextView.setText(context.getText(yea.D));
        pq9 pq9Var = qp4.u0;
        appCompatTextView.setTextColor(pq9Var.j(appCompatTextView).getText().g);
        kqe kqeVar = os2.a;
        i4f.f.b(appCompatTextView, du4.b);
        this.G0 = appCompatTextView;
        AppCompatTextView appCompatTextView2 = new AppCompatTextView(context, null);
        appCompatTextView2.setId(wea.v);
        appCompatTextView2.setLayoutParams(new ViewGroup.LayoutParams(0, -2));
        appCompatTextView2.setTextAlignment(2);
        appCompatTextView2.setSingleLine(true);
        appCompatTextView2.setEllipsize(truncateAt);
        appCompatTextView2.setTextColor(pq9Var.j(appCompatTextView2).getText().j);
        i4f.g.b(appCompatTextView2, du4.b);
        this.H0 = appCompatTextView2;
        AppCompatImageView appCompatImageView = new AppCompatImageView(context, null);
        appCompatImageView.setId(wea.w);
        float f = 24;
        appCompatImageView.setLayoutParams(new ViewGroup.LayoutParams(tu0.G(fk4.d().getDisplayMetrics().density * f), tu0.G(f * fk4.d().getDisplayMetrics().density)));
        appCompatImageView.setImageResource(woc.j0);
        float f2 = 2;
        appCompatImageView.setPadding(tu0.F(fk4.d().getDisplayMetrics().density * 3.5d), tu0.G(fk4.d().getDisplayMetrics().density * f2), tu0.F(fk4.d().getDisplayMetrics().density * 3.5d), tu0.G(f2 * fk4.d().getDisplayMetrics().density));
        appCompatImageView.setImageTintList(ColorStateList.valueOf(pq9Var.j(appCompatImageView).getText().j));
        this.I0 = appCompatImageView;
        setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        float f3 = 12;
        float f4 = 8;
        setPadding(tu0.G(fk4.d().getDisplayMetrics().density * f3), tu0.G(fk4.d().getDisplayMetrics().density * f4), tu0.G(f3 * fk4.d().getDisplayMetrics().density), tu0.G(f4 * fk4.d().getDisplayMetrics().density));
        addView(appCompatTextView);
        addView(appCompatTextView2);
        addView(appCompatImageView);
        dj3 dj3VarQ = fp3.q(this);
        int id = appCompatTextView.getId();
        dj3VarQ.d(id, 6, 0, 6);
        dj3VarQ.d(id, 3, 0, 3);
        dj3VarQ.d(id, 4, appCompatTextView2.getId(), 3);
        float f5 = 1;
        new l2a(dj3VarQ, 4, id, 4).e(tu0.G(fk4.d().getDisplayMetrics().density * f5));
        dj3VarQ.d(id, 7, appCompatImageView.getId(), 6);
        l2a l2aVar = new l2a(dj3VarQ, 7, id, 4);
        float f6 = 16;
        l2aVar.e(tu0.G(fk4.d().getDisplayMetrics().density * f6));
        int id2 = appCompatTextView2.getId();
        dj3VarQ.d(id2, 6, 0, 6);
        dj3VarQ.d(id2, 3, appCompatTextView.getId(), 4);
        au1.p(f5, fk4.d().getDisplayMetrics().density, new l2a(dj3VarQ, 3, id2, 4));
        dj3VarQ.d(id2, 4, 0, 4);
        dj3VarQ.d(id2, 7, appCompatImageView.getId(), 6);
        new l2a(dj3VarQ, 7, id2, 4).e(tu0.G(f6 * fk4.d().getDisplayMetrics().density));
        int id3 = appCompatImageView.getId();
        dj3VarQ.d(id3, 3, 0, 3);
        dj3VarQ.d(id3, 4, 0, 4);
        dj3VarQ.d(id3, 7, 0, 7);
        dj3VarQ.a(this);
        onThemeChanged(pq9Var.j(this));
    }

    @Override // defpackage.kre
    public final void onThemeChanged(fka fkaVar) {
        pq9 pq9Var = qp4.u0;
        this.G0.setTextColor(pq9Var.j(this).getText().g);
        this.H0.setTextColor(pq9Var.j(this).getText().j);
        this.I0.setImageTintList(ColorStateList.valueOf(fkaVar.getIcon().k));
    }

    public final void setLink(CharSequence charSequence) {
        this.H0.setText(charSequence);
    }

    public final void setOnShareLinkClickListener(m56 m56Var) {
        tu0.K(this.I0, 300L, new tb(this, m56Var, 9));
    }
}
