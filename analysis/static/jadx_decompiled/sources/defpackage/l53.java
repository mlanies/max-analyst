package defpackage;

import android.content.Context;
import android.view.View;
import one.me.messages.list.loader.MessageModel;

/* loaded from: classes2.dex */
public final class l53 extends ht8 {
    public final /* synthetic */ int T0;
    public final m56 U0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l53(Context context, om8 om8Var, int i) {
        super(context, new k53(context));
        this.T0 = i;
        switch (i) {
            case 1:
                super(context, new q53(context));
                this.U0 = om8Var;
                break;
            case 2:
                super(context, new xqd(context));
                this.U0 = om8Var;
                break;
            case 3:
                super(context, new zqd(context));
                this.U0 = om8Var;
                break;
            default:
                this.U0 = om8Var;
                break;
        }
    }

    @Override // defpackage.ht8
    public final void L(MessageModel messageModel) {
        switch (this.T0) {
            case 0:
                o00 o00Var = messageModel.u0.d;
                f53 f53Var = o00Var instanceof f53 ? (f53) o00Var : null;
                if (f53Var != null) {
                    k53 k53Var = (k53) this.I0;
                    k53Var.setModel(f53Var);
                    k53Var.setOnFinalImageSetCallback(new lr1(this, f53Var, messageModel, 2));
                    break;
                }
                break;
            case 1:
                o00 o00Var2 = messageModel.u0.d;
                f53 f53Var2 = o00Var2 instanceof f53 ? (f53) o00Var2 : null;
                if (f53Var2 != null) {
                    q53 q53Var = (q53) this.I0;
                    q53Var.setModel(f53Var2);
                    q53Var.setOnFinalImageSetCallback(new lr1(this, f53Var2, messageModel, 3));
                    break;
                }
                break;
            case 2:
                o00 o00Var3 = messageModel.u0.d;
                vqd vqdVar = o00Var3 instanceof vqd ? (vqd) o00Var3 : null;
                if (vqdVar != null) {
                    View view = this.I0;
                    ((xqd) view).setModel(vqdVar);
                    ((xqd) view).x0.setOnFinalImageSetCallback(new a81(this, vqdVar, messageModel, 10));
                    break;
                }
                break;
            default:
                o00 o00Var4 = messageModel.u0.d;
                vqd vqdVar2 = o00Var4 instanceof vqd ? (vqd) o00Var4 : null;
                if (vqdVar2 != null) {
                    zqd zqdVar = (zqd) this.I0;
                    zqdVar.setModel(vqdVar2);
                    zqdVar.D0.setOnFinalImageSetCallback(new a81(this, vqdVar2, messageModel, 11));
                    break;
                }
                break;
        }
    }

    @Override // defpackage.ht8
    public void M(is0 is0Var) {
        switch (this.T0) {
            case 1:
                ((q53) this.I0).x(is0Var);
                break;
            case 3:
                ((zqd) this.I0).x(is0Var);
                break;
        }
    }

    @Override // defpackage.ht8
    public final void O(v83 v83Var) {
        switch (this.T0) {
            case 0:
                k53 k53Var = (k53) this.I0;
                k53Var.setDateTextColor(v83Var.g.a);
                k53Var.w0.f();
                break;
            case 1:
                ((q53) this.I0).C0.f();
                break;
            case 2:
                ((xqd) this.I0).setDateTextColor(v83Var.g.a);
                break;
            default:
                zqd zqdVar = (zqd) this.I0;
                if (!zqdVar.w()) {
                    zqdVar.getDate$message_list_release().setTextColor$message_list_release(v83Var.g.a);
                    break;
                }
                break;
        }
    }
}
