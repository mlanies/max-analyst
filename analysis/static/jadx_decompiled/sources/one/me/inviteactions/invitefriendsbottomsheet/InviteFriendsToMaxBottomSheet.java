package one.me.inviteactions.invitefriendsbottomsheet;

import android.annotation.SuppressLint;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import defpackage.au1;
import defpackage.bc7;
import defpackage.c57;
import defpackage.dj3;
import defpackage.du4;
import defpackage.f7a;
import defpackage.fk4;
import defpackage.fp3;
import defpackage.fs;
import defpackage.gca;
import defpackage.h67;
import defpackage.hca;
import defpackage.i4f;
import defpackage.i67;
import defpackage.je7;
import defpackage.l2a;
import defpackage.l67;
import defpackage.m57;
import defpackage.mqd;
import defpackage.nec;
import defpackage.nj4;
import defpackage.oi9;
import defpackage.q33;
import defpackage.qp4;
import defpackage.rh4;
import defpackage.tu0;
import defpackage.v3c;
import defpackage.w4d;
import defpackage.x77;
import defpackage.xx5;
import defpackage.y7d;
import defpackage.yoc;
import kotlin.Metadata;
import one.me.rlottie.RLottieDrawable;
import one.me.rlottie.RLottieFactory;
import one.me.rlottie.RLottieImageView;
import one.me.rlottie.RLottieImageViewUtils;
import one.me.sdk.bottomsheet.BottomSheetWidget;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lone/me/inviteactions/invitefriendsbottomsheet/InviteFriendsToMaxBottomSheet;", "Lone/me/sdk/bottomsheet/BottomSheetWidget;", "<init>", "()V", "invite-actions_release"}, k = 1, mv = {2, 0, 0})
@SuppressLint({"ValidController"})
/* loaded from: classes2.dex */
public final class InviteFriendsToMaxBottomSheet extends BottomSheetWidget {
    public static final /* synthetic */ bc7[] E0 = {new oi9(InviteFriendsToMaxBottomSheet.class, "inviteFriendsJob", "getInviteFriendsJob()Lkotlinx/coroutines/Job;"), rh4.g(nec.a, InviteFriendsToMaxBottomSheet.class, "isCurrentAnimationDark", "isCurrentAnimationDark()Z")};
    public final je7 A0;
    public final je7 B0;
    public final w4d C0;
    public final fs D0;
    public final je7 y0;
    public final je7 z0;

    public InviteFriendsToMaxBottomSheet() {
        super(null, 1, null);
        c57 c57Var = c57.a;
        this.y0 = c57Var.getAccessor().d(q33.class);
        this.z0 = c57Var.getAccessor().d(y7d.class);
        this.A0 = c57Var.getAccessor().d(l67.class);
        je7 je7VarCreateViewModelLazy = createViewModelLazy(h67.class, new nj4(12, new m57(3)));
        this.B0 = je7VarCreateViewModelLazy;
        this.C0 = mqd.D();
        this.D0 = new fs(Boolean.class, "is_current_animation_dark");
        ((h67) je7VarCreateViewModelLazy.getValue()).getClass();
    }

    public final RLottieDrawable A0() {
        boolean zJ = qp4.u0.b(getContext()).j();
        bc7 bc7Var = E0[1];
        this.D0.b(this, Boolean.valueOf(zJ));
        return RLottieFactory.createByAsset$default(getContext(), B0() ? "invite_friends_dark.json" : "invite_friends_light.json", null, tu0.G(248 * fk4.d().getDisplayMetrics().density), tu0.G(80 * fk4.d().getDisplayMetrics().density), false, false, false, false, false, 900, null);
    }

    public final boolean B0() {
        bc7 bc7Var = E0[1];
        return ((Boolean) this.D0.a(this)).booleanValue();
    }

    @Override // one.me.sdk.bottomsheet.BottomSheetWidget, one.me.sdk.bottomsheet.BaseBottomSheetWidget, defpackage.uu3
    public final void onDestroyView(View view) {
        super.onDestroyView(view);
        x77 x77Var = (x77) this.C0.T0(this, E0[0]);
        if (x77Var != null) {
            x77Var.cancel(null);
        }
    }

    @Override // one.me.sdk.bottomsheet.BottomSheetWidget
    public final View x0(LayoutInflater layoutInflater, FrameLayout frameLayout) throws InterruptedException {
        ConstraintLayout constraintLayout = new ConstraintLayout(getContext());
        RLottieImageView rLottieImageView = new RLottieImageView(getContext());
        rLottieImageView.setId(gca.p);
        RLottieImageViewUtils.setLottieDrawable(rLottieImageView, A0());
        rLottieImageView.playAnimation();
        constraintLayout.addView(rLottieImageView, tu0.G(248 * fk4.d().getDisplayMetrics().density), tu0.G(80 * fk4.d().getDisplayMetrics().density));
        TextView textView = new TextView(getContext());
        textView.setId(gca.r);
        textView.setGravity(17);
        i4f.i.b(textView, du4.b);
        textView.setTextColor(qp4.u0.j(textView).getText().e);
        textView.setText(hca.l);
        constraintLayout.addView(textView, -2, -2);
        f7a f7aVar = new f7a(getContext());
        f7aVar.setId(gca.q);
        f7aVar.setText(yoc.s0);
        tu0.K(f7aVar, 300L, new xx5(7, this));
        constraintLayout.addView(f7aVar, 0, -2);
        v3c.y(new i67(textView, this, rLottieImageView, null), constraintLayout);
        dj3 dj3VarQ = fp3.q(constraintLayout);
        int id = rLottieImageView.getId();
        dj3VarQ.d(id, 3, 0, 3);
        au1.p(44, fk4.d().getDisplayMetrics().density, new l2a(dj3VarQ, 3, id, 4));
        dj3VarQ.d(id, 6, 0, 6);
        dj3VarQ.d(id, 7, 0, 7);
        int id2 = textView.getId();
        dj3VarQ.d(id2, 3, rLottieImageView.getId(), 4);
        dj3VarQ.d(id2, 6, 0, 6);
        dj3VarQ.d(id2, 7, 0, 7);
        int id3 = f7aVar.getId();
        dj3VarQ.d(id3, 3, textView.getId(), 4);
        au1.p(48, fk4.d().getDisplayMetrics().density, new l2a(dj3VarQ, 3, id3, 4));
        dj3VarQ.d(id3, 6, 0, 6);
        dj3VarQ.d(id3, 7, 0, 7);
        dj3VarQ.d(id3, 4, 0, 4);
        new l2a(dj3VarQ, 4, id3, 4).e(tu0.G(24 * fk4.d().getDisplayMetrics().density));
        dj3VarQ.a(constraintLayout);
        return constraintLayout;
    }
}
