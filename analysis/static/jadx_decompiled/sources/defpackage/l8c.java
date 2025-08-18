package defpackage;

import java.io.IOException;

/* loaded from: classes.dex */
public final class l8c extends mne {
    public final /* synthetic */ int e = 1;
    public final /* synthetic */ m8c f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l8c(String str, m8c m8cVar) {
        super(str, true);
        this.f = m8cVar;
    }

    @Override // defpackage.mne
    public final long a() {
        switch (this.e) {
            case 0:
                m8c m8cVar = this.f;
                try {
                    if (m8cVar.h()) {
                    }
                } catch (IOException e) {
                    m8cVar.c(e);
                    break;
                }
                break;
            default:
                this.f.b.d();
                break;
        }
        return -1L;
        return -1L;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l8c(m8c m8cVar) {
        super(zr6.l(new StringBuilder(), m8cVar.g, " writer"), true);
        this.f = m8cVar;
    }
}
