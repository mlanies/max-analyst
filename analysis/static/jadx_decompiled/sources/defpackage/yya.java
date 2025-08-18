package defpackage;

import java.util.Set;
import kotlin.coroutines.Continuation;
import one.me.chats.picker.contacts.PickerContactsListWidget;

/* loaded from: classes.dex */
public final class yya extends ffe implements a66 {
    public final /* synthetic */ PickerContactsListWidget X;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yya(PickerContactsListWidget pickerContactsListWidget, Continuation continuation) {
        super(2, continuation);
        this.X = pickerContactsListWidget;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        yya yyaVar = (yya) n((Set) obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        yyaVar.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new yya(this.X, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        bc7[] bc7VarArr = PickerContactsListWidget.y0;
        PickerContactsListWidget pickerContactsListWidget = this.X;
        kp.x(pickerContactsListWidget.o0(), new xya(pickerContactsListWidget.o0(), 0));
        return e5f.a;
    }
}
