package defpackage;

import android.animation.Animator;
import one.me.profile.screens.avatars.ProfileAvatarsScreen;

/* loaded from: classes2.dex */
public final class qbb implements Animator.AnimatorListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ ProfileAvatarsScreen b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ qbb(ProfileAvatarsScreen profileAvatarsScreen, boolean z, int i) {
        this.a = i;
        this.b = profileAvatarsScreen;
        this.c = z;
    }

    private final void a(Animator animator) {
    }

    private final void b(Animator animator) {
    }

    private final void c(Animator animator) {
    }

    private final void d(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        int i = this.a;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        boolean z = this.c;
        ProfileAvatarsScreen profileAvatarsScreen = this.b;
        switch (this.a) {
            case 0:
                if (profileAvatarsScreen.getView() != null) {
                    ProfileAvatarsScreen.v0(profileAvatarsScreen).setVisibility(z ? 0 : 8);
                    break;
                }
                break;
            default:
                if (profileAvatarsScreen.getView() != null) {
                    bc7[] bc7VarArr = ProfileAvatarsScreen.z0;
                    profileAvatarsScreen.A0().setVisibility(z ? 0 : 8);
                    if (!z) {
                        profileAvatarsScreen.y0(false);
                        break;
                    }
                }
                break;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
        int i = this.a;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        ProfileAvatarsScreen profileAvatarsScreen = this.b;
        switch (this.a) {
            case 0:
                if (profileAvatarsScreen.getView() != null) {
                    ProfileAvatarsScreen.v0(profileAvatarsScreen).setVisibility(0);
                    break;
                }
                break;
            default:
                if (profileAvatarsScreen.getView() != null) {
                    bc7[] bc7VarArr = ProfileAvatarsScreen.z0;
                    profileAvatarsScreen.A0().setVisibility(0);
                    if (this.c) {
                        profileAvatarsScreen.y0(true);
                        break;
                    }
                }
                break;
        }
    }
}
