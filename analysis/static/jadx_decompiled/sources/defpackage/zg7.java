package defpackage;

import android.app.Activity;
import android.content.ComponentCallbacks2;
import androidx.fragment.app.b;
import java.util.LinkedHashMap;

/* loaded from: classes.dex */
public abstract class zg7 {
    public static final LinkedHashMap a = new LinkedHashMap();

    public static final wg7 a(Activity activity, boolean z) {
        wg7 wg7Var;
        wg7 wg7Var2 = (wg7) a.get(activity);
        if (wg7Var2 == null) {
            wg7Var2 = null;
            if (z && (activity instanceof b)) {
                ynf ynfVarE = ((b) activity).S().E("LifecycleHandler");
                if (ynfVarE instanceof wg7) {
                    wg7Var = (wg7) ynfVarE;
                    wg7Var2 = wg7Var;
                }
            } else {
                ComponentCallbacks2 componentCallbacks2FindFragmentByTag = activity.getFragmentManager().findFragmentByTag("LifecycleHandler");
                if (componentCallbacks2FindFragmentByTag instanceof wg7) {
                    wg7Var = (wg7) componentCallbacks2FindFragmentByTag;
                    wg7Var2 = wg7Var;
                }
            }
        }
        if (wg7Var2 != null) {
            wg7Var2.H(activity);
        }
        return wg7Var2;
    }
}
