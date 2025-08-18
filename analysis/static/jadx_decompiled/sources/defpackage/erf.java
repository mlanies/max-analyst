package defpackage;

import ru.ok.android.externcalls.sdk.api.ApiProtocol;

/* loaded from: classes2.dex */
public final /* synthetic */ class erf implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ hrf b;
    public final /* synthetic */ String c;

    public /* synthetic */ erf(hrf hrfVar, String str, int i) {
        this.a = i;
        this.b = hrfVar;
        this.c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                hrf hrfVar = this.b;
                String str = this.c;
                synchronized (hrfVar.b) {
                    try {
                        j3g j3gVar = hrfVar.c;
                        if (j3gVar == null) {
                            hrfVar.q.o("Socket is absent, waiting?");
                        } else {
                            ((m8c) j3gVar).g(str);
                            b9b b9bVar = hrfVar.q;
                            if (((b4c) b9bVar.c).shouldHideSensitiveInformation()) {
                                ((a4c) b9bVar.b).log("OKWSSignaling", " -> " + c37.n(str));
                            } else {
                                ((a4c) b9bVar.b).log("OKWSSignaling", " -> ".concat(str));
                            }
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
            default:
                hrf hrfVar2 = this.b;
                String strE = hrf.e(hrf.e(hrfVar2.h, ApiProtocol.KEY_TOKEN, this.c), "tgt", "retry");
                if (hrfVar2.k) {
                    long j = hrfVar2.l;
                    if (j > 0) {
                        strE = hrf.e(strE, "recoverTs", String.valueOf(j));
                    }
                }
                hrfVar2.q.o("transport.restart");
                synchronized (hrfVar2.b) {
                    hrfVar2.h = strE;
                }
                synchronized (hrfVar2.e) {
                    hrfVar2.f = false;
                    hrfVar2.a("restart");
                }
                return;
        }
    }
}
