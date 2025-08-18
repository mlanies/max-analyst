package defpackage;

import kotlin.coroutines.Continuation;
import one.me.contactlist.ContactListWidget;

/* loaded from: classes.dex */
public final class zo3 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ ContactListWidget Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zo3(ContactListWidget contactListWidget, Continuation continuation) {
        super(2, continuation);
        this.Y = contactListWidget;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        zo3 zo3Var = (zo3) n((jqe) obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        zo3Var.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        zo3 zo3Var = new zo3(this.Y, continuation);
        zo3Var.X = obj;
        return zo3Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        jqe jqeVar = (jqe) this.X;
        ContactListWidget contactListWidget = this.Y;
        CharSequence charSequenceB = jqeVar.b(contactListWidget.getContext());
        String string = charSequenceB != null ? charSequenceB.toString() : null;
        if (string == null) {
            string = "";
        }
        eha searchView = contactListWidget.o0().getSearchView();
        if (searchView != null) {
            searchView.setSearchHint(string);
        }
        return e5f.a;
    }
}
