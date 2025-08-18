package defpackage;

import kotlin.coroutines.Continuation;
import one.me.startconversation.chattitleicon.ChatTitleIconScreen;

/* loaded from: classes2.dex */
public final class yr2 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ ChatTitleIconScreen Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yr2(Continuation continuation, ChatTitleIconScreen chatTitleIconScreen) {
        super(2, continuation);
        this.Y = chatTitleIconScreen;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        yr2 yr2Var = (yr2) n(obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        yr2Var.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        yr2 yr2Var = new yr2(continuation, this.Y);
        yr2Var.X = obj;
        return yr2Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        String str;
        od2.a0(obj);
        ds2 ds2Var = (ds2) this.X;
        String str2 = ds2Var.b;
        if (str2 == null || w9e.C0(str2)) {
            str = ds2Var.a;
            if (str == null || w9e.C0(str)) {
                str = null;
            }
        } else {
            str = ds2Var.b;
        }
        s5a s5aVarN0 = ChatTitleIconScreen.n0(this.Y);
        s5aVarN0.setAvatarUrl(str);
        s5aVarN0.setCloseBadgeVisibility(!(str == null || str.length() == 0));
        return e5f.a;
    }
}
