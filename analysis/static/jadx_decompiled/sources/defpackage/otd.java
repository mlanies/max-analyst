package defpackage;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import java.util.Iterator;

/* loaded from: classes2.dex */
public final class otd implements TextWatcher {
    public final /* synthetic */ ptd a;
    public final /* synthetic */ int b;

    public otd(ptd ptdVar, int i) {
        this.a = ptdVar;
        this.b = i;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        fg3 fg3Var;
        l17 l17VarH0;
        int length = charSequence != null ? charSequence.length() : 0;
        String string = charSequence != null ? charSequence.subSequence(i, i3 + i).toString() : null;
        String strG = "";
        if (string == null) {
            string = "";
        }
        int i4 = this.b;
        ptd ptdVar = this.a;
        if (length == 2 && string.length() == 1) {
            jg3 jg3Var = (jg3) ptdVar.G0;
            if (jg3Var.I0(i4) && string.length() == 1) {
                l17 l17VarH02 = jg3Var.H0(i4);
                if (l17VarH02 != null) {
                    ((ptd) l17VarH02).B(string);
                }
                l17 l17VarH03 = jg3Var.H0(i4 + 1);
                if (l17VarH03 != null) {
                    ((ptd) l17VarH03).H0.requestFocus();
                    return;
                }
                return;
            }
            return;
        }
        if (length > 1) {
            ((jg3) ptdVar.G0).J0(i4, String.valueOf(charSequence));
            return;
        }
        g17 g17Var = ptdVar.G0;
        String strValueOf = String.valueOf(charSequence);
        jg3 jg3Var2 = (jg3) g17Var;
        if (jg3Var2.I0(i4) && strValueOf.length() == 1) {
            if (i4 < jg3Var2.getCountCells() - 1 && (l17VarH0 = jg3Var2.H0(i4 + 1)) != null) {
                ((ptd) l17VarH0).H0.requestFocus();
            }
            Iterator it = jg3.G0(jg3Var2).iterator();
            while (it.hasNext()) {
                strG = au1.g(strG, ((ptd) ((l17) it.next())).A());
            }
            if (strG.length() <= 0 || strG.length() != jg3Var2.getCountCells() || !TextUtils.isDigitsOnly(strG) || (fg3Var = jg3Var2.W1) == null) {
                return;
            }
            fg3Var.e(strG);
        }
    }
}
