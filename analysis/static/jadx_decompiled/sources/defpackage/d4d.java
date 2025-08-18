package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class d4d extends kgb {
    public final ImageView F0;
    public final AppCompatTextView G0;
    public final AppCompatTextView H0;

    public d4d(Context context) {
        ConstraintLayout constraintLayout = new ConstraintLayout(context);
        super(constraintLayout);
        ImageView imageView = new ImageView(context);
        float f = 24;
        ti3 ti3Var = new ti3(tu0.G(fk4.d().getDisplayMetrics().density * f), tu0.G(f * fk4.d().getDisplayMetrics().density));
        int i = sea.s0;
        imageView.setId(i);
        ti3Var.t = 0;
        ti3Var.i = 0;
        ti3Var.l = 0;
        imageView.setLayoutParams(ti3Var);
        this.F0 = imageView;
        AppCompatTextView appCompatTextView = new AppCompatTextView(context, null);
        int i2 = sea.u0;
        appCompatTextView.setId(i2);
        ti3 ti3Var2 = new ti3(0, -2);
        float f2 = 12;
        appCompatTextView.setPaddingRelative(tu0.G(fk4.d().getDisplayMetrics().density * f2), appCompatTextView.getPaddingTop(), appCompatTextView.getPaddingEnd(), appCompatTextView.getPaddingBottom());
        ti3Var2.s = i;
        ti3Var2.i = 0;
        ti3Var2.v = 0;
        appCompatTextView.setLayoutParams(ti3Var2);
        appCompatTextView.setSingleLine(true);
        i4f.j.b(appCompatTextView, du4.b);
        this.G0 = appCompatTextView;
        AppCompatTextView appCompatTextView2 = new AppCompatTextView(context, null);
        appCompatTextView2.setId(sea.t0);
        ti3 ti3Var3 = new ti3(0, -2);
        ti3Var3.t = i2;
        ti3Var3.j = i2;
        ti3Var3.l = 0;
        ti3Var3.v = 0;
        float f3 = 8;
        appCompatTextView2.setPaddingRelative(tu0.G(fk4.d().getDisplayMetrics().density * f2), tu0.G(4 * fk4.d().getDisplayMetrics().density), appCompatTextView2.getPaddingEnd(), tu0.G(fk4.d().getDisplayMetrics().density * f3));
        appCompatTextView2.setLayoutParams(ti3Var3);
        i4f.n.b(appCompatTextView2, du4.b);
        this.H0 = appCompatTextView2;
        constraintLayout.setLayoutParams(new ti3(-1, -2));
        constraintLayout.addView(imageView);
        constraintLayout.addView(appCompatTextView);
        constraintLayout.addView(appCompatTextView2);
        constraintLayout.setPaddingRelative(tu0.G(fk4.d().getDisplayMetrics().density * f2), tu0.G(fk4.d().getDisplayMetrics().density * f3), tu0.G(f2 * fk4.d().getDisplayMetrics().density), tu0.G(f3 * fk4.d().getDisplayMetrics().density));
        v3c.y(new r1b(this, (Continuation) null, 13), constraintLayout);
    }

    @Override // defpackage.hqd
    public final void A(ol7 ol7Var) {
        c4d c4dVar = (c4d) ol7Var;
        int i = rwb.profile_selectable_item_tag;
        Integer numValueOf = Integer.valueOf(c4dVar.a);
        View view = this.a;
        tpa.J(i, view, numValueOf);
        this.G0.setText(c4dVar.c.b(view.getContext()));
        this.H0.setText(c4dVar.o.b(view.getContext()));
        ImageView imageView = this.F0;
        boolean z = c4dVar.b;
        imageView.setSelected(z);
        imageView.setImageDrawable(z ? kt3.b(view.getContext(), yfa.m) : null);
    }
}
