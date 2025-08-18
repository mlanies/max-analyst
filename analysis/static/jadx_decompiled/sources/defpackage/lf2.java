package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.RippleDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;

/* loaded from: classes2.dex */
public final class lf2 extends ConstraintLayout implements kre {
    public final TextView G0;
    public final TextView H0;
    public final TextView I0;
    public final s5a J0;
    public final LinearLayout K0;

    public lf2(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TextView textView = new TextView(context);
        ti3 ti3Var = new ti3(-1, -2);
        float f = 4;
        ((ViewGroup.MarginLayoutParams) ti3Var).bottomMargin = tu0.G(fk4.d().getDisplayMetrics().density * f);
        textView.setLayoutParams(ti3Var);
        i4f.j.b(textView, du4.b);
        textView.setSingleLine(true);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        this.G0 = textView;
        TextView textView2 = new TextView(context);
        ti3 ti3Var2 = new ti3(-1, -2);
        ((ViewGroup.MarginLayoutParams) ti3Var2).bottomMargin = tu0.G(f * fk4.d().getDisplayMetrics().density);
        textView2.setLayoutParams(ti3Var2);
        kqe kqeVar = i4f.n;
        kqeVar.b(textView2, du4.b);
        textView2.setMaxLines(2);
        textView2.setEllipsize(truncateAt);
        textView2.setVisibility(8);
        this.H0 = textView2;
        TextView textView3 = new TextView(context);
        textView3.setLayoutParams(new ti3(-1, -2));
        kqeVar.b(textView3, du4.b);
        textView3.setSingleLine(true);
        textView3.setEllipsize(truncateAt);
        pq9 pq9Var = qp4.u0;
        textView3.setBackground(new RippleDrawable(ColorStateList.valueOf(pq9Var.j(textView3).d().a.a.h), null, new ColorDrawable(-1)));
        this.I0 = textView3;
        s5a s5aVar = new s5a(context);
        s5aVar.setId(wea.j0);
        float f2 = 48;
        s5aVar.setLayoutParams(new ti3(tu0.G(fk4.d().getDisplayMetrics().density * f2), tu0.G(f2 * fk4.d().getDisplayMetrics().density)));
        s5aVar.setAvatarShape(l5a.a);
        this.J0 = s5aVar;
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setId(wea.i0);
        linearLayout.setLayoutParams(new ti3(0, -2));
        linearLayout.setOrientation(1);
        linearLayout.addView(textView);
        linearLayout.addView(textView2);
        linearLayout.addView(textView3);
        this.K0 = linearLayout;
        setLayoutParams(new ti3(-1, -2));
        int iG = tu0.G(12 * fk4.d().getDisplayMetrics().density);
        setPadding(iG, iG, iG, iG);
        setBackground(new RippleDrawable(ColorStateList.valueOf(pq9Var.j(this).d().a.a.h), null, new ColorDrawable(-1)));
        addView(s5aVar);
        addView(linearLayout);
        onThemeChanged(pq9Var.j(this));
    }

    @Override // defpackage.kre
    public final void onThemeChanged(fka fkaVar) {
        this.G0.setTextColor(fkaVar.getText().e);
        this.H0.setTextColor(fkaVar.getText().g);
        this.I0.setTextColor(fkaVar.getText().j);
        this.J0.onThemeChanged(fkaVar);
    }

    public final void setLink(CharSequence charSequence) {
        this.I0.setText(charSequence);
    }

    public final void setLinkOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.I0.setOnLongClickListener(onLongClickListener);
    }

    public final void setLinkPhoto(String str) {
        uc0 uc0VarA = oag.a(this.G0.getText(), 9223372036854775806L);
        s5a s5aVar = this.J0;
        s5aVar.setAvatarUrl(str);
        s5aVar.g(uc0VarA, false);
        dj3 dj3VarQ = fp3.q(this);
        int id = s5aVar.getId();
        dj3VarQ.d(id, 6, 0, 6);
        dj3VarQ.d(id, 3, 0, 3);
        dj3VarQ.d(id, 4, 0, 4);
        int id2 = this.K0.getId();
        dj3VarQ.d(id2, 3, 0, 3);
        dj3VarQ.d(id2, 4, 0, 4);
        dj3VarQ.d(id2, 7, 0, 7);
        dj3VarQ.d(id2, 6, s5aVar.getId(), 7);
        new l2a(dj3VarQ, 6, id2, 4).e(tu0.G(12 * fk4.d().getDisplayMetrics().density));
        dj3VarQ.a(this);
    }

    public final void setOnLinkClickListener(View.OnClickListener onClickListener) {
        tu0.K(this.I0, 300L, onClickListener);
    }

    public final void setSubtitle(CharSequence charSequence) {
        TextView textView = this.H0;
        textView.setVisibility(true ^ (charSequence == null || charSequence.length() == 0) ? 0 : 8);
        textView.setText(charSequence);
    }

    public final void setTitle(CharSequence charSequence) {
        this.G0.setText(charSequence);
    }
}
