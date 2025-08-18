package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.coroutines.Continuation;
import one.me.chats.picker.contacts.PickerContactsListWidget;

/* loaded from: classes.dex */
public final class zya extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ PickerContactsListWidget Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zya(PickerContactsListWidget pickerContactsListWidget, Continuation continuation) {
        super(2, continuation);
        this.Y = pickerContactsListWidget;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        zya zyaVar = (zya) n((String) obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        zyaVar.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        zya zyaVar = new zya(this.Y, continuation);
        zyaVar.X = obj;
        return zyaVar;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        boolean zC0 = w9e.C0((String) this.X);
        PickerContactsListWidget pickerContactsListWidget = this.Y;
        if (zC0) {
            bc7[] bc7VarArr = PickerContactsListWidget.y0;
            hdc adapter = pickerContactsListWidget.o0().getAdapter();
            nd3 nd3Var = pickerContactsListWidget.s0;
            if (!tpa.f(adapter, nd3Var)) {
                dle dleVar = pickerContactsListWidget.v0;
                if (dleVar != null) {
                    dleVar.B(pickerContactsListWidget.o0());
                }
                pickerContactsListWidget.o0().setAdapter(nd3Var);
                pickerContactsListWidget.v0 = z7.m(pickerContactsListWidget.o0());
                RecyclerView recyclerViewO0 = pickerContactsListWidget.o0();
                bo6 bo6Var = pickerContactsListWidget.w0;
                if (bo6Var != null) {
                    recyclerViewO0.p0(bo6Var);
                }
                pickerContactsListWidget.w0 = null;
                h8e h8eVar = pickerContactsListWidget.x0;
                if (h8eVar != null) {
                    recyclerViewO0.p0(h8eVar);
                }
                pickerContactsListWidget.x0 = null;
                pickerContactsListWidget.m0(pickerContactsListWidget.o0());
            }
        } else {
            bc7[] bc7VarArr2 = PickerContactsListWidget.y0;
            hdc adapter2 = pickerContactsListWidget.o0().getAdapter();
            nxa nxaVar = pickerContactsListWidget.Y;
            if (!tpa.f(adapter2, nxaVar)) {
                dle dleVar2 = pickerContactsListWidget.v0;
                if (dleVar2 != null) {
                    dleVar2.B(pickerContactsListWidget.o0());
                }
                pickerContactsListWidget.o0().setAdapter(nxaVar);
                pickerContactsListWidget.v0 = z7.m(pickerContactsListWidget.o0());
                RecyclerView recyclerViewO02 = pickerContactsListWidget.o0();
                bo6 bo6Var2 = pickerContactsListWidget.w0;
                if (bo6Var2 != null) {
                    recyclerViewO02.p0(bo6Var2);
                }
                pickerContactsListWidget.w0 = null;
                h8e h8eVar2 = pickerContactsListWidget.x0;
                if (h8eVar2 != null) {
                    recyclerViewO02.p0(h8eVar2);
                }
                pickerContactsListWidget.x0 = null;
            }
        }
        return e5f.a;
    }
}
