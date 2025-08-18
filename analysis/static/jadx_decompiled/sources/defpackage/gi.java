package defpackage;

import android.widget.ImageView;
import one.me.rlottie.ImageReceiver;

/* loaded from: classes2.dex */
public final class gi implements ImageReceiver {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ gi(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // one.me.rlottie.ImageReceiver
    public final void invalidate() {
        switch (this.a) {
            case 0:
                ((hi) this.b).invalidate();
                break;
            case 1:
                ((ImageView) ((mw4) this.b).a).invalidate();
                break;
            case 2:
                ((iw8) this.b).invalidate();
                break;
            case 3:
                ((dy8) this.b).invalidate();
                break;
            default:
                ((z3g) this.b).invalidate();
                break;
        }
    }
}
