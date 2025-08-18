package defpackage;

import java.util.Collections;
import java.util.List;
import kotlin.coroutines.Continuation;
import one.me.chats.search.ChatsListSearchScreen;

/* loaded from: classes.dex */
public final class dv2 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ ChatsListSearchScreen Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dv2(Continuation continuation, ChatsListSearchScreen chatsListSearchScreen) {
        super(2, continuation);
        this.Y = chatsListSearchScreen;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        dv2 dv2Var = (dv2) n(obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        dv2Var.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        dv2 dv2Var = new dv2(continuation, this.Y);
        dv2Var.X = obj;
        return dv2Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        ov2 ov2Var = (ov2) this.X;
        ChatsListSearchScreen chatsListSearchScreen = this.Y;
        bc7[] bc7VarArr = ChatsListSearchScreen.J0;
        chatsListSearchScreen.getClass();
        String name = ChatsListSearchScreen.class.getName();
        ir6 ir6Var = hm9.m;
        if (ir6Var != null && ir6Var.c()) {
            ir6Var.d(us7.X, name, "updateState " + ov2Var, null);
        }
        int iOrdinal = ov2Var.a.ordinal();
        nz4 nz4Var = nz4.a;
        if (iOrdinal == 0) {
            chatsListSearchScreen.m0();
            chatsListSearchScreen.A0.E(nz4Var);
            chatsListSearchScreen.C0.E(nz4Var);
            chatsListSearchScreen.B0.E(Collections.singletonList(ro7.a));
        } else if (iOrdinal != 2) {
            wuc wucVar = wuc.CHATS_LIST_SEARCH_RESULT;
            if (iOrdinal == 3) {
                List list = ov2Var.d;
                boolean z = ov2Var.e;
                chatsListSearchScreen.B0.E(nz4Var);
                chatsListSearchScreen.m0();
                chatsListSearchScreen.C0.E(nz4Var);
                chatsListSearchScreen.A0.F(list, new u60(z, chatsListSearchScreen, 8));
                an9.g((an9) chatsListSearchScreen.b.getValue(), wucVar);
            } else if (iOrdinal == 4) {
                chatsListSearchScreen.B0.E(nz4Var);
                chatsListSearchScreen.m0();
                chatsListSearchScreen.A0.E(nz4Var);
                chatsListSearchScreen.C0.F(Collections.singletonList(uz4.a), new cu1(13, chatsListSearchScreen));
                an9.g((an9) chatsListSearchScreen.b.getValue(), wucVar);
            }
        } else {
            it6 it6Var = ov2Var.c;
            boolean z2 = ov2Var.e;
            chatsListSearchScreen.B0.E(nz4Var);
            chatsListSearchScreen.A0.E(nz4Var);
            chatsListSearchScreen.C0.E(nz4Var);
            String name2 = ChatsListSearchScreen.class.getName();
            ir6 ir6Var2 = hm9.m;
            if (ir6Var2 != null && ir6Var2.c()) {
                ir6Var2.d(us7.X, name2, "idleSearchData.recentContacts = ".concat(x53.n0(it6Var.a, null, null, null, null, 63)), null);
            }
            chatsListSearchScreen.v0.F(Collections.singletonList(it6Var.a), new av2(z2, chatsListSearchScreen, it6Var));
            an9.g((an9) chatsListSearchScreen.b.getValue(), wuc.CHATS_LIST_SEARCH_INITIAL);
        }
        return e5f.a;
    }
}
