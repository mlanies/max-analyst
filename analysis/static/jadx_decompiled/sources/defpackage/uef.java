package defpackage;

import java.util.Locale;

/* loaded from: classes2.dex */
public final /* synthetic */ class uef implements qj3, b66 {
    public final /* synthetic */ int a;
    public final /* synthetic */ kef b;

    public /* synthetic */ uef(kef kefVar, int i) {
        this.a = i;
        this.b = kefVar;
    }

    @Override // defpackage.qj3
    public void accept(Object obj) {
        kef kefVar = this.b;
        Throwable th = (Throwable) obj;
        switch (this.a) {
            case 0:
                Locale locale = Locale.ENGLISH;
                hm9.p("wef", "putConversionInRepository: failed, videoConversion=" + kefVar, th);
                break;
            default:
                kj6.r(kefVar.d);
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.b66
    /* renamed from: apply */
    public Object mo131apply(Object obj) {
        qef qefVar = (qef) obj;
        kef kefVar = this.b;
        mef mefVar = null;
        if (kefVar != null) {
            nef nefVar = new nef();
            lef lefVar = kefVar.a;
            if (lefVar != null) {
                mefVar = new mef();
                mefVar.a = lefVar.a;
                ref refVar = lefVar.b;
                mefVar.b = refVar.a;
                mefVar.c = refVar.b;
                mefVar.d = refVar.c;
                mefVar.e = refVar.d;
            }
            nefVar.a = mefVar;
            nefVar.c = kefVar.c;
            nefVar.d = kefVar.d;
            nefVar.b = kefVar.b;
            mefVar = nefVar;
        }
        qefVar.getClass();
        return new sa3(2, new oef(qefVar, 0, mefVar));
    }
}
