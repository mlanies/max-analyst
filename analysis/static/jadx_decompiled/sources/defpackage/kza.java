package defpackage;

import java.util.Set;
import kotlin.coroutines.Continuation;
import one.me.chats.picker.members.PickerMembersListWidget;

/* loaded from: classes.dex */
public final class kza extends ffe implements a66 {
    public final /* synthetic */ PickerMembersListWidget X;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kza(PickerMembersListWidget pickerMembersListWidget, Continuation continuation) {
        super(2, continuation);
        this.X = pickerMembersListWidget;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        kza kzaVar = (kza) n((Set) obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        kzaVar.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new kza(this.X, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        bc7[] bc7VarArr = PickerMembersListWidget.x0;
        this.X.p0().Y();
        return e5f.a;
    }
}
