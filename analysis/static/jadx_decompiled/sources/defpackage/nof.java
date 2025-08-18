package defpackage;

import android.os.SystemClock;
import android.view.View;
import androidx.viewpager2.widget.ViewPager2;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class nof implements u4, qj3, ifg {
    public final Object a;

    public /* synthetic */ nof(Object obj) {
        this.a = obj;
    }

    @Override // defpackage.qj3
    public void accept(Object obj) {
        c4c c4cVar = (c4c) obj;
        vk8 vk8Var = (vk8) this.a;
        ((wte) ((vte) vk8Var.j)).getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        for (Map.Entry entry : ((HashMap) vk8Var.d).entrySet()) {
            m1e m1eVar = (m1e) entry.getKey();
            bbg bbgVar = (bbg) entry.getValue();
            if ((bbgVar.b.toMillis(bbgVar.a) + bbgVar.c) - 10 < jElapsedRealtime) {
                bbgVar.c = jElapsedRealtime;
                m1eVar.a(c4cVar);
            }
        }
    }

    @Override // defpackage.u4
    public boolean b(View view) {
        int currentItem = ((ViewPager2) view).getCurrentItem() + 1;
        ViewPager2 viewPager2 = (ViewPager2) ((m5d) this.a).X;
        if (viewPager2.F0) {
            viewPager2.f(currentItem, true);
        }
        return true;
    }

    @Override // defpackage.ifg
    public Object r() {
        fig figVar = (fig) ((ifg) this.a).r();
        if (figVar != null) {
            return figVar;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    public nof(pkg pkgVar, hm7 hm7Var) {
        this.a = pkgVar;
    }
}
