package defpackage;

import one.me.messages.list.ui.MessagesListWidget;
import one.me.pinbars.PinBarsWidget;
import one.me.profile.screens.members.ChatMembersScreen;

/* loaded from: classes2.dex */
public final class qk2 implements k56 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ qk2(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.k56
    public final Object invoke() {
        e5f e5fVar = e5f.a;
        Object obj = this.b;
        switch (this.a) {
            case 0:
                bc7[] bc7VarArr = ChatMembersScreen.u0;
                ((ChatMembersScreen) obj).o0().q();
                return e5fVar;
            case 1:
                return (ft2) obj;
            case 2:
                return (Boolean) ((jg3) obj).Y1.invoke();
            case 3:
                return Class.forName((String) obj);
            case 4:
                bc7[] bc7VarArr2 = MessagesListWidget.X0;
                n59 n59VarX0 = ((MessagesListWidget) obj).x0();
                z2e z2eVar = (z2e) n59VarX0.A1.getValue();
                if (z2eVar != null) {
                    ((s8g) n59VarX0.T0.getValue()).a(new v8d(new u8d(n59VarX0.b.a, z2eVar.a, 1)));
                }
                xx6 xx6Var = (xx6) o19.a.getAccessor().e();
                if (xx6Var != null) {
                    xx6Var.f(bcd.a0(new wx6(ux6.b, 1), new wx6(ux6.Y, 1)), wuc.CHAT);
                }
                return e5fVar;
            default:
                return qp4.u0.o(((PinBarsWidget) obj).getContext()).c;
        }
    }
}
