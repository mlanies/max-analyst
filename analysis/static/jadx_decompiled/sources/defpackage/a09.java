package defpackage;

import android.view.View;
import kotlin.NoWhenBranchMatchedException;
import one.me.sdk.messagewrite.MessageWriteWidget;

/* loaded from: classes2.dex */
public final /* synthetic */ class a09 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ MessageWriteWidget b;

    public /* synthetic */ a09(MessageWriteWidget messageWriteWidget, int i) {
        this.a = i;
        this.b = messageWriteWidget;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        MessageWriteWidget messageWriteWidget = this.b;
        switch (this.a) {
            case 0:
                int i = messageWriteWidget.E0;
                if (i == 0) {
                    return;
                }
                xz8 xz8VarV0 = messageWriteWidget.v0();
                CharSequence charSequence = (CharSequence) messageWriteWidget.q0().getMessageState().getValue();
                Integer num = (Integer) messageWriteWidget.q0().getMessagePosition().getValue();
                xz8VarV0.getClass();
                int iS = au1.s(i);
                if (iS == 0) {
                    xz8.C(xz8VarV0, null, null, null, 14);
                    return;
                }
                if (iS == 1) {
                    xz8VarV0.P0.m(null, new bz8(charSequence, num));
                    xz8VarV0.D(null);
                    return;
                } else {
                    if (iS != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    pnf.o(xz8VarV0.z0, new iz8());
                    return;
                }
            default:
                bc7[] bc7VarArr = MessageWriteWidget.F0;
                messageWriteWidget.X.f.k = messageWriteWidget.q0().getText();
                xz8 xz8VarV02 = messageWriteWidget.v0();
                pnf.o(xz8VarV02.z0, jz8.a);
                return;
        }
    }
}
