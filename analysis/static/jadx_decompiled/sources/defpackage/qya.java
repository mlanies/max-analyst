package defpackage;

import kotlin.coroutines.Continuation;
import one.me.chats.picker.chats.PickerChatsTabWidget;

/* loaded from: classes.dex */
public final class qya extends ffe implements a66 {
    public /* synthetic */ boolean X;
    public final /* synthetic */ PickerChatsTabWidget Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qya(PickerChatsTabWidget pickerChatsTabWidget, Continuation continuation) {
        super(2, continuation);
        this.Y = pickerChatsTabWidget;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        qya qyaVar = (qya) n(bool, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        qyaVar.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        qya qyaVar = new qya(this.Y, continuation);
        qyaVar.X = ((Boolean) obj).booleanValue();
        return qyaVar;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        boolean z = this.X;
        PickerChatsTabWidget pickerChatsTabWidget = this.Y;
        if (z) {
            bc7[] bc7VarArr = PickerChatsTabWidget.y0;
            if (pickerChatsTabWidget.n0().getCurrentItem() != 0) {
                pickerChatsTabWidget.n0().e(0, false);
            }
        }
        bc7[] bc7VarArr2 = PickerChatsTabWidget.y0;
        pickerChatsTabWidget.n0().setUserInputEnabled(!z);
        c2f.a(pickerChatsTabWidget.m0(), pickerChatsTabWidget.x0);
        pickerChatsTabWidget.m0().setVisibility(z ^ true ? 0 : 8);
        return e5f.a;
    }
}
