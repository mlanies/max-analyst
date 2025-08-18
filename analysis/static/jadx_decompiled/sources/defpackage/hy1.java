package defpackage;

import java.util.concurrent.Future;

/* loaded from: classes.dex */
public final class hy1 implements iy1 {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ hy1(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.iy1
    public final void b(Throwable th) {
        switch (this.a) {
            case 0:
                if (th != null) {
                    ((Future) this.b).cancel(false);
                    break;
                }
                break;
            case 1:
                ((m56) this.b).invoke(th);
                break;
            default:
                ((cm4) this.b).dispose();
                break;
        }
    }

    public final String toString() {
        switch (this.a) {
            case 0:
                return "CancelFutureOnCancel[" + ((Future) this.b) + ']';
            case 1:
                return "CancelHandler.UserSupplied[" + ((m56) this.b).getClass().getSimpleName() + '@' + c54.u(this) + ']';
            default:
                return "DisposeOnCancel[" + ((cm4) this.b) + ']';
        }
    }
}
