package defpackage;

import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.coroutines.Continuation;
import one.me.inviteactions.invitefriendsbottomsheet.InviteFriendsToMaxBottomSheet;
import one.me.rlottie.RLottieDrawable;
import one.me.rlottie.RLottieImageView;
import one.me.rlottie.RLottieImageViewUtils;

/* loaded from: classes2.dex */
public final class i67 extends ffe implements c66 {
    public /* synthetic */ ConstraintLayout X;
    public /* synthetic */ fka Y;
    public final /* synthetic */ TextView Z;
    public final /* synthetic */ InviteFriendsToMaxBottomSheet s0;
    public final /* synthetic */ RLottieImageView t0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i67(TextView textView, InviteFriendsToMaxBottomSheet inviteFriendsToMaxBottomSheet, RLottieImageView rLottieImageView, Continuation continuation) {
        super(3, continuation);
        this.Z = textView;
        this.s0 = inviteFriendsToMaxBottomSheet;
        this.t0 = rLottieImageView;
    }

    @Override // defpackage.c66
    public final Object invoke(Object obj, Object obj2, Object obj3) throws Throwable {
        i67 i67Var = new i67(this.Z, this.s0, this.t0, (Continuation) obj3);
        i67Var.X = (ConstraintLayout) obj;
        i67Var.Y = (fka) obj2;
        e5f e5fVar = e5f.a;
        i67Var.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        ConstraintLayout constraintLayout = this.X;
        this.Z.setTextColor(this.Y.getText().e);
        bc7[] bc7VarArr = InviteFriendsToMaxBottomSheet.E0;
        InviteFriendsToMaxBottomSheet inviteFriendsToMaxBottomSheet = this.s0;
        boolean zB0 = inviteFriendsToMaxBottomSheet.B0();
        e5f e5fVar = e5f.a;
        pq9 pq9Var = qp4.u0;
        if ((zB0 && pq9Var.b(constraintLayout.getContext()).j()) || (!inviteFriendsToMaxBottomSheet.B0() && !pq9Var.b(constraintLayout.getContext()).j())) {
            return e5fVar;
        }
        RLottieDrawable rLottieDrawableA0 = inviteFriendsToMaxBottomSheet.A0();
        rLottieDrawableA0.setCurrentFrame(rLottieDrawableA0.getFramesCount() - 1);
        RLottieImageView rLottieImageView = this.t0;
        RLottieImageViewUtils.setLottieDrawable(rLottieImageView, rLottieDrawableA0);
        rLottieImageView.playAnimation();
        return e5fVar;
    }
}
