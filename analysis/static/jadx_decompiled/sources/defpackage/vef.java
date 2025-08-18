package defpackage;

import ru.ok.tamtam.media.converter.VideoConverterException;

/* loaded from: classes2.dex */
public final /* synthetic */ class vef implements b66, qj3 {
    public final /* synthetic */ int a;
    public final /* synthetic */ wef b;

    public /* synthetic */ vef(wef wefVar, int i) {
        this.a = i;
        this.b = wefVar;
    }

    @Override // defpackage.qj3
    public void accept(Object obj) throws InterruptedException {
        int i = this.a;
        wef wefVar = this.b;
        switch (i) {
            case 1:
                zl4 zl4Var = (zl4) obj;
                synchronized (wefVar) {
                    wefVar.h.a(zl4Var);
                }
                return;
            default:
                kef kefVar = (kef) obj;
                nd7.U(new qa3(wefVar.b.a(), 2, new uef(kefVar, 2)).l(), ft.e, new uef(kefVar, 0), new e5(22, kefVar));
                return;
        }
    }

    @Override // defpackage.b66
    /* renamed from: apply */
    public Object mo131apply(Object obj) throws Throwable {
        iqd iqdVarG;
        int i = 0;
        wef wefVar = this.b;
        int i2 = 2;
        int i3 = this.a;
        kef kefVar = (kef) obj;
        wefVar.getClass();
        switch (i3) {
            case 0:
                if (kefVar.b && kj6.h(kefVar.d)) {
                    hm9.m("wef", "convertVideo: exists result = %s", kefVar);
                    return iqd.g(kefVar);
                }
                hm9.m("wef", "convertVideo: start convert = %s", kefVar);
                if (oag.t(kefVar.c)) {
                    it3 it3VarC = ((cj0) wefVar.a).c(kefVar.a.a);
                    if (it3VarC == null) {
                        iqdVarG = iqd.f(new VideoConverterException("failed to prepare videoConversion files"));
                    } else if (it3VarC.b == 0) {
                        iqdVarG = iqd.f(new VideoConverterException("content is zero length"));
                    } else {
                        String str = it3VarC.e;
                        if (oag.t(str)) {
                            iqdVarG = new q1a(1, new tef(wefVar, kefVar, it3VarC, i)).m(wefVar.g.a).i(wefVar.f);
                        } else {
                            w36 w36VarA = kefVar.a();
                            w36VarA.c = str;
                            iqdVarG = iqd.g(new kef(w36VarA));
                        }
                    }
                } else {
                    iqdVarG = iqd.g(kefVar);
                }
                return new rqd(new rqd(new uqd(new rqd(iqdVarG, new vef(wefVar, i2), 2), new vef(wefVar, 3), 0), new uef(kefVar, 1), 1), new vef(wefVar, i2), 2);
            default:
                return new q1a(1, new ypc(wefVar, 24, kefVar)).m(wefVar.e.a).i(wefVar.f);
        }
    }
}
