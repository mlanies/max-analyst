package defpackage;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.appcompat.widget.AppCompatTextView;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class ae7 extends kgb {
    public final AppCompatEditText F0;
    public final je7 G0;

    public ae7(Context context) {
        LinearLayout linearLayout = new LinearLayout(context);
        super(linearLayout);
        AppCompatEditText appCompatEditText = new AppCompatEditText(context, null);
        appCompatEditText.setId(rwb.profile_edit_last_name_field);
        appCompatEditText.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        float f = 12;
        float f2 = 16;
        appCompatEditText.setPaddingRelative(tu0.G(fk4.d().getDisplayMetrics().density * f), tu0.G(fk4.d().getDisplayMetrics().density * f2), tu0.G(f * fk4.d().getDisplayMetrics().density), tu0.G(fk4.d().getDisplayMetrics().density * f2));
        appCompatEditText.setSingleLine(true);
        i4f.l.b(appCompatEditText, du4.b);
        appCompatEditText.setHint(appCompatEditText.getResources().getText(vea.k0));
        appCompatEditText.setClipToOutline(true);
        appCompatEditText.setOutlineProvider(new ix3(tu0.G(f2 * fk4.d().getDisplayMetrics().density)));
        appCompatEditText.setInputType(appCompatEditText.getInputType() | 16384);
        this.F0 = appCompatEditText;
        this.G0 = tu0.r(3, new hy4(context, 11));
        linearLayout.setOrientation(1);
        linearLayout.setGravity(16);
        linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        linearLayout.addView(appCompatEditText);
        v3c.y(new xh0(this, (Continuation) null, 16), linearLayout);
    }

    @Override // defpackage.hqd
    public final void A(ol7 ol7Var) {
        zd7 zd7Var = (zd7) ol7Var;
        String str = zd7Var.a;
        if (str != null) {
            this.F0.setText(str);
        }
        E(zd7Var.b);
    }

    public final void E(a73 a73Var) {
        je7 je7Var = this.G0;
        if (je7Var.a() || a73Var != null) {
            AppCompatTextView appCompatTextView = (AppCompatTextView) je7Var.getValue();
            appCompatTextView.setVisibility(a73Var != null ? 0 : 8);
            appCompatTextView.setText(a73Var != null ? a73Var.a(appCompatTextView.getContext()) : null);
            ay7.b((ViewGroup) this.a, appCompatTextView, null);
        }
    }
}
