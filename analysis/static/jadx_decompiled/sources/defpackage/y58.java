package defpackage;

import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import one.me.chatscreen.mediabar.MediaBarWidget;

/* loaded from: classes.dex */
public final class y58 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ MediaBarWidget Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y58(Continuation continuation, MediaBarWidget mediaBarWidget) {
        super(2, continuation);
        this.Y = mediaBarWidget;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        y58 y58Var = (y58) n(obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        y58Var.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        y58 y58Var = new y58(continuation, this.Y);
        y58Var.X = obj;
        return y58Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        String string;
        od2.a0(obj);
        i3d i3dVar = (i3d) this.X;
        boolean z = i3dVar instanceof h3d;
        MediaBarWidget mediaBarWidget = this.Y;
        if (z) {
            bc7[] bc7VarArr = MediaBarWidget.d1;
            mediaBarWidget.z0().setVisibility(8);
        } else if (i3dVar instanceof f3d) {
            mediaBarWidget.G0 = ((f3d) i3dVar).a;
            MediaBarWidget.o0(mediaBarWidget);
            mediaBarWidget.A0().setDropdownRotationProgress(r4.a / 512.0f);
        } else if (i3dVar instanceof g3d) {
            bc7[] bc7VarArr2 = MediaBarWidget.d1;
            s86 s86VarU0 = mediaBarWidget.u0();
            g3d g3dVar = (g3d) i3dVar;
            b86 b86Var = g3dVar.a;
            s86VarU0.getClass();
            pnf.o(s86VarU0.o, new i86(b86Var));
            n3 n3VarC = g3dVar.a.a.c();
            if (n3VarC instanceof q76) {
                string = mediaBarWidget.getContext().getString(((q76) n3VarC).a);
            } else {
                if (!(n3VarC instanceof r76)) {
                    throw new NoWhenBranchMatchedException();
                }
                string = ((r76) n3VarC).a;
            }
            mediaBarWidget.A0().setTitle(string);
        }
        return e5f.a;
    }
}
