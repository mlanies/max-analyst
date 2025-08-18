package defpackage;

import java.io.IOException;

/* loaded from: classes.dex */
public final class gp6 extends mne {
    public final /* synthetic */ kp6 e;
    public final /* synthetic */ int f;
    public final /* synthetic */ bt0 g;
    public final /* synthetic */ int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gp6(String str, kp6 kp6Var, int i, bt0 bt0Var, int i2, boolean z) {
        super(str, true);
        this.e = kp6Var;
        this.f = i;
        this.g = bt0Var;
        this.h = i2;
    }

    @Override // defpackage.mne
    public final long a() {
        try {
            hx9 hx9Var = this.e.w0;
            bt0 bt0Var = this.g;
            int i = this.h;
            hx9Var.getClass();
            bt0Var.R(i);
            this.e.J0.o(this.f, 9);
            synchronized (this.e) {
                this.e.L0.remove(Integer.valueOf(this.f));
            }
            return -1L;
        } catch (IOException unused) {
            return -1L;
        }
    }
}
