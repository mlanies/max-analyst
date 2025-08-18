package defpackage;

import android.view.View;
import one.me.stickerspreview.set.StickerSetBottomSheet;

/* loaded from: classes2.dex */
public final /* synthetic */ class o3e implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ StickerSetBottomSheet b;

    public /* synthetic */ o3e(StickerSetBottomSheet stickerSetBottomSheet, int i) {
        this.a = i;
        this.b = stickerSetBottomSheet;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        znc router;
        StickerSetBottomSheet stickerSetBottomSheet = this.b;
        switch (this.a) {
            case 0:
                bc7[] bc7VarArr = StickerSetBottomSheet.A0;
                uu3 parentController = stickerSetBottomSheet.getParentController();
                if (parentController != null && (router = parentController.getRouter()) != null) {
                    router.C();
                    break;
                }
                break;
            default:
                bc7[] bc7VarArr2 = StickerSetBottomSheet.A0;
                i3e i3eVar = (i3e) stickerSetBottomSheet.s0.getValue();
                w3e w3eVar = (w3e) i3eVar.C0.a.getValue();
                if (w3eVar != null) {
                    i3eVar.G0.o1(i3eVar, i3e.H0[3], j47.S(i3eVar.a, ((w9a) i3eVar.c).b(), vx3.b, new h3e(w3eVar, i3eVar, null)));
                    break;
                }
                break;
        }
    }
}
