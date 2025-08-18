package defpackage;

import java.util.Objects;

/* loaded from: classes.dex */
public final class wz9 extends uk0 {
    public final /* synthetic */ int Y;
    public final Object Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wz9(f2a f2aVar, Object obj, int i) {
        super(f2aVar);
        this.Y = i;
        this.Z = obj;
    }

    @Override // defpackage.f2a
    public final void e(Object obj) {
        switch (this.Y) {
            case 0:
                int i = this.X;
                f2a f2aVar = this.a;
                if (i != 0) {
                    f2aVar.e(null);
                    break;
                } else {
                    try {
                        if (((b7b) this.Z).test(obj)) {
                            f2aVar.e(obj);
                            break;
                        }
                    } catch (Throwable th) {
                        c37.B(th);
                        this.b.g();
                        this.onError(th);
                        return;
                    }
                }
                break;
            default:
                if (!this.o) {
                    int i2 = this.X;
                    f2a f2aVar2 = this.a;
                    if (i2 != 0) {
                        f2aVar2.e(null);
                        break;
                    } else {
                        try {
                            Object objMo131apply = ((b66) this.Z).mo131apply(obj);
                            Objects.requireNonNull(objMo131apply, "The mapper function returned a null value.");
                            f2aVar2.e(objMo131apply);
                            break;
                        } catch (Throwable th2) {
                            c37.B(th2);
                            this.b.g();
                            onError(th2);
                        }
                    }
                }
                break;
        }
    }

    @Override // defpackage.dqd
    public final Object poll() {
        Object objPoll;
        switch (this.Y) {
            case 0:
                break;
            default:
                Object objPoll2 = this.c.poll();
                if (objPoll2 == null) {
                    return null;
                }
                Object objMo131apply = ((b66) this.Z).mo131apply(objPoll2);
                Objects.requireNonNull(objMo131apply, "The mapper function returned a null value.");
                return objMo131apply;
        }
        do {
            objPoll = this.c.poll();
            if (objPoll != null) {
            }
            return objPoll;
        } while (!((b7b) this.Z).test(objPoll));
        return objPoll;
    }
}
