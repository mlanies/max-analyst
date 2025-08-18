package defpackage;

import kotlin.coroutines.Continuation;
import one.me.chats.picker.chats.PickerChatsListWidget;

/* loaded from: classes.dex */
public final class lya extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ PickerChatsListWidget Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lya(Continuation continuation, PickerChatsListWidget pickerChatsListWidget) {
        super(2, continuation);
        this.Y = pickerChatsListWidget;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        lya lyaVar = (lya) n((String) obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        lyaVar.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        lya lyaVar = new lya(continuation, this.Y);
        lyaVar.X = obj;
        return lyaVar;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        String str = (String) this.X;
        PickerChatsListWidget pickerChatsListWidget = this.Y;
        hdc hdcVar = (hdc) pickerChatsListWidget.w0.C().get(0);
        boolean zC0 = w9e.C0(str);
        nxa nxaVar = pickerChatsListWidget.y0;
        nxa nxaVar2 = pickerChatsListWidget.x0;
        nd3 nd3Var = pickerChatsListWidget.w0;
        if (zC0) {
            if (!tpa.f(hdcVar, nxaVar2)) {
                dle dleVar = pickerChatsListWidget.s0;
                if (dleVar != null) {
                    dleVar.B(pickerChatsListWidget.p0());
                }
                nd3Var.E(nxaVar);
                nd3Var.o.a(0, nxaVar2);
                pickerChatsListWidget.p0().setRefreshingNext(PickerChatsListWidget.n0(pickerChatsListWidget));
                pickerChatsListWidget.s0 = z7.m(pickerChatsListWidget.p0());
            }
        } else if (!tpa.f(hdcVar, nxaVar)) {
            dle dleVar2 = pickerChatsListWidget.s0;
            if (dleVar2 != null) {
                dleVar2.B(pickerChatsListWidget.p0());
            }
            nd3Var.E(nxaVar2);
            nd3Var.o.a(0, nxaVar);
            pickerChatsListWidget.p0().setRefreshingNext(PickerChatsListWidget.n0(pickerChatsListWidget));
            pickerChatsListWidget.s0 = z7.m(pickerChatsListWidget.p0());
        }
        return e5f.a;
    }
}
