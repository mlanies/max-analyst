package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatTextView;

/* loaded from: classes2.dex */
public final class wid extends LinearLayout implements kre {
    public final s5a a;
    public final AppCompatTextView b;
    public final AppCompatTextView c;
    public final AppCompatTextView o;
    public final AppCompatTextView s0;
    public final LinearLayout t0;

    public wid(Context context) {
        super(context, null);
        s5a s5aVar = new s5a(context);
        s5aVar.setId(lha.k);
        float f = 96;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(tu0.G(fk4.d().getDisplayMetrics().density * f), tu0.G(f * fk4.d().getDisplayMetrics().density));
        layoutParams.gravity = 1;
        float f2 = 12;
        layoutParams.bottomMargin = tu0.G(fk4.d().getDisplayMetrics().density * f2);
        layoutParams.topMargin = tu0.G(f2 * fk4.d().getDisplayMetrics().density);
        s5aVar.setLayoutParams(layoutParams);
        s5aVar.setAvatarShape(j5a.a);
        this.a = s5aVar;
        AppCompatTextView appCompatTextView = new AppCompatTextView(context, null);
        appCompatTextView.setId(lha.n);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.bottomMargin = tu0.G(6 * fk4.d().getDisplayMetrics().density);
        appCompatTextView.setLayoutParams(layoutParams2);
        float f3 = 20;
        appCompatTextView.setPaddingRelative(tu0.G(fk4.d().getDisplayMetrics().density * f3), appCompatTextView.getPaddingTop(), tu0.G(fk4.d().getDisplayMetrics().density * f3), appCompatTextView.getPaddingBottom());
        appCompatTextView.setGravity(1);
        i4f.b.b(appCompatTextView, du4.b);
        pq9 pq9Var = qp4.u0;
        appCompatTextView.setTextColor(pq9Var.j(appCompatTextView).getText().e);
        appCompatTextView.setMaxLines(2);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        appCompatTextView.setEllipsize(truncateAt);
        this.b = appCompatTextView;
        AppCompatTextView appCompatTextView2 = new AppCompatTextView(context, null);
        appCompatTextView2.setId(lha.p);
        appCompatTextView2.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        appCompatTextView2.setGravity(1);
        kqe kqeVar = i4f.n;
        kqeVar.b(appCompatTextView2, du4.b);
        appCompatTextView2.setTextColor(pq9Var.j(appCompatTextView2).getText().j);
        this.c = appCompatTextView2;
        AppCompatTextView appCompatTextView3 = new AppCompatTextView(context, null);
        appCompatTextView3.setId(lha.m);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, -2);
        float f4 = 4;
        layoutParams3.setMarginStart(tu0.G(fk4.d().getDisplayMetrics().density * f4));
        layoutParams3.setMarginEnd(tu0.G(f4 * fk4.d().getDisplayMetrics().density));
        appCompatTextView3.setLayoutParams(layoutParams3);
        appCompatTextView3.setText("·");
        appCompatTextView3.setGravity(1);
        kqeVar.b(appCompatTextView3, du4.b);
        appCompatTextView3.setTextColor(pq9Var.j(appCompatTextView3).getText().h);
        this.o = appCompatTextView3;
        AppCompatTextView appCompatTextView4 = new AppCompatTextView(context, null);
        appCompatTextView4.setId(lha.o);
        appCompatTextView4.setLayoutParams(new t53(-2, -2));
        appCompatTextView4.setGravity(1);
        kqeVar.b(appCompatTextView4, du4.b);
        appCompatTextView4.setTextColor(pq9Var.j(appCompatTextView4).getText().j);
        appCompatTextView4.setEllipsize(truncateAt);
        appCompatTextView4.setMaxLines(1);
        this.s0 = appCompatTextView4;
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setId(lha.l);
        linearLayout.setLayoutParams(new t53(-2, -2));
        linearLayout.setPaddingRelative(tu0.G(fk4.d().getDisplayMetrics().density * f3), linearLayout.getPaddingTop(), tu0.G(f3 * fk4.d().getDisplayMetrics().density), linearLayout.getPaddingBottom());
        linearLayout.setOrientation(0);
        linearLayout.addView(appCompatTextView2);
        linearLayout.addView(appCompatTextView3);
        linearLayout.addView(appCompatTextView4);
        this.t0 = linearLayout;
        setId(lha.j);
        t53 t53Var = new t53(-1, -2);
        setMinimumHeight(tu0.G(172 * fk4.d().getDisplayMetrics().density));
        t53Var.a = 2;
        t53Var.b = -0.3f;
        ((FrameLayout.LayoutParams) t53Var).bottomMargin = tu0.G(24 * fk4.d().getDisplayMetrics().density);
        setLayoutParams(t53Var);
        setClipToPadding(false);
        setGravity(1);
        setOrientation(1);
        addView(s5aVar);
        addView(appCompatTextView);
        addView(linearLayout);
    }

    private final void setDivider(boolean z) {
        this.o.setVisibility(z ? 0 : 8);
    }

    private final void setNickname(String str) {
        AppCompatTextView appCompatTextView = this.s0;
        appCompatTextView.setVisibility(true ^ (str == null || str.length() == 0) ? 0 : 8);
        if (str == null) {
            str = "";
        }
        appCompatTextView.setText(str);
    }

    private final void setPhoneNumber(String str) {
        AppCompatTextView appCompatTextView = this.c;
        appCompatTextView.setVisibility(true ^ (str == null || str.length() == 0) ? 0 : 8);
        if (str == null) {
            str = "";
        }
        appCompatTextView.setText(str);
    }

    @Override // defpackage.kre
    public final void onThemeChanged(fka fkaVar) {
        this.b.setTextColor(fkaVar.getText().e);
        this.c.setTextColor(fkaVar.getText().j);
        this.s0.setTextColor(fkaVar.getText().j);
        this.o.setTextColor(fkaVar.getText().h);
    }

    @Override // android.view.View
    public void setAlpha(float f) {
        this.t0.setAlpha(f);
        this.a.setAlpha(f);
    }

    public final void setAvatarClickedListener(k56 k56Var) {
        tu0.K(this.a, 300L, new m6(23, k56Var));
    }

    public final void setNicknameClickListener(k56 k56Var) {
        tu0.K(this.s0, 300L, new m6(22, k56Var));
    }

    public final void setTopBarContent(did didVar) {
        s5a.i(this.a, didVar.b, Long.valueOf(didVar.a), didVar.d);
        this.b.setText(didVar.c);
        String str = didVar.e;
        setPhoneNumber(str);
        String str2 = didVar.f;
        setNickname(str2);
        boolean z = false;
        if (!(str == null || str.length() == 0)) {
            if (!(str2 == null || str2.length() == 0)) {
                z = true;
            }
        }
        setDivider(z);
    }

    public final void setUserPhoneClickListener(k56 k56Var) {
        tu0.K(this.c, 300L, new m6(21, k56Var));
    }
}
