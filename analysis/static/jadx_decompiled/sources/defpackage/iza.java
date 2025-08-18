package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;
import one.me.chats.picker.members.PickerMembersListWidget;

/* loaded from: classes.dex */
public final class iza extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ PickerMembersListWidget Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iza(PickerMembersListWidget pickerMembersListWidget, Continuation continuation) {
        super(2, continuation);
        this.Y = pickerMembersListWidget;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        iza izaVar = (iza) n((List) obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        izaVar.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        iza izaVar = new iza(this.Y, continuation);
        izaVar.X = obj;
        return izaVar;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        this.Y.Y.E((List) this.X);
        return e5f.a;
    }
}
