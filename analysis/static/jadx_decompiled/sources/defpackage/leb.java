package defpackage;

import kotlin.coroutines.Continuation;
import one.me.profileedit.screens.adminpermissions.ProfileEditAdminPermissionsWidget;
import one.me.sdk.uikit.common.button.OneMeButton;

/* loaded from: classes2.dex */
public final class leb extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ ProfileEditAdminPermissionsWidget Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public leb(Continuation continuation, ProfileEditAdminPermissionsWidget profileEditAdminPermissionsWidget) {
        super(2, continuation);
        this.Y = profileEditAdminPermissionsWidget;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        leb lebVar = (leb) n(obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        lebVar.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        leb lebVar = new leb(continuation, this.Y);
        lebVar.X = obj;
        return lebVar;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        vdb vdbVar = (vdb) this.X;
        ProfileEditAdminPermissionsWidget profileEditAdminPermissionsWidget = this.Y;
        gic gicVar = profileEditAdminPermissionsWidget.u0;
        if (gicVar.a()) {
            ((OneMeButton) gicVar.getValue()).setVisibility(vdbVar.b ? 0 : 8);
            profileEditAdminPermissionsWidget.p0();
        }
        profileEditAdminPermissionsWidget.Z.E(vdbVar.a);
        return e5f.a;
    }
}
