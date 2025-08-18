package defpackage;

import android.content.Context;
import javax.inject.Provider;

/* loaded from: classes.dex */
public final class i45 implements Provider, epb {
    public final /* synthetic */ int a;
    public final Provider b;

    public /* synthetic */ i45(Provider provider, int i) {
        this.a = i;
        this.b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        switch (this.a) {
            case 0:
                String packageName = ((Context) this.b.get()).getPackageName();
                if (packageName != null) {
                    return packageName;
                }
                throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
            default:
                return this.b.get();
        }
    }
}
