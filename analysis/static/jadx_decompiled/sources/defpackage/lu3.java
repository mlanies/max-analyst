package defpackage;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.Spannable;
import android.view.View;
import android.widget.TextView;
import java.util.List;
import one.me.messages.list.loader.MessageModel;

/* loaded from: classes2.dex */
public final class lu3 extends qy8 {
    public ey1 I0;

    @Override // defpackage.qy8
    public final void E(MessageModel messageModel, List list) {
        this.H0 = new ry8(messageModel.I0);
        View view = this.a;
        pw8 pw8Var = messageModel.y0;
        if (pw8Var == null || pw8Var.a <= 0) {
            ((TextView) view).setOnClickListener(null);
        } else {
            tu0.K(view, 300L, new tb(this, 26, pw8Var));
        }
        CharSequence charSequence = messageModel.o;
        Spannable spannable = charSequence instanceof Spannable ? (Spannable) charSequence : null;
        if (spannable != null) {
            al3[] al3VarArr = (al3[]) spannable.getSpans(0, spannable.length(), al3.class);
            if (al3VarArr != null) {
                for (al3 al3Var : al3VarArr) {
                    al3Var.b = new v02(26, this);
                }
            }
        }
        ((TextView) view).setText(charSequence);
        F(messageModel, view);
    }

    @Override // defpackage.mr2
    public final void e(v83 v83Var) {
        TextView textView = (TextView) this.a;
        textView.setTextColor(v83Var.g.a);
        Drawable background = textView.getBackground();
        GradientDrawable gradientDrawable = background instanceof GradientDrawable ? (GradientDrawable) background : null;
        if (gradientDrawable != null) {
            gradientDrawable.setColors(v83Var.b.v);
        }
    }
}
