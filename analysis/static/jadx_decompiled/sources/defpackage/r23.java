package defpackage;

import android.content.Context;
import android.graphics.drawable.RippleDrawable;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.appcompat.widget.AppCompatTextView;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public final class r23 extends hdc {
    public final sme X;
    public final bk4 Y;
    public final List Z;
    public final Context o;

    public r23(Context context, ArrayList arrayList) {
        this.o = context;
        this.Z = arrayList;
        khe kheVar = sme.a0;
        this.X = fm9.R(context);
        this.Y = bk4.b();
    }

    @Override // defpackage.hdc
    public final int j() {
        return this.Z.size();
    }

    @Override // defpackage.hdc
    public final void r(dec decVar, int i) {
        q23 q23Var = (q23) decVar;
        iw0 iw0Var = (iw0) this.Z.get(i);
        p23 p23Var = new p23(this, i, iw0Var, 0);
        boolean z = iw0Var.d;
        AppCompatCheckBox appCompatCheckBox = q23Var.F0;
        appCompatCheckBox.setChecked(z);
        q23Var.G0.setText(iw0Var.a);
        q23Var.H0.setText(iw0Var.c);
        q23Var.a.setOnClickListener(new tb(q23Var, 17, p23Var));
        appCompatCheckBox.setOnClickListener(p23Var);
    }

    @Override // defpackage.hdc
    public final dec t(ViewGroup viewGroup, int i) {
        Context context = this.o;
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setLayoutParams(new pdc(-1, -2));
        sme smeVar = this.X;
        RippleDrawable rippleDrawableL = hm9.L(0, smeVar.i);
        linearLayout.setWeightSum(1.0f);
        linearLayout.setBackground(rippleDrawableL);
        c54.c(linearLayout);
        bk4 bk4Var = this.Y;
        j47.q(linearLayout, bk4Var.m);
        j47.p(linearLayout, bk4Var.r);
        j47.o(linearLayout, bk4Var.j);
        j47.r(linearLayout, bk4Var.j);
        AppCompatCheckBox appCompatCheckBox = new AppCompatCheckBox(context, null);
        kqe kqeVar = i4f.l;
        kqeVar.b(appCompatCheckBox, du4.b);
        int i2 = smeVar.k;
        appCompatCheckBox.setHighlightColor(i2);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -1);
        layoutParams.gravity = 16;
        c54.c(appCompatCheckBox);
        j47.p(appCompatCheckBox, bk4Var.d);
        linearLayout.addView(appCompatCheckBox, layoutParams);
        AppCompatTextView appCompatTextView = new AppCompatTextView(context, null);
        appCompatTextView.setTextColor(smeVar.F);
        kqeVar.b(appCompatTextView, du4.b);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        appCompatTextView.setEllipsize(truncateAt);
        appCompatTextView.setSingleLine(true);
        appCompatTextView.setLines(1);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams2.weight = 1.0f;
        layoutParams2.gravity = 8388627;
        c54.c(appCompatTextView);
        appCompatTextView.setTextAlignment(5);
        linearLayout.addView(appCompatTextView, layoutParams2);
        AppCompatTextView appCompatTextView2 = new AppCompatTextView(context, null);
        appCompatTextView2.setTextColor(i2);
        kqeVar.b(appCompatTextView2, du4.b);
        appCompatTextView2.setEllipsize(truncateAt);
        appCompatTextView2.setSingleLine(true);
        appCompatTextView2.setLines(1);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams3.gravity = 8388627;
        c54.c(appCompatCheckBox);
        appCompatTextView.setTextAlignment(5);
        linearLayout.addView(appCompatTextView2, layoutParams3);
        return new q23(linearLayout, appCompatCheckBox, appCompatTextView, appCompatTextView2);
    }
}
