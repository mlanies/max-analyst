package defpackage;

import java.io.IOException;

/* loaded from: classes.dex */
public final class ep6 extends mne {
    public final /* synthetic */ int e;
    public final /* synthetic */ int f;
    public final /* synthetic */ int g;
    public final /* synthetic */ Object h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ep6(String str, Object obj, int i, int i2, int i3) {
        super(str, true);
        this.e = i3;
        this.h = obj;
        this.f = i;
        this.g = i2;
    }

    @Override // defpackage.mne
    public final long a() throws IOException {
        switch (this.e) {
            case 0:
                kp6 kp6Var = (kp6) ((cc1) this.h).c;
                int i = this.f;
                int i2 = this.g;
                kp6Var.getClass();
                try {
                    kp6Var.J0.n(i, i2, true);
                    break;
                } catch (IOException e) {
                    kp6Var.a(2, 2, e);
                    return -1L;
                }
            default:
                kp6 kp6Var2 = (kp6) this.h;
                try {
                    kp6Var2.J0.o(this.f, this.g);
                    break;
                } catch (IOException e2) {
                    kp6Var2.a(2, 2, e2);
                    return -1L;
                }
        }
        return -1L;
    }
}
