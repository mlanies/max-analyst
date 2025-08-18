package defpackage;

import android.view.View;
import android.view.ViewGroup;
import java.util.List;
import kotlin.coroutines.Continuation;
import one.me.chats.picker.contacts.PickerContactsListWidget;

/* loaded from: classes.dex */
public final class wya extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ PickerContactsListWidget Y;
    public final /* synthetic */ View Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wya(Continuation continuation, PickerContactsListWidget pickerContactsListWidget, View view) {
        super(2, continuation);
        this.Y = pickerContactsListWidget;
        this.Z = view;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        wya wyaVar = (wya) n(obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        wyaVar.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        wya wyaVar = new wya(continuation, this.Y, this.Z);
        wyaVar.X = obj;
        return wyaVar;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        List list = (List) this.X;
        PickerContactsListWidget pickerContactsListWidget = this.Y;
        pickerContactsListWidget.Y.E(list);
        boolean z = !w9e.C0((CharSequence) pickerContactsListWidget.n0().u0.a.getValue());
        qm0 qm0Var = pickerContactsListWidget.t0;
        if (z) {
            View view = this.Z;
            ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
            if (viewGroup != null) {
                ay7.b(viewGroup, (View) qm0Var.getValue(), -1);
            }
            pickerContactsListWidget.o0().setVisibility((list == null || (list.isEmpty() ^ true)) ? 0 : 4);
            ((aba) qm0Var.getValue()).setVisibility((list == null || !list.isEmpty()) ? 4 : 0);
        } else {
            pickerContactsListWidget.o0().setVisibility(0);
            ((aba) qm0Var.getValue()).setVisibility(4);
        }
        return e5f.a;
    }
}
