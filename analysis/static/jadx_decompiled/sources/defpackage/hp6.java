package defpackage;

import java.io.IOException;
import java.util.List;

/* loaded from: classes.dex */
public final class hp6 extends mne {
    public final /* synthetic */ int e = 2;
    public final /* synthetic */ kp6 f;
    public final /* synthetic */ int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hp6(String str, kp6 kp6Var, int i, int i2) {
        super(str, true);
        this.f = kp6Var;
        this.g = i;
    }

    @Override // defpackage.mne
    public final long a() {
        switch (this.e) {
            case 0:
                this.f.w0.getClass();
                try {
                    this.f.J0.o(this.g, 9);
                    synchronized (this.f) {
                        this.f.L0.remove(Integer.valueOf(this.g));
                    }
                    return -1L;
                } catch (IOException unused) {
                    return -1L;
                }
            case 1:
                this.f.w0.getClass();
                try {
                    this.f.J0.o(this.g, 9);
                    synchronized (this.f) {
                        this.f.L0.remove(Integer.valueOf(this.g));
                    }
                    return -1L;
                } catch (IOException unused2) {
                    return -1L;
                }
            default:
                this.f.w0.getClass();
                synchronized (this.f) {
                    this.f.L0.remove(Integer.valueOf(this.g));
                }
                return -1L;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hp6(String str, kp6 kp6Var, int i, List list) {
        super(str, true);
        this.f = kp6Var;
        this.g = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hp6(String str, kp6 kp6Var, int i, List list, boolean z) {
        super(str, true);
        this.f = kp6Var;
        this.g = i;
    }
}
