package defpackage;

import one.me.startconversation.channel.PickSubscribersScreen;

/* loaded from: classes2.dex */
public final /* synthetic */ class fxa implements m56 {
    public final /* synthetic */ int a;
    public final /* synthetic */ PickSubscribersScreen b;

    public /* synthetic */ fxa(PickSubscribersScreen pickSubscribersScreen, int i) {
        this.a = i;
        this.b = pickSubscribersScreen;
    }

    @Override // defpackage.m56
    public final Object invoke(Object obj) {
        e5f e5fVar = e5f.a;
        PickSubscribersScreen pickSubscribersScreen = this.b;
        switch (this.a) {
            case 0:
                bc7[] bc7VarArr = PickSubscribersScreen.z0;
                i3a onBackPressedDispatcher = pickSubscribersScreen.getOnBackPressedDispatcher();
                if (onBackPressedDispatcher != null) {
                    onBackPressedDispatcher.d();
                    break;
                }
                break;
            default:
                syd sydVar = (syd) obj;
                sydVar.a2();
                bc7[] bc7VarArr2 = PickSubscribersScreen.z0;
                pickSubscribersScreen.getClass();
                bc7 bc7Var = PickSubscribersScreen.z0[1];
                sydVar.R1(sydVar.Z1(((Number) pickSubscribersScreen.u0.a(pickSubscribersScreen)).longValue()));
                break;
        }
        return e5fVar;
    }
}
