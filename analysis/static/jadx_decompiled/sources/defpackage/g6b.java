package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.text.TextUtils;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatTextView;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class g6b extends FrameLayout {
    public final boolean a;
    public Integer b;
    public AppCompatTextView c;
    public ImageView o;

    public g6b(Context context, boolean z) {
        super(context);
        this.a = z;
        setMinimumHeight(tu0.G(48 * fk4.d().getDisplayMetrics().density));
        v3c.y(new br(3, (Continuation) null, 13), this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final fka getCurrentTheme() {
        boolean z = this.a;
        pq9 pq9Var = qp4.u0;
        return z ? pq9Var.p(this).c : pq9Var.j(this);
    }

    public final void b(Integer num, Integer num2) {
        if (num != null) {
            int iIntValue = num.intValue();
            ImageView imageView = new ImageView(getContext());
            imageView.setImageResource(iIntValue);
            imageView.setImageTintList(ColorStateList.valueOf(getCurrentTheme().c(num2 != null ? num2.intValue() : wfa.Q)));
            v3c.y(new r1b(this, (Continuation) null, 1), imageView);
            this.o = imageView;
            float f = 24;
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(tu0.G(fk4.d().getDisplayMetrics().density * f), tu0.G(f * fk4.d().getDisplayMetrics().density));
            layoutParams.gravity = 8388627;
            layoutParams.setMarginStart(tu0.G(12 * fk4.d().getDisplayMetrics().density));
            addView(this.o, layoutParams);
        }
    }

    public final void c(g6b g6bVar, jqe jqeVar, Integer num, boolean z, boolean z2) {
        Continuation continuation = null;
        AppCompatTextView appCompatTextView = new AppCompatTextView(g6bVar.getContext(), null);
        i4f.l.b(appCompatTextView, du4.b);
        appCompatTextView.setMaxLines(2);
        appCompatTextView.setEllipsize(TextUtils.TruncateAt.END);
        appCompatTextView.setText(jqeVar.b(appCompatTextView.getContext()));
        int iIntValue = num != null ? num.intValue() : wfa.Q;
        this.b = Integer.valueOf(iIntValue);
        appCompatTextView.setTextColor(getCurrentTheme().c(iIntValue));
        v3c.y(new r1b(this, continuation, 2), appCompatTextView);
        this.c = appCompatTextView;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 8388627;
        layoutParams.setMarginStart((z || z2) ? tu0.G(48 * fk4.d().getDisplayMetrics().density) : tu0.G(12 * fk4.d().getDisplayMetrics().density));
        layoutParams.setMarginEnd(tu0.G(12 * fk4.d().getDisplayMetrics().density));
        float f = 4;
        layoutParams.topMargin = tu0.G(fk4.d().getDisplayMetrics().density * f);
        layoutParams.bottomMargin = tu0.G(f * fk4.d().getDisplayMetrics().density);
        g6bVar.addView(this.c, layoutParams);
    }
}
