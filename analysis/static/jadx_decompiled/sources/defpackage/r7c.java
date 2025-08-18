package defpackage;

import android.widget.FrameLayout;
import android.widget.TextView;

/* loaded from: classes2.dex */
public final class r7c extends c8e implements kre {
    public final TextView o;

    public r7c(FrameLayout frameLayout) {
        super(frameLayout);
        TextView textView = (TextView) frameLayout.getChildAt(0);
        this.o = textView;
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        int iG = tu0.G(4 * fk4.d().getDisplayMetrics().density);
        layoutParams.topMargin = iG;
        layoutParams.bottomMargin = iG;
        textView.setLayoutParams(layoutParams);
        textView.setTextAlignment(4);
        i4f.o.b(textView, du4.b);
        int iG2 = tu0.G(2 * fk4.d().getDisplayMetrics().density);
        int iG3 = tu0.G(12 * fk4.d().getDisplayMetrics().density);
        textView.setPadding(iG3, iG2, iG3, iG2);
        onThemeChanged(qp4.u0.j(textView));
    }

    @Override // defpackage.kre
    public final void onThemeChanged(fka fkaVar) {
        this.o.setTextColor(fkaVar.getText().i);
        this.a.setBackgroundColor(fkaVar.b().g);
    }
}
