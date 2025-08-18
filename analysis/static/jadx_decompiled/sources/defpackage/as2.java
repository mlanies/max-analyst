package defpackage;

import one.me.startconversation.chattitleicon.ChatTitleIconScreen;

/* loaded from: classes2.dex */
public final class as2 implements m56 {
    public final /* synthetic */ int a;
    public final /* synthetic */ wm9 b;

    public /* synthetic */ as2(ChatTitleIconScreen chatTitleIconScreen, wm9 wm9Var, int i) {
        this.a = i;
        this.b = wm9Var;
    }

    @Override // defpackage.m56
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                syd sydVar = (syd) obj;
                sydVar.a2();
                sydVar.R1(sydVar.Z1(((rr2) this.b).b));
                break;
            case 1:
                syd sydVar2 = (syd) obj;
                sydVar2.a2();
                sydVar2.P1().b(ey8.i(((qr2) this.b).b, ":profile/edit/link?id=", "&type=local_chat&flow=create"), null);
                break;
            default:
                syd sydVar3 = (syd) obj;
                sydVar3.a2();
                sydVar3.P1().b(ey8.h(((pr2) this.b).b, ":start-conversation/add-subscribers?id="), null);
                break;
        }
        return e5f.a;
    }
}
