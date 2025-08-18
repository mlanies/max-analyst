package defpackage;

import android.content.Context;
import android.content.Intent;
import kotlin.coroutines.Continuation;
import one.me.profile.screens.invite.ProfileInviteScreen;
import org.apache.http.protocol.HTTP;

/* loaded from: classes2.dex */
public final class uhb extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ ProfileInviteScreen Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uhb(ProfileInviteScreen profileInviteScreen, Continuation continuation) {
        super(2, continuation);
        this.Y = profileInviteScreen;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        uhb uhbVar = (uhb) n((wm9) obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        uhbVar.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        uhb uhbVar = new uhb(this.Y, continuation);
        uhbVar.X = obj;
        return uhbVar;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        wm9 wm9Var = (wm9) this.X;
        boolean z = wm9Var instanceof qhb;
        ProfileInviteScreen profileInviteScreen = this.Y;
        if (z) {
            Intent intent = new Intent();
            intent.setAction("android.intent.action.SEND");
            intent.putExtra("android.intent.extra.TEXT", ((qhb) wm9Var).b);
            intent.setType(HTTP.PLAIN_TEXT_TYPE);
            coc cocVar = (coc) x53.q0(profileInviteScreen.getRouter().e());
            ckb.c.P1().b(":chats/share", dy7.g(new kpa("oneme:share:data", intent), new kpa("tag", cocVar != null ? cocVar.b : null)));
        } else if (wm9Var instanceof rhb) {
            String str = o37.a;
            Context context = profileInviteScreen.getContext();
            CharSequence charSequenceB = ((rhb) wm9Var).b.b(profileInviteScreen.getContext());
            if (charSequenceB == null) {
                charSequenceB = "";
            }
            o37.d(context, charSequenceB, null);
        } else if (wm9Var instanceof c64) {
            ckb.c.R1((c64) wm9Var);
        } else if (wm9Var instanceof g43) {
            profileInviteScreen.getRouter().B(profileInviteScreen);
        }
        return e5f.a;
    }
}
