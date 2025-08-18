package defpackage;

import android.content.Context;
import android.text.InputFilter;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class pl2 extends kgb {
    public final cka F0;
    public final je7 G0;

    public pl2(Context context) {
        LinearLayout linearLayout = new LinearLayout(context);
        super(linearLayout);
        cka ckaVar = new cka(context);
        ckaVar.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        ckaVar.setBackgroundColorAttr(Integer.valueOf(wfa.N));
        ckaVar.setHintColorAttr(wfa.X);
        ckaVar.setClipToOutline(true);
        ckaVar.setOutlineProvider(new ix3(tu0.G(16 * fk4.d().getDisplayMetrics().density)));
        this.F0 = ckaVar;
        this.G0 = tu0.r(3, new a5(context, 26));
        linearLayout.setOrientation(1);
        linearLayout.setGravity(16);
        linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        linearLayout.addView(ckaVar);
        linearLayout.setBackground(null);
        v3c.y(new xh0(this, (Continuation) null, 2), linearLayout);
    }

    @Override // defpackage.hqd
    public final void A(ol7 ol7Var) {
        ol2 ol2Var = (ol2) ol7Var;
        CharSequence charSequenceA = ol2Var.b.a(this);
        if (charSequenceA == null) {
            charSequenceA = "";
        }
        String string = charSequenceA.toString();
        cka ckaVar = this.F0;
        ckaVar.setHint(string);
        ckaVar.setFilters(new InputFilter[]{new InputFilter.LengthFilter(ol2Var.o)});
        String str = ol2Var.a;
        if (str != null) {
            ckaVar.setText(str);
        }
        E(ol2Var.c);
    }

    public final void E(a73 a73Var) {
        je7 je7Var = this.G0;
        if (je7Var.a() || a73Var != null) {
            TextView textView = (TextView) je7Var.getValue();
            textView.setVisibility(a73Var != null ? 0 : 8);
            textView.setText(a73Var != null ? a73Var.a(textView.getContext()) : null);
            ay7.b((ViewGroup) this.a, textView, -1);
        }
    }
}
