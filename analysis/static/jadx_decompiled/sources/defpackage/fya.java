package defpackage;

import one.me.chats.picker.chats.PickerChatsListWidget;
import one.me.sdk.lists.widgets.EndlessRecyclerView2;

/* loaded from: classes.dex */
public final /* synthetic */ class fya implements k56 {
    public final /* synthetic */ int a;
    public final /* synthetic */ PickerChatsListWidget b;

    public /* synthetic */ fya(PickerChatsListWidget pickerChatsListWidget, int i) {
        this.a = i;
        this.b = pickerChatsListWidget;
    }

    @Override // defpackage.k56
    public final Object invoke() {
        int i = 17;
        PickerChatsListWidget pickerChatsListWidget = this.b;
        switch (this.a) {
            case 0:
                bc7[] bc7VarArr = PickerChatsListWidget.C0;
                s4a s4aVar = new s4a(17);
                ys2 ys2Var = ys2.a;
                vu2 vu2Var = new vu2(s4aVar, ys2Var.getAccessor().d(q33.class), ys2Var.getAccessor().d(y7d.class), ys2Var.getAccessor().d(qe5.class), ys2Var.getAccessor().d(w7b.class), ys2Var.getAccessor().d(lr2.class), ys2Var.getAccessor().d(kr2.class));
                khe kheVar = new khe(new s4a(18));
                q33 q33Var = (q33) ys2Var.getAccessor().c(q33.class);
                kke kkeVar = (kke) ys2Var.getAccessor().c(kke.class);
                v07 v07Var = new v07(vu2Var);
                qn3 qn3Var = (qn3) ys2Var.getAccessor().c(qn3.class);
                khe kheVarD = ys2Var.getAccessor().d(yx7.class);
                pu2 pu2VarA = ((rt2) ys2Var.getAccessor().c(rt2.class)).a(pickerChatsListWidget.b);
                bc7 bc7Var = PickerChatsListWidget.C0[0];
                return new eya(pickerChatsListWidget.b, pu2VarA, qn3Var, q33Var, new fya(pickerChatsListWidget, 4), (oa2) pickerChatsListWidget.c.a(pickerChatsListWidget), kkeVar, kheVarD, v07Var, kheVar);
            case 1:
                bc7[] bc7VarArr2 = PickerChatsListWidget.C0;
                aba abaVar = new aba(pickerChatsListWidget.getContext(), null);
                abaVar.setIcon(woc.O0);
                abaVar.setTitle(new eqe(yoc.d));
                abaVar.setSubtitle(new eqe(yoc.c));
                return abaVar;
            case 2:
                bc7[] bc7VarArr3 = PickerChatsListWidget.C0;
                EndlessRecyclerView2 endlessRecyclerView2 = new EndlessRecyclerView2(pickerChatsListWidget.getContext(), null, 6);
                endlessRecyclerView2.setId(p8a.k);
                endlessRecyclerView2.setClipChildren(false);
                endlessRecyclerView2.setClipToPadding(false);
                endlessRecyclerView2.setClipToOutline(false);
                return endlessRecyclerView2;
            case 3:
                bc7[] bc7VarArr4 = PickerChatsListWidget.C0;
                return new c03(new fya(pickerChatsListWidget, 5), new wz7(i, pickerChatsListWidget), new gya(pickerChatsListWidget, 0), new gya(pickerChatsListWidget, 1));
            case 4:
                bc7 bc7Var2 = PickerChatsListWidget.C0[1];
                return Boolean.valueOf(((Boolean) pickerChatsListWidget.o.a(pickerChatsListWidget)).booleanValue() && tpa.f(pickerChatsListWidget.b, "all.chat.folder"));
            default:
                bc7[] bc7VarArr5 = PickerChatsListWidget.C0;
                return a14.m(pickerChatsListWidget.getContext());
        }
    }
}
