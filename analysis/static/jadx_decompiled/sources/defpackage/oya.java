package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;
import one.me.chats.picker.chats.PickerChatsTabWidget;

/* loaded from: classes.dex */
public final class oya extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ PickerChatsTabWidget Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oya(PickerChatsTabWidget pickerChatsTabWidget, Continuation continuation) {
        super(2, continuation);
        this.Y = pickerChatsTabWidget;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        oya oyaVar = (oya) n((List) obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        oyaVar.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        oya oyaVar = new oya(this.Y, continuation);
        oyaVar.X = obj;
        return oyaVar;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        List list = (List) this.X;
        PickerChatsTabWidget pickerChatsTabWidget = this.Y;
        pickerChatsTabWidget.u0.g(list);
        pickerChatsTabWidget.w0.M(list);
        return e5f.a;
    }
}
