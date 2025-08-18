package defpackage;

import ru.ok.tamtam.errors.TamErrorException;

/* loaded from: classes2.dex */
public final class rle implements lme {
    public final /* synthetic */ sqd a;

    public rle(nqd nqdVar) {
        this.a = nqdVar;
    }

    @Override // defpackage.lme
    public final void e(gle gleVar) {
        sqd sqdVar = this.a;
        if (((nqd) sqdVar).h()) {
            return;
        }
        ((nqd) sqdVar).a(gleVar);
    }

    @Override // defpackage.lme
    public final void g(pke pkeVar) {
        sqd sqdVar = this.a;
        if (((nqd) sqdVar).h()) {
            return;
        }
        ((nqd) sqdVar).onError(new TamErrorException(pkeVar));
    }
}
