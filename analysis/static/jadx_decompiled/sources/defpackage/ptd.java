package defpackage;

import android.text.Editable;

/* loaded from: classes2.dex */
public final class ptd extends dec implements l17 {
    public final int F0;
    public final g17 G0;
    public final eg3 H0;
    public final /* synthetic */ qtd I0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ptd(qtd qtdVar, int i, g17 g17Var, eg3 eg3Var) {
        super(eg3Var);
        this.I0 = qtdVar;
        this.F0 = i;
        this.G0 = g17Var;
        this.H0 = eg3Var;
    }

    public final String A() {
        Editable text = this.H0.getText();
        String string = text != null ? text.toString() : null;
        return string == null ? "" : string;
    }

    public final void B(String str) {
        eg3 eg3Var = this.H0;
        eg3Var.setText(str);
        eg3Var.setSelection(eg3Var.length());
    }
}
