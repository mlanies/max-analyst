package defpackage;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import kotlin.coroutines.Continuation;
import one.me.chats.list.ChatsListWidget;

/* loaded from: classes.dex */
public final class tx2 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ ChatsListWidget Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tx2(Continuation continuation, ChatsListWidget chatsListWidget) {
        super(2, continuation);
        this.Y = chatsListWidget;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        tx2 tx2Var = (tx2) n(obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        tx2Var.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        tx2 tx2Var = new tx2(continuation, this.Y);
        tx2Var.X = obj;
        return tx2Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        wm9 wm9Var = (wm9) this.X;
        if (wm9Var instanceof vla) {
            gy2 gy2Var = gy2.c;
            long jLongValue = ((Number) ((vla) wm9Var).a).longValue();
            gy2Var.P1().b(":settings/folder/by-chat?id=" + jLongValue, null);
        } else if (wm9Var instanceof yc9) {
            gy2.c.P1().b(ey8.i(((Number) ((yc9) wm9Var).a).longValue(), ":profile/change-owner?chat_id=", "&leave_chat=true"), null);
        } else if (wm9Var instanceof c64) {
            gy2.c.R1((c64) wm9Var);
        } else if (wm9Var instanceof tla) {
            Context context = this.Y.getContext();
            Uri uri = (Uri) ((tla) wm9Var).a;
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.addCategory("android.intent.category.BROWSABLE");
            intent.setData(uri);
            try {
                context.startActivity(intent);
            } catch (ActivityNotFoundException e) {
                e.getMessage();
                uri.toString();
            }
        } else if (wm9Var instanceof a47) {
            gy2.c.P1().c(((m64) ((a47) wm9Var).a).a, null);
        }
        return e5f.a;
    }
}
