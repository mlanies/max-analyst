package defpackage;

import com.google.gson.Gson;
import java.util.ArrayList;
import java.util.Iterator;
import one.me.rlottie.RLottieDrawable;

/* loaded from: classes2.dex */
public final /* synthetic */ class r3c implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ RLottieDrawable b;

    public /* synthetic */ r3c(RLottieDrawable rLottieDrawable, int i) {
        this.a = i;
        this.b = rLottieDrawable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        RLottieDrawable rLottieDrawable = this.b;
        switch (this.a) {
            case 0:
                rLottieDrawable.invalidateInternal();
                break;
            default:
                Gson gson = RLottieDrawable.gson;
                rLottieDrawable.getClass();
                Iterator it = new ArrayList(rLottieDrawable.E1).iterator();
                while (it.hasNext()) {
                    ((RLottieDrawable.DrawableLoadListener) it.next()).onLoaded(rLottieDrawable);
                }
                break;
        }
    }
}
