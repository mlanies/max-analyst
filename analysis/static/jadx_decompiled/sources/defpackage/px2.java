package defpackage;

import one.me.chats.list.ChatsListWidget;
import one.me.contactlist.ContactListWidget;

/* loaded from: classes.dex */
public final /* synthetic */ class px2 implements xha {
    public final /* synthetic */ int a;
    public final /* synthetic */ dnd b;

    public /* synthetic */ px2(dnd dndVar, int i) {
        this.a = i;
        this.b = dndVar;
    }

    @Override // defpackage.xha
    public final void I(yha yhaVar) {
        dnd dndVar = this.b;
        switch (this.a) {
            case 0:
                bc7[] bc7VarArr = ChatsListWidget.M0;
                dndVar.b.invoke(yhaVar);
                break;
            default:
                bc7[] bc7VarArr2 = ContactListWidget.P0;
                dndVar.b.invoke(yhaVar);
                break;
        }
    }
}
