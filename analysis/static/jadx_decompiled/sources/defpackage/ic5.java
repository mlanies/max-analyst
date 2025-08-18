package defpackage;

import java.util.List;

/* loaded from: classes2.dex */
public final /* synthetic */ class ic5 implements f6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ List b;

    public /* synthetic */ ic5(int i, List list) {
        this.a = i;
        this.b = list;
    }

    @Override // defpackage.f6
    public final void run() {
        List list = this.b;
        switch (this.a) {
            case 0:
                hm9.m("sc5", "onNotifRemoved: removed sticker sets %s from cache", list);
                break;
            case 1:
                hm9.m("sc5", "onListUpdated: success store stickers sets=%s", list);
                break;
            case 2:
                hm9.m("md5", "onAssetsUpdate: success store stickers %s", list);
                break;
            case 3:
                hm9.m("md5", "removeFromFavorites: ids=%s", list);
                break;
            case 4:
                hm9.m("md5", "onListUpdated: success store stickers %s", list);
                break;
            case 5:
                hm9.m("md5", "onNotifRemoved: removed stickers %s from cache", list);
                break;
            case 6:
                hm9.m("a4e", "storeStickerSets: success for sets = %s", list);
                break;
            default:
                hm9.m("eoe", "awaitNoTasksByTypes: finished for types=%s", list);
                break;
        }
    }
}
