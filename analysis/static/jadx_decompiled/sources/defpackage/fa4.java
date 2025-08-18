package defpackage;

import ru.ok.tamtam.nano.Protos;

/* loaded from: classes2.dex */
public final /* synthetic */ class fa4 implements f6 {
    public final /* synthetic */ int a;

    public /* synthetic */ fa4(int i) {
        this.a = i;
    }

    @Override // defpackage.f6
    public final void run() {
        switch (this.a) {
            case 0:
                hm9.k("ga4", "clear: cleared repository");
                break;
            case 1:
                hm9.k("sc5", "onAssetsUpdate: stored fav sticker sets");
                break;
            case 2:
                hm9.k("sc5", "clear: cleared fav stickers repository");
                break;
            case 3:
                hm9.k("md5", "clear: cleared repository");
                break;
            case 4:
                hm9.k("k9c", "clearRecentSearch: success");
                break;
            case 5:
                hm9.n("x9c", "RECENT ADDED update handle success");
                break;
            case 6:
                hm9.n("x9c", "RECENT REMOVED update handle success");
                break;
            case 7:
                hm9.n("x9c", "Add to recents success");
                break;
            case 8:
                w4d w4dVar = cqc.a;
                break;
            case 9:
                hm9.k("o2e", "Success update recents");
                break;
            case 10:
                hm9.k("o2e", "clear: cleared repository");
                break;
            case 11:
                hm9.k("a4e", "clear: repository cleared");
                break;
            case Protos.Attaches.Attach.PRESENT /* 12 */:
                hm9.k("c7f", "clear: cleared upload repository");
                break;
            default:
                hm9.k("wef", "clear: success");
                break;
        }
    }
}
