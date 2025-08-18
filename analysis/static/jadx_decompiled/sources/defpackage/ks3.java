package defpackage;

import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;

/* loaded from: classes.dex */
public final class ks3 extends c8e implements kre {
    public final TextView o;

    public ks3(AppCompatTextView appCompatTextView) {
        super(appCompatTextView);
        this.o = appCompatTextView;
        appCompatTextView.setLayoutParams(new pdc(-1, tu0.G(40 * fk4.d().getDisplayMetrics().density)));
        appCompatTextView.setGravity(16);
        float f = 12;
        appCompatTextView.setPadding(tu0.G(fk4.d().getDisplayMetrics().density * f), 0, tu0.G(f * fk4.d().getDisplayMetrics().density), 0);
        onThemeChanged(qp4.u0.j(appCompatTextView));
    }

    @Override // defpackage.kre
    public final void onThemeChanged(fka fkaVar) {
        kqe kqeVar = i4f.r;
        TextView textView = this.o;
        kqeVar.b(textView, du4.b);
        textView.setTextColor(fkaVar.getText().i);
        textView.setBackgroundColor(fkaVar.b().k);
    }
}
