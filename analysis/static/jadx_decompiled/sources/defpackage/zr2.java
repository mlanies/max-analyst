package defpackage;

import android.content.ActivityNotFoundException;
import kotlin.coroutines.Continuation;
import one.me.startconversation.chattitleicon.ChatTitleIconScreen;

/* loaded from: classes2.dex */
public final class zr2 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ ChatTitleIconScreen Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zr2(Continuation continuation, ChatTitleIconScreen chatTitleIconScreen) {
        super(2, continuation);
        this.Y = chatTitleIconScreen;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        zr2 zr2Var = (zr2) n(obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        zr2Var.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        zr2 zr2Var = new zr2(continuation, this.Y);
        zr2Var.X = obj;
        return zr2Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        int i = 1;
        int i2 = 0;
        od2.a0(obj);
        wm9 wm9Var = (wm9) this.X;
        boolean z = wm9Var instanceof or2;
        ChatTitleIconScreen chatTitleIconScreen = this.Y;
        if (z) {
            mr0.G(chatTitleIconScreen);
            chatTitleIconScreen.startActivityForResult(((or2) wm9Var).b, 666);
        } else if (wm9Var instanceof sr2) {
            mr0.G(chatTitleIconScreen);
            try {
                chatTitleIconScreen.startActivityForResult(((sr2) wm9Var).b, 777);
                an9.g((an9) chatTitleIconScreen.s0.getValue(), wuc.AVATAR_PICKER_CAMERA);
            } catch (ActivityNotFoundException unused) {
                bc7[] bc7VarArr = ChatTitleIconScreen.z0;
                chatTitleIconScreen.r0().t();
                hm9.p(ChatTitleIconScreen.class.getName(), "failed open camera", null);
            }
        } else if (wm9Var instanceof rr2) {
            bc7[] bc7VarArr2 = ChatTitleIconScreen.z0;
            chatTitleIconScreen.p0().setProgressEnabled(false);
            syd.c.b2(new as2(chatTitleIconScreen, wm9Var, i2));
        } else if (wm9Var instanceof qr2) {
            bc7[] bc7VarArr3 = ChatTitleIconScreen.z0;
            chatTitleIconScreen.p0().setProgressEnabled(false);
            syd.c.b2(new as2(chatTitleIconScreen, wm9Var, i));
        } else if (wm9Var instanceof pr2) {
            bc7[] bc7VarArr4 = ChatTitleIconScreen.z0;
            chatTitleIconScreen.p0().setProgressEnabled(false);
            syd.c.b2(new as2(chatTitleIconScreen, wm9Var, 2));
        } else if (tpa.f(wm9Var, tr2.b)) {
            bc7[] bc7VarArr5 = ChatTitleIconScreen.z0;
            ((eua) chatTitleIconScreen.Z.getValue()).g(new l5g(chatTitleIconScreen, 1));
        }
        return e5f.a;
    }
}
