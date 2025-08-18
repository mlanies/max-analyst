package defpackage;

import kotlin.coroutines.Continuation;
import one.me.profileedit.screens.adminpermissions.ProfileEditAdminPermissionsWidget;

/* loaded from: classes2.dex */
public final class jeb extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ ProfileEditAdminPermissionsWidget Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jeb(Continuation continuation, ProfileEditAdminPermissionsWidget profileEditAdminPermissionsWidget) {
        super(2, continuation);
        this.Y = profileEditAdminPermissionsWidget;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        jeb jebVar = (jeb) n(obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        jebVar.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        jeb jebVar = new jeb(continuation, this.Y);
        jebVar.X = obj;
        return jebVar;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        wm9 wm9Var = (wm9) this.X;
        if (wm9Var instanceof qdb) {
            gfb.c.P1().b(ey8.i(((qdb) wm9Var).b, ":chats?id=", "&type=local"), null);
        } else if (wm9Var instanceof g43) {
            uu3 uu3Var = this.Y;
            mr0.G(uu3Var);
            uu3Var.getRouter().B(uu3Var);
        } else if (wm9Var instanceof c64) {
            gfb.c.R1((c64) wm9Var);
        }
        return e5f.a;
    }
}
