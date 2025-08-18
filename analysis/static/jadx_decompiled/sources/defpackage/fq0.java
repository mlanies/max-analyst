package defpackage;

import android.content.Context;
import android.widget.LinearLayout;
import android.widget.TextView;

/* loaded from: classes2.dex */
public final class fq0 extends ni0 {
    public final kk7 a;
    public final s5a b;
    public final bu6 c;
    public final TextView o;
    public final TextView s0;

    public fq0(Context context) {
        super(context, null, 0);
        kk7 kk7Var = new kk7(null, new x5(19, this), 5);
        this.a = kk7Var;
        s5a s5aVar = new s5a(context);
        float f = 72;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(tu0.G(fk4.d().getDisplayMetrics().density * f), tu0.G(f * fk4.d().getDisplayMetrics().density));
        layoutParams.gravity = 1;
        s5aVar.setLayoutParams(layoutParams);
        this.b = s5aVar;
        bu6 bu6Var = new bu6(context);
        bu6Var.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        this.c = bu6Var;
        TextView textView = new TextView(context);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.gravity = 1;
        layoutParams2.topMargin = tu0.G(24 * fk4.d().getDisplayMetrics().density);
        textView.setLayoutParams(layoutParams2);
        textView.setGravity(1);
        if (bk7.a == null) {
            bk7.a = new bk7();
        }
        textView.setMovementMethod(bk7.a);
        textView.setTransformationMethod(kk7Var);
        i4f.d.b(textView, du4.b);
        this.o = textView;
        TextView textView2 = new TextView(context);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams3.gravity = 1;
        layoutParams3.topMargin = tu0.G(8 * fk4.d().getDisplayMetrics().density);
        textView2.setLayoutParams(layoutParams3);
        textView2.setGravity(1);
        i4f.s.b(textView2, du4.b);
        this.s0 = textView2;
        addView(s5aVar);
        addView(bu6Var);
        addView(textView);
        addView(textView2);
        onThemeChanged(qp4.u0.b(context).i());
    }

    private final void setupWithAvatar(xz4 xz4Var) {
        float f = 24;
        setPadding(tu0.G(fk4.d().getDisplayMetrics().density * f), tu0.G(20 * fk4.d().getDisplayMetrics().density), tu0.G(fk4.d().getDisplayMetrics().density * f), tu0.G(f * fk4.d().getDisplayMetrics().density));
        this.c.setVisibility(8);
        s5a s5aVar = this.b;
        s5aVar.setVisibility(0);
        String str = xz4Var.a;
        Long lValueOf = Long.valueOf(xz4Var.c);
        CharSequence charSequence = xz4Var.b;
        if (charSequence == null) {
            charSequence = "";
        }
        s5a.i(s5aVar, str, lValueOf, charSequence);
    }

    private final void setupWithCustomImage(yt6 yt6Var) {
        float f = 24;
        setPadding(0, 0, 0, tu0.G(fk4.d().getDisplayMetrics().density * f));
        this.o.setPadding(tu0.G(fk4.d().getDisplayMetrics().density * f), 0, tu0.G(f * fk4.d().getDisplayMetrics().density), 0);
        this.b.setVisibility(8);
        bu6 bu6Var = this.c;
        bu6Var.setVisibility(0);
        bu6Var.setImageAttach(yt6Var);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.a.a = null;
    }

    @Override // defpackage.ni0, defpackage.kre
    public final void onThemeChanged(fka fkaVar) {
        super.onThemeChanged(fkaVar);
        this.o.setTextColor(fkaVar.getText().e);
        this.s0.setTextColor(fkaVar.getText().h);
    }

    public final void setLinkListener(hk7 hk7Var) {
        this.a.a = hk7Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.lang.CharSequence] */
    public final void setState(xz4 xz4Var) {
        yt6 yt6Var = xz4Var.d;
        if (yt6Var != null) {
            setupWithCustomImage(yt6Var);
        } else {
            setupWithAvatar(xz4Var);
        }
        CharSequence charSequenceD = xz4Var.e.d(this);
        if (charSequenceD == null) {
            charSequenceD = "";
        }
        this.o.setText(charSequenceD);
        TextView textView = this.s0;
        jqe jqeVar = xz4Var.f;
        CharSequence charSequenceD2 = jqeVar.d(this);
        textView.setVisibility((charSequenceD2 == null || charSequenceD2.length() == 0) ^ true ? 0 : 8);
        ?? D = jqeVar.d(this);
        textView.setText(D != 0 ? D : "");
        this.a.c(charSequenceD);
    }
}
