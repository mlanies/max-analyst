package defpackage;

import android.view.View;
import android.view.ViewGroup;
import java.util.List;
import kotlin.coroutines.Continuation;
import one.me.chats.picker.members.PickerMembersListWidget;

/* loaded from: classes.dex */
public final class jza extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ PickerMembersListWidget Y;
    public final /* synthetic */ View Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jza(Continuation continuation, PickerMembersListWidget pickerMembersListWidget, View view) {
        super(2, continuation);
        this.Y = pickerMembersListWidget;
        this.Z = view;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        jza jzaVar = (jza) n(obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        jzaVar.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        jza jzaVar = new jza(continuation, this.Y, this.Z);
        jzaVar.X = obj;
        return jzaVar;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        List list = (List) this.X;
        PickerMembersListWidget pickerMembersListWidget = this.Y;
        pickerMembersListWidget.Z.E(list);
        View view = this.Z;
        ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
        qm0 qm0Var = pickerMembersListWidget.s0;
        if (viewGroup != null) {
            ay7.b(viewGroup, (View) qm0Var.getValue(), -1);
        }
        pickerMembersListWidget.p0().setVisibility((list == null || (list.isEmpty() ^ true)) ? 0 : 4);
        ((aba) qm0Var.getValue()).setVisibility((list == null || !list.isEmpty()) ? 4 : 0);
        return e5f.a;
    }
}
