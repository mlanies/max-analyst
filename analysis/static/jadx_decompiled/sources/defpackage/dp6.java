package defpackage;

import java.io.IOException;

/* loaded from: classes.dex */
public final class dp6 extends mne {
    public final /* synthetic */ int e = 0;
    public final /* synthetic */ cc1 f;
    public final /* synthetic */ Object g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dp6(String str, cc1 cc1Var, mec mecVar) {
        super(str, true);
        this.f = cc1Var;
        this.g = mecVar;
    }

    @Override // defpackage.mne
    public final long a() {
        switch (this.e) {
            case 0:
                ((kp6) this.f.c).b.a((ded) ((mec) this.g).a);
                break;
            default:
                try {
                    ((kp6) this.f.c).b.b((rp6) this.g);
                    break;
                } catch (IOException e) {
                    q2b q2bVar = q2b.a;
                    q2b q2bVar2 = q2b.a;
                    String str = "Http2Connection.Listener failure for " + ((kp6) this.f.c).o;
                    q2bVar2.getClass();
                    q2b.i(4, str, e);
                    try {
                        ((rp6) this.g).c(2, e);
                        break;
                    } catch (IOException unused) {
                        break;
                    }
                }
        }
        return -1L;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dp6(String str, rp6 rp6Var, cc1 cc1Var) {
        super(str, true);
        this.g = rp6Var;
        this.f = cc1Var;
    }
}
