package defpackage;

import android.util.Size;
import android.view.Surface;

/* loaded from: classes.dex */
public final class fw6 extends xf4 {
    public final /* synthetic */ int n = 0;
    public final Object o;

    public fw6(Surface surface, Size size, int i) {
        super(size, i);
        this.o = surface;
    }

    @Override // defpackage.xf4
    public final bm7 e() {
        switch (this.n) {
            case 0:
                return kq0.r((Surface) this.o);
            default:
                return ((see) this.o).g;
        }
    }

    public fw6(Surface surface) {
        super(xf4.k, 0);
        this.o = surface;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fw6(see seeVar, Size size) {
        super(size, 34);
        this.o = seeVar;
    }
}
