package defpackage;

import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import java.util.ArrayList;
import one.me.calls.ui.bottomsheet.opponents.CallOpponentsListWidget;
import one.me.sdk.arch.Widget;

/* loaded from: classes.dex */
public final class vf1 implements TextWatcher {
    public final /* synthetic */ int a;
    public Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ vf1(Object obj, int i, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    private final void a(Editable editable) {
    }

    private final void b(Editable editable) {
    }

    private final void c(Editable editable) {
    }

    private final void d(Editable editable) {
    }

    private final void e(Editable editable) {
    }

    private final void f(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void g(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void h(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void i(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void j(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void k(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void l(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void m(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void n(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void o(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void p(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void q(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void r(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void s(int i, int i2, int i3, CharSequence charSequence) {
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        String string;
        Object obj = this.c;
        switch (this.a) {
            case 0:
                CallOpponentsListWidget callOpponentsListWidget = (CallOpponentsListWidget) obj;
                EditText editText = (EditText) this.b;
                if (editable == null || w9e.C0(editable)) {
                    ArrayList arrayList = qqe.a;
                    editText.setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
                } else if (!tpa.f(editText.getCompoundDrawablesRelative()[2], (Drawable) callOpponentsListWidget.X.getValue())) {
                    Drawable drawable = (Drawable) callOpponentsListWidget.X.getValue();
                    ArrayList arrayList2 = qqe.a;
                    editText.setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, (Drawable) null, drawable, (Drawable) null);
                }
                bc7[] bc7VarArr = CallOpponentsListWidget.H0;
                of1 of1VarR0 = callOpponentsListWidget.r0();
                if (editable == null || (string = editable.toString()) == null) {
                    string = "";
                }
                j47.T(of1VarR0.a, ((w9a) of1VarR0.X).e(), null, new mf1(of1VarR0, string, null), 2);
                break;
            case 1:
                ((m56) this.b).invoke(String.valueOf(editable));
                n04 n04Var = (n04) obj;
                n04Var.c.setText(String.valueOf(n04Var.a - (editable != null ? editable.length() : 0)));
                break;
            case 2:
                ((m56) this.b).invoke(String.valueOf(editable));
                xh4 xh4Var = (xh4) obj;
                xh4Var.u0.setText(String.valueOf(xh4Var.getMaxCount() - (editable != null ? editable.length() : 0)));
                break;
            case 3:
            case 4:
            case 5:
            case 6:
                break;
            case 7:
                ((m56) this.b).invoke(((sv8) obj).getText());
                break;
            case 8:
                break;
            default:
                if (((tmd) this.b).H0.isFocused()) {
                    ((m56) obj).invoke(String.valueOf(editable));
                    break;
                }
                break;
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        int i4 = this.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x003f  */
    @Override // android.text.TextWatcher
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onTextChanged(java.lang.CharSequence r5, int r6, int r7, int r8) {
        /*
            Method dump skipped, instructions count: 322
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vf1.onTextChanged(java.lang.CharSequence, int, int, int):void");
    }

    public /* synthetic */ vf1(Widget widget, int i) {
        this.a = i;
        this.c = widget;
    }
}
