package defpackage;

import org.apache.http.util.LangUtils;
import ru.ok.tamtam.nano.Protos;

/* loaded from: classes2.dex */
public final class nhd implements k56 {
    public final /* synthetic */ int a;
    public final /* synthetic */ k56 b;

    public /* synthetic */ nhd(int i, k56 k56Var) {
        this.a = i;
        this.b = k56Var;
    }

    @Override // defpackage.k56
    public final Object invoke() {
        switch (this.a) {
            case 0:
                return new mhd(0, (jhd) this.b);
            case 1:
                return new mhd(1, (hbc) this.b);
            case 2:
                return new mhd(2, (xid) this.b);
            case 3:
                return new mhd(3, (xid) this.b);
            case 4:
                return new mhd(4, (xid) this.b);
            case 5:
                return new mhd(5, (xid) this.b);
            case 6:
                return new mhd(6, (rzd) this.b);
            case 7:
                return new mhd(7, (b3e) this.b);
            case 8:
                return new mhd(8, (z4e) this.b);
            case 9:
                return new mhd(9, (g5e) this.b);
            case 10:
                return new mhd(10, (xid) this.b);
            case 11:
                return new mhd(11, (z6e) this.b);
            case Protos.Attaches.Attach.PRESENT /* 12 */:
                return new mhd(12, (bse) this.b);
            case 13:
                return new mhd(13, (bse) this.b);
            case Protos.Attaches.Attach.LOCATION /* 14 */:
                return new mhd(14, (bse) this.b);
            case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                return new mhd(15, (bse) this.b);
            case 16:
                return new mhd(16, (syf) this.b);
            case LangUtils.HASH_SEED /* 17 */:
                return new mhd(17, (eh2) this.b);
            default:
                return new mhd(18, (bse) this.b);
        }
    }
}
