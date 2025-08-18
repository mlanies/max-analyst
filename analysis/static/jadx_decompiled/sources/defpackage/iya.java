package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;
import one.me.chats.picker.chats.PickerChatsListWidget;

/* loaded from: classes.dex */
public final class iya extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ PickerChatsListWidget Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iya(Continuation continuation, PickerChatsListWidget pickerChatsListWidget) {
        super(2, continuation);
        this.Y = pickerChatsListWidget;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        iya iyaVar = (iya) n(obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        iyaVar.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        iya iyaVar = new iya(continuation, this.Y);
        iyaVar.X = obj;
        return iyaVar;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        List list = (List) this.X;
        PickerChatsListWidget pickerChatsListWidget = this.Y;
        boolean zN0 = PickerChatsListWidget.n0(pickerChatsListWidget);
        pickerChatsListWidget.x0.E(list);
        if (pickerChatsListWidget.getView() != null) {
            pickerChatsListWidget.p0().setRefreshingNext(zN0);
        }
        return e5f.a;
    }
}
