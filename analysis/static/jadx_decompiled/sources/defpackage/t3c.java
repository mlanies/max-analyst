package defpackage;

import one.me.rlottie.RLottieDrawable;

/* loaded from: classes2.dex */
public final class t3c implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ RLottieDrawable b;

    public /* synthetic */ t3c(RLottieDrawable rLottieDrawable, int i) {
        this.a = i;
        this.b = rLottieDrawable;
    }

    /* JADX WARN: Removed duplicated region for block: B:64:0x0142 A[Catch: Exception -> 0x010f, TryCatch #0 {Exception -> 0x010f, blocks: (B:33:0x00bf, B:37:0x00ca, B:39:0x00d4, B:58:0x012e, B:60:0x0136, B:62:0x013c, B:64:0x0142, B:65:0x014b, B:67:0x0151, B:69:0x0157, B:70:0x0180, B:73:0x01a4, B:75:0x01bc, B:76:0x01c1, B:78:0x01cd, B:80:0x01d1, B:82:0x01d5, B:84:0x01d8, B:85:0x01de, B:86:0x01e7, B:88:0x01ea, B:89:0x01f0, B:91:0x01fb, B:93:0x01ff, B:95:0x0203, B:97:0x0206, B:98:0x020c, B:99:0x0215, B:101:0x0218, B:102:0x021e, B:103:0x0227, B:108:0x0233, B:110:0x0237, B:111:0x0241, B:112:0x0246, B:114:0x024a, B:116:0x0254, B:117:0x0258, B:119:0x025c, B:121:0x0262, B:123:0x0271, B:124:0x0276, B:106:0x022d, B:54:0x0107, B:57:0x0112), top: B:161:0x00bf }] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0151 A[Catch: Exception -> 0x010f, TryCatch #0 {Exception -> 0x010f, blocks: (B:33:0x00bf, B:37:0x00ca, B:39:0x00d4, B:58:0x012e, B:60:0x0136, B:62:0x013c, B:64:0x0142, B:65:0x014b, B:67:0x0151, B:69:0x0157, B:70:0x0180, B:73:0x01a4, B:75:0x01bc, B:76:0x01c1, B:78:0x01cd, B:80:0x01d1, B:82:0x01d5, B:84:0x01d8, B:85:0x01de, B:86:0x01e7, B:88:0x01ea, B:89:0x01f0, B:91:0x01fb, B:93:0x01ff, B:95:0x0203, B:97:0x0206, B:98:0x020c, B:99:0x0215, B:101:0x0218, B:102:0x021e, B:103:0x0227, B:108:0x0233, B:110:0x0237, B:111:0x0241, B:112:0x0246, B:114:0x024a, B:116:0x0254, B:117:0x0258, B:119:0x025c, B:121:0x0262, B:123:0x0271, B:124:0x0276, B:106:0x022d, B:54:0x0107, B:57:0x0112), top: B:161:0x00bf }] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01a4 A[Catch: Exception -> 0x010f, TryCatch #0 {Exception -> 0x010f, blocks: (B:33:0x00bf, B:37:0x00ca, B:39:0x00d4, B:58:0x012e, B:60:0x0136, B:62:0x013c, B:64:0x0142, B:65:0x014b, B:67:0x0151, B:69:0x0157, B:70:0x0180, B:73:0x01a4, B:75:0x01bc, B:76:0x01c1, B:78:0x01cd, B:80:0x01d1, B:82:0x01d5, B:84:0x01d8, B:85:0x01de, B:86:0x01e7, B:88:0x01ea, B:89:0x01f0, B:91:0x01fb, B:93:0x01ff, B:95:0x0203, B:97:0x0206, B:98:0x020c, B:99:0x0215, B:101:0x0218, B:102:0x021e, B:103:0x0227, B:108:0x0233, B:110:0x0237, B:111:0x0241, B:112:0x0246, B:114:0x024a, B:116:0x0254, B:117:0x0258, B:119:0x025c, B:121:0x0262, B:123:0x0271, B:124:0x0276, B:106:0x022d, B:54:0x0107, B:57:0x0112), top: B:161:0x00bf }] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01c1 A[Catch: Exception -> 0x010f, TryCatch #0 {Exception -> 0x010f, blocks: (B:33:0x00bf, B:37:0x00ca, B:39:0x00d4, B:58:0x012e, B:60:0x0136, B:62:0x013c, B:64:0x0142, B:65:0x014b, B:67:0x0151, B:69:0x0157, B:70:0x0180, B:73:0x01a4, B:75:0x01bc, B:76:0x01c1, B:78:0x01cd, B:80:0x01d1, B:82:0x01d5, B:84:0x01d8, B:85:0x01de, B:86:0x01e7, B:88:0x01ea, B:89:0x01f0, B:91:0x01fb, B:93:0x01ff, B:95:0x0203, B:97:0x0206, B:98:0x020c, B:99:0x0215, B:101:0x0218, B:102:0x021e, B:103:0x0227, B:108:0x0233, B:110:0x0237, B:111:0x0241, B:112:0x0246, B:114:0x024a, B:116:0x0254, B:117:0x0258, B:119:0x025c, B:121:0x0262, B:123:0x0271, B:124:0x0276, B:106:0x022d, B:54:0x0107, B:57:0x0112), top: B:161:0x00bf }] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() throws java.lang.InterruptedException {
        /*
            Method dump skipped, instructions count: 804
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.t3c.run():void");
    }
}
