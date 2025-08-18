package defpackage;

import java.util.Set;
import kotlin.coroutines.Continuation;
import one.me.chats.picker.chats.PickerChatsListWidget;

/* loaded from: classes.dex */
public final class kya extends ffe implements a66 {
    public final /* synthetic */ PickerChatsListWidget X;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kya(Continuation continuation, PickerChatsListWidget pickerChatsListWidget) {
        super(2, continuation);
        this.X = pickerChatsListWidget;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        kya kyaVar = (kya) n((Set) obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        kyaVar.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new kya(continuation, this.X);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        bc7[] bc7VarArr = PickerChatsListWidget.C0;
        this.X.p0().Y();
        return e5f.a;
    }
}
