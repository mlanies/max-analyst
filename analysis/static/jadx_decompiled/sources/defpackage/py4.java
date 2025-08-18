package defpackage;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;

/* loaded from: classes2.dex */
public final class py4 implements TextWatcher {
    public final /* synthetic */ int a;
    public boolean b;
    public final Object c;

    public /* synthetic */ py4(int i, Object obj) {
        this.a = i;
        this.c = obj;
    }

    private final void a(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void b(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void c(int i, int i2, int i3, CharSequence charSequence) {
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        c4f[] c4fVarArr;
        Object value;
        q0e q0eVar;
        Object value2;
        int i;
        Object[] spans;
        switch (this.a) {
            case 0:
                if (!TextUtils.isEmpty(editable) && !this.b) {
                    this.b = true;
                    String string = editable.toString();
                    if (!TextUtils.isEmpty(string)) {
                        for (CharSequence charSequence : ((tx4) this.c).c(string)) {
                            int iIndexOf = string.indexOf(charSequence.toString());
                            if (iIndexOf >= 0 && ((c4fVarArr = (c4f[]) editable.getSpans(iIndexOf, charSequence.length() + iIndexOf, c4f.class)) == null || c4fVarArr.length <= 0)) {
                                editable.replace(iIndexOf, charSequence.length() + iIndexOf, charSequence);
                            }
                        }
                    }
                    this.b = false;
                    break;
                }
                break;
            default:
                sv8 sv8Var = (sv8) this.c;
                q0e q0eVar2 = sv8Var.L0;
                do {
                    value = q0eVar2.getValue();
                    ((Number) value).intValue();
                } while (!q0eVar2.c(value, Integer.valueOf(sv8Var.c.getSelectionEnd())));
                do {
                    q0eVar = sv8Var.J0;
                    value2 = q0eVar.getValue();
                    spans = null;
                } while (!q0eVar.c(value2, editable != null ? editable.subSequence(0, editable.length()) : null));
                pq9 pq9Var = qp4.u0;
                if (editable == null || w9e.C0(editable) || !this.b) {
                    sv8Var.k(pq9Var.j(sv8Var));
                }
                if (editable != null) {
                    try {
                        spans = editable.getSpans(0, editable.length(), me.class);
                    } catch (Throwable unused) {
                    }
                    if (spans == null) {
                        spans = new me[0];
                    }
                    for (me meVar : (me[]) spans) {
                        ((ak) meVar).s0.start();
                    }
                    break;
                }
                break;
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        switch (this.a) {
            case 0:
                break;
            default:
                this.b = !(charSequence == null || w9e.C0(charSequence));
                break;
        }
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        int i4 = this.a;
    }
}
