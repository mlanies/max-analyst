package defpackage;

import android.view.View;
import android.view.ViewGroup;
import java.util.List;
import kotlin.coroutines.Continuation;
import one.me.chats.picker.chats.PickerChatsListWidget;

/* loaded from: classes.dex */
public final class jya extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ PickerChatsListWidget Y;
    public final /* synthetic */ View Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jya(Continuation continuation, PickerChatsListWidget pickerChatsListWidget, View view) {
        super(2, continuation);
        this.Y = pickerChatsListWidget;
        this.Z = view;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        jya jyaVar = (jya) n(obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        jyaVar.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        jya jyaVar = new jya(continuation, this.Y, this.Z);
        jyaVar.X = obj;
        return jyaVar;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        List list = (List) this.X;
        PickerChatsListWidget pickerChatsListWidget = this.Y;
        pickerChatsListWidget.y0.E(list);
        if (pickerChatsListWidget.getView() != null) {
            pickerChatsListWidget.p0().setRefreshingNext(false);
        }
        if (tpa.f(pickerChatsListWidget.b, "all.chat.folder")) {
            View view = this.Z;
            ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
            qm0 qm0Var = pickerChatsListWidget.z0;
            if (viewGroup != null) {
                ay7.b(viewGroup, (View) qm0Var.getValue(), -1);
            }
            pickerChatsListWidget.p0().setVisibility((list == null || (list.isEmpty() ^ true)) ? 0 : 4);
            ((aba) qm0Var.getValue()).setVisibility((list == null || !list.isEmpty()) ? 4 : 0);
        }
        return e5f.a;
    }
}
