package defpackage;

import java.io.IOException;

/* loaded from: classes.dex */
public final class jp6 extends mne {
    public final /* synthetic */ kp6 e;
    public final /* synthetic */ int f;
    public final /* synthetic */ long g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jp6(String str, kp6 kp6Var, int i, long j) {
        super(str, true);
        this.e = kp6Var;
        this.f = i;
        this.g = j;
    }

    @Override // defpackage.mne
    public final long a() throws IOException {
        kp6 kp6Var = this.e;
        try {
            kp6Var.J0.S(this.f, this.g);
            return -1L;
        } catch (IOException e) {
            kp6Var.d(e);
            return -1L;
        }
    }
}
