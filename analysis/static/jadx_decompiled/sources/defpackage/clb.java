package defpackage;

import one.me.profile.ProfileScreen;

/* loaded from: classes2.dex */
public final /* synthetic */ class clb implements k56 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ProfileScreen b;

    public /* synthetic */ clb(ProfileScreen profileScreen, int i) {
        this.a = i;
        this.b = profileScreen;
    }

    @Override // defpackage.k56
    public final Object invoke() {
        ProfileScreen profileScreen = this.b;
        switch (this.a) {
            case 0:
                bc7[] bc7VarArr = ProfileScreen.D0;
                return profileScreen.getContext();
            case 1:
                bc7[] bc7VarArr2 = ProfileScreen.D0;
                return new rg1(new khe(new clb(profileScreen, 2)), new l5g(profileScreen, 0));
            default:
                bc7[] bc7VarArr3 = ProfileScreen.D0;
                return profileScreen.getRouter();
        }
    }
}
