package defpackage;

import ru.ok.messages.settings.caching.FrgCachingSettings;

/* loaded from: classes2.dex */
public final /* synthetic */ class o46 implements qj3, nod {
    public final /* synthetic */ FrgCachingSettings a;

    public String a(float f) {
        return this.a.G1[(int) f];
    }

    @Override // defpackage.qj3
    public void accept(Object obj) {
        zl4 zl4Var = (zl4) obj;
        FrgCachingSettings frgCachingSettings = this.a;
        if (frgCachingSettings.y1 == null) {
            frgCachingSettings.y1 = new hc3();
        }
        frgCachingSettings.y1.a(zl4Var);
    }
}
