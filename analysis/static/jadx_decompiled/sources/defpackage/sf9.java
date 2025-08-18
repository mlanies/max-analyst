package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.List;

/* loaded from: classes.dex */
public final class sf9 extends ConstraintLayout {
    public final yia G0;
    public final TextView H0;
    public final TextView I0;

    public sf9(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        yia yiaVar = new yia(context);
        yiaVar.setId(y7a.S1);
        float f = 40;
        yiaVar.setAvatarSize(tu0.G(fk4.d().getDisplayMetrics().density * f));
        this.G0 = yiaVar;
        TextView textView = new TextView(context);
        textView.setId(y7a.V1);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        pq9 pq9Var = qp4.u0;
        textView.setTextColor(pq9Var.p(textView).c.getText().e);
        i4f.j.b(textView, du4.b);
        textView.setSingleLine();
        this.H0 = textView;
        TextView textView2 = new TextView(context);
        textView2.setId(y7a.U1);
        textView2.setEllipsize(truncateAt);
        textView2.setSingleLine();
        textView2.setTextColor(pq9Var.p(textView2).c.getText().g);
        i4f.m.b(textView2, du4.b);
        this.I0 = textView2;
        ImageView imageView = new ImageView(context);
        imageView.setId(y7a.T1);
        imageView.setImageResource(woc.G0);
        int iG = tu0.G(2 * fk4.d().getDisplayMetrics().density);
        imageView.setPadding(iG, iG, iG, iG);
        imageView.setImageTintList(ColorStateList.valueOf(pq9Var.p(imageView).c.getIcon().j));
        float f2 = 12;
        float f3 = 6;
        setPadding(tu0.G(fk4.d().getDisplayMetrics().density * f2), tu0.G(fk4.d().getDisplayMetrics().density * f3), tu0.G(fk4.d().getDisplayMetrics().density * f2), tu0.G(f3 * fk4.d().getDisplayMetrics().density));
        addView(yiaVar, new ti3(tu0.G(fk4.d().getDisplayMetrics().density * f), tu0.G(f * fk4.d().getDisplayMetrics().density)));
        addView(textView, new ti3(-2, -2));
        addView(textView2, new ti3(-2, -2));
        float f4 = 24;
        addView(imageView, new ti3(tu0.G(fk4.d().getDisplayMetrics().density * f4), tu0.G(f4 * fk4.d().getDisplayMetrics().density)));
        setLayoutParams(new ti3(-1, tu0.G(60 * fk4.d().getDisplayMetrics().density)));
        dj3 dj3VarQ = fp3.q(this);
        int id = yiaVar.getId();
        dj3VarQ.d(id, 4, 0, 4);
        dj3VarQ.d(id, 6, 0, 6);
        dj3VarQ.d(id, 3, 0, 3);
        dj3VarQ.g(id).d.w = 0.0f;
        int id2 = textView.getId();
        dj3VarQ.d(id2, 3, 0, 3);
        dj3VarQ.d(id2, 6, yiaVar.getId(), 7);
        new l2a(dj3VarQ, 6, id2, 4).e(tu0.G(f2 * fk4.d().getDisplayMetrics().density));
        dj3VarQ.d(id2, 4, textView2.getId(), 3);
        dj3VarQ.d(id2, 7, imageView.getId(), 6);
        dj3VarQ.g(id2).d.w = 0.0f;
        dj3VarQ.g(id2).d.l0 = true;
        int id3 = textView2.getId();
        dj3VarQ.d(id3, 3, textView.getId(), 4);
        dj3VarQ.d(id3, 6, textView.getId(), 6);
        dj3VarQ.d(id3, 7, textView.getId(), 7);
        dj3VarQ.d(id3, 4, 0, 4);
        dj3VarQ.g(id3).d.w = 0.0f;
        dj3VarQ.g(id3).d.W = 2;
        int id4 = imageView.getId();
        dj3VarQ.d(id4, 3, 0, 3);
        dj3VarQ.d(id4, 4, 0, 4);
        dj3VarQ.d(id4, 7, 0, 7);
        dj3VarQ.a(this);
    }

    public final void setAvatars(List<kpa> list) {
        this.G0.setAvatars(list);
    }

    public final void setMessage(jqe jqeVar) {
        this.I0.setText(jqeVar != null ? jqeVar.b(getContext()) : null);
    }

    public final void setName(jqe jqeVar) {
        this.H0.setText(jqeVar != null ? jqeVar.b(getContext()) : null);
    }
}
