package defpackage;

import android.widget.PopupWindow;
import one.me.chats.forward.ForwardPickerScreen;

/* loaded from: classes.dex */
public final /* synthetic */ class m11 implements PopupWindow.OnDismissListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ m11(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        switch (this.a) {
            case 0:
                ((k56) this.b).invoke();
                break;
            case 1:
                pq9 pq9Var = qp4.u0;
                knc kncVar = ((in1) this.b).I0;
                kncVar.setIconTint(pq9Var.p(kncVar).c.getIcon().f);
                kncVar.setMode(fnc.a);
                break;
            case 2:
                ((mn1) this.b).J0 = null;
                break;
            case 3:
                k56 k56Var = ((cu3) this.b).b;
                if (k56Var != null) {
                    k56Var.invoke();
                    break;
                }
                break;
            default:
                ((ForwardPickerScreen) this.b).H0 = null;
                break;
        }
    }
}
