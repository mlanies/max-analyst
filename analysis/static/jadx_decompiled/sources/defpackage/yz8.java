package defpackage;

import android.view.ViewGroup;
import kotlin.coroutines.Continuation;
import one.me.sdk.messagewrite.MessageWriteWidget;

/* loaded from: classes2.dex */
public final /* synthetic */ class yz8 implements k56 {
    public final /* synthetic */ int a;
    public final /* synthetic */ MessageWriteWidget b;

    public /* synthetic */ yz8(MessageWriteWidget messageWriteWidget, int i) {
        this.a = i;
        this.b = messageWriteWidget;
    }

    @Override // defpackage.k56
    public final Object invoke() {
        int i = 3;
        int i2 = 0;
        pq9 pq9Var = qp4.u0;
        MessageWriteWidget messageWriteWidget = this.b;
        switch (this.a) {
            case 0:
                break;
            case 1:
                bc7[] bc7VarArr = MessageWriteWidget.F0;
                csb csbVar = new csb(messageWriteWidget.getContext());
                csbVar.setLayoutParams(new ViewGroup.LayoutParams(-1, tu0.G(52 * fk4.d().getDisplayMetrics().density)));
                csbVar.setEndIconDrawable(kt3.b(csbVar.getContext(), woc.v));
                csbVar.setEndIconClickListener(new a09(messageWriteWidget, i2));
                v3c.y(new br(i, (Continuation) null, 10), csbVar);
                if (csbVar.isLaidOut() && !csbVar.isLayoutRequested()) {
                    if (qqe.c(csbVar.getTitleView())) {
                        MessageWriteWidget.B0(csbVar, true);
                        break;
                    }
                } else {
                    csbVar.addOnLayoutChangeListener(new hp1(csbVar, i, messageWriteWidget));
                    break;
                }
                break;
            case 2:
                bc7[] bc7VarArr2 = MessageWriteWidget.F0;
                break;
            default:
                bc7[] bc7VarArr3 = MessageWriteWidget.F0;
                break;
        }
        return pq9Var.o(messageWriteWidget.getContext()).c;
    }
}
