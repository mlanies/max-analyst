package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class gm4 extends k87 {
    public final /* synthetic */ int b;
    public final Object c;

    public /* synthetic */ gm4(int i, Object obj) {
        this.b = i;
        this.c = obj;
    }

    @Override // defpackage.k87
    public final boolean c() {
        switch (this.b) {
        }
        return false;
    }

    @Override // defpackage.k87
    public final void d(Throwable th) {
        switch (this.b) {
            case 0:
                ((cm4) this.c).dispose();
                break;
            case 1:
                ((m56) this.c).invoke(th);
                break;
            default:
                ((Continuation) this.c).resumeWith(e5f.a);
                break;
        }
    }
}
